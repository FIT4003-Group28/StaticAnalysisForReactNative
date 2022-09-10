package defpackage;
/* compiled from: PG */
/* renamed from: awmo  reason: default package */
/* loaded from: classes3.dex */
public final class awmo {
    private int d = Integer.MAX_VALUE;
    private int e = Integer.MAX_VALUE;
    public awmp a = awmp.LIFO;
    public dehn<?> b = deha.a(true);
    @dzsi
    public dehp c = null;

    public final awmu a() {
        int i = this.d;
        int i2 = this.e;
        awmp awmpVar = this.a;
        dehp dehpVar = this.c;
        dbsk.s(dehpVar);
        final awmu awmuVar = new awmu(i, i2, awmpVar, dehpVar, this.b);
        awmuVar.b.Pk(new Runnable(awmuVar) { // from class: awmm
            private final awmu a;

            {
                this.a = awmuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        }, awmuVar.a);
        return awmuVar;
    }

    public final void b(int i) {
        dbsk.a(this.e > 0);
        this.d = i;
    }

    public final void c(int i) {
        dbsk.a(true);
        this.e = i;
    }
}
