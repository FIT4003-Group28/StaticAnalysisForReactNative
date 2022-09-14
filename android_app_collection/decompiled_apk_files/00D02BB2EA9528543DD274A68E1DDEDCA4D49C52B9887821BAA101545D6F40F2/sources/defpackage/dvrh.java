package defpackage;
/* compiled from: PG */
/* renamed from: dvrh  reason: default package */
/* loaded from: classes6.dex */
public enum dvrh implements dsrb {
    UNKNOWN_RIDDLER_CLICK(0),
    EXIT(1),
    MORE_QUESTIONS(2),
    TIMELINE_LINK(3),
    LOCAL_GUIDE_OPT_IN_LINK(4);
    
    public final int f;

    dvrh(int i) {
        this.f = i;
    }

    public static dvrh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXIT;
            }
            if (i == 2) {
                return MORE_QUESTIONS;
            }
            if (i == 3) {
                return TIMELINE_LINK;
            }
            if (i == 4) {
                return LOCAL_GUIDE_OPT_IN_LINK;
            }
            return null;
        }
        return UNKNOWN_RIDDLER_CLICK;
    }

    public static dsrd c() {
        return dvrg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
