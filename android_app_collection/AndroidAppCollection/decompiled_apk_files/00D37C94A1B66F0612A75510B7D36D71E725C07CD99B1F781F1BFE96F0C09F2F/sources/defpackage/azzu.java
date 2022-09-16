package defpackage;
/* compiled from: PG */
/* renamed from: azzu  reason: default package */
/* loaded from: classes2.dex */
public enum azzu implements aopm {
    UNKNOWN(0),
    CRONET(1);
    
    public final int c;

    azzu(int i) {
        this.c = i;
    }

    public static aopo a() {
        return axce.n;
    }

    public static azzu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CRONET;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
