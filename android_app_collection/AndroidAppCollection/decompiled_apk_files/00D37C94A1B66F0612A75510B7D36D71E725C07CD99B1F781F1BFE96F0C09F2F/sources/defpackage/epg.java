package defpackage;

import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: epg  reason: default package */
/* loaded from: classes3.dex */
public final class epg implements aafl {
    public final aafo a;
    public final yzj b;
    private final abcu c;
    private final ScheduledExecutorService d;
    private final Executor e;
    private final Runnable f;
    private final akgp g;
    private final afvn h;
    private final akhf i;
    private final akhi j;

    public epg(abcu abcuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, final akid akidVar, akgp akgpVar, afvn afvnVar, aafo aafoVar, yzj yzjVar, akhf akhfVar, akhi akhiVar) {
        this.c = abcuVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        this.e = executor;
        akidVar.getClass();
        this.f = new Runnable() { // from class: epf
            @Override // java.lang.Runnable
            public final void run() {
                akid.this.d();
            }
        };
        akgpVar.getClass();
        this.g = akgpVar;
        afvnVar.getClass();
        this.h = afvnVar;
        this.a = aafoVar;
        this.b = yzjVar;
        akhfVar.getClass();
        this.i = akhfVar;
        akhiVar.getClass();
        this.j = akhiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.h.t()) {
            this.d.execute(this.f);
        } else {
            this.g.a.getWritableDatabase().delete("suggestions", "1", null);
        }
        this.i.a();
        this.j.a();
        aopa createBuilder = SetSettingEndpointOuterClass$SetSettingEndpoint.a.createBuilder();
        String str = ((ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint) apzgVar.qm(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.clearSearchHistorySettingEndpoint)).b;
        createBuilder.copyOnWrite();
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = (SetSettingEndpointOuterClass$SetSettingEndpoint) createBuilder.instance;
        str.getClass();
        setSettingEndpointOuterClass$SetSettingEndpoint.b |= 1;
        setSettingEndpointOuterClass$SetSettingEndpoint.e = str;
        abct b = this.c.b();
        b.j(aafx.a(apzgVar));
        b.t((SetSettingEndpointOuterClass$SetSettingEndpoint) createBuilder.mo39build());
        ylx.l(this.c.e(b), this.e, new ylv() { // from class: epd
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                yzj yzjVar = epg.this.b;
                if (yzjVar != null) {
                    yzjVar.e(th);
                }
                zep.n("Error requesting SetSetting", th);
            }
        }, new ylw() { // from class: epe
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ascs ascsVar = (ascs) obj;
                aafo aafoVar = epg.this.a;
                if (aafoVar != null) {
                    aafoVar.d(ascsVar.c, null);
                }
            }
        }, anlf.a);
    }
}
