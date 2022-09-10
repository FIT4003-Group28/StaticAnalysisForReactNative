package defpackage;
/* compiled from: PG */
/* renamed from: apjx  reason: default package */
/* loaded from: classes2.dex */
public final class apjx extends bbf {
    private final cjxz a;
    private final cjyb b;

    public apjx(cjyb cjybVar) {
        cjxz cjxzVar = new cjxz();
        cjxzVar.c();
        this.a = cjxzVar;
        this.b = cjybVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void c(int i) {
        if (i == 0) {
            this.a.b();
        } else if (this.a.a()) {
        } else {
            this.b.c(this.a);
        }
    }
}
