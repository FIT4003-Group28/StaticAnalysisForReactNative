package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhxs  reason: default package */
/* loaded from: classes3.dex */
public class bhxs implements bhwu {
    public boolean a;
    final /* synthetic */ bhxy b;
    private final dndr c;

    public bhxs(bhxy bhxyVar, final dndr dndrVar) {
        this.b = bhxyVar;
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.a(z);
        this.c = dndrVar;
        this.a = false;
        bhxyVar.c.b(new Runnable(this, dndrVar) { // from class: bhxq
            private final bhxs a;
            private final dndr b;

            {
                this.a = this;
                this.b = dndrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bhxs bhxsVar = this.a;
                dndr dndrVar2 = this.b;
                bhxy bhxyVar2 = bhxsVar.b;
                bvrj.BACKGROUND_THREADPOOL.c();
                final boolean j = dcft.j((List) deha.s(bhxyVar2.e.a().m()), new dbsl(dndrVar2) { // from class: bhxb
                    private final dndr a;

                    {
                        this.a = dndrVar2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return ((azva) obj).a == this.a;
                    }
                });
                bhxsVar.b.c.b(new Runnable(bhxsVar, j) { // from class: bhxr
                    private final bhxs a;
                    private final boolean b;

                    {
                        this.a = bhxsVar;
                        this.b = j;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bhxs bhxsVar2 = this.a;
                        boolean z2 = !this.b;
                        bhxsVar2.a = z2;
                        if (z2) {
                            cqkx.p(bhxsVar2.b);
                        }
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.jad
    public cqkl c() {
        bhxy bhxyVar = this.b;
        bhxyVar.i = this.c;
        bhxyVar.k = bhxyVar.D(dtxj.aB);
        this.b.k.q().show();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(this.c == dndr.HOME ? dtxj.aA : dtxj.aD);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.b.B(this.c);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.bhwu, defpackage.jad
    public cqtd i() {
        return cqrt.g(this.c == dndr.HOME ? 2131232714 : 2131232989, ibm.x());
    }
}
