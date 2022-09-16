package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aawm  reason: default package */
/* loaded from: classes.dex */
public final class aawm implements aafl {
    public final yzj a;
    public final Context b;
    public final aafo c;
    private final aawn d;

    public aawm(Context context, aawn aawnVar, yzj yzjVar, aafo aafoVar) {
        aawnVar.getClass();
        this.d = aawnVar;
        yzjVar.getClass();
        this.a = yzjVar;
        this.b = context;
        aafoVar.getClass();
        this.c = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aawk a = this.d.a();
        a.j(aafx.a(apzgVar));
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = (FlagEndpointOuterClass$FlagEndpoint) apzgVar.qm(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint);
        a.a = flagEndpointOuterClass$FlagEndpoint.b;
        int g = araa.g(flagEndpointOuterClass$FlagEndpoint.c);
        if (g == 0) {
            g = 1;
        }
        a.t = g;
        a.b = (String) zew.K(map, "com.google.android.libraries.youtube.innertube.services.flags.user_comments", String.class);
        a.c = ((Boolean) zew.J(map, "com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", false)).booleanValue();
        a.d = (arsa) zew.K(map, "com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", arsa.class);
        a.s = (arse) zew.K(map, "com.google.android.libraries.youtube.innertube.services.flags.video_report_details", arse.class);
        afzf afzfVar = (afzf) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afzf.class);
        if (afzfVar == null) {
            afzfVar = new aawl(this, map);
        }
        this.d.b(a, afzfVar);
    }
}
