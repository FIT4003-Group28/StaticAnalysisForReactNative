package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class FoldingFeature implements DisplayFeature {
    public static final Companion Companion = new Companion(null);
    public static final int OCCLUSION_FULL = 1;
    public static final int OCCLUSION_NONE = 0;
    public static final int ORIENTATION_HORIZONTAL = 1;
    public static final int ORIENTATION_VERTICAL = 0;
    public static final int STATE_FLAT = 1;
    public static final int STATE_HALF_OPENED = 2;
    public static final int TYPE_FOLD = 1;
    public static final int TYPE_HINGE = 2;
    private final Bounds featureBounds;
    private final State state;
    private final Type type;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            bounds.getClass();
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class OcclusionType {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final OcclusionType NONE = new OcclusionType("NONE");
        public static final OcclusionType FULL = new OcclusionType("FULL");

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azsr azsrVar) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Orientation {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azsr azsrVar) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class State {
        public static final Companion Companion = new Companion(null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azsr azsrVar) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Type {
        public static final Companion Companion = new Companion(null);
        public static final Type FOLD = new Type("FOLD");
        public static final Type HINGE = new Type("HINGE");
        private final String description;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azsr azsrVar) {
                this();
            }

            public final Type from$window_release(int i) {
                if (i != 1) {
                    if (i == 2) {
                        return Type.HINGE;
                    }
                    throw new IllegalArgumentException(azst.a(FoldingFeature.class.getSimpleName(), " incorrect type value"));
                }
                return Type.FOLD;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FoldingFeature(Rect rect, Type type, State state) {
        this(new Bounds(rect), type, state);
        rect.getClass();
        type.getClass();
        state.getClass();
    }

    @Override // androidx.window.layout.DisplayFeature
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    public final OcclusionType getOcclusionType() {
        return (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) ? OcclusionType.NONE : OcclusionType.FULL;
    }

    public final Orientation getOrientation() {
        return this.featureBounds.getWidth() > this.featureBounds.getHeight() ? Orientation.HORIZONTAL : Orientation.VERTICAL;
    }

    public final State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean isSeparating() {
        if (azst.c(this.type, Type.HINGE)) {
            return true;
        }
        return azst.c(this.type, Type.FOLD) && azst.c(this.state, State.HALF_OPENED);
    }

    public String toString() {
        return ((Object) "FoldingFeature") + " { " + this.featureBounds + ", type=" + this.type + ", state=" + this.state + " }";
    }

    public FoldingFeature(Bounds bounds, Type type, State state) {
        bounds.getClass();
        type.getClass();
        state.getClass();
        this.featureBounds = bounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!azst.c(getClass(), obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            FoldingFeature foldingFeature = (FoldingFeature) obj;
            return azst.c(this.featureBounds, foldingFeature.featureBounds) && azst.c(this.type, foldingFeature.type) && azst.c(this.state, foldingFeature.state);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.FoldingFeature");
    }
}
