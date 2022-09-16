package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bcaj  reason: default package */
/* loaded from: classes3.dex */
public final class bcaj implements Serializable {
    @dzsi
    public Class<? extends fd> a;

    public static final boolean d(fd fdVar) {
        Bundle bundle = fdVar.o;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("firstFragmentOfPhotoUploadFlow", false);
    }

    public static void e(ges gesVar) {
        Bundle bundle = gesVar.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("firstFragmentOfPhotoUploadFlow", true);
        gesVar.B(bundle);
    }

    public final void a(ff ffVar, bbuf bbufVar) {
        dbsk.t(this.a, "dispatchResult can't be called without calling pushFirstFragment(ForResult).");
        ges b = b(ffVar);
        if (b != null) {
            ffVar.g().f();
            b.Nw(bbufVar);
        }
    }

    @dzsi
    public final ges b(ff ffVar) {
        dbsk.t(this.a, "popFragmentsUntilFirstFragmentOfPhotoUploadFlow can't be called without calling pushFirstFragment(ForResult).");
        ffVar.g().aq();
        gfq gfqVar = new gfq(ffVar);
        while (true) {
            ges gesVar = (ges) gfqVar.d();
            if (gesVar == null) {
                return null;
            }
            if (d(gesVar)) {
                return gesVar;
            }
            ffVar.g().f();
        }
    }

    public final void c(ges gesVar, gfw gfwVar) {
        dbsk.m(this.a == null, "pushFirstFragment(ForResult) shouldn't be called twice in a single photo upload flow.");
        e(gesVar);
        this.a = gesVar.getClass();
        gfwVar.aZ(gesVar);
    }
}
