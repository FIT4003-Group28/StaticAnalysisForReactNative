package defpackage;

import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
/* compiled from: PG */
/* renamed from: lty  reason: default package */
/* loaded from: classes3.dex */
final class lty implements ahda {
    final /* synthetic */ ltz a;

    public lty(ltz ltzVar) {
        this.a = ltzVar;
    }

    @Override // defpackage.ahda
    public final void a() {
        ltz ltzVar = this.a;
        WatchUpsellDialogController watchUpsellDialogController = ltzVar.b;
        if (watchUpsellDialogController.b) {
            ltzVar.a.b(watchUpsellDialogController.c);
            this.a.b.c = null;
            return;
        }
        watchUpsellDialogController.a.b();
    }

    @Override // defpackage.ahda
    public final void b() {
    }
}
