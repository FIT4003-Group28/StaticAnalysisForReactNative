package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikr  reason: default package */
/* loaded from: classes6.dex */
public final class ikr {
    public final iki a;
    public final ikq b;
    private final ijz c;
    private final ikb d;
    private final ikt e;

    public ikr(iki ikiVar, ijz ijzVar, ikb ikbVar, ikq ikqVar, ikt iktVar) {
        this.a = ikiVar;
        this.c = ijzVar;
        this.d = ikbVar;
        this.b = ikqVar;
        this.e = iktVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (bvox.a(this.a)) {
            return decl.h(this.c.a(this.a.g), this.c.a(this.a.h - this.d.b()), this.e.b());
        }
        return decl.h(this.c.a(this.a.g), this.e.a(), this.c.a(this.a.h - this.d.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        if (bvox.a(this.a)) {
            return decl.h(this.c.a(this.a.h), this.e.a(), this.c.a(this.a.g + this.d.b()));
        }
        return decl.h(this.c.a(this.a.h), this.c.a(this.a.g + this.d.b()), this.e.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return (a() + b()) / 2;
    }
}
