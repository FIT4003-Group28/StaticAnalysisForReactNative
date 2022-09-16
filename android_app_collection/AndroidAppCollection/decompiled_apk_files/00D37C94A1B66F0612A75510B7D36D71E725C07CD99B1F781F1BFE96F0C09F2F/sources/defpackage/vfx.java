package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: vfx  reason: default package */
/* loaded from: classes4.dex */
final class vfx implements Runnable {
    View a;
    CharSequence b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(View view, CharSequence charSequence) {
        aqxo.q(view != null, "Invalid view reference");
        this.a = view;
        this.b = charSequence;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        View view = this.a;
        if (view == null) {
            return;
        }
        vfy.a(view, this.b);
        this.a = null;
    }
}
