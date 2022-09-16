package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.ExtensionDisplayFeature;
import androidx.window.extensions.ExtensionFoldingFeature;
import androidx.window.extensions.ExtensionWindowLayoutInfo;
import androidx.window.layout.FoldingFeature;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExtensionAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ExtensionAdapter";
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }

        private final boolean hasMatchingDimension(Rect rect, Rect rect2) {
            return (rect.left == rect2.left && rect.right == rect2.right) || (rect.top == rect2.top && rect.bottom == rect2.bottom);
        }

        private final boolean isValid(Rect rect, ExtensionFoldingFeature extensionFoldingFeature) {
            if (extensionFoldingFeature.getBounds().width() == 0 && extensionFoldingFeature.getBounds().height() == 0) {
                return false;
            }
            if (extensionFoldingFeature.getType() == 1 && !extensionFoldingFeature.getBounds().isEmpty()) {
                return false;
            }
            if (extensionFoldingFeature.getType() != 1 && extensionFoldingFeature.getType() != 2) {
                return false;
            }
            Rect bounds = extensionFoldingFeature.getBounds();
            bounds.getClass();
            return hasMatchingDimension(bounds, rect);
        }

        public final DisplayFeature translateFoldFeature$window_release(Rect rect, ExtensionFoldingFeature extensionFoldingFeature) {
            FoldingFeature.Type type;
            FoldingFeature.State state;
            rect.getClass();
            extensionFoldingFeature.getClass();
            if (!isValid(rect, extensionFoldingFeature)) {
                return null;
            }
            int type2 = extensionFoldingFeature.getType();
            if (type2 == 1) {
                type = FoldingFeature.Type.FOLD;
            } else if (type2 != 2) {
                return null;
            } else {
                type = FoldingFeature.Type.HINGE;
            }
            int state2 = extensionFoldingFeature.getState();
            if (state2 == 1) {
                state = FoldingFeature.State.FLAT;
            } else if (state2 != 2) {
                return null;
            } else {
                state = FoldingFeature.State.HALF_OPENED;
            }
            Rect bounds = extensionFoldingFeature.getBounds();
            bounds.getClass();
            return new FoldingFeature(new Bounds(bounds), type, state);
        }
    }

    public ExtensionAdapter(WindowMetricsCalculator windowMetricsCalculator) {
        windowMetricsCalculator.getClass();
        this.windowMetricsCalculator = windowMetricsCalculator;
    }

    public final DisplayFeature translate(Activity activity, ExtensionDisplayFeature extensionDisplayFeature) {
        activity.getClass();
        extensionDisplayFeature.getClass();
        if (!(extensionDisplayFeature instanceof ExtensionFoldingFeature)) {
            return null;
        }
        return Companion.translateFoldFeature$window_release(this.windowMetricsCalculator.computeCurrentWindowMetrics(activity).getBounds(), (ExtensionFoldingFeature) extensionDisplayFeature);
    }

    public final WindowLayoutInfo translate(Activity activity, ExtensionWindowLayoutInfo extensionWindowLayoutInfo) {
        activity.getClass();
        extensionWindowLayoutInfo.getClass();
        List<ExtensionDisplayFeature> displayFeatures = extensionWindowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (ExtensionDisplayFeature extensionDisplayFeature : displayFeatures) {
            extensionDisplayFeature.getClass();
            DisplayFeature translate = translate(activity, extensionDisplayFeature);
            if (translate != null) {
                arrayList.add(translate);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
