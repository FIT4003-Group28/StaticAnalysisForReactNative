package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: bqlw  reason: default package */
/* loaded from: classes4.dex */
final class bqlw implements begr {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bqjh b;
    final /* synthetic */ Dialog c;
    final /* synthetic */ bqly d;

    public bqlw(bqly bqlyVar, bwrs bwrsVar, bqjh bqjhVar, Dialog dialog) {
        this.d = bqlyVar;
        this.a = bwrsVar;
        this.b = bqjhVar;
        this.c = dialog;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        this.a.d(iloVar);
        this.d.f(this.a, this.b);
        this.c.dismiss();
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        bvoo.h("Could not update insufficient Placemark: %s", bttqVar);
        this.d.f(this.a, this.b);
        this.c.dismiss();
    }
}
