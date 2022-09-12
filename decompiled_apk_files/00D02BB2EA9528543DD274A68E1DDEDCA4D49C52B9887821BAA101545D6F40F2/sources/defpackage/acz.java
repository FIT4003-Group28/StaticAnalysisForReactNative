package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acz  reason: default package */
/* loaded from: classes2.dex */
public final class acz implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ add b;

    public acz(add addVar, View view) {
        this.b = addVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.smoothScrollTo(this.a.getLeft() - ((this.b.getWidth() - this.a.getWidth()) / 2), 0);
        this.b.a = null;
    }
}
