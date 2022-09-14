package defpackage;

import java.io.IOException;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cuiq  reason: default package */
/* loaded from: classes5.dex */
public final class cuiq {
    public static dbsg<byte[]> a(cukp cukpVar) {
        try {
            HashMap hashMap = new HashMap();
            if (cukpVar.a() != null) {
                cukn a = cukpVar.a();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RESOURCE_ID", a.a());
                hashMap2.put("RESOURCE_REGION", Integer.valueOf(a.b()));
                hashMap.put("MEDIA_ID", hashMap2);
            }
            if (cukpVar.b() != null) {
                hashMap.put("LOCAL_URI", cukpVar.b());
            }
            hashMap.put("WIDTH", Integer.valueOf(cukpVar.d()));
            hashMap.put("HEIGHT", Integer.valueOf(cukpVar.e()));
            hashMap.put("SIZE", Integer.valueOf(cukpVar.f()));
            hashMap.put("DOWNLOAD_STATUS", Integer.valueOf(cukpVar.g()));
            if (cukpVar.c().a()) {
                hashMap.put("THUMBNAIL", cukpVar.c().b());
            }
            return dbsg.i(csto.a(hashMap));
        } catch (IOException unused) {
            cstl.a("PhotoUtils");
            return dbpy.a;
        }
    }

    public static dbsg<cukp> b(cugu cuguVar) {
        dbsg dbsgVar;
        int a = cuguVar.f().a();
        if (a == 0) {
            throw null;
        }
        if (a != 3 || !cuguVar.f().b().a().equals("photos")) {
            return dbpy.a;
        }
        HashMap<String, Object> d = csto.d(cuguVar.f().b().b());
        try {
            cuko i = cukp.i();
            i.i(((Integer) d.get("WIDTH")).intValue());
            i.c(((Integer) d.get("HEIGHT")).intValue());
            i.f(((Integer) d.get("SIZE")).intValue());
            i.b(((Integer) d.get("DOWNLOAD_STATUS")).intValue());
            if (d.containsKey("THUMBNAIL")) {
                i.h((byte[]) d.get("THUMBNAIL"));
            }
            if (d.containsKey("MEDIA_ID")) {
                HashMap hashMap = (HashMap) d.get("MEDIA_ID");
                try {
                    cukm c = cukn.c();
                    c.b((String) hashMap.get("RESOURCE_ID"));
                    c.c(((Integer) hashMap.get("RESOURCE_REGION")).intValue());
                    dbsgVar = dbsg.i(c.a());
                } catch (Exception unused) {
                    cstl.a("PhotoConverters");
                    dbsgVar = dbpy.a;
                }
                ((cukk) i).a = (cukn) dbsgVar.b();
            }
            if (d.containsKey("LOCAL_URI")) {
                ((cukk) i).b = (String) d.get("LOCAL_URI");
            }
            return dbsg.i(i.a());
        } catch (Exception unused2) {
            cstl.a("PhotoConverters");
            return dbpy.a;
        }
    }
}
