package defpackage;

import android.view.KeyEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akca  reason: default package */
/* loaded from: classes.dex */
public final class akca implements Runnable {
    final /* synthetic */ akcd a;

    public akca(akcd akcdVar) {
        this.a = akcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e.dispatchKeyEvent(new KeyEvent(0, 67));
        this.a.a.postDelayed(this, 100L);
    }
}
