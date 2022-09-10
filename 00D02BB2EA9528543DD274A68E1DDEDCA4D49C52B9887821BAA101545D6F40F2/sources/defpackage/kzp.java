package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzp  reason: default package */
/* loaded from: classes7.dex */
public final class kzp implements Runnable {
    final /* synthetic */ kzt a;

    public kzp(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kzt kztVar = this.a;
        if (kztVar.B != 1 && !kztVar.h(kztVar.l)) {
            kzt kztVar2 = this.a;
            kztVar2.c.a(kztVar2.l, true);
            kzt kztVar3 = this.a;
            kztVar3.i.l(kztVar3, true);
        }
    }
}
