package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ejm  reason: default package */
/* loaded from: classes3.dex */
public final class ejm implements aafl {
    public final acth a;
    public final aafo b;
    private final dt c;
    private final aath d;
    private final yzj e;
    private final Executor f;

    public ejm(dt dtVar, aath aathVar, acth acthVar, yzj yzjVar, aafo aafoVar, Executor executor) {
        this.c = dtVar;
        this.d = aathVar;
        this.a = acthVar;
        this.e = yzjVar;
        this.b = aafoVar;
        this.f = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aptf aptfVar = (aptf) apzgVar.qm(aptf.b);
        ajfz ajfzVar = null;
        if ((aptfVar.c & 2) != 0) {
            aptg aptgVar = aptfVar.d;
            if (aptgVar == null) {
                aptgVar = aptg.a;
            }
            int i = aptgVar.b;
            if ((i & 2) != 0) {
                aumx aumxVar = aptgVar.d;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                ajfzVar = ajna.g(aumxVar);
            } else if ((i & 1) != 0) {
                atof atofVar = aptgVar.c;
                if (atofVar == null) {
                    atofVar = atof.a;
                }
                ajfzVar = ajna.g(atofVar);
            }
        }
        if (ajfzVar == null) {
            zep.b("Invalid continuation in ChannelPageContinuationCommand");
            return;
        }
        aatf f = this.d.f();
        f.u(ajfzVar);
        f.j(apzgVar.c);
        dt dtVar = this.c;
        ankt h = this.d.h(f, this.f);
        yzj yzjVar = this.e;
        yzjVar.getClass();
        ylx.n(dtVar, h, new epl(yzjVar, 1), new zdt() { // from class: ejl
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ejm ejmVar = ejm.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                byte[] d = browseResponseModel != null ? browseResponseModel.d() : null;
                if (browseResponseModel == null || d == null) {
                    return;
                }
                ejmVar.a.oi().D(new acte(d));
                arlt arltVar = browseResponseModel.a;
                ejmVar.b.b(arltVar.n);
                ejmVar.b.b(arltVar.o);
            }
        });
    }
}
