package defpackage;
/* compiled from: PG */
/* renamed from: dibx  reason: default package */
/* loaded from: classes6.dex */
public enum dibx implements dsrb {
    UNKNOWN_CARD_TYPE(0),
    SUICA(1);
    
    public final int c;

    dibx(int i) {
        this.c = i;
    }

    public static dibx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUICA;
            }
            return null;
        }
        return UNKNOWN_CARD_TYPE;
    }

    public static dsrd c() {
        return dibw.a;
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
