package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bota  reason: default package */
/* loaded from: classes.dex */
public final class bota extends afhx {
    public static final dbsl<afga> b = bosy.a;
    public final dxio<boxa> a;
    private final dxio<begg> c;

    public bota(Intent intent, @dzsi String str, dxio<begg> dxioVar, dxio<boxa> dxioVar2) {
        super(intent, str, afid.REPORT_A_PROBLEM);
        this.c = dxioVar;
        this.a = dxioVar2;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("feature_id");
        dbsk.s(stringExtra);
        ily ilyVar = new ily();
        ilyVar.k(stringExtra);
        this.c.a().p(ilyVar.d(), null, new bosz(this, bomu.a(this.f.getIntExtra("field", bomu.UNDEFINED.i)), this.f.getIntExtra("notification_type", dpyv.UNKNOWN_NOTIFICATION_ID.dm)));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_REPORT_A_PROBLEM;
    }
}
