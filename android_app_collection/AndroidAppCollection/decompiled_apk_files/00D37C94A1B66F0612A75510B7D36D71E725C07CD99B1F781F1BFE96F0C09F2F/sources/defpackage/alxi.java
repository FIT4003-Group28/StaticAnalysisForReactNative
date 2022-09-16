package defpackage;
/* compiled from: PG */
/* renamed from: alxi  reason: default package */
/* loaded from: classes.dex */
public final class alxi {
    public int a;
    private boolean b;

    public alxi() {
        this.a = 2132083544;
        this.b = true;
    }

    public alxi(alxj alxjVar) {
        this.a = 2132083544;
        this.b = true;
        this.a = alxjVar.b;
        String str = alxjVar.c;
        this.b = alxjVar.d;
    }

    public final alxj a() {
        return new alxj(this.a, this.b);
    }

    public final void b() {
        this.b = true;
    }
}
