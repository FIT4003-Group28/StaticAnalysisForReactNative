package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: lfj  reason: default package */
/* loaded from: classes7.dex */
final class lfj implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ lfk a;

    public lfj(lfk lfkVar) {
        this.a = lfkVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a.execute(lfi.a);
        this.a.d.c().getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
