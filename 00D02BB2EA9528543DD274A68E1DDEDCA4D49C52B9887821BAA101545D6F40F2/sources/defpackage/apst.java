package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: apst  reason: default package */
/* loaded from: classes.dex */
public final class apst extends afhx {
    public static final dbsl<afga> k = apsr.a;
    public final gga a;
    public final bvjj b;
    public final bvrb c;
    public final auhi d;
    public final dxio<begg> e;
    public final dxio<aput> i;
    @dzsi
    public Uri j;

    public apst(Intent intent, @dzsi String str, gga ggaVar, bvjj bvjjVar, bvrb bvrbVar, auhi auhiVar, dxio<begg> dxioVar, dxio<aput> dxioVar2) {
        super(intent, str, afid.NEW_BUSINESS_REVIEW);
        this.a = ggaVar;
        this.b = bvjjVar;
        this.c = bvrbVar;
        this.d = auhiVar;
        this.e = dxioVar;
        this.i = dxioVar2;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("mm_url");
        try {
            dbsk.s(stringExtra);
            this.j = Uri.parse(stringExtra);
            String stringExtra2 = this.f.getStringExtra("feature_id");
            if (dbsj.d(stringExtra2)) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.k(stringExtra2);
            this.e.a().p(ilyVar.d(), null, new apss(this));
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_REPLY_TO_REVIEWS_NOTIFICATION;
    }
}
