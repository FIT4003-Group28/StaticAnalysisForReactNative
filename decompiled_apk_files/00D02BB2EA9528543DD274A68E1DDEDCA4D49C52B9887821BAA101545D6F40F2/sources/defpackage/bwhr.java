package defpackage;

import android.content.pm.ResolveInfo;
/* renamed from: bwhr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bwhr {
    public static cjtd a(cjtd cjtdVar, dbsg<ResolveInfo> dbsgVar) {
        cjta c = cjtd.c(cjtdVar);
        if (dbsgVar.a()) {
            ddjk bZ = ddjl.c.bZ();
            String str = dbsgVar.b().activityInfo.name;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjl ddjlVar = (ddjl) bZ.b;
            str.getClass();
            ddjlVar.a |= 1;
            ddjlVar.b = str;
            c.p(bZ.bK());
        }
        return c.a();
    }
}
