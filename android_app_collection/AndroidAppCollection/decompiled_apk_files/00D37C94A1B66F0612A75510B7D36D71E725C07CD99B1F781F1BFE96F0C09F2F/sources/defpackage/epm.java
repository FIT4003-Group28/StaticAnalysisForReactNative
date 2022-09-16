package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: epm  reason: default package */
/* loaded from: classes3.dex */
public final class epm implements aafl {
    public final aafo a;
    private final aaub b;
    private final yzj c;
    private final Executor d;
    private final dt e;

    public epm(aaub aaubVar, yzj yzjVar, aafo aafoVar, Executor executor, dt dtVar) {
        aaubVar.getClass();
        this.b = aaubVar;
        yzjVar.getClass();
        this.c = yzjVar;
        aafoVar.getClass();
        this.a = aafoVar;
        this.d = executor;
        this.e = dtVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        aaub aaubVar = this.b;
        aatt aattVar = new aatt(aaubVar.e, aaubVar.a.c());
        final aqln aqlnVar = (aqln) apzgVar.qm(aqln.b);
        aattVar.a = aqlnVar.c;
        aattVar.j(apzgVar.c);
        dt dtVar = this.e;
        aaub aaubVar2 = this.b;
        Executor executor = this.d;
        if (aaubVar2.c == null) {
            aaubVar2.c = new aatu(aaubVar2.b, aaubVar2.f);
        }
        ylx.n(dtVar, aaubVar2.c.g(aattVar, executor), new epl(this.c), new zdt() { // from class: epk
            @Override // defpackage.zdt
            public final void a(Object obj) {
                epm epmVar = epm.this;
                aqln aqlnVar2 = aqlnVar;
                Map map2 = map;
                Void r4 = (Void) obj;
                if (aqlnVar2.d.size() > 0) {
                    epmVar.a.d(aqlnVar2.d, map2);
                }
            }
        });
    }
}
