package defpackage;
/* compiled from: PG */
/* renamed from: btuj  reason: default package */
/* loaded from: classes4.dex */
public final class btuj {
    final btum a = new btum();
    public final btup b;
    public final cqat c;
    public long d;
    public int e;
    public long f;
    public long g;

    public btuj(btup btupVar, cqat cqatVar) {
        this.b = btupVar;
        this.c = cqatVar;
    }

    public final void a(long j) {
        this.d = j;
        this.g = this.c.e();
    }

    public final void b(int i, boolean z) {
        this.e = i - ((int) this.d);
        this.c.e();
        btum btumVar = this.a;
        long j = btumVar.b;
        int i2 = this.e;
        btumVar.b = j + i2;
        btumVar.d++;
        this.b.e(i2, z);
        if (z) {
            btum btumVar2 = this.a;
            btumVar2.c += this.e;
            btumVar2.e++;
        }
    }

    public final void c(long j) {
        this.c.e();
        long j2 = j - this.d;
        this.f = j2;
        this.a.a += j2;
        this.b.f(j2);
    }

    public final void d() {
        this.b.h();
    }
}
