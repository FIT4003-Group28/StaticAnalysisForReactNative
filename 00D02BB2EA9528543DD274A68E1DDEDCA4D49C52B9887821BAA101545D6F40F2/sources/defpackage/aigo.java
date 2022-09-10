package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: aigo  reason: default package */
/* loaded from: classes2.dex */
public final class aigo implements aikz {
    private final dcdn<PersonId, ahvg> a;

    public aigo(ailh ailhVar, ahvi ahviVar) {
        dcdg p = dcdn.p();
        for (doep doepVar : ailhVar.a) {
            ahvg d = ahvg.d(doepVar, ahviVar);
            p.f(((ahuz) d).a.a(), d);
        }
        this.a = p.b();
    }

    public final dcdc<ahvg> a() {
        return dcdc.r(this.a.values());
    }

    public final dbsg<ahvg> b(Profile profile) {
        return dbsg.j(this.a.get(profile.a()));
    }

    @Override // defpackage.aikz
    public final void c(String str, PrintWriter printWriter) {
    }
}
