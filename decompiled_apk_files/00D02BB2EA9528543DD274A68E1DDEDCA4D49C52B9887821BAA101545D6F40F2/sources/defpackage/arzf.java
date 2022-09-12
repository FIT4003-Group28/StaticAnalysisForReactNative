package defpackage;
/* compiled from: PG */
/* renamed from: arzf  reason: default package */
/* loaded from: classes2.dex */
final class arzf implements Runnable {
    final /* synthetic */ arzg a;

    public arzf(arzg arzgVar) {
        this.a = arzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arzg arzgVar = this.a;
        if (arzgVar.h) {
            arzgVar.a();
            arzg arzgVar2 = this.a;
            arzgVar2.e.postDelayed(arzgVar2.m, 1000L);
        }
    }
}
