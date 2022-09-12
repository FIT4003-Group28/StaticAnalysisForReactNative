package defpackage;
/* compiled from: PG */
/* renamed from: dqut  reason: default package */
/* loaded from: classes6.dex */
public enum dqut implements dsrb {
    UNKNOWN_PASS_TYPE(0),
    US_WA_GOOD_TO_GO(1);
    
    public final int c;

    dqut(int i) {
        this.c = i;
    }

    public static dqut b(int i) {
        if (i != 0) {
            if (i == 1) {
                return US_WA_GOOD_TO_GO;
            }
            return null;
        }
        return UNKNOWN_PASS_TYPE;
    }

    public static dsrd c() {
        return dqus.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
