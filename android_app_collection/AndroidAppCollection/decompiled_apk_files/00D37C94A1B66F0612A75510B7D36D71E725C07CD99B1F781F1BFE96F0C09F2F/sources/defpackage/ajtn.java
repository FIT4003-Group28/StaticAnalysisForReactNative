package defpackage;
/* compiled from: PG */
/* renamed from: ajtn  reason: default package */
/* loaded from: classes.dex */
public final class ajtn {
    private ajru a;
    private ajru b;
    private Long c;
    private Runnable d;
    private Runnable e;
    private Runnable f;
    private Runnable g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public final void c(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void e(Runnable runnable) {
        if (runnable != null) {
            this.g = runnable;
            return;
        }
        throw new NullPointerException("Null newOnEnd");
    }

    public final void f(Runnable runnable) {
        if (runnable != null) {
            this.f = runnable;
            return;
        }
        throw new NullPointerException("Null newOnStart");
    }

    public final void g(ajru ajruVar) {
        if (ajruVar != null) {
            this.b = ajruVar;
            return;
        }
        throw new NullPointerException("Null newPresenter");
    }

    public final void h(Runnable runnable) {
        if (runnable != null) {
            this.e = runnable;
            return;
        }
        throw new NullPointerException("Null oldOnEnd");
    }

    public final void i(Runnable runnable) {
        if (runnable != null) {
            this.d = runnable;
            return;
        }
        throw new NullPointerException("Null oldOnStart");
    }

    public final void j(ajru ajruVar) {
        if (ajruVar != null) {
            this.a = ajruVar;
            return;
        }
        throw new NullPointerException("Null oldPresenter");
    }

    public final void k(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void l(int i) {
        this.k = Integer.valueOf(i);
    }

    public final ajto a() {
        ajru ajruVar;
        Long l;
        ajru ajruVar2 = this.a;
        if (ajruVar2 == null || (ajruVar = this.b) == null || (l = this.c) == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" oldPresenter");
            }
            if (this.b == null) {
                sb.append(" newPresenter");
            }
            if (this.c == null) {
                sb.append(" duration");
            }
            if (this.d == null) {
                sb.append(" oldOnStart");
            }
            if (this.e == null) {
                sb.append(" oldOnEnd");
            }
            if (this.f == null) {
                sb.append(" newOnStart");
            }
            if (this.g == null) {
                sb.append(" newOnEnd");
            }
            if (this.h == null) {
                sb.append(" fromX");
            }
            if (this.i == null) {
                sb.append(" fromY");
            }
            if (this.j == null) {
                sb.append(" toX");
            }
            if (this.k == null) {
                sb.append(" toY");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajto(ajruVar2, ajruVar, l.longValue(), this.d, this.e, this.f, this.g, this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue());
    }
}
