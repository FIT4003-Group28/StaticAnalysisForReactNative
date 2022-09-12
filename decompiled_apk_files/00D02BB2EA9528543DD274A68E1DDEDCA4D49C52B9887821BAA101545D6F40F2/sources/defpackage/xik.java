package defpackage;
/* compiled from: PG */
/* renamed from: xik  reason: default package */
/* loaded from: classes7.dex */
public class xik extends qjg implements xii {
    public xik(cqhn cqhnVar, String str, dqvh dqvhVar, @dzsi cqtd cqtdVar, Boolean bool, cqkn<qjc> cqknVar, @dzsi ddho ddhoVar) {
        super(cqhnVar, str, bool, cqknVar, null, ddhoVar);
        cqtd b = ynf.b(dqvhVar);
        if (b != null) {
            this.a = cqrt.i(b, ibm.p());
        }
    }

    public void g(@dzsi String str, vtn vtnVar) {
        if (str == null) {
            this.a = null;
        } else {
            this.a = vtnVar.f(str, bvlw.a, new vtk(this) { // from class: xij
                private final xik a;

                {
                    this.a = this;
                }

                @Override // defpackage.vtk
                public final void a(cqtd cqtdVar) {
                    xik xikVar = this.a;
                    xikVar.a = cqtdVar;
                    cqkx.p(xikVar);
                }
            });
        }
    }

    public xik(cqhn cqhnVar, String str, dqvh dqvhVar, Boolean bool, cqkn<qjc> cqknVar, @dzsi ddho ddhoVar) {
        this(cqhnVar, str, dqvhVar, null, bool, cqknVar, ddhoVar);
    }
}
