package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lju  reason: default package */
/* loaded from: classes3.dex */
public final class lju {
    public final aadd a;
    private final acrr b;
    private final yve c;
    private final ayor d;

    public lju(acrr acrrVar, aadd aaddVar, aacz aaczVar, final ehh ehhVar, yve yveVar, ayor ayorVar) {
        this.b = acrrVar;
        this.a = aaddVar;
        this.c = yveVar;
        this.d = ayorVar;
        ayoi aA = aaddVar.a.V(ktg.j).V(ktg.k).af(new ayqe() { // from class: ljs
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                ehh ehhVar2 = ehh.this;
                if (((Boolean) obj).booleanValue()) {
                    return ehhVar2.g();
                }
                return ayoi.G();
            }
        }).V(new ayqe() { // from class: ljt
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                lju ljuVar = lju.this;
                egw egwVar = (egw) obj;
                boolean z = egwVar.c;
                boolean z2 = egwVar.f;
                aopa createBuilder = aphr.a.createBuilder();
                if (eog.B(ljuVar.a)) {
                    createBuilder.copyOnWrite();
                    aphr aphrVar = (aphr) createBuilder.instance;
                    aphrVar.b |= 131072;
                    aphrVar.c = z;
                    createBuilder.copyOnWrite();
                    aphr aphrVar2 = (aphr) createBuilder.instance;
                    aphrVar2.b |= 262144;
                    aphrVar2.d = z2;
                }
                return (aphr) createBuilder.mo39build();
            }
        }).V(ktg.i).ad(amon.a).B().aA();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ayrd.b(timeUnit, "unit is null");
        azje azjeVar = new azje(aA, timeUnit);
        azqc.i();
        azjeVar.as(new ljr(this, 1));
        if (eog.az(aaczVar)) {
            aynx af = yveVar.d().C(new ktg(8)).n().C(ktg.i).M(amon.a).af(2);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            ayrd.b(timeUnit2, "unit is null");
            ayzz ayzzVar = new ayzz(af, timeUnit2);
            azqc.j();
            ayzzVar.Z(new ljr(this));
        }
    }

    public final void a(ampq ampqVar, ampq ampqVar2, long j) {
        if (!ampqVar2.h()) {
            return;
        }
        acrr acrrVar = this.b;
        int i = (int) j;
        aopa createBuilder = aphs.a.createBuilder();
        createBuilder.copyOnWrite();
        aphs aphsVar = (aphs) createBuilder.instance;
        aphsVar.d = (aphr) ampqVar2.c();
        aphsVar.b |= 2;
        if (ampqVar.h()) {
            createBuilder.copyOnWrite();
            aphs aphsVar2 = (aphs) createBuilder.instance;
            aphsVar2.b |= 1;
            aphsVar2.c = i;
            createBuilder.copyOnWrite();
            aphs aphsVar3 = (aphs) createBuilder.instance;
            aphsVar3.e = (aphr) ampqVar.c();
            aphsVar3.b |= 4;
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).bZ((aphs) createBuilder.mo39build());
        acrrVar.c((arrh) a.mo39build());
    }
}
