package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: aeao  reason: default package */
/* loaded from: classes2.dex */
final class aeao implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aeat a;

    public aeao(aeat aeatVar) {
        this.a = aeatVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        aeat aeatVar = this.a;
        if (!aeatVar.d && aeatVar.b()) {
            aeatVar.b.a(new aear(aeatVar));
            aeatVar.d = true;
        }
        return true;
    }
}
