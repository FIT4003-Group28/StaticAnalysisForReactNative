package defpackage;
/* compiled from: PG */
/* renamed from: hqv  reason: default package */
/* loaded from: classes3.dex */
public abstract class hqv extends dp implements hvn, hqu {
    private hqt a;
    public dxy ay;

    @Override // defpackage.hqu
    public final hqt h() {
        ylr.c();
        if (this.a == null) {
            dxy dxyVar = this.ay;
            dyo dyoVar = dxyVar.a;
            eam eamVar = dxyVar.c;
            this.a = new dya(dyoVar, dxyVar.b, this);
        }
        return this.a;
    }
}
