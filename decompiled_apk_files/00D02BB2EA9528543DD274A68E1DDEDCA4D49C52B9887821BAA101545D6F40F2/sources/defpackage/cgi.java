package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgi  reason: default package */
/* loaded from: classes4.dex */
public final class cgi implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ cgj a;

    public cgi(cgj cgjVar) {
        this.a = cgjVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.a.a = true;
        cjp.c(new cgh(this));
    }
}
