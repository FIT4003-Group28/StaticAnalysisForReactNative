package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cupj  reason: default package */
/* loaded from: classes5.dex */
public final class cupj extends cuqm {
    private cuqn a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;

    @Override // defpackage.cuqm
    public final void b(cuqn cuqnVar) {
        this.a = cuqnVar;
    }

    @Override // defpackage.cuqm
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cuqm
    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cuqm
    public final void e(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cuqm
    public final void f(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cuqm
    public final cuqq a() {
        String str = this.a == null ? " element" : "";
        if (this.b == null) {
            str = str.concat(" paddingStart");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" paddingTop");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" paddingEnd");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" paddingBottom");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cupk(this.a, this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue());
    }
}
