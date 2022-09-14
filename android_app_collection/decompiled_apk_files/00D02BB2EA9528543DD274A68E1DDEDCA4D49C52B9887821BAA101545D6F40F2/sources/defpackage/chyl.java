package defpackage;
/* compiled from: PG */
/* renamed from: chyl  reason: default package */
/* loaded from: classes4.dex */
final class chyl implements Runnable {
    final /* synthetic */ chyq a;

    public chyl(chyq chyqVar) {
        this.a = chyqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        chyq chyqVar;
        int i;
        chum l = this.a.a.l();
        if (l == null) {
            return;
        }
        if (l.o) {
            chyqVar = this.a;
            i = 3;
        } else {
            chyqVar = this.a;
            i = 2;
        }
        chyqVar.g = i;
    }
}
