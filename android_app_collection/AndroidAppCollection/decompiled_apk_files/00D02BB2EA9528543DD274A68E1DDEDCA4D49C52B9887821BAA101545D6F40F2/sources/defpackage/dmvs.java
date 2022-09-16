package defpackage;
/* compiled from: PG */
/* renamed from: dmvs  reason: default package */
/* loaded from: classes.dex */
final class dmvs {
    int a;
    boolean b = false;
    private final int c;

    public dmvs(int i) {
        this.c = i;
        this.a = i;
    }

    public final void a(int i) {
        this.a = i;
        this.b = true;
    }

    public final void b() {
        this.a = this.c;
        this.b = false;
    }
}
