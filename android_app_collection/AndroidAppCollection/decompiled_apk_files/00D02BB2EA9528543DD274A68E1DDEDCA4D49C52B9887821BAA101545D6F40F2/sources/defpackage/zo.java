package defpackage;

import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: zo  reason: default package */
/* loaded from: classes7.dex */
final class zo implements Runnable {
    final /* synthetic */ zq a;

    public zo(zq zqVar) {
        this.a = zqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
