package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: abfp  reason: default package */
/* loaded from: classes.dex */
public final class abfp extends afhx {
    private final dxio<begg> c;
    private static final dcqe b = dcqe.c("abfp");
    public static final dbsl<afga> a = abfo.a;

    public abfp(Intent intent, @dzsi String str, dxio<begg> dxioVar) {
        super(intent, str, afid.WELCOME_TO_DESTINATION_NOTIFICATION);
        this.c = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("feature_id");
        dbsk.s(stringExtra);
        if (dbsj.d(stringExtra)) {
            bvoo.h("A feature id is required to handle this intent.", new Object[0]);
            return;
        }
        ily ilyVar = new ily();
        ilyVar.k(stringExtra);
        ilyVar.l = true;
        ilo d = ilyVar.d();
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.C = true;
        begjVar.c = jjn.EXPANDED;
        this.c.a().o(begjVar, false, null);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_WELCOME_TO_DESTINATION_NOTIFICATION;
    }
}
