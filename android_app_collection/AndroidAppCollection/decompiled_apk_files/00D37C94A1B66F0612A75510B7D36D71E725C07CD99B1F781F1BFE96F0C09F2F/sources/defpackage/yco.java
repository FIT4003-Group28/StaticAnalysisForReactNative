package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: yco  reason: default package */
/* loaded from: classes4.dex */
public final class yco implements aafl {
    public final ydq a;
    private final ydl b;

    public yco(ydl ydlVar, ydq ydqVar) {
        this.b = ydlVar;
        this.a = ydqVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aslc aslcVar = (aslc) apzgVar.qm(aslc.b);
        ydl ydlVar = this.b;
        byte[] I = aslcVar.c.I();
        byte[] I2 = aslcVar.d.I();
        ydlVar.d.add(new ycn(this));
        ylx.n(ydlVar.b, ((abfh) ydlVar.c.get()).c(), new ydj(ydlVar, I, I2), new ydj(ydlVar, I, I2, 1));
    }
}
