package defpackage;
/* compiled from: PG */
/* renamed from: aufx  reason: default package */
/* loaded from: classes2.dex */
public enum aufx {
    PRIMARY(1, dddv.f),
    SECONDARY(2, dddv.g),
    TERTIARY(3, dddv.i);
    
    public final int d;
    public final ddho e;

    aufx(int i, ddho ddhoVar) {
        this.d = i;
        this.e = ddhoVar;
    }

    public static aufx a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return PRIMARY;
            }
            return i2 != 1 ? TERTIARY : SECONDARY;
        }
        throw null;
    }
}
