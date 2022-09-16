package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class SidecarAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SidecarAdapter";

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }

        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) {
            sidecarDeviceState.getClass();
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) {
            sidecarDeviceState.getClass();
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        public final List getSidecarDisplayFeatures(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            sidecarWindowLayoutInfo.getClass();
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? azqp.a : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    }
                    return (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return azqp.a;
            }
        }

        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i) {
            sidecarDeviceState.getClass();
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final void setSidecarDisplayFeatures(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, List list) {
            sidecarWindowLayoutInfo.getClass();
            list.getClass();
            try {
                try {
                    sidecarWindowLayoutInfo.displayFeatures = list;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, list);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final DisplayFeature translate$window_release(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
            FoldingFeature.Type type;
            FoldingFeature.State state;
            sidecarDisplayFeature.getClass();
            sidecarDeviceState.getClass();
            Rect rect = sidecarDisplayFeature.getRect();
            rect.getClass();
            if (rect.width() == 0 && rect.height() == 0) {
                return null;
            }
            if (sidecarDisplayFeature.getType() == 1 && rect.width() != 0 && rect.height() != 0) {
                return null;
            }
            if ((sidecarDisplayFeature.getType() == 2 || sidecarDisplayFeature.getType() == 1) && rect.left != 0 && rect.top != 0) {
                return null;
            }
            int type2 = sidecarDisplayFeature.getType();
            if (type2 == 1) {
                type = FoldingFeature.Type.FOLD;
            } else if (type2 != 2) {
                return null;
            } else {
                type = FoldingFeature.Type.HINGE;
            }
            int sidecarDevicePosture$window_release = getSidecarDevicePosture$window_release(sidecarDeviceState);
            if (sidecarDevicePosture$window_release == 2) {
                state = FoldingFeature.State.HALF_OPENED;
            } else if (sidecarDevicePosture$window_release != 3) {
                return null;
            } else {
                state = FoldingFeature.State.FLAT;
            }
            Rect rect2 = sidecarDisplayFeature.getRect();
            rect2.getClass();
            return new FoldingFeature(new Bounds(rect2), type, state);
        }
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (azst.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        return sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && azst.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (isEqualSidecarDisplayFeature((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (azst.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (azst.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(azqp.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List translate(List list, SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        sidecarDeviceState.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DisplayFeature translate$window_release = Companion.translate$window_release((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }
}
