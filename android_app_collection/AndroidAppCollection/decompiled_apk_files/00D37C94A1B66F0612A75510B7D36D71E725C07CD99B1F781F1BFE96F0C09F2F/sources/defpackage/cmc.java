package defpackage;
/* compiled from: PG */
/* renamed from: cmc  reason: default package */
/* loaded from: classes2.dex */
public final class cmc extends cuz {
    public cki a;

    public cmc(long j) {
        super(j);
    }

    @Override // defpackage.cuz
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        cku ckuVar = (cku) obj;
        if (ckuVar == null) {
            return 1;
        }
        return ckuVar.a();
    }

    public final /* bridge */ /* synthetic */ cku b(chy chyVar) {
        return (cku) super.h(chyVar);
    }

    @Override // defpackage.cuz
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        chy chyVar = (chy) obj;
        cku ckuVar = (cku) obj2;
        cki ckiVar = this.a;
        if (ckiVar == null || ckuVar == null) {
            return;
        }
        ckiVar.b.a(ckuVar, true);
    }

    public final /* bridge */ /* synthetic */ void d(chy chyVar, cku ckuVar) {
        cku ckuVar2 = (cku) super.g(chyVar, ckuVar);
    }
}
