package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jyu  reason: default package */
/* loaded from: classes7.dex */
public final class jyu implements jyn {
    private final jyt a;
    private final dcdc<jym> b;
    @dzsi
    private final ddho c;
    private boolean d;

    public jyu(dcdc<jym> dcdcVar, jyt jytVar, @dzsi ddho ddhoVar) {
        dbsk.s(dcdcVar);
        this.b = dcdcVar;
        this.a = jytVar;
        this.c = ddhoVar;
    }

    @Override // defpackage.jyn
    public List<jym> a() {
        return this.b;
    }

    @Override // defpackage.jyn
    public cqkl b() {
        ((jvu) this.a).a.a.b();
        return cqkl.a;
    }

    @Override // defpackage.jyn
    public cqkl c() {
        ((jvu) this.a).a.b.o();
        return cqkl.a;
    }

    @Override // defpackage.jyn
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jyn
    @dzsi
    public cjtd e() {
        ddho ddhoVar = this.c;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    public void f(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }
}
