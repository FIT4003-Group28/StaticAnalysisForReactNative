package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahty  reason: default package */
/* loaded from: classes2.dex */
public final class ahty implements ahvr {
    private static final dcqe j = dcqe.c("ahty");
    public final dxio<akfa> a;
    public final dxio<aija> b;
    public final dxio<aiki> c;
    public final dxio<aihe<aimj, aiig>> d;
    public final dxio<aihe<ailh, aigm>> e;
    public final dxio<aijz> f;
    public final dxio<bvrb> g;
    public final dxio<cqat> h;
    public final dxio<ajsj> i;

    public ahty(dxio<akfa> dxioVar, dxio<aija> dxioVar2, dxio<aiki> dxioVar3, dxio<aihe<aimj, aiig>> dxioVar4, dxio<aihe<ailh, aigm>> dxioVar5, dxio<aijz> dxioVar6, dxio<bvrb> dxioVar7, dxio<cqat> dxioVar8, dxio<ajsj> dxioVar9) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
        this.g = dxioVar7;
        this.h = dxioVar8;
        this.i = dxioVar9;
    }

    public static dbsg<String> b(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    public final void a(final String str, final Profile profile, final eapd eapdVar, final dbsg<String> dbsgVar, final dbsg<Boolean> dbsgVar2, final dbsg<aigm> dbsgVar3) {
        final String g = profile.a().g();
        if (dbsj.d(str) || dbsj.d(g)) {
            bvoo.h("Location sharing notification received with missing data: recipientObfuscatedGaiaId=%s and senderObfuscatedGaiaId=%s", str, g);
        } else {
            this.g.a().b(new Runnable(this, str, dbsgVar, g, profile, dbsgVar2, eapdVar, dbsgVar3) { // from class: ahtv
                private final ahty a;
                private final String b;
                private final dbsg c;
                private final String d;
                private final Profile e;
                private final dbsg f;
                private final eapd g;
                private final dbsg h;

                {
                    this.a = this;
                    this.b = str;
                    this.c = dbsgVar;
                    this.d = g;
                    this.e = profile;
                    this.f = dbsgVar2;
                    this.g = eapdVar;
                    this.h = dbsgVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final ahty ahtyVar = this.a;
                    final String str2 = this.b;
                    final dbsg dbsgVar4 = this.c;
                    final String str3 = this.d;
                    final Profile profile2 = this.e;
                    final dbsg dbsgVar5 = this.f;
                    final eapd eapdVar2 = this.g;
                    final dbsg dbsgVar6 = this.h;
                    final btlu n = ahtyVar.a.a().n(str2);
                    ahtyVar.g.a().b(new Runnable(ahtyVar, dbsgVar4, str2, str3, n, profile2, dbsgVar5, eapdVar2, dbsgVar6) { // from class: ahtw
                        private final ahty a;
                        private final dbsg b;
                        private final String c;
                        private final String d;
                        private final btlu e;
                        private final Profile f;
                        private final dbsg g;
                        private final eapd h;
                        private final dbsg i;

                        {
                            this.a = ahtyVar;
                            this.b = dbsgVar4;
                            this.c = str2;
                            this.d = str3;
                            this.e = n;
                            this.f = profile2;
                            this.g = dbsgVar5;
                            this.h = eapdVar2;
                            this.i = dbsgVar6;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final ahty ahtyVar2 = this.a;
                            dbsg dbsgVar7 = this.b;
                            String str4 = this.c;
                            String str5 = this.d;
                            final btlu btluVar = this.e;
                            final Profile profile3 = this.f;
                            final dbsg dbsgVar8 = this.g;
                            eapd eapdVar3 = this.h;
                            dbsg dbsgVar9 = this.i;
                            if (dbsgVar7.a()) {
                                ahtyVar2.b.a().c(str4, str5, (String) dbsgVar7.b());
                            }
                            btlu b = ahtyVar2.i.a().b();
                            if (b != null && str4.equals(b.j())) {
                                ahtyVar2.f.a().b(btluVar);
                            }
                            if (profile3.b().a()) {
                                ahtyVar2.c.a().a().Pk(new Runnable(ahtyVar2, profile3, dbsgVar8, btluVar) { // from class: ahtx
                                    private final ahty a;
                                    private final Profile b;
                                    private final dbsg c;
                                    private final btlu d;

                                    {
                                        this.a = ahtyVar2;
                                        this.b = profile3;
                                        this.c = dbsgVar8;
                                        this.d = btluVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ahty ahtyVar3 = this.a;
                                        ahtyVar3.c.a().t(this.b, this.c, this.d);
                                    }
                                }, ahtyVar2.g.a().h());
                                ahtyVar2.d.a().a(new aiid(eapdVar3, profile3), dbsg.j(btluVar));
                            }
                            if (dbsgVar9.a()) {
                                ahtyVar2.e.a().a((aigm) dbsgVar9.b(), dbsg.j(btluVar));
                            }
                        }
                    }, bvrj.UI_THREAD);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }
}
