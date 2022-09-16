package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lub  reason: default package */
/* loaded from: classes3.dex */
public final class lub implements aakn {
    private final Context a;
    private final azqb b;
    private final fcl c;
    private final fbj d;

    public lub(Context context, azqb azqbVar, fcl fclVar, fbj fbjVar) {
        this.a = context;
        this.b = azqbVar;
        this.c = fclVar;
        this.d = fbjVar;
    }

    private final aten c(aten atenVar, int i, int i2, arhr arhrVar) {
        aopa mo52toBuilder = atenVar.mo52toBuilder();
        eog.e(this.a, mo52toBuilder, i2);
        aopc aopcVar = (aopc) arhs.a.createBuilder();
        aopcVar.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        arhs arhsVar2 = (arhs) aopcVar.mo39build();
        aten atenVar2 = (aten) mo52toBuilder.instance;
        int i3 = atenVar2.b;
        if ((i3 & 1) != 0) {
            ateo ateoVar = atenVar2.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            aopa mo52toBuilder2 = ateoVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            ateo ateoVar2 = (ateo) mo52toBuilder2.instance;
            arhsVar2.getClass();
            ateoVar2.d = arhsVar2;
            ateoVar2.b |= 2;
            mo52toBuilder.copyOnWrite();
            aten atenVar3 = (aten) mo52toBuilder.instance;
            ateo ateoVar3 = (ateo) mo52toBuilder2.mo39build();
            ateoVar3.getClass();
            atenVar3.c = ateoVar3;
            atenVar3.b |= 1;
        } else if ((i3 & 2) != 0) {
            ater aterVar = atenVar2.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            aopa mo52toBuilder3 = aterVar.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            ater aterVar2 = (ater) mo52toBuilder3.instance;
            arhsVar2.getClass();
            aterVar2.d = arhsVar2;
            aterVar2.b |= 4;
            mo52toBuilder.copyOnWrite();
            aten atenVar4 = (aten) mo52toBuilder.instance;
            ater aterVar3 = (ater) mo52toBuilder3.mo39build();
            aterVar3.getClass();
            atenVar4.d = aterVar3;
            atenVar4.b |= 2;
        } else if ((i3 & 16) != 0) {
            atej atejVar = atenVar2.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            aopa mo52toBuilder4 = atejVar.mo52toBuilder();
            mo52toBuilder4.copyOnWrite();
            atej atejVar2 = (atej) mo52toBuilder4.instance;
            arhsVar2.getClass();
            atejVar2.d = arhsVar2;
            atejVar2.b |= 2;
            mo52toBuilder.copyOnWrite();
            aten atenVar5 = (aten) mo52toBuilder.instance;
            atej atejVar3 = (atej) mo52toBuilder4.mo39build();
            atejVar3.getClass();
            atenVar5.g = atejVar3;
            atenVar5.b |= 16;
        } else if ((i3 & 32) != 0) {
            atek atekVar = atenVar2.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            aopa mo52toBuilder5 = atekVar.mo52toBuilder();
            mo52toBuilder5.copyOnWrite();
            atek atekVar2 = (atek) mo52toBuilder5.instance;
            arhsVar2.getClass();
            atekVar2.d = arhsVar2;
            atekVar2.b |= 2;
            mo52toBuilder.copyOnWrite();
            aten atenVar6 = (aten) mo52toBuilder.instance;
            atek atekVar3 = (atek) mo52toBuilder5.mo39build();
            atekVar3.getClass();
            atenVar6.h = atekVar3;
            atenVar6.b |= 32;
        } else if ((i3 & 8) != 0) {
            atex atexVar = atenVar2.f;
            if (atexVar == null) {
                atexVar = atex.a;
            }
            aopa mo52toBuilder6 = atexVar.mo52toBuilder();
            if (!((atex) mo52toBuilder6.instance).i) {
                mo52toBuilder6.copyOnWrite();
                atex atexVar2 = (atex) mo52toBuilder6.instance;
                arhsVar2.getClass();
                atexVar2.d = arhsVar2;
                atexVar2.b |= 4;
            } else {
                mo52toBuilder6.copyOnWrite();
                atex atexVar3 = (atex) mo52toBuilder6.instance;
                arhsVar2.getClass();
                atexVar3.g = arhsVar2;
                atexVar3.b |= 64;
            }
            mo52toBuilder.copyOnWrite();
            aten atenVar7 = (aten) mo52toBuilder.instance;
            atex atexVar4 = (atex) mo52toBuilder6.mo39build();
            atexVar4.getClass();
            atenVar7.f = atexVar4;
            atenVar7.b |= 8;
        } else if ((i3 & 1024) != 0) {
            avqs avqsVar = atenVar2.m;
            if (avqsVar == null) {
                avqsVar = avqs.a;
            }
            aopa mo52toBuilder7 = avqsVar.mo52toBuilder();
            mo52toBuilder7.copyOnWrite();
            avqs avqsVar2 = (avqs) mo52toBuilder7.instance;
            arhsVar2.getClass();
            avqsVar2.d = arhsVar2;
            avqsVar2.c = 2;
            mo52toBuilder.copyOnWrite();
            aten atenVar8 = (aten) mo52toBuilder.instance;
            avqs avqsVar3 = (avqs) mo52toBuilder7.mo39build();
            avqsVar3.getClass();
            atenVar8.m = avqsVar3;
            atenVar8.b |= 1024;
        }
        apzg e = abgc.e((aten) mo52toBuilder.mo39build());
        if (e != null && e.qn(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            aopa mo52toBuilder8 = ((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) e.qm(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)).mo52toBuilder();
            mo52toBuilder8.copyOnWrite();
            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) mo52toBuilder8.instance;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d = i - 1;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 2;
            aopc aopcVar2 = (aopc) e.mo52toBuilder();
            aopcVar2.e(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) mo52toBuilder8.mo39build());
            abgc.j(mo52toBuilder, (apzg) aopcVar2.mo39build());
        }
        return (aten) mo52toBuilder.mo39build();
    }

    @Override // defpackage.aakn
    public final amuk a(aten atenVar, Object obj) {
        final agqv agqvVar;
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
        if (this.c.h()) {
            agwh m = ((agrf) this.b.get()).a().m();
            if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1) {
                str = (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
            }
            agqvVar = m.e(str);
        } else {
            agqvVar = null;
        }
        if (!((Boolean) this.d.a().E(new ayqe() { // from class: lua
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                agqv agqvVar2 = agqv.this;
                amvn amvnVar = (amvn) obj2;
                boolean z = false;
                if (agqvVar2 != null && amvnVar.contains(agqvVar2.m())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).U()).booleanValue()) {
            String str2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
            ArrayList arrayList = new ArrayList();
            if (agqvVar == null || agqvVar.s()) {
                if (amps.e(str2) || !this.c.i(str2)) {
                    arrayList.add(eog.c(this.a, atenVar, 2, R.string.add_video_to_offline, ampq.j(arhr.OFFLINE_RESUME)));
                } else {
                    arrayList.add(eog.c(this.a, atenVar, 8, R.string.readd_to_offline, ampq.j(arhr.OFFLINE_RESUME)));
                }
            } else {
                agqp i = agqvVar.i();
                agqp agqpVar = agqp.DELETED;
                switch (i.ordinal()) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                        arrayList.add(eog.c(this.a, atenVar, 4, R.string.pause_offline, ampq.j(arhr.OFFLINE_PAUSE)));
                        break;
                    case 10:
                        arrayList.add(eog.c(this.a, atenVar, 6, R.string.resume_offline, ampq.j(arhr.OFFLINE_RESUME)));
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 19:
                    case 20:
                    case 22:
                        arrayList.add(eog.c(this.a, atenVar, 5, R.string.offline_retry_failed_videos_menu_item, ampq.j(arhr.OFFLINE_RESUME)));
                        break;
                    case 17:
                        arrayList.add(eog.c(this.a, atenVar, 9, R.string.renew_offline, ampq.j(arhr.OFFLINE_RESUME)));
                        break;
                    case 21:
                        arrayList.add(eog.c(this.a, atenVar, 8, R.string.retry_offline, ampq.j(arhr.OFFLINE_RESUME)));
                        break;
                }
                arrayList.add(eog.c(this.a, atenVar, 3, R.string.remove_offline, ampq.j(arhr.OFFLINE_REMOVE)));
            }
            return amuk.o(arrayList);
        }
        return amuk.q();
    }

    @Override // defpackage.aakn
    public final aten b(aten atenVar, Object obj) {
        atenVar.getClass();
        apzg e = abgc.e(atenVar);
        agqg agqgVar = null;
        if (e == null || !e.qn(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            return null;
        }
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) e.qm(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        if (offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c.isEmpty()) {
            return null;
        }
        if (this.c.i(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c)) {
            agqgVar = ((agrf) this.b.get()).a().i().d(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c);
        }
        if (agqgVar == null) {
            return c(atenVar, 2, R.string.add_playlist_to_offline, arhr.OFFLINE_DOWNLOAD);
        }
        return c(atenVar, 3, R.string.remove_offline, arhr.OFFLINE_REMOVE);
    }
}
