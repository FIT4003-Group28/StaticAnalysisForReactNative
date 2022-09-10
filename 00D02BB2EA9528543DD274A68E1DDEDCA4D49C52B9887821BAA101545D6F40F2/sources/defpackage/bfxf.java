package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfxf  reason: default package */
/* loaded from: classes.dex */
public final class bfxf extends afhx {
    public final gga a;
    public final begg b;
    public final bjbu c;
    public final eeu d;
    public final auhi e;
    public final bvjj i;
    public final bvrb j;
    private static final dcqe l = dcqe.c("bfxf");
    public static final dbsl<afga> k = bfxd.a;

    public bfxf(Intent intent, @dzsi String str, gga ggaVar, begg beggVar, bjbu bjbuVar, eeu eeuVar, auhi auhiVar, bvjj bvjjVar, bvrb bvrbVar) {
        super(intent, str, afid.PLACE_QA);
        this.a = ggaVar;
        this.d = eeuVar;
        this.b = beggVar;
        this.c = bjbuVar;
        this.e = auhiVar;
        this.i = bvjjVar;
        this.j = bvrbVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("feature_id");
        String stringExtra2 = this.f.getStringExtra("annotation_id");
        boolean booleanExtra = this.f.getBooleanExtra("is_merchant", false);
        boolean booleanExtra2 = this.f.getBooleanExtra("is_city", false);
        if (stringExtra == null) {
            bvoo.h("Missing feature id in PlaceQaIntent", new Object[0]);
        } else if (stringExtra2 == null) {
            bvoo.h("Missing annotation id in PlaceQaIntent", new Object[0]);
        } else {
            ily ilyVar = new ily();
            ilyVar.k(stringExtra);
            this.b.p(ilyVar.d(), null, new bfxe(this, stringExtra2, booleanExtra, booleanExtra2));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_PLACE_QA;
    }
}
