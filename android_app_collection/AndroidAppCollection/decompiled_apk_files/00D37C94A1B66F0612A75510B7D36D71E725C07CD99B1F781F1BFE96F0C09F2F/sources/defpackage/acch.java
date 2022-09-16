package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acch  reason: default package */
/* loaded from: classes.dex */
public final class acch implements Runnable {
    final /* synthetic */ accj a;

    public acch(accj accjVar) {
        this.a = accjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        accj accjVar = this.a;
        if (accjVar.k) {
            accjVar.o.clear();
            return;
        }
        accjVar.c = ((Integer) accjVar.o.removeFirst()).intValue();
        accjVar.p = System.currentTimeMillis();
        accjVar.h.putInt("video-bitrate", accjVar.c);
        try {
            accjVar.b.setParameters(accjVar.h);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to set bitrate: ");
            sb.append(valueOf);
            Log.e("ScreencastVideoEncoder", sb.toString());
        }
        if (accjVar.o.isEmpty()) {
            return;
        }
        accjVar.g.postDelayed(accjVar.i, accjVar.r);
    }
}
