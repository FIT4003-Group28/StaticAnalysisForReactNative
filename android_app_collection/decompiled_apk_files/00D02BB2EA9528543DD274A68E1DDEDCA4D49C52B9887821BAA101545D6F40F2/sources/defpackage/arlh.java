package defpackage;
/* compiled from: PG */
/* renamed from: arlh  reason: default package */
/* loaded from: classes2.dex */
public final class arlh<T> extends btrh<T> {
    public arlh(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        arlg arlgVar = (arlg) this.a;
        crhp crhpVar = (crhp) obj;
        synchronized (arlgVar.g) {
            if (!arlgVar.l && crhpVar.b()) {
                dbsk.l(!arlgVar.l);
                arlgVar.l = true;
                arlgVar.m = arlgVar.d.a(czh.WALKING_NAVIGATION, czs.INERTIAL_BACKGROUND);
                crow crowVar = arlgVar.f;
                String b = arlgVar.d.b();
                if (b != null) {
                    ddnp ddnpVar = crowVar.b;
                    if (ddnpVar.c) {
                        ddnpVar.bF();
                        ddnpVar.c = false;
                    }
                    ddnq ddnqVar = (ddnq) ddnpVar.b;
                    ddnq ddnqVar2 = ddnq.j;
                    b.getClass();
                    ddnqVar.a |= 128;
                    ddnqVar.h = b;
                }
                crow crowVar2 = arlgVar.f;
                boolean z = arlgVar.e instanceof dap;
                ddnp ddnpVar2 = crowVar2.b;
                if (ddnpVar2.c) {
                    ddnpVar2.bF();
                    ddnpVar2.c = false;
                }
                ddnq ddnqVar3 = (ddnq) ddnpVar2.b;
                ddnq ddnqVar4 = ddnq.j;
                ddnqVar3.a |= 256;
                ddnqVar3.i = z;
            } else if (arlgVar.l && !crhpVar.b()) {
                arlgVar.a();
                arlgVar.b();
            }
        }
    }
}
