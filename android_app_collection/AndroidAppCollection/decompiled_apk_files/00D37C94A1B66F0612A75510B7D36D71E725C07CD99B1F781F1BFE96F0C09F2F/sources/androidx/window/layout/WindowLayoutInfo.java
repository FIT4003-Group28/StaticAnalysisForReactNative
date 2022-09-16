package androidx.window.layout;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WindowLayoutInfo {
    private final List displayFeatures;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Builder {
        private List displayFeatures = azqp.a;

        public final WindowLayoutInfo build() {
            return new WindowLayoutInfo(azqn.c(this.displayFeatures));
        }

        public final Builder setDisplayFeatures(List list) {
            list.getClass();
            this.displayFeatures = azqn.c(list);
            return this;
        }
    }

    public WindowLayoutInfo(List list) {
        list.getClass();
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && azst.c(getClass(), obj.getClass())) {
            return azst.c(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
        }
        return false;
    }

    public final List getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        List list = this.displayFeatures;
        list.getClass();
        StringBuilder sb = new StringBuilder();
        azqn.e(list, sb, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }");
        String sb2 = sb.toString();
        sb2.getClass();
        return sb2;
    }
}
