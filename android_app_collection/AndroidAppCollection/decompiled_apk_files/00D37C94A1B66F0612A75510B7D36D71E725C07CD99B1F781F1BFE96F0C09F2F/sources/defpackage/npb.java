package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: npb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class npb implements zdt {
    public final /* synthetic */ npe a;
    public final /* synthetic */ Optional b;
    private final /* synthetic */ int c;

    public /* synthetic */ npb(npe npeVar, Optional optional) {
        this.a = npeVar;
        this.b = optional;
    }

    public /* synthetic */ npb(npe npeVar, Optional optional, int i) {
        this.c = i;
        this.a = npeVar;
        this.b = optional;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        aqvq aqvqVar;
        if (this.c != 0) {
            npe npeVar = this.a;
            Optional optional = this.b;
            atut atutVar = ((abal) obj).a;
            aafo aafoVar = npeVar.h;
            apzg apzgVar = atutVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            nmc nmcVar = (nmc) optional.get();
            nmcVar.j().D(new acte(atutVar.f));
            atuu atuuVar = atutVar.c;
            if (atuuVar == null) {
                atuuVar = atuu.a;
            }
            if (atuuVar.b == 138681066) {
                aqvqVar = (aqvq) atuuVar.c;
            } else {
                aqvqVar = aqvq.b;
            }
            nmcVar.x(aqvqVar, null, false);
            npe.b((nmc) optional.get(), false);
            return;
        }
        npe npeVar2 = this.a;
        nmc nmcVar2 = (nmc) this.b.get();
        String b = npeVar2.f.b((Throwable) obj);
        if (!(nmcVar2 instanceof nkh)) {
            return;
        }
        ((nkh) nmcVar2).d().b(b, false);
    }
}
