package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
/* compiled from: PG */
/* renamed from: aihs  reason: default package */
/* loaded from: classes2.dex */
public abstract class aihs implements aihd {
    final eapd a;
    final eaow b;

    public aihs(eapd eapdVar, eaow eaowVar) {
        this.a = eapdVar;
        this.b = eaowVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean f(dqzv dqzvVar, ahwg ahwgVar) {
        PersonId b;
        dqyb dqybVar;
        int a = dqzq.a(dqzvVar.d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int a2 = dqzq.a(ahwgVar.a().d);
        if (a2 != 0) {
            i = a2;
        }
        if (a == 2) {
            a = 3;
        }
        if (i == 2) {
            i = 3;
        }
        if (a == i) {
            if (!ahwgVar.c().a() && ahwgVar.l().a()) {
                if (dqzvVar.b == 2) {
                    dqybVar = (dqyb) dqzvVar.c;
                } else {
                    dqybVar = dqyb.j;
                }
                if ((dqybVar.a & 2) != 0) {
                    return ahwgVar.l().b().equals((dqzvVar.b == 2 ? (dqyb) dqzvVar.c : dqyb.j).e);
                }
            }
            if (ahwgVar.k()) {
                dqzn dqznVar = dqzvVar.e;
                if (dqznVar == null) {
                    dqznVar = dqzn.c;
                }
                String str = dqznVar.a;
                dqzn dqznVar2 = ahwgVar.a().e;
                if (dqznVar2 == null) {
                    dqznVar2 = dqzn.c;
                }
                if (!str.equals(dqznVar2.a)) {
                    return false;
                }
            }
            if (!ahwgVar.c().a() || (b = PersonId.b(dqzvVar)) == null) {
                return false;
            }
            return b.equals(ahwgVar.c().b().a());
        }
        return false;
    }

    public abstract List<aihr> a(List<aihr> list, ahvi ahviVar);

    public abstract aimf b();

    @Override // defpackage.aihd
    public final eapd d() {
        return this.a;
    }

    @Override // defpackage.aihd
    public final eaow e() {
        return this.b;
    }
}
