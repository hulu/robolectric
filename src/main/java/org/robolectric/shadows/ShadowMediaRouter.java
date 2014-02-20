package org.robolectric.shadows;

import android.media.MediaRouter;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

import java.util.ArrayList;
import java.util.List;

/**
 * Shadows android.media.MediaRouter
 */
@Implements(MediaRouter.class)
public class ShadowMediaRouter {

  private List<MediaRouter.RouteInfo> mRoutes = new ArrayList<MediaRouter.RouteInfo>();

  @Implementation
  public void addRoute(MediaRouter.RouteInfo info) {
    mRoutes.add(info);
  }

  @Implementation
  public void addUserRoute(MediaRouter.UserRouteInfo info) {
    mRoutes.add(info);
  }

  @Implementation
  public void clearUserRoutes() {
    for (int i = 0; i < mRoutes.size(); i++) {
      final MediaRouter.RouteInfo info = mRoutes.get(i);
      if (info instanceof MediaRouter.UserRouteInfo) {
        removeRouteAt(i);
        i--;
      }
    }
  }

  @Implementation
  public int getRouteCount() {
    return mRoutes.size();
  }

  @Implementation
  void removeRouteAt(int routeIndex) {
    mRoutes.remove(routeIndex);
  }
}
