package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aqqn  reason: default package */
/* loaded from: classes2.dex */
public final class aqqn {
    private static final dcqe a = dcqe.c("aqqn");
    private final dxio<aqav> b;
    private final dxio<apyz> c;
    private final dxio<ckcw> d;
    private final eeu e;

    public aqqn(dxio<apyz> dxioVar, dxio<aqav> dxioVar2, dxio<ckcw> dxioVar3, eeu eeuVar) {
        this.c = dxioVar;
        this.d = dxioVar3;
        this.b = dxioVar2;
        this.e = eeuVar;
    }

    public static dbsg<String> c(Intent intent, String str) {
        if (str.equals(intent.getAction())) {
            return dbsg.j(dbsj.f(intent.getStringExtra("args")));
        }
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            return dbpy.a;
        }
        Uri data = intent.getData();
        dbsk.s(data);
        return dbsg.j(dbsj.f(data.getQueryParameter("args")));
    }

    public static dbsg<Long> d(Intent intent, String str) {
        String stringExtra = str.equals(intent.getAction()) ? intent.getStringExtra("timestamp") : "";
        if ("android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) {
            Uri data = intent.getData();
            dbsk.s(data);
            stringExtra = data.getQueryParameter("timestamp");
        }
        if (!dbsj.d(stringExtra)) {
            try {
                return dbsg.i(Long.valueOf(Long.parseLong(stringExtra)));
            } catch (NumberFormatException unused) {
                bvoo.h("Timestamp %s is corrupted.", stringExtra);
            }
        }
        return dbpy.a;
    }

    public final void a() {
        this.c.a().f();
    }

    public final void b(String str, apzb apzbVar, dbsg<Long> dbsgVar) {
        apzc e;
        ((ckco) this.d.a().a(ckgs.j)).a(ckgq.a(true != this.e.g() ? 2 : 1));
        ((ckhe) this.d.a().a(ckgs.k)).a();
        this.b.a().j();
        apza i = apzc.i();
        i.c(str);
        i.d(apzbVar);
        apyz a2 = this.c.a();
        if (dbsgVar.a()) {
            ((apyl) i).b = dbsg.i(dbsgVar.b());
            e = i.e();
        } else {
            e = i.e();
        }
        a2.n(e, true);
    }
}
