package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnkz  reason: default package */
/* loaded from: classes3.dex */
public final class bnkz implements bnkn {
    public final Context a;
    public final dzsj<ckcw> b;
    public final bnko c;
    public final int d;
    private final dehq e;

    public bnkz(Context context, dzsj dzsjVar, dehq dehqVar, dzsj dzsjVar2, bvtd bvtdVar, bvtg bvtgVar, dvoz dvozVar) {
        this.a = context;
        this.c = new bnko(context, dzsjVar2, bvtgVar, dvozVar);
        this.e = dehqVar;
        this.b = dzsjVar;
        int b = bvoc.b(context);
        this.d = b;
        if (b == 0) {
            ((ckco) ((ckcw) dzsjVar.a()).a(ckja.X)).a(bnkv.a(1));
            bvoo.j(new NullPointerException("Unable to retrieve GMM versionCode - null PackageInfo object."));
        }
    }

    @Override // defpackage.bnkn
    public final void a() {
        bvqd.a(this.e.f(new Runnable(this) { // from class: bnkx
            private final bnkz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                final bnkz bnkzVar = this.a;
                coxz a = coxs.a(bnkzVar.a);
                String sb = new StringBuilder("com.google.geo.apps").toString();
                int i = bnkzVar.d;
                String[] strArr = new String[0];
                bnko bnkoVar = bnkzVar.c;
                dekm bZ = deko.s.bZ();
                dekr bZ2 = deks.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                deks deksVar = (deks) bZ2.b;
                deksVar.a |= 1;
                deksVar.b = 10L;
                deks deksVar2 = (deks) bZ2.b;
                deksVar2.a |= 2;
                deksVar2.c = 55L;
                deks deksVar3 = (deks) bZ2.b;
                deksVar3.a |= 4;
                deksVar3.d = 4L;
                deks bK = bZ2.bK();
                if (bnkoVar.d.a().a()) {
                    dekr bZ3 = deks.e.bZ();
                    long a2 = bnkoVar.d.a().b().a();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    deks deksVar4 = (deks) bZ3.b;
                    deksVar4.a |= 1;
                    deksVar4.b = a2;
                    long b = bnkoVar.d.a().b().b();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    deks deksVar5 = (deks) bZ3.b;
                    deksVar5.a |= 2;
                    deksVar5.c = b;
                    long c = bnkoVar.d.a().b().c();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    deks deksVar6 = (deks) bZ3.b;
                    deksVar6.a |= 4;
                    deksVar6.d = c;
                    deks bK2 = bZ3.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bK2.getClass();
                    ((deko) bZ.b).m = bK2;
                }
                Locale v = cjxr.v();
                String language = v.getLanguage();
                String upperCase = v.getCountry().toUpperCase(Locale.US);
                StringBuilder sb2 = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(upperCase).length());
                sb2.append(language);
                sb2.append("-");
                sb2.append(upperCase);
                String sb3 = sb2.toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((deko) bZ.b).i = "GMM";
                int d = bnkoVar.d.d();
                switch (d) {
                    case 1:
                        str = "UNKNOWN";
                        break;
                    case 2:
                        str = "GMM_ANDROID";
                        break;
                    case 3:
                        str = "GMM_IOS";
                        break;
                    case 4:
                        str = "MAPS_ANDROID_API";
                        break;
                    case 5:
                        str = "MAPS_IOS_SDK";
                        break;
                    case 6:
                        str = "NAV_API_ANDROID";
                        break;
                    case 7:
                        str = "NAV_API_IOS";
                        break;
                    case 8:
                        str = "GSA_IOS";
                        break;
                    case 9:
                        str = "GMM_ANDROID_EMBEDDED";
                        break;
                    case 10:
                        str = "NAV_GO";
                        break;
                    case 11:
                        str = "NAV_CORE_ANDROID";
                        break;
                    case 12:
                        str = "MAP_CORE_ANDROID";
                        break;
                    default:
                        str = "null";
                        break;
                }
                if (d == 0) {
                    throw null;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((deko) bZ.b).k = str;
                String b2 = bvnz.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deko dekoVar = (deko) bZ.b;
                b2.getClass();
                dekoVar.c = b2;
                dekoVar.f = true;
                String upperCase2 = bnkoVar.b.a().a().toUpperCase(Locale.ROOT);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deko dekoVar2 = (deko) bZ.b;
                upperCase2.getClass();
                dekoVar2.b = upperCase2;
                dekoVar2.d = true;
                boolean a3 = btxd.a(bnkoVar.a);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deko dekoVar3 = (deko) bZ.b;
                dekoVar3.e = a3;
                bK.getClass();
                dekoVar3.a = bK;
                long longValue = bvtd.a.longValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deko dekoVar4 = (deko) bZ.b;
                dekoVar4.n = longValue;
                dekoVar4.r = bnkoVar.c.g;
                sb3.getClass();
                dekoVar4.h = sb3;
                sb3.getClass();
                dekoVar4.o = sb3;
                dekoVar4.g = true;
                int i2 = btpf.b(bnkoVar.a) ? 4 : 3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((deko) bZ.b).j = dekn.a(i2);
                int i3 = bnkoVar.a.getResources().getDisplayMetrics().densityDpi;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deko dekoVar5 = (deko) bZ.b;
                dekoVar5.l = i3;
                dekoVar5.p = false;
                String a4 = bnkoVar.b.a().a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a4.getClass();
                ((deko) bZ.b).q = a4;
                a.a(sb, i, strArr, bZ.bK().bS()).m(new cpcf(bnkzVar) { // from class: bnky
                    private final bnkz a;

                    {
                        this.a = bnkzVar;
                    }

                    @Override // defpackage.cpcf
                    public final void a(cpcq cpcqVar) {
                        bnkz bnkzVar2 = this.a;
                        if (cpcqVar.b()) {
                            ((ckco) bnkzVar2.b.a().a(ckja.X)).a(bnkv.a(3));
                            return;
                        }
                        Exception e = cpcqVar.e();
                        if (e != null) {
                            bvoo.j(e);
                        }
                        ((ckco) bnkzVar2.b.a().a(ckja.X)).a(bnkv.a(1));
                    }
                });
            }
        }, 0L, 12L, TimeUnit.HOURS), this.e);
    }
}
