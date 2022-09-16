package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czud  reason: default package */
/* loaded from: classes5.dex */
final class czud implements Runnable {
    final /* synthetic */ View a;

    public czud(View view) {
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.performAccessibilityAction(64, null);
    }
}
