package defpackage;
/* compiled from: PG */
/* renamed from: bdvw  reason: default package */
/* loaded from: classes3.dex */
final class bdvw implements Runnable {
    final /* synthetic */ ilo a;
    final /* synthetic */ ily b;
    final /* synthetic */ bdvx c;

    public bdvw(bdvx bdvxVar, ilo iloVar, ily ilyVar) {
        this.c = bdvxVar;
        this.a = iloVar;
        this.b = ilyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (akqi.d(this.a.ai())) {
            this.b.C = this.c.c.c.x().d(this.a);
        }
        try {
            this.b.C(this.c.c.d.a(this.a));
        } catch (axxc unused) {
        }
        this.c.a.d(this.b.d());
        this.c.c();
    }
}
