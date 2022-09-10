package defpackage;

import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: cqho  reason: default package */
/* loaded from: classes.dex */
public abstract class cqho {
    private cqid a;
    final Configuration b;
    private cqhu c;
    private cqkj d;
    private cqkd e;
    private cqkv f;
    private cqhr g;
    private cqhw h;
    private cqkr i;

    /* JADX INFO: Access modifiers changed from: protected */
    public cqho(Configuration configuration) {
        dbsk.m(cqkx.a.add(this), "Environment was already registered.");
        dbsk.s(configuration);
        this.b = new Configuration(configuration);
    }

    public final void c() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        cqhw cqhwVar = this.h;
        if (cqhwVar != null) {
            synchronized (cqhwVar.c) {
                cqhwVar.b.b();
                cqhwVar.a.p();
            }
            this.h = null;
        }
        cqkr cqkrVar = this.i;
        if (cqkrVar != null) {
            cqkrVar.a.d();
            this.i = null;
        }
        dbsk.m(cqkx.a.remove(this), "Environment was not registered.");
    }

    public final cqid d() {
        if (this.a == null) {
            this.a = e();
        }
        return this.a;
    }

    protected abstract cqid e();

    protected abstract cqhu f();

    public final cqkj g() {
        if (this.d == null) {
            this.d = h();
        }
        return this.d;
    }

    protected abstract cqkj h();

    public final cqkd i() {
        if (this.e == null) {
            this.e = j();
        }
        return this.e;
    }

    protected abstract cqkd j();

    public final cqkv k() {
        if (this.f == null) {
            this.f = l();
        }
        return this.f;
    }

    protected abstract cqkv l();

    public final cqhr m() {
        if (this.g == null) {
            this.g = n();
        }
        return this.g;
    }

    protected abstract cqhr n();

    public final cqhw o() {
        if (this.h == null) {
            this.h = p();
        }
        return this.h;
    }

    protected abstract cqhw p();

    public final cqkr q() {
        if (this.i == null) {
            this.i = r();
        }
        return this.i;
    }

    protected abstract cqkr r();

    public final void s(Configuration configuration) {
        if (this.b.diff(configuration) == 0) {
            return;
        }
        o().e();
        q().b();
        this.b.updateFrom(configuration);
    }

    public final void t() {
        if (this.c == null) {
            this.c = f();
        }
    }
}
