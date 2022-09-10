package defpackage;
/* compiled from: PG */
/* renamed from: bznn  reason: default package */
/* loaded from: classes4.dex */
public class bznn extends bznp implements bznq {
    private final cqvf a;
    private final cqvf b;
    @dzsi
    private final cqtd c;
    @dzsi
    private final eil d;
    private final ddho e;
    private final ddho f;

    public bznn(@dzsi jdi jdiVar, cqvf cqvfVar, cqvf cqvfVar2, cqvf cqvfVar3, @dzsi cqtd cqtdVar, @dzsi Integer num, ddho ddhoVar, ddho ddhoVar2) {
        super(jdiVar, cqvfVar2);
        this.a = cqvfVar;
        this.b = cqvfVar3;
        this.c = cqtdVar;
        this.d = num == null ? null : new eil(num);
        this.e = ddhoVar;
        this.f = ddhoVar2;
    }

    @Override // defpackage.bznq
    public cqvf a() {
        return this.a;
    }

    @Override // defpackage.bznq
    public cqvf b() {
        return this.b;
    }

    @Override // defpackage.bznq
    @dzsi
    public cqtd c() {
        return this.c;
    }

    @Override // defpackage.bznq
    @dzsi
    /* renamed from: d */
    public eil g() {
        return this.d;
    }

    @Override // defpackage.bznq
    public cjtd e() {
        return cjtd.a(this.f);
    }

    @Override // defpackage.bznq
    public cjtd f() {
        return cjtd.a(this.e);
    }
}
