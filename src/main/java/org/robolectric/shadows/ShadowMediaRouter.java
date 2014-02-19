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
  public int getRouteCount() {
    return mRoutes.size();
  }
}
