package defpackage;
/* compiled from: PG */
/* renamed from: avjt  reason: default package */
/* loaded from: classes3.dex */
public enum avjt implements dsrb {
    UNKNOWN_INTERVAL_CHECK(0),
    NO_INTERVAL_CHECK(2),
    RELAXED(3);
    
    public final int d;

    avjt(int i) {
        this.d = i;
    }

    public static avjt b(int i) {
        if (i != 0) {
            if (i == 2) {
                return NO_INTERVAL_CHECK;
            }
            if (i == 3) {
                return RELAXED;
            }
            return null;
        }
        return UNKNOWN_INTERVAL_CHECK;
    }

    public static dsrd c() {
        return avjs.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
