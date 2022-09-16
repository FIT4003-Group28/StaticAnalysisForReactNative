package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dgvk  reason: default package */
/* loaded from: classes6.dex */
public final class dgvk extends dgxg {
    private static final Writer f = new dgvj();
    private static final dgth g = new dgth("closed");
    public final List<dgtc> a;
    public dgtc b;
    private String h;

    public dgvk() {
        super(f);
        this.a = new ArrayList();
        this.b = dgte.a;
    }

    private final dgtc l() {
        List<dgtc> list = this.a;
        return list.get(list.size() - 1);
    }

    private final void m(dgtc dgtcVar) {
        if (this.h != null) {
            if (!(dgtcVar instanceof dgte) || this.e) {
                ((dgtf) l()).a(this.h, dgtcVar);
            }
            this.h = null;
        } else if (this.a.isEmpty()) {
            this.b = dgtcVar;
        } else {
            dgtc l = l();
            if (l instanceof dgta) {
                ((dgta) l).a(dgtcVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.dgxg
    public final void a() {
        dgta dgtaVar = new dgta();
        m(dgtaVar);
        this.a.add(dgtaVar);
    }

    @Override // defpackage.dgxg
    public final void b() {
        dgtf dgtfVar = new dgtf();
        m(dgtfVar);
        this.a.add(dgtfVar);
    }

    @Override // defpackage.dgxg
    public final void c() {
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (l() instanceof dgta) {
            List<dgtc> list = this.a;
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dgxg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.a.add(g);
    }

    @Override // defpackage.dgxg
    public final void d() {
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (l() instanceof dgtf) {
            List<dgtc> list = this.a;
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dgxg
    public final void e(String str) {
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (l() instanceof dgtf) {
            this.h = str;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dgxg
    public final void f() {
        m(dgte.a);
    }

    @Override // defpackage.dgxg, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.dgxg
    public final void g(long j) {
        m(new dgth(Long.valueOf(j)));
    }

    @Override // defpackage.dgxg
    public final void h(Boolean bool) {
        if (bool == null) {
            f();
        } else {
            m(new dgth(bool));
        }
    }

    @Override // defpackage.dgxg
    public final void i(Number number) {
        if (number == null) {
            f();
            return;
        }
        if (!this.c) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m(new dgth(number));
    }

    @Override // defpackage.dgxg
    public final void j(String str) {
        if (str == null) {
            f();
        } else {
            m(new dgth(str));
        }
    }

    @Override // defpackage.dgxg
    public final void k(boolean z) {
        m(new dgth(Boolean.valueOf(z)));
    }
}
