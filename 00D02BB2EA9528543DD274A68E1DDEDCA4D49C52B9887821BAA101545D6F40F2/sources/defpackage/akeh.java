package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akeh  reason: default package */
/* loaded from: classes2.dex */
public final class akeh extends aken {
    private dcep<btlt> a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    @Override // defpackage.aken
    public final void b(btlt... btltVarArr) {
        this.a = dcep.M(btltVarArr);
    }

    @Override // defpackage.aken
    public final void c(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void e(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void f(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void h(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    public final void i(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.aken
    protected final akeu a() {
        String str = this.a == null ? " accountTypeRequirements" : "";
        if (this.b == null) {
            str = str.concat(" loginAppBarTitle");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" loginAppBarTitleContentDescription");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" loginTitle");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" loginSubtitle");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" incognitoTitle");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" incognitoTitleContentDescription");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" incognitoSubtitle");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new akei(this.a, this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue());
    }
}
