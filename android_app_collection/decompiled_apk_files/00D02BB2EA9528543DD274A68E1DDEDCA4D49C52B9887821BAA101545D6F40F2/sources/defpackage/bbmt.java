package defpackage;
/* renamed from: bbmt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bbmt implements dbrn {
    private final dpqg a;

    public bbmt(dpqg dpqgVar) {
        this.a = dpqgVar;
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpqg dpqgVar = this.a;
        dpqe dpqeVar = (dpqe) obj;
        if (dpqeVar.c) {
            dpqeVar.bF();
            dpqeVar.c = false;
        }
        dpqh dpqhVar = (dpqh) dpqeVar.b;
        dpqh dpqhVar2 = dpqh.c;
        dpqhVar.b = dpqgVar.e;
        dpqhVar.a |= 1;
        return dpqeVar;
    }
}
