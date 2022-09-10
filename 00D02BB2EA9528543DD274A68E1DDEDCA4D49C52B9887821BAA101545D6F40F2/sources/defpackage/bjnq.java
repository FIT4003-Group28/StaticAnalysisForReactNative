package defpackage;
/* compiled from: PG */
/* renamed from: bjnq  reason: default package */
/* loaded from: classes3.dex */
public class bjnq implements bjno {
    public String a;
    private final bjfo b;
    private final bjln c;

    public bjnq(bjfo bjfoVar, bjln bjlnVar) {
        this.b = bjfoVar;
        this.c = bjlnVar;
        this.a = bjfoVar.d;
    }

    @Override // defpackage.bjno
    public cqkl a() {
        this.c.d(this.b);
        return cqkl.a;
    }

    @Override // defpackage.bjno
    public cqkl b() {
        this.c.c(this.b, this.a);
        return cqkl.a;
    }

    @Override // defpackage.bjno
    public cqkl c() {
        bjmi bjmiVar = (bjmi) this.c;
        bjmiVar.i(this.b, false);
        bjmiVar.n();
        return cqkl.a;
    }

    @Override // defpackage.bjno
    public String d() {
        return this.a;
    }

    @Override // defpackage.bjno
    public cqgl e() {
        return new cqgl(this) { // from class: bjnp
            private final bjnq a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.a = charSequence.toString();
            }
        };
    }
}
