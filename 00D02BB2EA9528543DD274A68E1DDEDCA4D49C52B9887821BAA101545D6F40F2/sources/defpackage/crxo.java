package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crxo  reason: default package */
/* loaded from: classes5.dex */
public final class crxo {
    public static davp a(crxb crxbVar, crts crtsVar, boolean z) {
        davp davpVar = new davp();
        c(crxbVar.b(), davpVar);
        b(crxbVar.a(), crtsVar, z, davpVar);
        return davpVar;
    }

    public static void b(String str, crts crtsVar, boolean z, davp davpVar) {
        dgpo dgpoVar = crtsVar.d;
        if (dgpoVar == null) {
            dgpoVar = dgpo.e;
        }
        if ((dgpoVar.a & 1) != 0) {
            dgpo dgpoVar2 = crtsVar.d;
            if (dgpoVar2 == null) {
                dgpoVar2 = dgpo.e;
            }
            if ((dgpoVar2.a & 2) != 0) {
                davx davxVar = new davx();
                dgpo dgpoVar3 = crtsVar.d;
                if (dgpoVar3 == null) {
                    dgpoVar3 = dgpo.e;
                }
                davxVar.latitude = Double.valueOf(dgpoVar3.b);
                dgpo dgpoVar4 = crtsVar.d;
                if (dgpoVar4 == null) {
                    dgpoVar4 = dgpo.e;
                }
                davxVar.longitude = Double.valueOf(dgpoVar4.c);
                dgpo dgpoVar5 = crtsVar.d;
                if (dgpoVar5 == null) {
                    dgpoVar5 = dgpo.e;
                }
                if ((dgpoVar5.a & 4) != 0) {
                    dgpo dgpoVar6 = crtsVar.d;
                    if (dgpoVar6 == null) {
                        dgpoVar6 = dgpo.e;
                    }
                    davxVar.altitude = Double.valueOf(dgpoVar6.d);
                }
                davpVar.location = davxVar;
            }
        }
        if ((crtsVar.a & 8) != 0) {
            dgrh dgrhVar = crtsVar.e;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            decs a = decs.a(dgrhVar.b);
            dgrh dgrhVar2 = crtsVar.e;
            if (dgrhVar2 == null) {
                dgrhVar2 = dgrh.d;
            }
            decs a2 = decs.a(dgrhVar2.c);
            davw davwVar = new davw();
            davwVar.cellId = a.d();
            davwVar.fprint = a2.d();
            davpVar.featureId = davwVar;
        }
        int i = crtsVar.a;
        if ((i & 2048) != 0) {
            davpVar.mid = crtsVar.p;
        }
        if ((i & 16) != 0) {
            davpVar.description = crtsVar.f;
        }
        if (crtsVar.h.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < crtsVar.h.size(); i2++) {
                davz davzVar = new davz();
                davzVar.id = crtsVar.h.get(i2).b;
                arrayList.add(davzVar);
            }
            davpVar.localTag = arrayList;
        }
        int i3 = crtsVar.a;
        if ((i3 & 64) != 0) {
            davpVar.albumId = crtsVar.j;
        }
        if ((i3 & 4096) != 0) {
            davpVar.ugcsContentId = crtsVar.q;
        }
        if ((i3 & 128) != 0) {
            dgpu b = dgpu.b(crtsVar.k);
            if (b == null) {
                b = dgpu.LOCAL;
            }
            davpVar.shareTarget = String.valueOf(b.g);
        }
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(str);
        arrayList2.add(valueOf.length() != 0 ? "request_id:".concat(valueOf) : new String("request_id:"));
        if (crtsVar.i.size() > 0) {
            arrayList2.addAll(crtsVar.i);
        }
        davpVar.label = arrayList2;
        if ((crtsVar.a & 256) != 0) {
            davy davyVar = new davy();
            crtr crtrVar = crtsVar.m;
            if (crtrVar == null) {
                crtrVar = crtr.d;
            }
            davyVar.snapToPlaceConfidenceScore = Float.valueOf(crtrVar.b);
            crtr crtrVar2 = crtsVar.m;
            if (crtrVar2 == null) {
                crtrVar2 = crtr.d;
            }
            davyVar.elsaConfidenceScore = Float.valueOf(crtrVar2.c);
            davpVar.placeConfidence = davyVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (crtk crtkVar : crtsVar.l) {
            davs davsVar = new davs();
            davsVar.offeringAttachment = ddae.d.i(crtkVar.b.G());
            arrayList3.add(davsVar);
        }
        davpVar.association = arrayList3;
        davpVar.mediaType = z ? "VIDEO" : "PHOTO";
    }

    public static void c(crti crtiVar, davp davpVar) {
        if ((crtiVar.a & 2) != 0) {
            davpVar.obfuscatedUserId = crtiVar.c;
        }
        int a = dgps.a(crtiVar.d);
        if (a == 0) {
            a = 1;
        }
        davpVar.source = String.valueOf(a - 1);
        if ((crtiVar.a & 8) != 0) {
            dawa dawaVar = new dawa();
            dgpy dgpyVar = crtiVar.e;
            if (dgpyVar == null) {
                dgpyVar = dgpy.c;
            }
            dawaVar.clientName = dgpyVar.b;
            davpVar.ugcsClientSpec = dawaVar;
        }
        davpVar.apiVersion = Integer.toString(1);
        if ((crtiVar.a & 16) != 0) {
            dfqp b = dfqp.b(crtiVar.f);
            if (b == null) {
                b = dfqp.PHOTO_SERVICE;
            }
            davpVar.uploadTarget = b.name();
        }
    }

    public static davu d(crxb crxbVar, List<davp> list) {
        davt davtVar = new davt();
        int a = dgps.a(crxbVar.b().d);
        if (a == 0) {
            a = 1;
        }
        davtVar.source = String.valueOf(a - 1);
        davtVar.photosToImport = list;
        davtVar.allowPartialSuccess = true;
        if ((crxbVar.b().a & 8) != 0) {
            dawa dawaVar = new dawa();
            dgpy dgpyVar = crxbVar.b().e;
            if (dgpyVar == null) {
                dgpyVar = dgpy.c;
            }
            dawaVar.clientName = dgpyVar.b;
            davtVar.ugcsClientSpec = dawaVar;
        }
        davu davuVar = new davu();
        davuVar.request = davtVar;
        return davuVar;
    }
}
