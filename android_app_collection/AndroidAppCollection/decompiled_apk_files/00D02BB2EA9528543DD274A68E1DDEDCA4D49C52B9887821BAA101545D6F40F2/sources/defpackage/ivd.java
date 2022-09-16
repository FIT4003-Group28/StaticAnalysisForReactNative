package defpackage;
/* compiled from: PG */
/* renamed from: ivd  reason: default package */
/* loaded from: classes6.dex */
public class ivd implements izx {
    public static final cqrp a = cqrp.d(1.0d);
    public static final cqrp b = cqrp.d(11.0d);
    @dzsi
    private final cqtd e;
    private final cqsn f;
    private final cqss g;
    private final ivc h;
    private Boolean i;
    @dzsi
    private final ivc j;
    private Boolean k;
    @dzsi
    private final cjtd l;
    private final cqsn m;

    public ivd(@dzsi cqtd cqtdVar, cqsn cqsnVar, cqss cqssVar, ivc ivcVar, ivc ivcVar2, @dzsi cjtd cjtdVar) {
        this(cqtdVar, cqsnVar, cqssVar, ivcVar, true, ivcVar2, false, false, cjtdVar, cqsnVar);
    }

    public ivd(@dzsi cqtd cqtdVar, cqsn cqsnVar, cqss cqssVar, ivc ivcVar, Boolean bool, @dzsi ivc ivcVar2, Boolean bool2, Boolean bool3, @dzsi cjtd cjtdVar, cqsn cqsnVar2) {
        this.e = cqtdVar;
        this.f = cqsnVar;
        this.g = cqssVar;
        this.h = ivcVar;
        this.i = bool;
        this.j = ivcVar2;
        this.k = bool2;
        this.l = cjtdVar;
        this.m = cqsnVar2;
    }

    @Override // defpackage.izx
    @dzsi
    public cqtd a() {
        return this.e;
    }

    @Override // defpackage.izx
    public cqsn b() {
        return this.f;
    }

    @Override // defpackage.izx
    public cqss c() {
        return this.g;
    }

    @Override // defpackage.izx
    public cqkl d(cjqm cjqmVar) {
        this.h.a(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.izx
    public cqkl e(cjqm cjqmVar) {
        ivc ivcVar = this.j;
        if (ivcVar != null) {
            ivcVar.a(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.izx
    public Boolean f() {
        return this.i;
    }

    @Override // defpackage.izx
    public Boolean g() {
        return this.k;
    }

    @Override // defpackage.izx
    @dzsi
    public cjtd h() {
        return this.l;
    }

    @Override // defpackage.izx
    public cqsn i() {
        return this.m;
    }

    public ivd(@dzsi cqtd cqtdVar, cqsn cqsnVar, cqss cqssVar, ivc ivcVar, @dzsi cjtd cjtdVar) {
        this(cqtdVar, cqsnVar, cqssVar, ivcVar, false, null, false, false, cjtdVar, cqsnVar);
    }

    public ivd(@dzsi cqtd cqtdVar, cqsn cqsnVar, cqss cqssVar, ivc ivcVar, Boolean bool, Boolean bool2, @dzsi cjtd cjtdVar, cqsn cqsnVar2) {
        this(cqtdVar, cqsnVar, cqssVar, ivcVar, false, null, bool, bool2, cjtdVar, cqsnVar2);
    }
}
