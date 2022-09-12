package defpackage;
/* compiled from: PG */
/* renamed from: ddhj  reason: default package */
/* loaded from: classes5.dex */
public enum ddhj implements dsrb {
    VISIBILITY_VISIBLE(0),
    VISIBILITY_HIDDEN(1),
    VISIBILITY_REPRESSED_COUNTERFACTUAL(2),
    VISIBILITY_CHILDREN_HIDDEN(3),
    VISIBILITY_REPRESSED_PRIVACY(4);
    
    public final int g;
    public static final ddhj f = VISIBILITY_REPRESSED_COUNTERFACTUAL;

    ddhj(int i) {
        this.g = i;
    }

    public static ddhj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VISIBILITY_HIDDEN;
            }
            if (i == 2) {
                return VISIBILITY_REPRESSED_COUNTERFACTUAL;
            }
            if (i == 3) {
                return VISIBILITY_CHILDREN_HIDDEN;
            }
            if (i == 4) {
                return VISIBILITY_REPRESSED_PRIVACY;
            }
            return null;
        }
        return VISIBILITY_VISIBLE;
    }

    public static dsrd c() {
        return ddhi.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
