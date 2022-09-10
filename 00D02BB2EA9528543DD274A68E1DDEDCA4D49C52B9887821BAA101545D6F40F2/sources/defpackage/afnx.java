package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: afnx  reason: default package */
/* loaded from: classes2.dex */
public final class afnx implements afks {
    private final afmg a;

    public afnx(afmg afmgVar) {
        dbsk.s(afmgVar);
        this.a = afmgVar;
    }

    private static dbsg<String> c(String str) {
        return dbsj.d(str) ? dbpy.a : dbsg.i(str);
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        duqz duqzVar = duqpVar.o;
        if (duqzVar == null) {
            duqzVar = duqz.f;
        }
        final boolean z = true;
        dbsk.m(!dbsj.d(duqzVar.b), "Request Location external invocation response missing sender obfuscated Gaia ID.");
        dbsk.m(!dbsj.d(duqzVar.c), "Request Location external invocation response missing sender email.");
        ahwk g = Profile.g();
        ahuw ahuwVar = (ahuw) g;
        ahuwVar.a = PersonId.c(duqzVar.b);
        ahuwVar.e = dbsg.i(duqzVar.c);
        ahuwVar.b = c(duqzVar.d);
        ahuwVar.d = c(duqzVar.e);
        final Profile a = g.a();
        if (intent != null) {
            z = true ^ affw.b(intent);
        }
        final afmg afmgVar = this.a;
        final dbsg<String> c = c(duqzVar.a);
        return new Runnable(afmgVar, c, a, z) { // from class: afmf
            private final afmg a;
            private final dbsg b;
            private final Profile c;
            private final boolean d;

            {
                this.a = afmgVar;
                this.b = c;
                this.c = a;
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afmg afmgVar2 = this.a;
                dbsg dbsgVar = this.b;
                Profile profile = this.c;
                afmgVar2.a.a().k((String) dbsgVar.f(), profile.a().g(), dbsg.i(profile), this.d);
            }
        };
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_LOCATION_SHARING_REQUEST_LOCATION;
    }
}
