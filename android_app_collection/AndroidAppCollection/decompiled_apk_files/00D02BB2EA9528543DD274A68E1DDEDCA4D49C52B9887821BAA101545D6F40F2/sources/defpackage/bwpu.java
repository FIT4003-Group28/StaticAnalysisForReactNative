package defpackage;
/* compiled from: PG */
/* renamed from: bwpu  reason: default package */
/* loaded from: classes4.dex */
public class bwpu implements jbf {
    private final eeu a;
    private final dzsj<avik> b;
    private final avzp c;
    private final dltm d;
    private final boolean e;

    public bwpu(eeu eeuVar, dzsj<avik> dzsjVar, avzp avzpVar, dltm dltmVar, boolean z) {
        this.a = eeuVar;
        this.b = dzsjVar;
        this.c = avzpVar;
        this.d = dltmVar;
        this.e = z;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return this.c.a(this.d, this.e);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.b()) {
            return cqkl.a;
        }
        this.b.a().l(this.d);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return null;
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return this.c.b(this.d);
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.d.a;
    }
}
