package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lof  reason: default package */
/* loaded from: classes3.dex */
public final class lof implements aakn {
    public final Context a;
    public final jfv b;
    private final faw c;
    private final lub d;

    public lof(Context context, faw fawVar, lub lubVar, jfv jfvVar) {
        this.a = context;
        this.c = fawVar;
        this.d = lubVar;
        this.b = jfvVar;
    }

    @Override // defpackage.aakn
    public final amuk a(final aten atenVar, Object obj) {
        atenVar.getClass();
        apzg e = abgc.e(atenVar);
        if (e == null || !e.qn(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return amuk.q();
        }
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) e.qm(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        String str = "";
        if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : str).isEmpty()) {
            return amuk.q();
        }
        faw fawVar = this.c;
        if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1) {
            str = (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        }
        return (amuk) fawVar.a(str).s(new ayqe() { // from class: lod
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                jfz a;
                lof lofVar = lof.this;
                aajj aajjVar = (aajj) obj2;
                ayoc v = ayoc.v(aajjVar.d());
                jfv jfvVar = lofVar.b;
                if (aajjVar instanceof awjr) {
                    a = jfw.b((awjr) aajjVar);
                } else {
                    a = jfw.a((asze) aajjVar);
                }
                return v.L(zhn.a(jfvVar.a(a)), eho.t);
            }
        }).w(new ayqe() { // from class: loe
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                lof lofVar = lof.this;
                aten atenVar2 = atenVar;
                ampr amprVar = (ampr) obj2;
                String str2 = (String) amprVar.a;
                amuf f = amuk.f();
                jiq jiqVar = jiq.PLAYABLE;
                switch (((jiq) amprVar.b).ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        f.h(eog.d(lofVar.a, atenVar2, 4, R.string.pause_offline, ampq.j(arhr.OFFLINE_PAUSE), ampq.j(str2)));
                        break;
                    case 4:
                        f.h(eog.d(lofVar.a, atenVar2, 6, R.string.resume_offline, ampq.j(arhr.OFFLINE_RESUME), ampq.j(str2)));
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 13:
                        f.h(eog.d(lofVar.a, atenVar2, 5, R.string.offline_retry_failed_videos_menu_item, ampq.j(arhr.OFFLINE_RESUME), ampq.j(str2)));
                        break;
                    case 8:
                        f.h(eog.d(lofVar.a, atenVar2, 9, R.string.renew_offline, ampq.j(arhr.OFFLINE_RESUME), ampq.j(str2)));
                        break;
                    case 10:
                        f.h(eog.d(lofVar.a, atenVar2, 8, R.string.retry_offline, ampq.j(arhr.OFFLINE_RESUME), ampq.j(str2)));
                        break;
                }
                f.h(eog.d(lofVar.a, atenVar2, 3, R.string.remove_offline, ampq.j(arhr.OFFLINE_REMOVE), ampq.j(str2)));
                return f.g();
            }
        }).R(this.d.a(atenVar, obj)).L(4L, TimeUnit.SECONDS).U();
    }

    @Override // defpackage.aakn
    public final aten b(aten atenVar, Object obj) {
        return this.d.b(atenVar, obj);
    }
}
