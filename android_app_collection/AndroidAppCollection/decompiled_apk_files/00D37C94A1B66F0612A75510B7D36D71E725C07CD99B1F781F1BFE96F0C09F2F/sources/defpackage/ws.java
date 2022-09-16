package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ws  reason: default package */
/* loaded from: classes4.dex */
public final class ws implements Runnable {
    final /* synthetic */ ww a;
    private final /* synthetic */ int b;

    public ws(ww wwVar) {
        this.a = wwVar;
    }

    public ws(ww wwVar, int i) {
        this.b = i;
        this.a = wwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q();
        } else if (i == 1) {
            View view = this.a.l;
            if (view == null || view.getWindowToken() == null) {
                return;
            }
            this.a.s();
        } else {
            vv vvVar = this.a.e;
            if (vvVar == null || !lj.aj(vvVar) || this.a.e.getCount() <= this.a.e.getChildCount()) {
                return;
            }
            int childCount = this.a.e.getChildCount();
            ww wwVar = this.a;
            if (childCount > wwVar.k) {
                return;
            }
            wwVar.p.setInputMethodMode(2);
            this.a.s();
        }
    }
}
