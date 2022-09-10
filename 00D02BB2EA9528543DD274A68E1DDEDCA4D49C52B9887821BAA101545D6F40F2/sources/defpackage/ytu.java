package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ytu  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ytu implements dbrn {
    static final dbrn a = new ytu();

    private ytu() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        final yvn yvnVar = (yvn) obj;
        dpsn dpsnVar = yvnVar.c().c;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        akqi j = akqi.j(dpsnVar);
        dpum dpumVar = yvnVar.c().d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        akqq f = akqq.f(dpumVar);
        cqtd d = yvnVar.d();
        String str = yvnVar.c().b;
        yvnVar.getClass();
        return xdj.g(j, f, d, str, new Runnable(yvnVar) { // from class: yuc
            private final yvn a;

            {
                this.a = yvnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.t();
            }
        });
    }
}
