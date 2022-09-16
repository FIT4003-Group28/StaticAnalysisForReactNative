package defpackage;
/* compiled from: PG */
/* renamed from: arou  reason: default package */
/* loaded from: classes2.dex */
public enum arou implements aopm {
    UNKNOWN_FORM_FACTOR(0),
    SMALL_FORM_FACTOR(1),
    LARGE_FORM_FACTOR(2),
    AUTOMOTIVE_FORM_FACTOR(3),
    WEARABLE_FORM_FACTOR(4);
    
    public final int f;

    arou(int i) {
        this.f = i;
    }

    public static aopo a() {
        return arka.q;
    }

    public static arou b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SMALL_FORM_FACTOR;
            }
            if (i == 2) {
                return LARGE_FORM_FACTOR;
            }
            if (i == 3) {
                return AUTOMOTIVE_FORM_FACTOR;
            }
            if (i == 4) {
                return WEARABLE_FORM_FACTOR;
            }
            return null;
        }
        return UNKNOWN_FORM_FACTOR;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
