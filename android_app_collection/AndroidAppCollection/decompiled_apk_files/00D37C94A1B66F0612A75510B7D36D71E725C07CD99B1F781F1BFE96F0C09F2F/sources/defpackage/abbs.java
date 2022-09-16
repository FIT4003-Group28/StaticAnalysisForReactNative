package defpackage;

import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abbs  reason: default package */
/* loaded from: classes.dex */
public final class abbs implements aafl {
    public static final /* synthetic */ int a = 0;
    private final abbu b;
    private final azqb c;
    private final Executor d;

    public abbs(abbu abbuVar, azqb azqbVar, Executor executor) {
        abbuVar.getClass();
        this.b = abbuVar;
        this.c = azqbVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        azqb azqbVar;
        afzf afzfVar = (afzf) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afzf.class);
        if (afzfVar == null && (azqbVar = this.c) != null) {
            xnc xncVar = (xnc) azqbVar.get();
            zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (xncVar != null) {
                afzfVar = xncVar;
            }
        }
        if (afzfVar == null) {
            return;
        }
        abbu abbuVar = this.b;
        abbt abbtVar = new abbt(abbuVar.e, abbuVar.a.c());
        abbtVar.a = abbt.g(((GetReportFormEndpointOuterClass$GetReportFormEndpoint) apzgVar.qm(GetReportFormEndpointOuterClass$GetReportFormEndpoint.getReportFormEndpoint)).b);
        abbtVar.j(aafx.a(apzgVar));
        ylx.l(this.b.b.a(abbtVar), this.d, new itc(afzfVar, 3), new itd(afzfVar, 3), anlf.a);
    }
}
