package defpackage;
/* compiled from: PG */
/* renamed from: arze  reason: default package */
/* loaded from: classes2.dex */
final class arze implements Runnable {
    final /* synthetic */ arzg a;

    public arze(arzg arzgVar) {
        this.a = arzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arzg arzgVar = this.a;
        arzgVar.h = false;
        arzgVar.a();
    }
}
