package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zoq  reason: default package */
/* loaded from: classes4.dex */
public final class zoq implements Runnable {
    final /* synthetic */ zor a;

    public zoq(zor zorVar) {
        this.a = zorVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zor zorVar = this.a;
        zorVar.e.b.removeCallbacks(zorVar.d);
        this.a.e.c();
        zor zorVar2 = this.a;
        if (zorVar2.a != null || zorVar2.b == null) {
            return;
        }
        zorVar2.e.b.postDelayed(zorVar2.d, zorVar2.c);
    }
}
