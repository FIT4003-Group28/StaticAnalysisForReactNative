package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfxi  reason: default package */
/* loaded from: classes.dex */
public final class bfxi extends afhx {
    public static final dbsl<afga> a = bfxh.a;
    private final cklq b;
    private final gfq c;
    private final dxio<begg> d;

    public bfxi(Intent intent, @dzsi String str, cklq cklqVar, gfq gfqVar, dxio<begg> dxioVar) {
        super(intent, str, afid.PLACESHEET_TAB_ACTION);
        this.b = cklqVar;
        this.c = gfqVar;
        this.d = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.b.a(ckls.EXTERNAL_INTENT);
        String stringExtra = this.f.getStringExtra("feature_id");
        dbsk.s(stringExtra);
        ily ilyVar = new ily();
        ilyVar.k(stringExtra);
        ilo d = ilyVar.d();
        String stringExtra2 = this.f.getStringExtra("tab");
        dbsk.s(stringExtra2);
        bege a2 = bege.a(stringExtra2);
        this.c.c();
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.c = jjn.EXPANDED;
        begjVar.e = a2;
        begjVar.n = false;
        begjVar.c(false);
        this.d.a().o(begjVar, false, null);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PLACESHEET;
    }
}
