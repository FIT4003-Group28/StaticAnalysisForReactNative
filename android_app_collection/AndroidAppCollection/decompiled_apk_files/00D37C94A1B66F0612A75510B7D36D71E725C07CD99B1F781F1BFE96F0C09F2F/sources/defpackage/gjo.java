package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjo  reason: default package */
/* loaded from: classes3.dex */
public final class gjo implements aafl {
    public final mrx a;
    public final acth b;
    private final Executor c;
    private final aath d;

    public gjo(mrx mrxVar, aath aathVar, acth acthVar, Executor executor) {
        this.a = mrxVar;
        this.d = aathVar;
        this.b = acthVar;
        this.c = executor;
    }

    public final void b(aatf aatfVar) {
        ankt h = this.d.h(aatfVar, this.c);
        anjk anjkVar = anjk.a;
        final mrx mrxVar = this.a;
        mrxVar.getClass();
        ylx.k(h, anjkVar, new ylv() { // from class: gjl
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                mrx mrxVar2 = mrx.this;
                mrxVar2.f.b(mrxVar2.b.b(th), true);
            }
        }, new ylw() { // from class: gjm
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                avjp avjpVar;
                gjo gjoVar = gjo.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                arlt arltVar = browseResponseModel.a;
                if (arltVar == null) {
                    gjoVar.a.e();
                    return;
                }
                acti oi = gjoVar.b.oi();
                if (oi != null && (arltVar.b & 4096) != 0) {
                    oi.D(new acte(arltVar.j));
                }
                arlu arluVar = browseResponseModel.a.f;
                if (arluVar == null) {
                    arluVar = arlu.a;
                }
                if (arluVar.b != 118637602) {
                    return;
                }
                mrx mrxVar2 = gjoVar.a;
                arlu arluVar2 = browseResponseModel.a.f;
                if (arluVar2 == null) {
                    arluVar2 = arlu.a;
                }
                if (arluVar2.b == 118637602) {
                    avjpVar = (avjp) arluVar2.c;
                } else {
                    avjpVar = avjp.a;
                }
                acti oi2 = gjoVar.b.oi();
                if (mrx.k(avjpVar)) {
                    mrxVar2.e();
                } else {
                    mrxVar2.f(avjpVar, oi2);
                }
            }
        });
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint)) {
            return;
        }
        FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint = (FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint) apzgVar.qm(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint);
        if ((fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.b & 1) == 0) {
            return;
        }
        final aatf f = this.d.f();
        f.t(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.c);
        f.j(apzgVar.c);
        aopa createBuilder = arln.a.createBuilder();
        createBuilder.af(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.e);
        f.t = (arln) createBuilder.mo39build();
        if (!fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.d.isEmpty()) {
            f.v(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.d);
        }
        mrx mrxVar = this.a;
        akgj akgjVar = new akgj() { // from class: gjn
            @Override // defpackage.akgj
            public final void qX() {
                gjo.this.b(f);
            }
        };
        if (mrxVar.g == null) {
            mrxVar.b();
        }
        mrxVar.f.f(akgjVar);
        mrxVar.h();
        mrxVar.f.e();
        mrxVar.f.c();
        mrxVar.e = true;
        b(f);
    }
}
