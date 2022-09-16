package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abcs  reason: default package */
/* loaded from: classes.dex */
public final class abcs implements aafl {
    public final azqb a;
    public final yzj b;
    private final abcu c;
    private final Executor d;

    public abcs(abcu abcuVar, azqb azqbVar, yzj yzjVar, Executor executor) {
        this.c = abcuVar;
        this.a = azqbVar;
        this.b = yzjVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        abct b = this.c.b();
        b.j(aafx.a(apzgVar));
        b.t((SetSettingEndpointOuterClass$SetSettingEndpoint) apzgVar.qm(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint));
        ylx.l(this.c.e(b), this.d, new ylv() { // from class: abcq
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                yzj yzjVar = abcs.this.b;
                if (yzjVar != null) {
                    yzjVar.e(th);
                }
                zep.n("Error requesting SetSetting", th);
            }
        }, new ylw() { // from class: abcr
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                abcs abcsVar = abcs.this;
                Map map2 = map;
                apzg apzgVar2 = apzgVar;
                ascs ascsVar = (ascs) obj;
                if (abcsVar.a != null) {
                    ((aafo) abcsVar.a.get()).e(((SetSettingEndpointOuterClass$SetSettingEndpoint) apzgVar2.qm(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint)).f, zew.I(map2, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
                    ((aafo) abcsVar.a.get()).e(ascsVar.c, null);
                }
            }
        }, anlf.a);
    }
}
