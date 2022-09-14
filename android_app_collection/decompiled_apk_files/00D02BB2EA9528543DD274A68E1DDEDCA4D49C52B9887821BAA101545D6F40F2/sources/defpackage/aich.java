package defpackage;
/* compiled from: PG */
/* renamed from: aich  reason: default package */
/* loaded from: classes2.dex */
public final class aich<T> extends btrh<T> {
    private final int d;

    public aich(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            aice aiceVar = (aice) this.a;
            crhp crhpVar = (crhp) obj;
            aiceVar.a.b = crhpVar.d();
            aicg aicgVar = aiceVar.a;
            if (!aicgVar.b) {
                aicgVar.d = null;
                aicgVar.c = null;
                aicgVar.k(false);
                return;
            }
            aicgVar.d = crhpVar.e().g();
            aiceVar.a.c = crhpVar.e().a;
            aiceVar.a.j();
        } else if (i == 1) {
            aice aiceVar2 = (aice) this.a;
            if (((crhq) obj).d()) {
                int i2 = aicg.e;
                aicg aicgVar2 = aiceVar2.a;
                aicgVar2.b = false;
                aicgVar2.d = null;
                aicgVar2.c = null;
                aicgVar2.k(false);
                return;
            }
            int i3 = aicg.e;
        } else if (i == 2) {
            crmk crmkVar = (crmk) obj;
            int i4 = aicg.e;
            aicg aicgVar3 = ((aice) this.a).a;
            aicgVar3.b = false;
            aicgVar3.d = null;
            aicgVar3.c = null;
            aicgVar3.k(true);
        } else if (i != 3) {
            aice aiceVar3 = (aice) this.a;
            crmh crmhVar = (crmh) obj;
            int i5 = aicg.e;
            aiceVar3.a.d = crmhVar.b.b();
            aicg aicgVar4 = aiceVar3.a;
            aicgVar4.c = crmhVar.a;
            aicgVar4.j();
        } else {
            aice aiceVar4 = (aice) this.a;
            crmj crmjVar = (crmj) obj;
            int i6 = aicg.e;
            aiceVar4.a.d = crmjVar.b.b();
            aicg aicgVar5 = aiceVar4.a;
            aicgVar5.c = crmjVar.c;
            aicgVar5.j();
        }
    }
}
