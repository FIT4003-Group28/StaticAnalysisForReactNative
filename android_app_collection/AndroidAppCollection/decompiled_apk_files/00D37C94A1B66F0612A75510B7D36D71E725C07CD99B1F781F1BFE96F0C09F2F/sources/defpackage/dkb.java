package defpackage;

import android.os.SystemClock;
import java.util.Deque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkb  reason: default package */
/* loaded from: classes3.dex */
public final class dkb implements Runnable {
    final /* synthetic */ Deque a;
    final /* synthetic */ boolean b;

    public dkb(Deque deque, boolean z) {
        this.a = deque;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!this.a.isEmpty()) {
            dhp dhpVar = (dhp) this.a.pollFirst();
            boolean z = this.b;
            dhv dhvVar = dhpVar.c;
            dhj dhjVar = dhpVar.b;
            boolean z2 = dhpVar.a;
            czu czuVar = dhpVar.d;
            if (dhjVar != null) {
                dhvVar.m(dhjVar, z2, z, uptimeMillis, czuVar, 0);
            }
        }
    }
}
