package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dbhr  reason: default package */
/* loaded from: classes5.dex */
public final class dbhr {
    public static int a(int i) {
        int i2 = i - 1;
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : R.raw.sceneform_transparent_textured_material : R.raw.sceneform_opaque_textured_material : R.raw.sceneform_transparent_colored_material : R.raw.sceneform_opaque_colored_material;
        int i4 = R.raw.sceneform_view_renderable;
        if (i3 == 0) {
            i3 = i2 != 8 ? 0 : R.raw.sceneform_view_renderable;
        }
        if (i3 != 0) {
            i4 = i3;
        } else if (i2 == 0) {
            i4 = R.raw.sceneform_camera_material;
        } else if (i2 == 5) {
            i4 = R.raw.sceneform_plane_shadow_material;
        } else if (i2 == 6) {
            i4 = R.raw.sceneform_plane_material;
        } else if (i2 == 7) {
            i4 = R.drawable.sceneform_plane;
        } else if (i2 != 8) {
            i4 = 0;
        }
        if (i4 != 0) {
            return i4;
        }
        return 0;
    }
}
