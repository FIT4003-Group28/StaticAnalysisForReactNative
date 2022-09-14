package defpackage;
/* compiled from: PG */
/* renamed from: dfqp  reason: default package */
/* loaded from: classes6.dex */
public enum dfqp implements dsrb {
    PHOTO_SERVICE(0),
    SHOEBOX(1);
    
    public final int c;

    dfqp(int i) {
        this.c = i;
    }

    public static dfqp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SHOEBOX;
            }
            return null;
        }
        return PHOTO_SERVICE;
    }

    public static dsrd c() {
        return dfqo.a;
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
