package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
import java.util.List;
/* compiled from: PG */
/* renamed from: aihw  reason: default package */
/* loaded from: classes2.dex */
public final class aihw implements aikz {
    private final dced<PersonId, ahwg> a;
    private final dcdc<ahwg> b;
    private final int c;

    public aihw(List<ahwg> list, int i) {
        dcdz j = dced.j();
        for (ahwg ahwgVar : list) {
            if (ahwgVar.c().a()) {
                j.h(ahwgVar.c().b().a(), ahwgVar);
            }
        }
        this.a = j.f();
        this.b = dcdc.r(list);
        this.c = i;
    }

    public final dcdc<ahwg> a() {
        return dcdc.q(dcft.i(this.b, aihv.a));
    }

    public final dcdc<ahwg> b(Profile profile) {
        dccr<ahwg> h = this.a.h(profile.a());
        return h != null ? dcdc.r(h) : dcdc.e();
    }

    @Override // defpackage.aikz
    public final void c(String str, PrintWriter printWriter) {
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final int e() {
        return this.c;
    }
}
