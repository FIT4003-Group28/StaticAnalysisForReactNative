package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahkw  reason: default package */
/* loaded from: classes2.dex */
public final class ahkw<T> extends btrh<T> {
    private final int d;

    public ahkw(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        boolean z = false;
        switch (this.d) {
            case 0:
                ahkv ahkvVar = (ahkv) this.a;
                ahjy ahjyVar = (ahjy) obj;
                ahjt ahjtVar = ahjyVar.a;
                ahjt ahjtVar2 = ahkvVar.F;
                ahkvVar.F = new ahjt(ahjyVar.a);
                if (!ahkvVar.G && ahkvVar.F.equals(ahjtVar2)) {
                    return;
                }
                ahkvVar.w();
                ahkvVar.d.a().f(dukj.NETWORK_TYPE_CHANGED, ahkvVar.F.d());
                ahkvVar.c.b(new ahjx(ahkvVar.F));
                ahkvVar.G = false;
                return;
            case 1:
                ahkv ahkvVar2 = (ahkv) this.a;
                ahkvVar2.r = ((crhp) obj).b();
                ahkvVar2.w();
                return;
            case 2:
                ahkv ahkvVar3 = (ahkv) this.a;
                ahkvVar3.s = ((byze) obj).a();
                ahkvVar3.w();
                return;
            case 3:
                ahkv ahkvVar4 = (ahkv) this.a;
                ahkvVar4.t = ((GmmCarProjectionStateEvent) obj).isInProjectedMode();
                ahkvVar4.w();
                return;
            case 4:
                ahkv ahkvVar5 = (ahkv) this.a;
                ahkvVar5.A = ((crmj) obj).b.a().h;
                ahkvVar5.w();
                return;
            case 5:
                ahkv ahkvVar6 = (ahkv) this.a;
                ahkvVar6.A = ((crhb) obj).a.a();
                ahkvVar6.w();
                return;
            case 6:
                ahkv ahkvVar7 = (ahkv) this.a;
                btvr btvrVar = (btvr) obj;
                if (btvrVar.a.getNavigationParameters().C() || btvrVar.a.getLocationParameters().m) {
                    z = true;
                }
                ahkvVar7.w = z;
                ahkvVar7.v = btvrVar.a.getNavigationParameters().a.aT;
                ahkvVar7.x = btvrVar.a.getNavigationParameters().S();
                ahkvVar7.B = btvrVar.a.getNavigationParameters().U();
                ahkvVar7.C = btvrVar.a.getNavigationParameters().V();
                duwx duwxVar = btvrVar.a.getLocationParameters().f;
                if (duwxVar == null) {
                    duwxVar = duwx.i;
                }
                ahkvVar7.y = duwxVar.e;
                ahkvVar7.w();
                if ((btvrVar.a.getLocationParameters().a & 4096) == 0) {
                    ahkvVar7.e.P(bvjk.hf);
                    return;
                } else {
                    ahkvVar7.e.Z(bvjk.hf, btvrVar.a.getLocationParameters().k);
                    return;
                }
            default:
                ((ahkv) this.a).z = ((gdx) obj).a;
                return;
        }
    }
}
