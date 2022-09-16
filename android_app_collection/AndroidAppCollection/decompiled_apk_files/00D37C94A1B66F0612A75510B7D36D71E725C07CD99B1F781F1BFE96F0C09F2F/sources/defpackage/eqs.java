package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqs  reason: default package */
/* loaded from: classes3.dex */
public final class eqs implements aafl {
    private final ahce a;

    public eqs(ahce ahceVar) {
        ahceVar.getClass();
        this.a = ahceVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        attp attpVar;
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) apzgVar.qm(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        int an = akel.an(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d);
        int i = 1;
        if (an == 0) {
            an = 1;
        }
        int i2 = an - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                this.a.a(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, ahbt.a(false));
                return;
            } else if (i2 != 8) {
                int an2 = akel.an(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d);
                if (an2 != 0) {
                    i = an2;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unsupported Offline Video Action: ");
                sb.append(i - 1);
                zep.l(sb.toString());
                return;
            } else {
                this.a.a(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, ahbt.a(true));
                return;
            }
        }
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        atpy atpyVar = null;
        if (I instanceof aqei) {
            aqei aqeiVar = (aqei) I;
            aqeh aqehVar = aqeiVar.o;
            if (aqehVar == null) {
                aqehVar = aqeh.a;
            }
            if ((1 & aqehVar.b) != 0) {
                aqeh aqehVar2 = aqeiVar.o;
                if (aqehVar2 == null) {
                    aqehVar2 = aqeh.a;
                }
                attpVar = aqehVar2.c;
                if (attpVar == null) {
                    attpVar = attp.a;
                }
            }
            attpVar = null;
        } else if (I instanceof audg) {
            audg audgVar = (audg) I;
            aude audeVar = audgVar.y;
            if (audeVar == null) {
                audeVar = aude.a;
            }
            if (audeVar.b == 60572968) {
                aude audeVar2 = audgVar.y;
                if (audeVar2 == null) {
                    audeVar2 = aude.a;
                }
                if (audeVar2.b == 60572968) {
                    attpVar = (attp) audeVar2.c;
                } else {
                    attpVar = attp.a;
                }
            }
            attpVar = null;
        } else {
            if (I instanceof aucu) {
                aucu aucuVar = (aucu) I;
                auct auctVar = aucuVar.D;
                if (auctVar == null) {
                    auctVar = auct.a;
                }
                if (auctVar.b == 60572968) {
                    auct auctVar2 = aucuVar.D;
                    if (auctVar2 == null) {
                        auctVar2 = auct.a;
                    }
                    if (auctVar2.b == 60572968) {
                        attpVar = (attp) auctVar2.c;
                    } else {
                        attpVar = attp.a;
                    }
                }
            }
            attpVar = null;
        }
        if (attpVar == null) {
            if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 8) != 0) {
                aunb aunbVar = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                attpVar = (attp) aunbVar.qm(OfflineabilityRendererOuterClass.offlineabilityRenderer);
            } else {
                attpVar = null;
            }
        }
        if (attpVar == null) {
            String valueOf = String.valueOf(I);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb2.append("Object is not an offlineable playlist: ");
            sb2.append(valueOf);
            zep.b(sb2.toString());
            return;
        }
        acti actiVar = (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class);
        ahce ahceVar = this.a;
        String str = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c;
        if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 16) != 0 && (atpyVar = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.f) == null) {
            atpyVar = atpy.a;
        }
        ahceVar.j(str, attpVar, actiVar, atpyVar);
    }
}
