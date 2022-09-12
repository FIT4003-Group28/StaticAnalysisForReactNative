package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bybc  reason: default package */
/* loaded from: classes4.dex */
public final class bybc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ deig b;
    final /* synthetic */ bybe c;

    public bybc(bybe bybeVar, String str, deig deigVar) {
        this.c = bybeVar;
        this.a = str;
        this.b = deigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amfu a = this.c.a.c.a(this.a, bybf.a, new bybb(this));
        this.b.j(a);
        if (!bybf.b(a)) {
            this.c.c(this.a);
        }
    }
}
