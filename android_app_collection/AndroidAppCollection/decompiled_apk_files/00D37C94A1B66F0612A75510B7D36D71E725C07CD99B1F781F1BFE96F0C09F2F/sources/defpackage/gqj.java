package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: gqj  reason: default package */
/* loaded from: classes3.dex */
public final class gqj extends lpi implements nnc, ynl {
    public boolean a;
    private final aafo b;
    private final ezh c;
    private final acrr d;
    private final axxe e;
    private apyr h;
    private aypg m;
    private final gqi n;

    public gqj(ajyi ajyiVar, yni yniVar, yzj yzjVar, ajin ajinVar, snc sncVar, iub iubVar, ampq ampqVar, ajxt ajxtVar, aari aariVar, acti actiVar, akam akamVar, ampq ampqVar2, aafo aafoVar, ezh ezhVar, acrr acrrVar, axxe axxeVar) {
        super(ajyiVar, yniVar, yzjVar, ajinVar, sncVar, iubVar, ampqVar, ajxtVar, aariVar, actiVar, akamVar);
        this.a = false;
        aqxo.p(ampqVar2.h());
        this.n = (gqi) ampqVar2.c();
        this.b = aafoVar;
        this.c = ezhVar;
        this.d = acrrVar;
        this.e = axxeVar;
    }

    @Override // defpackage.nnc
    public final void d() {
        if (this.h != null && !this.n.s()) {
            if (this.n.t() && this.c.g().i()) {
                apyr apyrVar = this.h;
                if ((apyrVar.b & 1) != 0) {
                    aafo aafoVar = this.b;
                    apzg apzgVar = apyrVar.c;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            }
            if (!this.n.t()) {
                apyr apyrVar2 = this.h;
                if ((apyrVar2.b & 2) != 0) {
                    aafo aafoVar2 = this.b;
                    apzg apzgVar2 = apyrVar2.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.a(apzgVar2);
                    if (this.a) {
                        acrr acrrVar = this.d;
                        arrf a = arrh.a();
                        aopa createBuilder = apyt.a.createBuilder();
                        String h = this.n.h();
                        createBuilder.copyOnWrite();
                        apyt apytVar = (apyt) createBuilder.instance;
                        h.getClass();
                        apytVar.b |= 1;
                        apytVar.c = h;
                        a.copyOnWrite();
                        ((arrh) a.instance).ci((apyt) createBuilder.mo39build());
                        acrrVar.c((arrh) a.mo39build());
                    }
                }
            }
        }
        this.n.o();
        aypg aypgVar = this.m;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.m = null;
        }
    }

    @Override // defpackage.nnc
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.nnc
    public final void h() {
        this.n.p();
        this.m = this.e.a.a.V(axwv.t).B().at(new ayqb() { // from class: gqh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gqj.this.a = ((Boolean) obj).booleanValue();
            }
        }, fzc.q);
    }

    @Override // defpackage.lpi, defpackage.ajyq
    public final void i(aakq aakqVar) {
        super.i(aakqVar);
        for (Object obj : aakqVar.b()) {
            if (obj instanceof apyr) {
                this.h = (apyr) obj;
            }
        }
    }

    @Override // defpackage.nnc
    public final void pc() {
    }

    @Override // defpackage.nnc
    public final void pd() {
    }

    @Override // defpackage.lpi, defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == gqj.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, aabk.class, aabm.class, aawi.class, aawj.class, ajym.class};
                case 0:
                    n((isw) obj);
                    return null;
                case 1:
                    nn((aabk) obj);
                    return null;
                case 2:
                    no((aabm) obj);
                    return null;
                case 3:
                    N((aawi) obj);
                    return null;
                case 4:
                    o((aawj) obj);
                    return null;
                case 5:
                    M((ajym) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
