package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhe  reason: default package */
/* loaded from: classes5.dex */
class cyhe implements cyhd {
    private final cyhg a;
    private final cyho b;
    private final dbty<cylx> c;
    private final dbty<cyib> d;
    private final cqat e;

    public cyhe(cyhg cyhgVar, cyho cyhoVar, dbty<cylx> dbtyVar, dbty<cyib> dbtyVar2, cqat cqatVar) {
        this.a = cyhgVar;
        this.b = cyhoVar;
        this.c = dbtyVar;
        this.d = dbtyVar2;
        this.e = cqatVar;
    }

    @Override // defpackage.cyhd
    public final cyhg a() {
        return this.a;
    }

    @Override // defpackage.cyhd
    public final cylx b() {
        return this.c.a();
    }

    @Override // defpackage.cyhd
    public final cyho c() {
        return this.b;
    }

    @Override // defpackage.cyhd
    public final cyib d() {
        return this.d.a();
    }

    @Override // defpackage.cyhd
    public final cqat e() {
        return this.e;
    }

    @Override // defpackage.cyhd
    public final void f() {
        cyhc.a(this);
    }
}
