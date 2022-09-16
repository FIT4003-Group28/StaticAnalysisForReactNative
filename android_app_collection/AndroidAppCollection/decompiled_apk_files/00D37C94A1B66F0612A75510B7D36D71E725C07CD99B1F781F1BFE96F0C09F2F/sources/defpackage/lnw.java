package defpackage;
/* compiled from: PG */
/* renamed from: lnw  reason: default package */
/* loaded from: classes3.dex */
public class lnw {
    public final ajru a;
    public final ajsm b;
    public final int c;
    public final int d;

    public lnw(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
        this.a = ajruVar;
        this.b = ajsmVar;
        this.c = i;
        this.d = i2;
    }

    public static lnr a(final yni yniVar) {
        return new lnr() { // from class: lnv
            @Override // defpackage.lnr
            public final void oM(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
                yni.this.d(new lnw(ajruVar, ajsmVar, i, i2));
            }
        };
    }
}
