package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: cdnb  reason: default package */
/* loaded from: classes4.dex */
final class cdnb implements begr {
    final /* synthetic */ Dialog a;
    final /* synthetic */ cdnc b;

    public cdnb(cdnc cdncVar, Dialog dialog) {
        this.b = cdncVar;
        this.a = dialog;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        this.a.dismiss();
        this.b.w().d.g(iloVar);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        this.a.dismiss();
    }
}
