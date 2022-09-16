package defpackage;

import com.google.ar.core.AugmentedFace;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.Earth;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.MagicalSurfacePoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.Trackable;
/* compiled from: PG */
/* renamed from: dbbm  reason: default package */
/* loaded from: classes5.dex */
public enum dbbm {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class),
    MAGICAL_SURFACE_POINT(1095893267, MagicalSurfacePoint.class);
    
    public final int k;
    private final Class<?> l;

    dbbm(int i, Class cls) {
        this.k = i;
        this.l = cls;
    }

    public static dbbm a(Class<? extends Trackable> cls) {
        dbbm[] values;
        for (dbbm dbbmVar : values()) {
            Class<?> cls2 = dbbmVar.l;
            if (cls2 != null && cls2.equals(cls)) {
                return dbbmVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
