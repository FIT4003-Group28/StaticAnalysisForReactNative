package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: apsp  reason: default package */
/* loaded from: classes2.dex */
public final class apsp extends afhx {
    public static final dbsl<afga> j = apsn.a;
    public final gga a;
    public final bvjj b;
    public final bvrb c;
    public final auhi d;
    public final dxio<begg> e;
    public final dxio<apur> i;

    public apsp(Intent intent, @dzsi String str, gga ggaVar, bvjj bvjjVar, bvrb bvrbVar, auhi auhiVar, dxio<begg> dxioVar, dxio<apur> dxioVar2) {
        super(intent, str, afid.MERCHANT_FRESHNESS_WIZARD);
        this.a = ggaVar;
        this.b = bvjjVar;
        this.c = bvrbVar;
        this.d = auhiVar;
        this.e = dxioVar;
        this.i = dxioVar2;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("freshness_wizard_url");
        try {
            dbsk.s(stringExtra);
            Uri.parse(stringExtra);
            String stringExtra2 = this.f.getStringExtra("feature_id");
            if (dbsj.d(stringExtra2)) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.k(stringExtra2);
            this.e.a().p(ilyVar.d(), null, new apso(this, stringExtra));
        } catch (RuntimeException unused) {
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_MERCHANT_FRESHNESS_WIZARD;
    }
}
