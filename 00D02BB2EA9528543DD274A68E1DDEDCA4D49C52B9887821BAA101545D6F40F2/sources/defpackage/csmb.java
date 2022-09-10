package defpackage;

import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csmb  reason: default package */
/* loaded from: classes5.dex */
public final class csmb implements Runnable {
    final /* synthetic */ csmc a;

    public csmb(csmc csmcVar) {
        this.a = csmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.a.a.getParent()).removeView(this.a.a);
        }
    }
}
