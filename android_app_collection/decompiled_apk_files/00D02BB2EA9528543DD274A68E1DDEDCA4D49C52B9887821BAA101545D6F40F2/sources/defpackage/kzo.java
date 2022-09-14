package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzo  reason: default package */
/* loaded from: classes7.dex */
public final class kzo implements Runnable {
    final /* synthetic */ kzt a;

    public kzo(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kzt kztVar = this.a;
        if (kztVar.B == 3) {
            kztVar.g(true);
        }
    }
}
