package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: ghs  reason: default package */
/* loaded from: classes6.dex */
public class ghs<V extends cqkp> implements ghp<V> {
    private final cqix<V> a;
    @dzsi
    private final String b;
    private final boolean c;
    private final ght d;
    @dzsi
    private final cjwu e;
    @dzsi
    private final cjtd f;

    public ghs(cqix<V> cqixVar, @dzsi String str, boolean z, ght ghtVar, @dzsi cjtd cjtdVar, @dzsi cjwu cjwuVar) {
        this.a = cqixVar;
        this.b = str;
        this.c = z;
        this.d = ghtVar;
        this.f = cjtdVar;
        this.e = cjwuVar;
    }

    @Override // defpackage.ghp
    public cqix<V> a() {
        return this.a;
    }

    @Override // defpackage.ghp
    @dzsi
    public String b() {
        return this.b;
    }

    @Override // defpackage.ghp
    @dzsi
    public cqfc c() {
        return new ghr();
    }

    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    public ght e() {
        return this.d;
    }

    @dzsi
    public cjtd f() {
        return this.f;
    }

    public cjwu g() {
        cjwu cjwuVar = this.e;
        return cjwuVar == null ? new cjwu() : cjwuVar;
    }
}
