package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aijr  reason: default package */
/* loaded from: classes.dex */
public final class aijr {
    public static int a(int i) {
        return i - 1;
    }

    public static boolean b(PlayerResponseModel playerResponseModel, snc sncVar) {
        VideoStreamingData videoStreamingData;
        return (playerResponseModel == null || (videoStreamingData = playerResponseModel.c) == null || !videoStreamingData.A(sncVar.d())) ? false : true;
    }

    public static apkk c(asaa asaaVar) {
        apkl apklVar;
        apkl apklVar2;
        if (!g(asaaVar) && asaaVar != null && (asaaVar.b & 1024) != 0) {
            arzr arzrVar = asaaVar.j;
            if (arzrVar == null) {
                arzrVar = arzr.a;
            }
            if (arzrVar.b == 64657230) {
                apklVar = (apkl) arzrVar.c;
            } else {
                apklVar = apkl.a;
            }
            if ((apklVar.b & 2) != 0) {
                arzr arzrVar2 = asaaVar.j;
                if (arzrVar2 == null) {
                    arzrVar2 = arzr.a;
                }
                if (arzrVar2.b == 64657230) {
                    apklVar2 = (apkl) arzrVar2.c;
                } else {
                    apklVar2 = apkl.a;
                }
                apkk apkkVar = apklVar2.d;
                return apkkVar == null ? apkk.a : apkkVar;
            }
        }
        return null;
    }

    public static aqft d(asaa asaaVar) {
        if ((asaaVar.b & 32) != 0) {
            arzz arzzVar = asaaVar.g;
            if (arzzVar == null) {
                arzzVar = arzz.a;
            }
            if (arzzVar.b == 64099105) {
                arzz arzzVar2 = asaaVar.g;
                if (arzzVar2 == null) {
                    arzzVar2 = arzz.a;
                }
                if (arzzVar2.b == 64099105) {
                    return (aqft) arzzVar2.c;
                }
                return aqft.a;
            }
        }
        return null;
    }

    public static attp e(asaa asaaVar) {
        if (asaaVar != null) {
            arzv arzvVar = asaaVar.l;
            if (arzvVar == null) {
                arzvVar = arzv.a;
            }
            if (arzvVar.b != 60572968) {
                return null;
            }
            arzv arzvVar2 = asaaVar.l;
            if (arzvVar2 == null) {
                arzvVar2 = arzv.a;
            }
            if (arzvVar2.b == 60572968) {
                return (attp) arzvVar2.c;
            }
            return attp.a;
        }
        return null;
    }

    public static auag f(asaa asaaVar) {
        auag auagVar;
        if (asaaVar != null && (asaaVar.b & 32) != 0) {
            arzz arzzVar = asaaVar.g;
            if (arzzVar == null) {
                arzzVar = arzz.a;
            }
            if (arzzVar.b == 73238862) {
                arzz arzzVar2 = asaaVar.g;
                if (arzzVar2 == null) {
                    arzzVar2 = arzz.a;
                }
                if (arzzVar2.b == 73238862) {
                    auagVar = (auag) arzzVar2.c;
                } else {
                    auagVar = auag.a;
                }
            } else {
                auagVar = null;
            }
            if (auagVar != null && !auagVar.c.isEmpty()) {
                int i = auagVar.b;
                if ((i & 4) != 0 && (i & 2) != 0) {
                    return auagVar;
                }
            }
        }
        return null;
    }

    public static boolean g(asaa asaaVar) {
        apkl apklVar;
        if (asaaVar != null && (asaaVar.b & 1024) != 0) {
            arzr arzrVar = asaaVar.j;
            if (arzrVar == null) {
                arzrVar = arzr.a;
            }
            if (arzrVar.b == 64657230) {
                arzr arzrVar2 = asaaVar.j;
                if (arzrVar2 == null) {
                    arzrVar2 = arzr.a;
                }
                if (arzrVar2.b == 64657230) {
                    apklVar = (apkl) arzrVar2.c;
                } else {
                    apklVar = apkl.a;
                }
            } else {
                apklVar = null;
            }
            if (apklVar != null && apklVar.c) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(asaa asaaVar) {
        int cj;
        return (asaaVar == null || (asaaVar.b & 131072) == 0 || (cj = awwc.cj(asaaVar.c)) == 0 || cj != 7) ? false : true;
    }

    public static boolean i(asaa asaaVar) {
        if (asaaVar != null) {
            int cj = awwc.cj(asaaVar.c);
            return cj == 0 || cj == 1;
        }
        return false;
    }

    public static boolean j(asaa asaaVar) {
        if (asaaVar == null) {
            return false;
        }
        int cj = awwc.cj(asaaVar.c);
        if (cj == 0) {
            cj = 1;
        }
        return cj == 1 || cj == 4 || cj == 5 || cj == 6 || cj == 10;
    }

    public static boolean k(asaa asaaVar) {
        if (asaaVar == null || (asaaVar.b & 131072) == 0) {
            return false;
        }
        arzu arzuVar = asaaVar.n;
        if (arzuVar == null) {
            arzuVar = arzu.a;
        }
        asuv asuvVar = arzuVar.c;
        if (asuvVar == null) {
            asuvVar = asuv.a;
        }
        return asuvVar.h;
    }
}
