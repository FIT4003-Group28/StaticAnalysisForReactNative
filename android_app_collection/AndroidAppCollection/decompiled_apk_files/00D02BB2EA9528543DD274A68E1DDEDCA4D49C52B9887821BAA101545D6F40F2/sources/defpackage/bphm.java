package defpackage;
/* compiled from: PG */
/* renamed from: bphm  reason: default package */
/* loaded from: classes3.dex */
class bphm implements bpwp {
    private final String a;
    private final cjtd b;
    private boolean c;
    private final cqkn<bpwp> d;

    public bphm(String str, cqkn<bpwp> cqknVar, cjtd cjtdVar) {
        this.a = str;
        this.d = cqknVar;
        this.b = cjtdVar;
    }

    @Override // defpackage.bpwp
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bpwp
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.bpwp
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    public void d(boolean z) {
        this.c = z;
    }

    @Override // defpackage.bpwp
    public cqkn<bpwp> e() {
        return this.d;
    }
}
