package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: crvt  reason: default package */
/* loaded from: classes5.dex */
public final class crvt {
    public final cnjz a;
    public final crxq b;
    public final String c;
    public crwb d;

    public crvt(Context context) {
        String str;
        this.a = new cnjz(context, "GPU", null);
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        this.c = str;
        this.b = new crxq(context);
    }

    public final crvs a(crxl crxlVar) {
        crvs b = b(crxlVar.g(), crxlVar.f());
        Object b2 = crxlVar.b();
        b.n(b2 instanceof crts ? (crts) b2 : null);
        return b;
    }

    public final crvs b(crxb crxbVar, dtbh dtbhVar) {
        return new crvs(this, crxbVar, dtbhVar);
    }
}
