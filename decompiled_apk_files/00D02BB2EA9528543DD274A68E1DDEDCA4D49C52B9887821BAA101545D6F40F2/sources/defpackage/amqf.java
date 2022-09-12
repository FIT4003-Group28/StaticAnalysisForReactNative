package defpackage;
/* compiled from: PG */
/* renamed from: amqf  reason: default package */
/* loaded from: classes.dex */
public final class amqf extends bnuu {
    public int a;
    public int b;
    public int c;
    public int d;
    private final amqe e;
    private final String[] f;

    public amqf() {
        amqe amqeVar = new amqe();
        this.e = amqeVar;
        amqc amqcVar = amqeVar.d;
        this.f = new String[]{amqcVar.a, "unused", "unused", amqcVar.b, amqcVar.c};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        amqd amqdVar = this.e.c;
        this.x = bntbVar.i(i, amqdVar.a);
        this.a = bntbVar.i(i, amqdVar.b);
        this.b = bntbVar.i(i, amqdVar.c);
        this.c = bntbVar.i(i, amqdVar.d);
        this.d = bntbVar.i(i, amqdVar.e);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.f;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.e.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.e.b;
    }
}
