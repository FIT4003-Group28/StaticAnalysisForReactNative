package defpackage;
/* compiled from: PG */
/* renamed from: bvks  reason: default package */
/* loaded from: classes.dex */
public final class bvks {
    public volatile deig<Boolean> a = deig.d();
    private boolean b;

    public bvks() {
        this.a.j(true);
        this.b = true;
    }

    public final synchronized void a() {
        if (!this.b) {
            return;
        }
        if (!this.a.isDone()) {
            return;
        }
        this.a = deig.d();
    }

    public final synchronized void b() {
        if (this.a.isDone()) {
            this.b = false;
        } else {
            this.a.j(true);
        }
    }

    public final synchronized void c() {
        this.b = true;
    }
}
