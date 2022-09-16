package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.internal.MyAccountChip;
/* compiled from: PG */
/* renamed from: cwho  reason: default package */
/* loaded from: classes5.dex */
final class cwho extends cvxj {
    final /* synthetic */ cwhp a;

    public cwho(cwhp cwhpVar) {
        this.a = cwhpVar;
    }

    @Override // defpackage.cvxj
    public final void a(final Object obj) {
        cwjf.a(new Runnable(this, obj) { // from class: cwhm
            private final cwho a;
            private final Object b;

            {
                this.a = this;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                final cwho cwhoVar = this.a;
                Object obj2 = this.b;
                if (obj2 == null) {
                    return;
                }
                MyAccountChip<AccountT> myAccountChip = cwhoVar.a.a;
                if (myAccountChip.b.a().d()) {
                    myAccountChip.b.o();
                    cwfn.f(myAccountChip.b.a().e());
                    i = 0;
                } else {
                    i = 8;
                }
                myAccountChip.setVisibility(i);
                cwhoVar.a.b.setAccount(obj2);
                if (!cwhoVar.a.j.a()) {
                    return;
                }
                ((cvwn) cwhoVar.a.j.b()).a().a().a().b(((cvwn) cwhoVar.a.j.b()).b(), new aa(cwhoVar) { // from class: cwhn
                    private final cwho a;

                    {
                        this.a = cwhoVar;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj3) {
                        Integer num = (Integer) obj3;
                        this.a.a.d();
                    }
                });
            }
        });
    }
}
