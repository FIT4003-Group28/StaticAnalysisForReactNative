package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: owy  reason: default package */
/* loaded from: classes7.dex */
public final class owy {
    public static final dcqe a = dcqe.c("owy");

    public static CharSequence a(CharSequence charSequence, @dzsi dtqa dtqaVar, Resources resources) {
        int i;
        if (charSequence == null || charSequence.length() == 0 || dtqaVar == null || dtqaVar.a.size() == 0) {
            return charSequence;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence);
        for (dtpz dtpzVar : dtqaVar.a) {
            int i2 = dtpzVar.b;
            if (i2 >= 0 && i2 < charSequence.length() && (i = dtpzVar.c) >= dtpzVar.b && i <= charSequence.length()) {
                if ((dtpzVar.a & 4) != 0) {
                    dtjf dtjfVar = dtpzVar.d;
                    if (dtjfVar == null) {
                        dtjfVar = dtjf.d;
                    }
                    Integer b = b(resources, dtjfVar);
                    if (b != null) {
                        append.setSpan(new ForegroundColorSpan(b.intValue()), dtpzVar.b, dtpzVar.c, 17);
                    }
                }
                for (dtpy dtpyVar : new dsrh(dtpzVar.e, dtpz.f)) {
                    dtpy dtpyVar2 = dtpy.UNKNOWN_FONT_STYLE;
                    int ordinal = dtpyVar.ordinal();
                    if (ordinal == 1) {
                        append.setSpan(new StyleSpan(1), dtpzVar.b, dtpzVar.c, 17);
                    } else if (ordinal == 2) {
                        append.setSpan(new StyleSpan(2), dtpzVar.b, dtpzVar.c, 17);
                    }
                }
            }
        }
        return append;
    }

    @dzsi
    public static Integer b(Resources resources, @dzsi dtjf dtjfVar) {
        if (dtjfVar == null) {
            return null;
        }
        int i = dtjfVar.a;
        if ((i & 1) == 0) {
            if ((i & 2) == 0) {
                return null;
            }
            return Integer.valueOf(dtjfVar.c);
        }
        dtpy dtpyVar = dtpy.UNKNOWN_FONT_STYLE;
        int a2 = dtje.a(dtjfVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 0) {
            return Integer.valueOf(resources.getColor(R.color.mod_daynight_grey900));
        }
        if (i2 == 1) {
            return Integer.valueOf(resources.getColor(R.color.mod_daynight_grey800));
        }
        if (i2 != 3) {
            return Integer.valueOf(resources.getColor(R.color.mod_daynight_blue600));
        }
        return Integer.valueOf(resources.getColor(R.color.mod_daynight_grey700));
    }

    public static ilo c(dtof dtofVar) {
        ily ilyVar = new ily();
        dvyw dvywVar = dtofVar.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.E(dvywVar);
        return ilyVar.d();
    }

    public static String d(int i, int i2, ddho ddhoVar) {
        ddxw bZ = ddxx.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ.b;
        int i3 = ddxxVar.a | 128;
        ddxxVar.a = i3;
        ddxxVar.h = 0;
        int i4 = i3 | 1;
        ddxxVar.a = i4;
        ddxxVar.b = i;
        int i5 = i4 | 32;
        ddxxVar.a = i5;
        ddxxVar.f = i2;
        int i6 = ((dtxi) ddhoVar).a;
        ddxxVar.a = i5 | 8;
        ddxxVar.d = i6;
        String valueOf = String.valueOf(Base64.encodeToString(bZ.bK().bS(), 11));
        return valueOf.length() != 0 ? "0".concat(valueOf) : new String("0");
    }

    public static jic e(@dzsi dtkq dtkqVar, int i) {
        ckqc ckqcVar = ckqc.FIFE;
        String str = null;
        if (dtkqVar == null || (dtkqVar.a & 2) == 0) {
            dbsj.d(null);
        } else {
            str = dtkqVar.c;
            int a2 = dtkp.a(dtkqVar.d);
            if (a2 == 0) {
                a2 = 1;
            }
            ckqcVar = jfv.c(a2);
        }
        return new jic(str, ckqcVar, i, 250);
    }

    public static jic f(@dzsi dwfl dwflVar, int i) {
        return new jic(h(dwflVar), i(dwflVar), i, 250);
    }

    public static jic g(@dzsi dwfl dwflVar, cqtd cqtdVar) {
        return new jic(h(dwflVar), i(dwflVar), cqtdVar, 250);
    }

    @dzsi
    public static String h(@dzsi dwfl dwflVar) {
        if (dwflVar == null || (dwflVar.a & 128) == 0) {
            return null;
        }
        return dwflVar.h;
    }

    public static ckqc i(@dzsi dwfl dwflVar) {
        if (dwflVar != null) {
            return jfv.b(dwflVar);
        }
        return ckqc.FIFE;
    }
}
