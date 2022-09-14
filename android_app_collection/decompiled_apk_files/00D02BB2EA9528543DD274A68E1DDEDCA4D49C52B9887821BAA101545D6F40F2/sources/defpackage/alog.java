package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alog  reason: default package */
/* loaded from: classes.dex */
public final class alog implements Runnable {
    private final akzh a;
    private final akpq b;
    private final alrv c;
    private int d = -1;
    private alwn e;
    private final aloh f;

    public alog(akzh akzhVar, aloi aloiVar, akpq akpqVar, alrv alrvVar) {
        this.a = akzhVar;
        this.b = akpqVar;
        this.c = alrvVar;
        this.f = new aloh(aloiVar);
        this.e = alrvVar.q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = (int) this.a.p().k;
        alwn q = this.c.q();
        if (i != this.d) {
            this.f.a(i);
        } else if (q != this.e) {
            this.f.b();
        }
        this.d = i;
        this.e = q;
        this.b.b(this);
    }
}
