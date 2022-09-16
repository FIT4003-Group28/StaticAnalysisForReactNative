package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lcr  reason: default package */
/* loaded from: classes3.dex */
final class lcr extends aljg {
    final /* synthetic */ lbr a;
    final /* synthetic */ lcs b;

    public lcr(lcs lcsVar, lbr lbrVar) {
        this.b = lcsVar;
        this.a = lbrVar;
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        if (i != 5 || !this.b.f.ap()) {
            return;
        }
        dp dpVar = this.b.f;
        if (dpVar.H || dpVar.s || dpVar.as()) {
            return;
        }
        ex l = this.b.f.mL().l();
        l.m(this.a);
        if (((Boolean) this.b.e.a().aE().e(0).aw()).booleanValue()) {
            l.d();
        } else {
            l.a();
        }
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
    }
}
