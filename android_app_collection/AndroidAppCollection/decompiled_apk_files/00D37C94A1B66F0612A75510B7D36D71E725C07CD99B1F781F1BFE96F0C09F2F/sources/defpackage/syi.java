package defpackage;
/* compiled from: PG */
/* renamed from: syi  reason: default package */
/* loaded from: classes4.dex */
public final class syi implements aynv {
    public final teb a;
    public final tda b;

    public syi(teb tebVar) {
        this.a = tebVar;
        this.b = tda.a;
    }

    public syi(teb tebVar, tda tdaVar) {
        this.a = tebVar;
        this.b = tdaVar;
    }

    @Override // defpackage.aynv
    public final aynu a(aynr aynrVar) {
        return aynrVar.q(new ayqb() { // from class: syh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                syi syiVar = syi.this;
                syiVar.a.a(31, "Command error", syiVar.b, (Throwable) obj);
            }
        }).C();
    }
}
