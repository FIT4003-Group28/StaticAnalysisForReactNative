package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
/* compiled from: PG */
/* renamed from: jpd  reason: default package */
/* loaded from: classes3.dex */
public final class jpd {
    public final jpu a;
    public final jpb b;
    private final fbj c;

    public jpd(jpu jpuVar, jpb jpbVar, fbj fbjVar) {
        this.a = jpuVar;
        this.b = jpbVar;
        this.c = fbjVar;
    }

    public final void a(final String str) {
        zgh.m(str);
        this.c.a().E(new fcr(str, 5)).S(new ayqb() { // from class: jpc
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jpd jpdVar = jpd.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    jpdVar.a.d(R.string.offline_actions_video_deleted_snackbar_text);
                    return;
                }
                jpb jpbVar = jpdVar.b;
                aqxo.p(!TextUtils.isEmpty(str2));
                dt dtVar = jpbVar.a;
                aopa createBuilder = atep.a.createBuilder();
                aakn aaknVar = jpbVar.b;
                aopa createBuilder2 = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
                createBuilder2.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder2.instance;
                str2.getClass();
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = str2;
                aopa createBuilder3 = aten.a.createBuilder();
                aopa createBuilder4 = ater.a.createBuilder();
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder2.mo39build());
                createBuilder4.copyOnWrite();
                ater aterVar = (ater) createBuilder4.instance;
                apzg apzgVar = (apzg) aopcVar.mo39build();
                apzgVar.getClass();
                aterVar.e = apzgVar;
                aterVar.b |= 8;
                createBuilder3.copyOnWrite();
                aten atenVar = (aten) createBuilder3.instance;
                ater aterVar2 = (ater) createBuilder4.mo39build();
                aterVar2.getClass();
                atenVar.d = aterVar2;
                atenVar.b |= 2;
                createBuilder.aB(aaknVar.a((aten) createBuilder3.mo39build(), null));
                akbc.c(dtVar, (atep) createBuilder.mo39build(), jpbVar.c, jpbVar.d, amyc.b);
            }
        });
    }
}
