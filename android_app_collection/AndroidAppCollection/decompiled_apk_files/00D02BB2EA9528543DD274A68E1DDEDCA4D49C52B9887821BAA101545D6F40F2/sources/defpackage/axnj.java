package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axnj  reason: default package */
/* loaded from: classes3.dex */
public class axnj implements axnf {
    public final axnt a;
    public final dfqc d;
    private final mw<String> f;
    public int e = 0;
    public final List<axns> b = new ArrayList();
    public final List<diyq> c = new ArrayList();

    public axnj(axnt axntVar, dfqc dfqcVar, mw<String> mwVar) {
        this.a = axntVar;
        this.d = dfqcVar;
        this.f = mwVar;
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        if (this.b.size() < 5 || this.b.indexOf(cqkpVar) != this.b.size() - 5) {
            return;
        }
        dqau dqauVar = ((axns) dcft.s(this.b)).b.b;
        if (dqauVar == null) {
            dqauVar = dqau.e;
        }
        dqkn dqknVar = dqauVar.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        this.f.a(dqknVar.d);
    }

    @Override // defpackage.axnf
    public List<axns> a() {
        return this.b;
    }

    public void b(List<diyq> list) {
        this.c.addAll(list);
        this.b.addAll(dchl.k(list, new dbrn(this) { // from class: axng
            private final axnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final axnj axnjVar = this.a;
                diyq diyqVar = (diyq) obj;
                axnt axntVar = axnjVar.a;
                dfqc dfqcVar = axnjVar.d;
                mw<axns> mwVar = new mw(axnjVar) { // from class: axnh
                    private final axnj a;

                    {
                        this.a = axnjVar;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        axnj axnjVar2 = this.a;
                        axns axnsVar = (axns) obj2;
                        axnjVar2.b.remove(axnsVar);
                        axnjVar2.c.remove(axnsVar.b);
                        cqkx.p(axnjVar2);
                    }
                };
                cjta b = cjtd.b();
                b.g(diyqVar.a);
                int i = axnjVar.e;
                axnjVar.e = i + 1;
                b.i(i);
                return axntVar.a(diyqVar, dfqcVar, mwVar, b);
            }
        }));
    }
}
