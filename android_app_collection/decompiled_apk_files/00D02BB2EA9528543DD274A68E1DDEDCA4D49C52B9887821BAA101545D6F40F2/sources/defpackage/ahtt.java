package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahtt  reason: default package */
/* loaded from: classes2.dex */
public final class ahtt {
    public final ahuu a;
    public final ajsj b;
    public final akfc c;
    public final aiki d;
    public final aijz e;
    public final cjqy f;
    public final aihe<aimj, aiig> g;
    public final cqat h;
    private final gga i;
    private final aija j;
    private final bvrb k;

    public ahtt(gga ggaVar, ahuu ahuuVar, aija aijaVar, ajsj ajsjVar, akfc akfcVar, aiki aikiVar, aijz aijzVar, bvrb bvrbVar, cjqy cjqyVar, aihe<aimj, aiig> aiheVar, cqat cqatVar) {
        this.i = ggaVar;
        this.a = ahuuVar;
        this.b = ajsjVar;
        this.j = aijaVar;
        this.c = akfcVar;
        this.d = aikiVar;
        this.e = aijzVar;
        this.k = bvrbVar;
        this.f = cjqyVar;
        this.g = aiheVar;
        this.h = cqatVar;
    }

    public final void a(@dzsi final String str, final String str2, final dbsg<Profile> dbsgVar, final boolean z, @dzsi String str3, boolean z2) {
        if (this.b.e()) {
            return;
        }
        if (str3 != null) {
            this.j.c(str, str2, str3);
        }
        Runnable runnable = new Runnable(this, str, str2, dbsgVar, z) { // from class: ahtq
            private final ahtt a;
            private final String b;
            private final String c;
            private final dbsg d;
            private final boolean e;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = dbsgVar;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahtt ahttVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                dbsg<Profile> dbsgVar2 = this.d;
                boolean z3 = this.e;
                bvrj.UI_THREAD.c();
                if (ahttVar.b.f()) {
                    ahttVar.a.q();
                    return;
                }
                btlu b = ahttVar.b.b();
                if (str4 == null) {
                    ahttVar.b(b, str5, dbsgVar2, z3);
                } else if (b == null || !dbsd.a(b.j(), str4)) {
                    ahttVar.c.f(str4, new ahts(ahttVar, str5, dbsgVar2, z3));
                } else {
                    ahttVar.b(b, str5, dbsgVar2, z3);
                }
            }
        };
        if (z2) {
            this.i.B(runnable);
        } else {
            runnable.run();
        }
    }

    public final void b(@dzsi final btlu btluVar, final String str, final dbsg<Profile> dbsgVar, final boolean z) {
        bvrj.UI_THREAD.c();
        if (btluVar == null || !dbsd.a(btluVar.j(), str)) {
            final PersonId c = PersonId.c(str);
            this.d.a().Pk(new Runnable(this, dbsgVar, str, btluVar, c, z) { // from class: ahtr
                private final ahtt a;
                private final dbsg b;
                private final String c;
                private final btlu d;
                private final PersonId e;
                private final boolean f;

                {
                    this.a = this;
                    this.b = dbsgVar;
                    this.c = str;
                    this.d = btluVar;
                    this.e = c;
                    this.f = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ahtt ahttVar = this.a;
                    dbsg dbsgVar2 = this.b;
                    String str2 = this.c;
                    btlu btluVar2 = this.d;
                    PersonId personId = this.e;
                    boolean z2 = this.f;
                    if (dbsgVar2.a()) {
                        dbsk.m(str2.equals(((Profile) dbsgVar2.b()).a().g()), "Received profile was for the wrong sharer.");
                        Profile profile = (Profile) dbsgVar2.b();
                        ahttVar.d.t(profile, dbpy.a, btluVar2);
                        ahttVar.g.a(new aiid(new eapd(ahttVar.h.b()), profile), dbsg.j(btluVar2));
                    }
                    if (ahttVar.d.i(btluVar2, personId)) {
                        ahttVar.d.j(btluVar2, personId);
                    }
                    aihe<aimj, aiig> aiheVar = ahttVar.g;
                    eapd eapdVar = new eapd(ahttVar.h.b());
                    ahwk g = Profile.g();
                    ((ahuw) g).a = personId;
                    aiheVar.a(new aiii(eapdVar, g.a()), dbsg.j(btluVar2));
                    ahttVar.d.u(btluVar2);
                    ahttVar.e.b(btluVar2);
                    ahttVar.a.s(dbsg.i(personId), ahwe.NOTIFICATION, z2);
                }
            }, this.k.h());
            return;
        }
        this.a.q();
    }
}
