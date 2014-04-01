package org.robolectric.shadows;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

import android.media.MediaRouter;

/**
 * Shadows android.media.MediaRouter
 */
@Implements(MediaRouter.class)
public class ShadowMediaRouter {

    @Implementation
    public int getRouteCount() {
        return 0;
    }
}
