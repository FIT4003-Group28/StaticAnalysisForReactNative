package defpackage;
/* compiled from: PG */
/* renamed from: cbvc  reason: default package */
/* loaded from: classes4.dex */
public class cbvc implements cbvb {
    private final cbrx a;
    private final cbtn b;

    public cbvc(cbrx cbrxVar, cbtn cbtnVar) {
        this.a = cbrxVar;
        this.b = cbtnVar;
    }

    @Override // defpackage.cbvb
    public String a() {
        return this.b.b;
    }

    @Override // defpackage.cbvb
    public Boolean b() {
        int a = cbtm.a(this.b.d);
        return Boolean.valueOf(a != 0 && a == 2);
    }

    @Override // defpackage.cbvb
    public cqkl c() {
        ((cbrz) this.a).b.b(this.b.c);
        return cqkl.a;
    }
}
