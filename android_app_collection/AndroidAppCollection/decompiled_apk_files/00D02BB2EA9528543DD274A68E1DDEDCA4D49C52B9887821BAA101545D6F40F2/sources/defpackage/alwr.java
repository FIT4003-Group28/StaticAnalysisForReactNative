package defpackage;
/* compiled from: PG */
/* renamed from: alwr  reason: default package */
/* loaded from: classes.dex */
public enum alwr implements dsrb {
    DEFAULT(0),
    DRAW_OVER_LABELS(1),
    DRAW_OVER_LABELS_AND_CALLOUTS(2);
    
    public static final dsrc<alwr> d = new dsrc<alwr>() { // from class: alwq
        @Override // defpackage.dsrc
        public final /* bridge */ /* synthetic */ alwr a(int i) {
            return alwr.b(i);
        }
    };
    private final int e;

    alwr(int i) {
        this.e = i;
    }

    public static alwr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DRAW_OVER_LABELS;
            }
            if (i == 2) {
                return DRAW_OVER_LABELS_AND_CALLOUTS;
            }
            return null;
        }
        return DEFAULT;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
