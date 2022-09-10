package defpackage;

import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.WindowManager;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cknv  reason: default package */
/* loaded from: classes4.dex */
public final class cknv {
    private static final dcep<String> a = dcep.C("content", "file");

    public static int a(WindowManager windowManager) {
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return Math.max(point.x, point.y);
    }

    @dzsi
    public static RectF b(@dzsi View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static boolean c(@dzsi dwfl dwflVar) {
        int a2;
        if (dwflVar == null) {
            return false;
        }
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dghk dghkVar = dizhVar.c;
        if (dghkVar == null) {
            dghkVar = dghk.g;
        }
        dggc b = dggc.b(dghkVar.b);
        if (b == null) {
            b = dggc.UNKNOWN;
        }
        if (b == dggc.UNKNOWN) {
            return ((dwflVar.a & 16) == 0 || (a2 = dwfc.a(dwflVar.f)) == 0 || a2 != 3) ? false : true;
        }
        dizh dizhVar2 = dwflVar.p;
        if (dizhVar2 == null) {
            dizhVar2 = dizh.j;
        }
        dghk dghkVar2 = dizhVar2.c;
        if (dghkVar2 == null) {
            dghkVar2 = dghk.g;
        }
        dggc b2 = dggc.b(dghkVar2.b);
        if (b2 == null) {
            b2 = dggc.UNKNOWN;
        }
        return b2 == dggc.PHOTO;
    }

    public static boolean d(@dzsi dwfl dwflVar, @dzsi dwfl dwflVar2) {
        if (dwflVar == null && dwflVar2 == null) {
            return true;
        }
        if (dwflVar != null && dwflVar2 != null) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            String str = dgggVar.c;
            dizh dizhVar2 = dwflVar2.p;
            if (dizhVar2 == null) {
                dizhVar2 = dizh.j;
            }
            dggg dgggVar2 = dizhVar2.b;
            if (dgggVar2 == null) {
                dgggVar2 = dggg.d;
            }
            String str2 = dgggVar2.c;
            int a2 = dwfc.a(dwflVar.f);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = dwfc.a(dwflVar2.f);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a2 == a3 && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Collection<dwfl> collection, dwfl dwflVar) {
        for (dwfl dwflVar2 : collection) {
            if (d(dwflVar2, dwflVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(@dzsi dwfl dwflVar) {
        int a2;
        if (dwflVar == null) {
            return false;
        }
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dghk dghkVar = dizhVar.c;
        if (dghkVar == null) {
            dghkVar = dghk.g;
        }
        dggc b = dggc.b(dghkVar.b);
        if (b == null) {
            b = dggc.UNKNOWN;
        }
        if (b == dggc.UNKNOWN) {
            if ((dwflVar.a & 16) == 0) {
                return false;
            }
            int a3 = dwfc.a(dwflVar.f);
            return (a3 != 0 && a3 == 2) || (a2 = dwfc.a(dwflVar.f)) == 0 || a2 == 1;
        }
        dizh dizhVar2 = dwflVar.p;
        if (dizhVar2 == null) {
            dizhVar2 = dizh.j;
        }
        dghk dghkVar2 = dizhVar2.c;
        if (dghkVar2 == null) {
            dghkVar2 = dghk.g;
        }
        dggc b2 = dggc.b(dghkVar2.b);
        if (b2 == null) {
            b2 = dggc.UNKNOWN;
        }
        return b2 == dggc.PANO;
    }

    public static boolean g(dwfl dwflVar) {
        if (f(dwflVar)) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            dgge b = dgge.b(dgggVar.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            return b == dgge.IMAGE_ALLEYCAT;
        }
        return false;
    }

    public static boolean h(dwfl dwflVar) {
        if (f(dwflVar)) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            dgge b = dgge.b(dgggVar.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            return dgge.IMAGE_FIFE.equals(b) || dgge.IMAGE_CONTENT_FIFE.equals(b) || dgge.MEDIA_GUESSABLE_FIFE.equals(b);
        }
        return false;
    }

    public static boolean i(dwfl dwflVar) {
        return a.contains(Uri.parse(dwflVar.h).getScheme());
    }

    public static boolean j(dwfl dwflVar) {
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dghk dghkVar = dizhVar.c;
        if (dghkVar == null) {
            dghkVar = dghk.g;
        }
        dggc b = dggc.b(dghkVar.b);
        if (b == null) {
            b = dggc.UNKNOWN;
        }
        return b == dggc.VIDEO;
    }

    public static String k(dwfl dwflVar) {
        return dwflVar.g;
    }

    public static dfxs l(dwfl dwflVar) {
        dlwo dlwoVar;
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dfxr bZ = dfxs.h.bZ();
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        if ((diisVar.a & 2) != 0) {
            dfwj bZ2 = dfwk.d.bZ();
            diis diisVar2 = dizhVar.g;
            if (diisVar2 == null) {
                diisVar2 = diis.h;
            }
            dhpf dhpfVar = diisVar2.e;
            if (dhpfVar == null) {
                dhpfVar = dhpf.i;
            }
            dfwe m = m(dhpfVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfwk dfwkVar = (dfwk) bZ2.b;
            m.getClass();
            dfwkVar.b = m;
            dfwkVar.a |= 64;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfxs dfxsVar = (dfxs) bZ.b;
            dfwk bK = bZ2.bK();
            bK.getClass();
            dfxsVar.g = bK;
            dfxsVar.a |= 32;
        }
        int i = 1;
        if ((dizhVar.a & 1) != 0) {
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            dfwp n = n(dgggVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfxs dfxsVar2 = (dfxs) bZ.b;
            n.getClass();
            dfxsVar2.b = n;
            dfxsVar2.a |= 2;
        }
        if ((dizhVar.a & 4) != 0) {
            dlwk dlwkVar = dizhVar.d;
            if (dlwkVar == null) {
                dlwkVar = dlwk.g;
            }
            dfwf s = s(dlwkVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfxs dfxsVar3 = (dfxs) bZ.b;
            dfwg bK2 = s.bK();
            bK2.getClass();
            dfxsVar3.d = bK2;
            dfxsVar3.a |= 8;
        }
        if ((dizhVar.a & 2) != 0) {
            dfxv bZ3 = dfxw.f.bZ();
            dghk dghkVar = dizhVar.c;
            if (dghkVar == null) {
                dghkVar = dghk.g;
            }
            dggc b = dggc.b(dghkVar.b);
            if (b == null) {
                b = dggc.UNKNOWN;
            }
            int t = t(b);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfxw dfxwVar = (dfxw) bZ3.b;
            dfxwVar.b = t - 1;
            dfxwVar.a |= 4;
            dghk dghkVar2 = dizhVar.c;
            if (dghkVar2 == null) {
                dghkVar2 = dghk.g;
            }
            dhkd dhkdVar = dghkVar2.c;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            dfwq p = p(dhkdVar);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfxw dfxwVar2 = (dfxw) bZ3.b;
            dfwr bK3 = p.bK();
            bK3.getClass();
            dfxwVar2.c = bK3;
            dfxwVar2.a |= 8;
            dfyl bZ4 = dfym.c.bZ();
            dghk dghkVar3 = dizhVar.c;
            if (dghkVar3 == null) {
                dghkVar3 = dghk.g;
            }
            dgho dghoVar = dghkVar3.d;
            if (dghoVar == null) {
                dghoVar = dgho.b;
            }
            dhkd dhkdVar2 = dghoVar.a;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            dfwq p2 = p(dhkdVar2);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dfym dfymVar = (dfym) bZ4.b;
            dfwr bK4 = p2.bK();
            bK4.getClass();
            dfymVar.b = bK4;
            dfymVar.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfxw dfxwVar3 = (dfxw) bZ3.b;
            dfym bK5 = bZ4.bK();
            bK5.getClass();
            dfxwVar3.d = bK5;
            dfxwVar3.a |= 16;
            dghk dghkVar4 = dizhVar.c;
            if (dghkVar4 == null) {
                dghkVar4 = dghk.g;
            }
            if ((dghkVar4.a & 16) != 0) {
                dfxp bZ5 = dfxq.d.bZ();
                dghk dghkVar5 = dizhVar.c;
                if (dghkVar5 == null) {
                    dghkVar5 = dghk.g;
                }
                dghe dgheVar = dghkVar5.e;
                if (dgheVar == null) {
                    dgheVar = dghe.c;
                }
                dhkd dhkdVar3 = dgheVar.a;
                if (dhkdVar3 == null) {
                    dhkdVar3 = dhkd.d;
                }
                dfwq p3 = p(dhkdVar3);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dfxq dfxqVar = (dfxq) bZ5.b;
                dfwr bK6 = p3.bK();
                bK6.getClass();
                dfxqVar.b = bK6;
                dfxqVar.a |= 1;
                dghk dghkVar6 = dizhVar.c;
                if (dghkVar6 == null) {
                    dghkVar6 = dghk.g;
                }
                dghe dgheVar2 = dghkVar6.e;
                if (dgheVar2 == null) {
                    dgheVar2 = dghe.c;
                }
                dhkd dhkdVar4 = dgheVar2.b;
                if (dhkdVar4 == null) {
                    dhkdVar4 = dhkd.d;
                }
                dfwq p4 = p(dhkdVar4);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dfxq dfxqVar2 = (dfxq) bZ5.b;
                dfwr bK7 = p4.bK();
                bK7.getClass();
                dfxqVar2.c = bK7;
                dfxqVar2.a |= 2;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dfxw dfxwVar4 = (dfxw) bZ3.b;
                dfxq bK8 = bZ5.bK();
                bK8.getClass();
                dfxwVar4.e = bK8;
                dfxwVar4.a |= 32;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfxs dfxsVar4 = (dfxs) bZ.b;
            dfxw bK9 = bZ3.bK();
            bK9.getClass();
            dfxsVar4.c = bK9;
            dfxsVar4.a |= 4;
        }
        Iterator<dlwo> it = dizhVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                dlwoVar = null;
                break;
            }
            dlwoVar = it.next();
            dlws dlwsVar = dlwoVar.b;
            if (dlwsVar == null) {
                dlwsVar = dlws.c;
            }
            int a2 = dlwr.a(dlwsVar.b);
            if (a2 != 0 && a2 == 2) {
                break;
            }
        }
        if (dlwoVar == null) {
            dlwoVar = dlwo.k;
        }
        dlwi dlwiVar = dlwoVar.c;
        if (dlwiVar == null) {
            dlwiVar = dlwi.f;
        }
        dhkb dhkbVar = dlwiVar.d;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        if ((dhkbVar.a & 2) == 0) {
            dsqp dsqpVar = (dsqp) dlwoVar.cu(5);
            dsqpVar.bC(dlwoVar);
            dlwn dlwnVar = (dlwn) dsqpVar;
            dlwi dlwiVar2 = dlwoVar.c;
            if (dlwiVar2 == null) {
                dlwiVar2 = dlwi.f;
            }
            dsqp dsqpVar2 = (dsqp) dlwiVar2.cu(5);
            dsqpVar2.bC(dlwiVar2);
            dlwh dlwhVar = (dlwh) dsqpVar2;
            dlwi dlwiVar3 = dlwoVar.c;
            if (dlwiVar3 == null) {
                dlwiVar3 = dlwi.f;
            }
            dhkb dhkbVar2 = dlwiVar3.d;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            dsqp dsqpVar3 = (dsqp) dhkbVar2.cu(5);
            dsqpVar3.bC(dhkbVar2);
            dhka dhkaVar = (dhka) dsqpVar3;
            if (dhkaVar.c) {
                dhkaVar.bF();
                dhkaVar.c = false;
            }
            dhkb dhkbVar3 = (dhkb) dhkaVar.b;
            dhkbVar3.a |= 2;
            dhkbVar3.c = 90.0f;
            if (dlwhVar.c) {
                dlwhVar.bF();
                dlwhVar.c = false;
            }
            dlwi dlwiVar4 = (dlwi) dlwhVar.b;
            dhkb bK10 = dhkaVar.bK();
            bK10.getClass();
            dlwiVar4.d = bK10;
            dlwiVar4.a |= 4;
            if (dlwnVar.c) {
                dlwnVar.bF();
                dlwnVar.c = false;
            }
            dlwo dlwoVar2 = (dlwo) dlwnVar.b;
            dlwi bK11 = dlwhVar.bK();
            bK11.getClass();
            dlwoVar2.c = bK11;
            dlwoVar2.a |= 2;
            dlwoVar = dlwnVar.bK();
        }
        dfxe bZ6 = dfxf.g.bZ();
        dfxg bZ7 = dfxi.c.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dfxi dfxiVar = (dfxi) bZ7.b;
        dfxiVar.b = 1;
        dfxiVar.a |= 1;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dfxf dfxfVar = (dfxf) bZ6.b;
        dfxi bK12 = bZ7.bK();
        bK12.getClass();
        dfxfVar.b = bK12;
        dfxfVar.a |= 1;
        dlwi dlwiVar5 = dlwoVar.c;
        if (dlwiVar5 == null) {
            dlwiVar5 = dlwi.f;
        }
        dfxa o = o(dlwiVar5);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dfxf dfxfVar2 = (dfxf) bZ6.b;
        dfxb bK13 = o.bK();
        bK13.getClass();
        dfxfVar2.c = bK13;
        dfxfVar2.a |= 2;
        if ((dlwoVar.a & 16) != 0) {
            dfxn bZ8 = dfxo.f.bZ();
            dlxa dlxaVar = dlwoVar.f;
            if (dlxaVar == null) {
                dlxaVar = dlxa.f;
            }
            if ((dlxaVar.a & 1) != 0) {
                dfvz bZ9 = dfwc.c.bZ();
                dlxa dlxaVar2 = dlwoVar.f;
                if (dlxaVar2 == null) {
                    dlxaVar2 = dlxa.f;
                }
                dlwa dlwaVar = dlxaVar2.b;
                if (dlwaVar == null) {
                    dlwaVar = dlwa.c;
                }
                int a3 = dlvz.a(dlwaVar.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                int a4 = dfwb.a(a3 - 1);
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dfwc dfwcVar = (dfwc) bZ9.b;
                int i2 = a4 - 1;
                if (a4 == 0) {
                    throw null;
                }
                dfwcVar.b = i2;
                dfwcVar.a |= 1;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dfxo dfxoVar = (dfxo) bZ8.b;
                dfwc bK14 = bZ9.bK();
                bK14.getClass();
                dfxoVar.b = bK14;
                dfxoVar.a |= 1;
            }
            dlxa dlxaVar3 = dlwoVar.f;
            if (dlxaVar3 == null) {
                dlxaVar3 = dlxa.f;
            }
            if ((dlxaVar3.a & 2) != 0) {
                dfxl bZ10 = dfxm.d.bZ();
                dlxa dlxaVar4 = dlwoVar.f;
                if (dlxaVar4 == null) {
                    dlxaVar4 = dlxa.f;
                }
                dlwy dlwyVar = dlxaVar4.c;
                if (dlwyVar == null) {
                    dlwyVar = dlwy.d;
                }
                dspd dspdVar = dlwyVar.c;
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dfxm dfxmVar = (dfxm) bZ10.b;
                dspdVar.getClass();
                dfxmVar.a |= 4;
                dfxmVar.c = dspdVar;
                dlxa dlxaVar5 = dlwoVar.f;
                if (dlxaVar5 == null) {
                    dlxaVar5 = dlxa.f;
                }
                dlwy dlwyVar2 = dlxaVar5.c;
                if (dlwyVar2 == null) {
                    dlwyVar2 = dlwy.d;
                }
                dhkd dhkdVar5 = dlwyVar2.a;
                if (dhkdVar5 == null) {
                    dhkdVar5 = dhkd.d;
                }
                dfwq p5 = p(dhkdVar5);
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dfxm dfxmVar2 = (dfxm) bZ10.b;
                dfwr bK15 = p5.bK();
                bK15.getClass();
                dfxmVar2.b = bK15;
                dfxmVar2.a |= 1;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dfxo dfxoVar2 = (dfxo) bZ8.b;
                dfxm bK16 = bZ10.bK();
                bK16.getClass();
                dfxoVar2.c = bK16;
                dfxoVar2.a |= 2;
            }
            dlxa dlxaVar6 = dlwoVar.f;
            if (dlxaVar6 == null) {
                dlxaVar6 = dlxa.f;
            }
            if ((dlxaVar6.a & 4) != 0) {
                dfyf bZ11 = dfyi.c.bZ();
                dlxa dlxaVar7 = dlwoVar.f;
                if (dlxaVar7 == null) {
                    dlxaVar7 = dlxa.f;
                }
                dlxo dlxoVar = dlxaVar7.d;
                if (dlxoVar == null) {
                    dlxoVar = dlxo.c;
                }
                int a5 = dlxn.a(dlxoVar.b);
                if (a5 == 0) {
                    a5 = 1;
                }
                int a6 = dfyh.a(a5 - 1);
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dfyi dfyiVar = (dfyi) bZ11.b;
                int i3 = a6 - 1;
                if (a6 == 0) {
                    throw null;
                }
                dfyiVar.b = i3;
                dfyiVar.a |= 1;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dfxo dfxoVar3 = (dfxo) bZ8.b;
                dfyi bK17 = bZ11.bK();
                bK17.getClass();
                dfxoVar3.d = bK17;
                dfxoVar3.a |= 4;
            }
            dlxa dlxaVar8 = dlwoVar.f;
            if (dlxaVar8 == null) {
                dlxaVar8 = dlxa.f;
            }
            if ((dlxaVar8.a & 8) != 0) {
                dfxl bZ12 = dfxm.d.bZ();
                dlxa dlxaVar9 = dlwoVar.f;
                if (dlxaVar9 == null) {
                    dlxaVar9 = dlxa.f;
                }
                dlwy dlwyVar3 = dlxaVar9.e;
                if (dlwyVar3 == null) {
                    dlwyVar3 = dlwy.d;
                }
                dspd dspdVar2 = dlwyVar3.c;
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                dfxm dfxmVar3 = (dfxm) bZ12.b;
                dspdVar2.getClass();
                dfxmVar3.a |= 4;
                dfxmVar3.c = dspdVar2;
                dlxa dlxaVar10 = dlwoVar.f;
                if (dlxaVar10 == null) {
                    dlxaVar10 = dlxa.f;
                }
                dlwy dlwyVar4 = dlxaVar10.e;
                if (dlwyVar4 == null) {
                    dlwyVar4 = dlwy.d;
                }
                dhkd dhkdVar6 = dlwyVar4.a;
                if (dhkdVar6 == null) {
                    dhkdVar6 = dhkd.d;
                }
                dfwq p6 = p(dhkdVar6);
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                dfxm dfxmVar4 = (dfxm) bZ12.b;
                dfwr bK18 = p6.bK();
                bK18.getClass();
                dfxmVar4.b = bK18;
                dfxmVar4.a |= 1;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dfxo dfxoVar4 = (dfxo) bZ8.b;
                dfxm bK19 = bZ12.bK();
                bK19.getClass();
                dfxoVar4.e = bK19;
                dfxoVar4.a |= 8;
            }
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dfxf dfxfVar3 = (dfxf) bZ6.b;
            dfxo bK20 = bZ8.bK();
            bK20.getClass();
            dfxfVar3.e = bK20;
            dfxfVar3.a |= 16;
        }
        for (dlxi dlxiVar : dlwoVar.j) {
            dfxz bZ13 = dfya.c.bZ();
            for (dlwm dlwmVar : dlxiVar.a) {
                dfxc bZ14 = dfxd.c.bZ();
                dszp q = q(dlwmVar);
                if (bZ14.c) {
                    bZ14.bF();
                    bZ14.c = false;
                }
                dfxd dfxdVar = (dfxd) bZ14.b;
                dszq bK21 = q.bK();
                bK21.getClass();
                dfxdVar.b = bK21;
                dfxdVar.a |= 2;
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                dfya dfyaVar = (dfya) bZ13.b;
                dfxd bK22 = bZ14.bK();
                bK22.getClass();
                dsrj<dfxd> dsrjVar = dfyaVar.a;
                if (!dsrjVar.a()) {
                    dfyaVar.a = dsqw.cl(dsrjVar);
                }
                dfyaVar.a.add(bK22);
            }
            for (Float f : dlxiVar.b) {
                float floatValue = f.floatValue();
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                dfya dfyaVar2 = (dfya) bZ13.b;
                dsre dsreVar = dfyaVar2.b;
                if (!dsreVar.a()) {
                    dfyaVar2.b = dsqw.cj(dsreVar);
                }
                dfyaVar2.b.g(floatValue);
            }
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dfxf dfxfVar4 = (dfxf) bZ6.b;
            dfya bK23 = bZ13.bK();
            bK23.getClass();
            dsrj<dfya> dsrjVar2 = dfxfVar4.f;
            if (!dsrjVar2.a()) {
                dfxfVar4.f = dsqw.cl(dsrjVar2);
            }
            dfxfVar4.f.add(bK23);
        }
        dfyj bZ15 = dfyk.b.bZ();
        dlxq dlxqVar = dlwoVar.d;
        if (dlxqVar == null) {
            dlxqVar = dlxq.b;
        }
        for (dlxk dlxkVar : dlxqVar.a) {
            dfyd bZ16 = dfye.f.bZ();
            dggg dgggVar2 = dlxkVar.a;
            if (dgggVar2 == null) {
                dgggVar2 = dggg.d;
            }
            dfwp n2 = n(dgggVar2);
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dfye dfyeVar = (dfye) bZ16.b;
            n2.getClass();
            dfyeVar.b = n2;
            dfyeVar.a |= i;
            dfvx bZ17 = dfvy.e.bZ();
            dfxa bZ18 = dfxb.e.bZ();
            dfwy bZ19 = dfwz.d.bZ();
            dhjx dhjxVar = dlxkVar.b;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            dhjz dhjzVar = dhjxVar.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            double d = dhjzVar.b;
            if (bZ19.c) {
                bZ19.bF();
                bZ19.c = false;
            }
            dfwz dfwzVar = (dfwz) bZ19.b;
            dfwzVar.a |= 2;
            dfwzVar.c = d;
            dhjx dhjxVar2 = dlxkVar.b;
            if (dhjxVar2 == null) {
                dhjxVar2 = dhjx.f;
            }
            dhjz dhjzVar2 = dhjxVar2.b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            double d2 = dhjzVar2.c;
            if (bZ19.c) {
                bZ19.bF();
                bZ19.c = false;
            }
            dfwz dfwzVar2 = (dfwz) bZ19.b;
            dfwzVar2.a |= 1;
            dfwzVar2.b = d2;
            if (bZ18.c) {
                bZ18.bF();
                bZ18.c = false;
            }
            dfxb dfxbVar = (dfxb) bZ18.b;
            dfwz bK24 = bZ19.bK();
            bK24.getClass();
            dfxbVar.b = bK24;
            dfxbVar.a |= 1;
            if (bZ17.c) {
                bZ17.bF();
                bZ17.c = false;
            }
            dfvy dfvyVar = (dfvy) bZ17.b;
            dfxb bK25 = bZ18.bK();
            bK25.getClass();
            dfvyVar.b = bK25;
            dfvyVar.a |= 1;
            dhjx dhjxVar3 = dlxkVar.b;
            if (dhjxVar3 == null) {
                dhjxVar3 = dhjx.f;
            }
            dhkd dhkdVar7 = dhjxVar3.d;
            if (dhkdVar7 == null) {
                dhkdVar7 = dhkd.d;
            }
            dfwq p7 = p(dhkdVar7);
            if (bZ17.c) {
                bZ17.bF();
                bZ17.c = false;
            }
            dfvy dfvyVar2 = (dfvy) bZ17.b;
            dfwr bK26 = p7.bK();
            bK26.getClass();
            dfvyVar2.c = bK26;
            dfvyVar2.a |= 2;
            dhjx dhjxVar4 = dlxkVar.b;
            if (dhjxVar4 == null) {
                dhjxVar4 = dhjx.f;
            }
            float f2 = dhjxVar4.e;
            if (bZ17.c) {
                bZ17.bF();
                bZ17.c = false;
            }
            dfvy dfvyVar3 = (dfvy) bZ17.b;
            dfvyVar3.a |= 4;
            dfvyVar3.d = f2;
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dfye dfyeVar2 = (dfye) bZ16.b;
            dfvy bK27 = bZ17.bK();
            bK27.getClass();
            dfyeVar2.c = bK27;
            dfyeVar2.a |= 2;
            dlwi dlwiVar6 = dlxkVar.c;
            if (dlwiVar6 == null) {
                dlwiVar6 = dlwi.f;
            }
            dfxa o2 = o(dlwiVar6);
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dfye dfyeVar3 = (dfye) bZ16.b;
            dfxb bK28 = o2.bK();
            bK28.getClass();
            dfyeVar3.d = bK28;
            dfyeVar3.a |= 4;
            dlwk dlwkVar2 = dlxkVar.d;
            if (dlwkVar2 == null) {
                dlwkVar2 = dlwk.g;
            }
            dfwf s2 = s(dlwkVar2);
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dfye dfyeVar4 = (dfye) bZ16.b;
            dfwg bK29 = s2.bK();
            bK29.getClass();
            dfyeVar4.e = bK29;
            dfyeVar4.a |= 8;
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dfyk dfykVar = (dfyk) bZ15.b;
            dfye bK30 = bZ16.bK();
            bK30.getClass();
            dsrj<dfye> dsrjVar3 = dfykVar.a;
            if (!dsrjVar3.a()) {
                dfykVar.a = dsqw.cl(dsrjVar3);
            }
            dfykVar.a.add(bK30);
            i = 1;
        }
        dlxq dlxqVar2 = dlwoVar.d;
        if (dlxqVar2 == null) {
            dlxqVar2 = dlxq.b;
        }
        if (dlxqVar2.a.size() > 0) {
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dfxf dfxfVar5 = (dfxf) bZ6.b;
            dfyk bK31 = bZ15.bK();
            bK31.getClass();
            dfxfVar5.d = bK31;
            dfxfVar5.a |= 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfxs dfxsVar5 = (dfxs) bZ.b;
        dfxf bK32 = bZ6.bK();
        bK32.getClass();
        dsrj<dfxf> dsrjVar4 = dfxsVar5.f;
        if (!dsrjVar4.a()) {
            dfxsVar5.f = dsqw.cl(dsrjVar4);
        }
        dfxsVar5.f.add(bK32);
        return bZ.bK();
    }

    public static dfwe m(dhpf dhpfVar) {
        dfwd bZ = dfwe.j.bZ();
        if ((dhpfVar.a & 1) != 0) {
            int i = dhpfVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar = (dfwe) bZ.b;
            dfweVar.a |= 1;
            dfweVar.b = i;
        }
        if ((dhpfVar.a & 2) != 0) {
            int i2 = dhpfVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar2 = (dfwe) bZ.b;
            dfweVar2.a |= 2;
            dfweVar2.c = i2;
        }
        if ((dhpfVar.a & 4) != 0) {
            int i3 = dhpfVar.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar3 = (dfwe) bZ.b;
            dfweVar3.a |= 4;
            dfweVar3.d = i3;
        }
        if ((dhpfVar.a & 8) != 0) {
            int i4 = dhpfVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar4 = (dfwe) bZ.b;
            dfweVar4.a |= 8;
            dfweVar4.e = i4;
        }
        if ((dhpfVar.a & 16) != 0) {
            int i5 = dhpfVar.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar5 = (dfwe) bZ.b;
            dfweVar5.a |= 16;
            dfweVar5.f = i5;
        }
        if ((dhpfVar.a & 32) != 0) {
            float f = dhpfVar.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar6 = (dfwe) bZ.b;
            dfweVar6.a |= 64;
            dfweVar6.h = f;
        }
        if ((dhpfVar.a & 64) != 0) {
            dszp r = r(dhpfVar.h);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwe dfweVar7 = (dfwe) bZ.b;
            dszq bK = r.bK();
            bK.getClass();
            dfweVar7.i = bK;
            dfweVar7.a |= 128;
        }
        return bZ.bK();
    }

    public static dfwp n(dggg dgggVar) {
        dfwn dfwnVar;
        dfwo bZ = dfwp.d.bZ();
        dgge b = dgge.b(dgggVar.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        if (b == dgge.IMAGE_UNKNOWN) {
            dfwnVar = dfwn.IMAGE_UNKNOWN;
        } else if (b == dgge.IMAGE_INTERNET) {
            dfwnVar = dfwn.IMAGE_INTERNET;
        } else if (b == dgge.IMAGE_ALLEYCAT) {
            dfwnVar = dfwn.IMAGE_ALLEYCAT;
        } else if (b == dgge.IMAGE_FIFE) {
            dfwnVar = dfwn.IMAGE_FIFE;
        } else if (b == dgge.IMAGE_PANORAMIO) {
            dfwnVar = dfwn.IMAGE_PANORAMIO;
        } else if (b == dgge.METADATA_GEO_PHOTO_SERVICE) {
            dfwnVar = dfwn.METADATA_GEO_PHOTO_SERVICE;
        } else if (b == dgge.VIDEO_YOUTUBE) {
            dfwnVar = dfwn.VIDEO_YOUTUBE;
        } else if (b == dgge.KEYHOLE) {
            dfwnVar = dfwn.KEYHOLE;
        } else if (b == dgge.IMAGE_CONTENT_FIFE) {
            dfwnVar = dfwn.IMAGE_CONTENT_FIFE;
        } else if (b == dgge.IMAGE_ALLEYCAT_SEARCH) {
            dfwnVar = dfwn.IMAGE_ALLEYCAT_SEARCH;
        } else if (b == dgge.MEDIA_GUESSABLE_FIFE) {
            dfwnVar = dfwn.MEDIA_GUESSABLE_FIFE;
        } else {
            dfwnVar = dfwn.IMAGE_UNKNOWN;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwp dfwpVar = (dfwp) bZ.b;
        dfwpVar.b = dfwnVar.l;
        int i = dfwpVar.a | 1;
        dfwpVar.a = i;
        String str = dgggVar.c;
        str.getClass();
        dfwpVar.a = i | 2;
        dfwpVar.c = str;
        return bZ.bK();
    }

    public static dfxa o(dlwi dlwiVar) {
        dfxa bZ = dfxb.e.bZ();
        dfwy bZ2 = dfwz.d.bZ();
        dpum dpumVar = dlwiVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        double d = dpumVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfwz dfwzVar = (dfwz) bZ2.b;
        dfwzVar.a |= 1;
        dfwzVar.b = d;
        dpum dpumVar2 = dlwiVar.b;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        double d2 = dpumVar2.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfwz dfwzVar2 = (dfwz) bZ2.b;
        dfwzVar2.a |= 2;
        dfwzVar2.c = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfxb dfxbVar = (dfxb) bZ.b;
        dfwz bK = bZ2.bK();
        bK.getClass();
        dfxbVar.b = bK;
        dfxbVar.a |= 1;
        dfwh bZ3 = dfwi.c.bZ();
        dlwe dlweVar = dlwiVar.c;
        if (dlweVar == null) {
            dlweVar = dlwe.c;
        }
        float f = dlweVar.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dfwi dfwiVar = (dfwi) bZ3.b;
        dfwiVar.a |= 1;
        dfwiVar.b = f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfxb dfxbVar2 = (dfxb) bZ.b;
        dfwi bK2 = bZ3.bK();
        bK2.getClass();
        dfxbVar2.c = bK2;
        dfxbVar2.a |= 2;
        dfxx bZ4 = dfxy.e.bZ();
        dhkb dhkbVar = dlwiVar.d;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        float f2 = dhkbVar.b;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dfxy dfxyVar = (dfxy) bZ4.b;
        dfxyVar.a |= 1;
        dfxyVar.b = f2;
        dhkb dhkbVar2 = dlwiVar.d;
        if (dhkbVar2 == null) {
            dhkbVar2 = dhkb.e;
        }
        float f3 = dhkbVar2.c;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dfxy dfxyVar2 = (dfxy) bZ4.b;
        dfxyVar2.a |= 2;
        dfxyVar2.c = f3;
        dhkb dhkbVar3 = dlwiVar.d;
        if (dhkbVar3 == null) {
            dhkbVar3 = dhkb.e;
        }
        float f4 = dhkbVar3.d;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dfxy dfxyVar3 = (dfxy) bZ4.b;
        dfxyVar3.a |= 4;
        dfxyVar3.d = f4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfxb dfxbVar3 = (dfxb) bZ.b;
        dfxy bK3 = bZ4.bK();
        bK3.getClass();
        dfxbVar3.d = bK3;
        dfxbVar3.a |= 4;
        return bZ;
    }

    public static dfwq p(dhkd dhkdVar) {
        dfwq bZ = dfwr.d.bZ();
        int i = dhkdVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwr dfwrVar = (dfwr) bZ.b;
        int i2 = dfwrVar.a | 2;
        dfwrVar.a = i2;
        dfwrVar.c = i;
        int i3 = dhkdVar.c;
        dfwrVar.a = i2 | 1;
        dfwrVar.b = i3;
        return bZ;
    }

    public static dszp q(dlwm dlwmVar) {
        dszp bZ = dszq.c.bZ();
        String str = dlwmVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszq dszqVar = (dszq) bZ.b;
        str.getClass();
        dszqVar.a |= 1;
        dszqVar.b = str;
        return bZ;
    }

    public static dszp r(String str) {
        dszp bZ = dszq.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszq dszqVar = (dszq) bZ.b;
        str.getClass();
        dszqVar.a |= 1;
        dszqVar.b = str;
        return bZ;
    }

    public static dfwf s(dlwk dlwkVar) {
        dfwf bZ = dfwg.g.bZ();
        dszp r = r(dlwkVar.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwg dfwgVar = (dfwg) bZ.b;
        dszq bK = r.bK();
        bK.getClass();
        dfwgVar.c = bK;
        dfwgVar.a |= 4;
        dszp r2 = r(dlwkVar.d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwg dfwgVar2 = (dfwg) bZ.b;
        dszq bK2 = r2.bK();
        bK2.getClass();
        dfwgVar2.d = bK2;
        dfwgVar2.a |= 8;
        dszp r3 = r(dlwkVar.e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwg dfwgVar3 = (dfwg) bZ.b;
        dszq bK3 = r3.bK();
        bK3.getClass();
        dfwgVar3.e = bK3;
        dfwgVar3.a |= 16;
        dszp r4 = r(dlwkVar.f);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwg dfwgVar4 = (dfwg) bZ.b;
        dszq bK4 = r4.bK();
        bK4.getClass();
        dfwgVar4.f = bK4;
        dfwgVar4.a |= 32;
        for (String str : dlwkVar.b) {
            dszp r5 = r(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwg dfwgVar5 = (dfwg) bZ.b;
            dszq bK5 = r5.bK();
            bK5.getClass();
            dsrj<dszq> dsrjVar = dfwgVar5.b;
            if (!dsrjVar.a()) {
                dfwgVar5.b = dsqw.cl(dsrjVar);
            }
            dfwgVar5.b.add(bK5);
        }
        return bZ;
    }

    public static int t(dggc dggcVar) {
        if (dggcVar == dggc.UNKNOWN) {
            return 1;
        }
        if (dggcVar == dggc.TOUR) {
            return 2;
        }
        if (dggcVar == dggc.PHOTO) {
            return 4;
        }
        return dggcVar == dggc.PANO ? 3 : 1;
    }
}
