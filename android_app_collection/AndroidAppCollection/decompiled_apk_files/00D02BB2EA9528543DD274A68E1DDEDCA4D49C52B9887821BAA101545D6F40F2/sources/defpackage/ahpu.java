package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahpu  reason: default package */
/* loaded from: classes2.dex */
public final class ahpu<T> extends btrh<T> {
    private final int d;

    public ahpu(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        switch (this.d) {
            case 0:
                ahpt ahptVar = (ahpt) this.a;
                if (!((crmi) obj).a) {
                    return;
                }
                ahps j = ahptVar.j(6, null);
                if (ahptVar.d()) {
                    j.g = true;
                }
                ahptVar.c(j);
                return;
            case 1:
                ahpt ahptVar2 = (ahpt) this.a;
                crlw crlwVar = (crlw) obj;
                ahps j2 = ahptVar2.j(15, null);
                if (ahptVar2.d()) {
                    j2.i = true;
                }
                ahptVar2.c(j2);
                return;
            case 2:
                ahpt ahptVar3 = (ahpt) this.a;
                crmj crmjVar = (crmj) obj;
                ahptVar3.b(crmjVar.b.a().h);
                ahptVar3.i(7, crmjVar.b.a);
                return;
            case 3:
                ahpt ahptVar4 = (ahpt) this.a;
                boolean b = ((crhp) obj).b();
                if (!b) {
                    ahptVar4.i(7, amuh.b);
                }
                if (ahptVar4.d.booleanValue() == b) {
                    return;
                }
                ahptVar4.d = Boolean.valueOf(b);
                ahptVar4.i(13, ahptVar4.d);
                return;
            case 4:
                ((ahpt) this.a).b(((crhb) obj).a.a());
                return;
            case 5:
                ((ahpt) this.a).i(9, (crew) obj);
                return;
            case 6:
                ((ahpt) this.a).i(10, (crex) obj);
                return;
            case 7:
                ((ahpt) this.a).i(11, ((crev) obj).a);
                return;
            case 8:
                ahpt ahptVar5 = (ahpt) this.a;
                ascc asccVar = (ascc) obj;
                boolean z = ahptVar5.e;
                boolean z2 = asccVar.d;
                if (z == z2) {
                    return;
                }
                ahptVar5.e = z2;
                ahptVar5.i(12, asccVar);
                return;
            default:
                ((ahpt) this.a).i(14, (GmmCarProjectionStateEvent) obj);
                return;
        }
    }
}
