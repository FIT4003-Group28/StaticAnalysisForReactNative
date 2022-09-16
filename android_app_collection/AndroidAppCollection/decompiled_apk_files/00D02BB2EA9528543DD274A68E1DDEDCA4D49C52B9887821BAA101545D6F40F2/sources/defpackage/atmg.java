package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmg  reason: default package */
/* loaded from: classes2.dex */
public final class atmg implements Runnable {
    final /* synthetic */ atmi a;

    public atmg(atmi atmiVar) {
        this.a = atmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        atmz atmzVar;
        atmi atmiVar = this.a;
        if (this != atmiVar.c || (atmzVar = atmiVar.n) == null) {
            return;
        }
        atmzVar.c();
    }
}
