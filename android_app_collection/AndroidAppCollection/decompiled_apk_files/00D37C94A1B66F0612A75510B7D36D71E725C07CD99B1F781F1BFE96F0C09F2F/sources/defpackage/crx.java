package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crx  reason: default package */
/* loaded from: classes3.dex */
public final class crx implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ cpq a;
    final /* synthetic */ cry b;

    public crx(cry cryVar, cpq cpqVar) {
        this.b = cryVar;
        this.a = cpqVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.b.a = true;
        cpq cpqVar = this.a;
        cvd.i();
        if (!cpqVar.d.get()) {
            cvd.j(new crw(this));
        }
    }
}
