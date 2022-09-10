package defpackage;
/* compiled from: PG */
/* renamed from: bpgi  reason: default package */
/* loaded from: classes3.dex */
public class bpgi implements bpwp {
    final /* synthetic */ bpgj a;
    private final boxh b;
    private boolean c = false;
    private final cqkn<bpwp> d;

    public bpgi(bpgj bpgjVar, boxh boxhVar, cqkn<bpwp> cqknVar) {
        this.a = bpgjVar;
        this.b = boxhVar;
        this.d = cqknVar;
    }

    @Override // defpackage.bpwp
    public CharSequence a() {
        return this.a.a.getString(this.b.e);
    }

    @Override // defpackage.bpwp
    public cjtd b() {
        return cjtd.a(this.b.f);
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

    public boxh f() {
        return this.b;
    }
}
