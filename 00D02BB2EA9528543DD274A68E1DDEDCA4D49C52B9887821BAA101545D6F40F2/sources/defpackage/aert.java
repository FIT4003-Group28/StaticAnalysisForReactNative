package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
/* compiled from: PG */
/* renamed from: aert  reason: default package */
/* loaded from: classes2.dex */
final class aert implements Runnable {
    final /* synthetic */ AndroidLocationEvent a;
    final /* synthetic */ aeru b;

    public aert(aeru aeruVar, AndroidLocationEvent androidLocationEvent) {
        this.b = aeruVar;
        this.a = androidLocationEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
