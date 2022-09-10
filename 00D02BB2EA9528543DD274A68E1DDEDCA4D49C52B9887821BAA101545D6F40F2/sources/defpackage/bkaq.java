package defpackage;
/* compiled from: PG */
/* renamed from: bkaq  reason: default package */
/* loaded from: classes3.dex */
public class bkaq implements bjxb {
    private final dqcq a;
    private final bkam b;
    private final CharSequence c;

    public bkaq(gga ggaVar, cqhn cqhnVar, bkan bkanVar, cjtd cjtdVar, dqcq dqcqVar, int i, bkao bkaoVar) {
        this.a = dqcqVar;
        this.b = bkanVar.a(dqcqVar, new bkap(ggaVar, bkaoVar, cjtdVar));
        this.c = dqcqVar.b;
    }

    @Override // defpackage.bjxb
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.bjxb
    public CharSequence b() {
        return this.b.a();
    }

    @Override // defpackage.bjxb
    public Integer c() {
        return this.b.c();
    }

    @Override // defpackage.bjxb
    public cqkl d() {
        return this.b.d();
    }

    @Override // defpackage.bjxb
    public cjtd e() {
        return this.b.e();
    }

    public void f(int i) {
        if (this.b.g(i)) {
            cqkx.p(this);
        }
    }

    public dqcq g() {
        return this.a;
    }
}
