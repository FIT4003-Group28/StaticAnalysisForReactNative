package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, c = {xaj.class, xbd.class})
/* renamed from: wpw  reason: default package */
/* loaded from: classes4.dex */
public final class wpw implements wqg {
    private final wqf a;
    private final xdu b;
    private final xci c;
    private final List d;
    private final List e;
    private final wmt f;
    private final ecf g;

    public wpw(wqf wqfVar, xdu xduVar, xci xciVar, ecf ecfVar, wmt wmtVar) {
        this.a = wqfVar;
        this.b = xduVar;
        this.c = xciVar;
        this.g = ecfVar;
        this.f = wmtVar;
        this.d = (List) xciVar.e(xaj.class);
        this.e = (List) xciVar.e(xbd.class);
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        asjj asjjVar;
        aqvq aqvqVar;
        try {
            ecf ecfVar = this.g;
            List<aqvm> list = this.d;
            asit asitVar = (asit) this.c.i.f();
            if (asitVar != null) {
                aopa createBuilder = asjj.a.createBuilder();
                createBuilder.copyOnWrite();
                asjj asjjVar2 = (asjj) createBuilder.instance;
                asjjVar2.t = asitVar;
                asjjVar2.c |= 1024;
                asjjVar = (asjj) createBuilder.mo39build();
            } else {
                asjjVar = null;
            }
            for (aqvm aqvmVar : list) {
                nml a = ecfVar.a();
                if (aqvmVar.b == 138681066) {
                    aqvqVar = (aqvq) aqvmVar.c;
                } else {
                    aqvqVar = aqvq.b;
                }
                a.r(aqvqVar, asjjVar);
            }
            if (this.c.f(xbu.class) && this.c.f(xbs.class)) {
                this.f.b((apzg) this.c.e(xbu.class), (Map) this.c.e(xbs.class));
            }
            this.a.a(this.b, this.c);
        } catch (wlb e) {
            this.a.c(this.b, this.c, new wuo(e.getMessage()));
        }
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        try {
            ecf ecfVar = this.g;
            for (String str : this.e) {
                nml a = ecfVar.a();
                str.getClass();
                a.n(new eqa(str, 1));
            }
        } catch (wlb e) {
            wwf.b(this.b, this.c, e.getMessage());
        }
        this.a.d(this.b, this.c, i);
    }
}
