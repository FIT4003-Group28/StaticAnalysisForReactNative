package defpackage;

import com.google.android.apps.gmm.wearable.api.WearableLocationStatusEvent;
/* compiled from: PG */
/* renamed from: cktv  reason: default package */
/* loaded from: classes4.dex */
final class cktv implements Runnable {
    final /* synthetic */ cktw a;

    public cktv(cktw cktwVar) {
        this.a = cktwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.l) {
            this.a.c.b(new WearableLocationStatusEvent(false));
            cktw cktwVar = this.a;
            cktwVar.s = null;
            cktwVar.r = false;
        }
    }
}
