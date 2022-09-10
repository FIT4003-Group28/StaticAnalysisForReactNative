package defpackage;
/* compiled from: PG */
/* renamed from: ckhe  reason: default package */
/* loaded from: classes.dex */
public final class ckhe {
    public final ckcr a;
    private final btsp<ckcq> b = btsp.b(new ckhd(this));
    private boolean c;

    public ckhe(ckcr ckcrVar) {
        this.a = ckcrVar;
    }

    public final synchronized void a() {
        this.b.a().a();
        this.c = true;
    }

    public final synchronized boolean b() {
        return this.c;
    }

    public final synchronized void c() {
        if (this.c) {
            this.b.a().b();
            this.c = false;
        }
    }

    public final synchronized void d() {
        if (!this.c) {
            this.b.a().a();
            this.b.a().b();
        }
    }

    public final synchronized void e() {
        this.c = false;
    }
}
