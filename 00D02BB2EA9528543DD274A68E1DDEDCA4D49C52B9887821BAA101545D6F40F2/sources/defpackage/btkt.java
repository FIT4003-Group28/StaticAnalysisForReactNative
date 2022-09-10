package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: btkt  reason: default package */
/* loaded from: classes4.dex */
final class btkt implements btks {
    final /* synthetic */ btkv a;

    public btkt(btkv btkvVar) {
        this.a = btkvVar;
    }

    private final void c(boolean z) {
        if (z) {
            this.a.a.g.a().j(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 224).putExtra("extra.accountName", this.a.a.d.o()), 0, 4);
            return;
        }
        btkx btkxVar = this.a.a;
        btkxVar.c.a(new btkr(btkxVar, btkxVar.f.getEnableFeatureParameters().bq), "personal_content_settings");
    }

    @Override // defpackage.btks
    public final void a(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        cjta b = cjtd.b();
        b.d = dtyi.bR;
        if (booleanValue) {
            cjqy cjqyVar = this.a.a.b;
            cjte cjteVar = new cjte(deaf.TAP);
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = deaa.TOGGLE_ON;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
            cjqyVar.m(cjteVar, b.a());
        } else {
            cjqy cjqyVar2 = this.a.a.b;
            cjte cjteVar2 = new cjte(deaf.TAP);
            ddzy bZ2 = deab.c.bZ();
            deaa deaaVar2 = deaa.TOGGLE_OFF;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deab deabVar2 = (deab) bZ2.b;
            deabVar2.b = deaaVar2.d;
            deabVar2.a |= 1;
            b.a = bZ2.bK();
            cjqyVar2.m(cjteVar2, b.a());
        }
        c(bool.booleanValue());
    }

    @Override // defpackage.btks
    public final void b() {
        c(this.a.a.h());
    }
}
