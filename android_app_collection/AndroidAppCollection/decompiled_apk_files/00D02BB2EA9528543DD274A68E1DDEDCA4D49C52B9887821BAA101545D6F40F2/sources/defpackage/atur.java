package defpackage;
/* compiled from: PG */
/* renamed from: atur  reason: default package */
/* loaded from: classes2.dex */
public class atur implements atxt {
    public cqtd a;
    private final cqsn b;
    private final atuq c;
    private final cjtd d;
    @dzsi
    private final audo e;

    public atur(auei aueiVar, dbsg<aryv> dbsgVar, cqsn cqsnVar, atuq atuqVar, cjtd cjtdVar, vtn vtnVar) {
        this.b = cqsnVar;
        this.c = atuqVar;
        this.d = cjtdVar;
        auec auecVar = (auec) aueiVar;
        cqtd a = yzw.a(auecVar.a, auecVar.b, vtnVar, new vtk(this) { // from class: atup
            private final atur a;

            {
                this.a = this;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar) {
                atur aturVar = this.a;
                aturVar.a = cqtdVar;
                cqkx.p(aturVar);
            }
        });
        this.e = dbsgVar.a() ? new audj(dbsgVar.b(), false) : null;
        this.a = a == null ? cqtt.c() : a;
    }

    @Override // defpackage.atxt
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.atxt
    public cqsn b() {
        return this.b;
    }

    @Override // defpackage.atxt
    @dzsi
    public audo c() {
        return this.e;
    }

    @Override // defpackage.atxt
    public cqkl d() {
        atux atuxVar = (atux) this.c;
        atuxVar.a.g(atuxVar.b, atuxVar.c);
        return cqkl.a;
    }

    @Override // defpackage.atxt
    public cjtd e() {
        return this.d;
    }
}
