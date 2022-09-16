package defpackage;
/* compiled from: PG */
/* renamed from: lny  reason: default package */
/* loaded from: classes3.dex */
public class lny {
    public final ajru a;
    public final ajsm b;
    public final int c;
    public final int d;

    public lny(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
        this.a = ajruVar;
        this.b = ajsmVar;
        this.c = i;
        this.d = i2;
    }

    public static lns a(final yni yniVar) {
        return new lns() { // from class: lnx
            @Override // defpackage.lns
            public final void b(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
                yni.this.d(new lny(ajruVar, ajsmVar, i, i2));
            }
        };
    }
}
