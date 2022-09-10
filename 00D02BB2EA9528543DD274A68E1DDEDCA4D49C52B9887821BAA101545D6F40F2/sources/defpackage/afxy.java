package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: afxy  reason: default package */
/* loaded from: classes2.dex */
public final class afxy {
    public final Context a;
    public final btvo b;
    public final afxv c;
    public final afxn d;
    public final afyc e;

    public afxy(Context context, btvo btvoVar, afxv afxvVar, afxn afxnVar, afyc afycVar) {
        this.a = context;
        this.b = btvoVar;
        this.c = afxvVar;
        this.d = afxnVar;
        this.e = afycVar;
    }

    public static boolean f(dwfl dwflVar) {
        if (cknv.j(dwflVar) || cknv.f(dwflVar) || cknv.h(dwflVar) || cknv.g(dwflVar)) {
            return false;
        }
        return cknv.c(dwflVar);
    }

    public static cjta k(ddel ddelVar, boolean z) {
        ddhj ddhjVar;
        cjta b = cjtd.b();
        ddes bZ = ddet.D.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddelVar.getClass();
        ddetVar.t = ddelVar;
        ddetVar.a |= 4194304;
        b.s(bZ.bK());
        ddeu ddeuVar = b.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddelVar.getClass();
        ddevVar.p = ddelVar;
        ddevVar.a |= 8388608;
        if (z) {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        } else {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        }
        b.w(ddhjVar);
        return b;
    }

    private static String l(@dzsi ilo iloVar) {
        return (iloVar == null || iloVar.h() == null) ? "" : iloVar.h().g;
    }

    public final boolean a() {
        return this.c.b();
    }

    public final void b(@dzsi ilo iloVar, String str) {
        afxv afxvVar = this.c;
        afxvVar.l.put(str, l(iloVar));
    }

    public final ddel c(@dzsi ilo iloVar) {
        ddej bZ = ddel.f.bZ();
        int ordinal = this.e.ordinal();
        int i = 6;
        if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 3;
        } else if (ordinal == 3) {
            i = 4;
        } else if (ordinal == 6) {
            i = 5;
        } else if (ordinal != 7) {
            i = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddel ddelVar = (ddel) bZ.b;
        ddelVar.b = i - 1;
        ddelVar.a |= 1;
        String l = l(iloVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddel ddelVar2 = (ddel) bZ.b;
        l.getClass();
        ddelVar2.a |= 2;
        ddelVar2.c = l;
        return bZ.bK();
    }

    public final cjta d(@dzsi ilo iloVar) {
        return k(c(iloVar), false);
    }

    public final boolean e() {
        if (this.e != afyc.PHOTO_TABS) {
            return false;
        }
        dkng dkngVar = this.b.getLensParameters().i;
        if (dkngVar == null) {
            dkngVar = dkng.c;
        }
        dknf dknfVar = dkngVar.a;
        if (dknfVar == null) {
            dknfVar = dknf.h;
        }
        return dknfVar.a && dknfVar.b;
    }

    public final boolean g(@dzsi ilo iloVar, String str) {
        String l = l(iloVar);
        if (TextUtils.isEmpty(l)) {
            return false;
        }
        afxv afxvVar = this.c;
        if (afxvVar.l.containsKey(str)) {
            return afxvVar.l.get(str).equals(l);
        }
        return false;
    }

    public final boolean h(@dzsi dizh dizhVar) {
        return i(dizhVar).a();
    }

    public final dbsg<afyd> i(@dzsi dizh dizhVar) {
        if (dizhVar == null || (dizhVar.a & 64) == 0) {
            return dbpy.a;
        }
        dccx F = dcdc.F();
        dizl dizlVar = dizhVar.i;
        if (dizlVar == null) {
            dizlVar = dizl.e;
        }
        for (dizn diznVar : dizlVar.b) {
            F.g(diznVar.b);
        }
        return this.c.c(F.f());
    }

    public final dbsg<afyd> j(@dzsi ilo iloVar) {
        String str;
        List<String> list;
        if (iloVar == null || iloVar.h() == null || (iloVar.h().a & 8192) == 0) {
            str = "";
        } else {
            dvxz dvxzVar = iloVar.h().s;
            if (dvxzVar == null) {
                dvxzVar = dvxz.h;
            }
            str = dvxzVar.g;
        }
        afxv afxvVar = this.c;
        String e = dbsj.e(str);
        afxn afxnVar = afxvVar.g;
        if (TextUtils.isEmpty(e)) {
            list = dcdc.e();
        } else {
            String b = dbqa.b(e);
            if (!afxnVar.a.containsKey(b)) {
                list = dcdc.e();
            } else {
                list = afxnVar.a.get(b);
            }
        }
        return afxvVar.c(list);
    }
}
