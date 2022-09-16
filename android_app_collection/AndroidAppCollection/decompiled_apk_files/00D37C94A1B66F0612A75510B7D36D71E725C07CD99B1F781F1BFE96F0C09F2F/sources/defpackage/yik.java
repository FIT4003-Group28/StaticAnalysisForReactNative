package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: PG */
/* renamed from: yik  reason: default package */
/* loaded from: classes4.dex */
public final class yik extends yjg {
    private final azqb a;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final Executor k;

    public yik(Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        this.k = executor;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
        this.g = azqbVar6;
        this.h = azqbVar7;
        this.i = azqbVar8;
        this.j = azqbVar9;
    }

    @Override // defpackage.yjg
    protected final void a() {
        boolean z = ((adph) this.j.get()).a;
        this.c.get();
        yxv yxvVar = (yxv) this.d.get();
        yxvVar.c.schedule(new yxu(yxvVar, 1), 10000L, TimeUnit.MILLISECONDS);
        ((yni) this.h.get()).g((yxp) this.e.get());
        yme ymeVar = (yme) this.g.get();
        apfo apfoVar = ymeVar.a().d;
        if (apfoVar == null) {
            apfoVar = apfo.a;
        }
        if (apfoVar != null) {
            apfq apfqVar = apfoVar.c;
            if (apfqVar == null) {
                apfqVar = apfq.a;
            }
            if ((apfqVar.b & 1) != 0) {
                apfo apfoVar2 = ymeVar.a().d;
                if (apfoVar2 == null) {
                    apfoVar2 = apfo.a;
                }
                apfq apfqVar2 = apfoVar2.c;
                if (apfqVar2 == null) {
                    apfqVar2 = apfq.a;
                }
                apfz apfzVar = apfqVar2.c;
                if (apfzVar == null) {
                    apfzVar = apfz.a;
                }
                if (apfzVar.e) {
                    HttpsURLConnection.setDefaultSSLSocketFactory(new yro(HttpsURLConnection.getDefaultSSLSocketFactory()));
                }
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            yqn yqnVar = (yqn) this.f.get();
            if (ymeVar.c().h) {
                yqnVar.b((Executor) this.i.get());
            } else {
                yqnVar.b(this.k);
            }
        }
    }
}
