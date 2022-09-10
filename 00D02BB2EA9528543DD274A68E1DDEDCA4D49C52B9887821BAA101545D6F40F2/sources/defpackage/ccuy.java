package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ccuy  reason: default package */
/* loaded from: classes4.dex */
public abstract class ccuy<T> implements ccup<T> {
    private ccux<T> a = new ccuu();
    private ccun b = ccuq.a;
    private dcdc<ccuo<T>> c = dcdc.e();

    @Override // defpackage.ccup
    public List<ccuo<T>> a() {
        return this.c;
    }

    @Override // defpackage.ccup
    public ccun b() {
        return this.b;
    }

    @Override // defpackage.ccup
    public cqkl c(final ccuo<T> ccuoVar) {
        this.c = dcbg.b(this.c).o(new dbsl(ccuoVar) { // from class: ccut
            private final ccuo a;

            {
                this.a = ccuoVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((ccuo) obj) != this.a;
            }
        }).z();
        this.a.b(ccuoVar.e());
        return cqkl.a;
    }

    @Override // defpackage.ccup
    public cqkl d(ccuo<T> ccuoVar) {
        this.a.c(ccuoVar.e());
        return cqkl.a;
    }

    public void e(ccux<T> ccuxVar) {
        this.a = ccuxVar;
        this.b = new ccun(this) { // from class: ccur
            private final ccuy a;

            {
                this.a = this;
            }

            @Override // defpackage.ccun
            public cqkl a() {
                return this.a.h();
            }
        };
        this.c = dcdc.e();
    }

    public List<T> f() {
        return dcbg.b(this.c).s(ccus.a).z();
    }

    public void g(List<T> list) {
        dccx F = dcdc.F();
        for (int i = 0; i < list.size(); i++) {
            F.g(i(list.get(i), i));
        }
        this.c = F.f();
    }

    public cqkl h() {
        this.a.a();
        return cqkl.a;
    }

    protected abstract ccuo<T> i(T t, int i);
}
