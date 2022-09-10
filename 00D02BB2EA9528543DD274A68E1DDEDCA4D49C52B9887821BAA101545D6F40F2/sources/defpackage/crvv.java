package defpackage;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crvv  reason: default package */
/* loaded from: classes5.dex */
public final class crvv {
    public final crvt a;
    public crwb b;
    private final dasj c;

    public crvv(crwb crwbVar, crvt crvtVar, dasj dasjVar) {
        this.b = crwbVar;
        this.a = crvtVar;
        this.c = dasjVar;
    }

    public static boolean c(davv davvVar) {
        return davvVar.status != null;
    }

    public final davn a(dasy dasyVar, String str) {
        dcdn<crvz, String> dcdnVar = crwv.a;
        crvz b = crvz.b(this.b.b);
        if (b == null) {
            b = crvz.TEST;
        }
        String str2 = dcdnVar.get(b);
        dbsk.s(str2);
        String str3 = this.b.c;
        darf darfVar = new darf(new dare());
        darfVar.h(str);
        return new davn(new davk(this.c, dasyVar, new crvu(darfVar)).e(str2).f(str3).g());
    }

    public final dgpw b(String str, List<String> list, crxb crxbVar) {
        List<davp> list2;
        dasy dathVar = new dath();
        davn a = a(dathVar, str);
        ArrayList arrayList = new ArrayList();
        int a2 = dgps.a(crxbVar.b().d);
        if (a2 == 0) {
            a2 = 1;
        }
        String valueOf = String.valueOf(a2 - 1);
        for (String str2 : list) {
            davp davpVar = new davp();
            davpVar.id = str2;
            davpVar.source = valueOf;
            arrayList.add(davpVar);
        }
        davq davqVar = new davq();
        davqVar.deletePhotos = arrayList;
        try {
            dathVar.d(davqVar);
            davr e = new davi(new davj(a), davqVar).e();
            dathVar.d(e);
            if (e == null || (list2 = e.deletedPhotos) == null || list2.size() <= 0) {
                throw new crxr(crtx.FAILED, dgpm.NULL_STATUS_FAILURE);
            }
            return dgpw.b(e.deletedPhotos.get(0).status);
        } catch (UnknownHostException unused) {
            throw new crxr(crtx.TRANSIENT_ERROR, dgpm.CONNECTION_FAILURE);
        } catch (IOException unused2) {
            throw new crxr(crtx.TRANSIENT_ERROR, dgpm.DELETE_IO_EXCEPTION);
        }
    }

    public final void d(crxb crxbVar, dtbh dtbhVar, dgpm dgpmVar, crua cruaVar, @dzsi Exception exc) {
        dbsb b = dbsc.b(this);
        b.b("RequestInfo", crxbVar);
        b.b("Operation", dtbhVar);
        b.b("ClientException", dgpmVar);
        b.b("PhotoUri", cruaVar.c);
        crts crtsVar = cruaVar.d;
        if (crtsVar == null) {
            crtsVar = crts.r;
        }
        b.b("UploadOption", crtsVar);
        b.b("Exception details", exc);
        b.toString();
        crvs b2 = this.a.b(crxbVar, dtbhVar);
        crts crtsVar2 = cruaVar.d;
        if (crtsVar2 == null) {
            crtsVar2 = crts.r;
        }
        b2.n(crtsVar2);
        b2.k(dgpmVar);
    }
}
