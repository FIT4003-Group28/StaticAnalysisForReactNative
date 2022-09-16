package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xsx  reason: default package */
/* loaded from: classes4.dex */
final class xsx implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ xtc a;

    public xsx(xtc xtcVar) {
        this.a = xtcVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.p.getViewTreeObserver().removeOnPreDrawListener(this.a.l);
        xtc xtcVar = this.a;
        xtcVar.l = null;
        int lineCount = xtcVar.p.getLineCount();
        xtc xtcVar2 = this.a;
        if (lineCount > xtcVar2.j) {
            xtcVar2.q.setVisibility(0);
            this.a.i(true);
        }
        return true;
    }
}
