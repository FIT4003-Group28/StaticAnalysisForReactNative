package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahfc */
/* loaded from: classes.dex */
public final /* synthetic */ class ahfc {
    public static apoj a(auaz auazVar) {
        if (auazVar != null) {
            auaw auawVar = auazVar.g;
            if (auawVar == null) {
                auawVar = auaw.a;
            }
            if ((auawVar.b & 1) == 0) {
                return null;
            }
            auaw auawVar2 = auazVar.g;
            if (auawVar2 == null) {
                auawVar2 = auaw.a;
            }
            apoj apojVar = auawVar2.c;
            return apojVar == null ? apoj.a : apojVar;
        }
        return null;
    }

    public static apoj b(auaz auazVar) {
        if (auazVar != null) {
            aubc aubcVar = auazVar.i;
            if (aubcVar == null) {
                aubcVar = aubc.a;
            }
            if ((aubcVar.b & 1) == 0) {
                return null;
            }
            aubc aubcVar2 = auazVar.i;
            if (aubcVar2 == null) {
                aubcVar2 = aubc.a;
            }
            apoj apojVar = aubcVar2.c;
            return apojVar == null ? apoj.a : apojVar;
        }
        return null;
    }

    public static final Class[] c(aias aiasVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhl ahhlVar = (ahhl) obj;
                aiasVar.e();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhl.class};
    }

    public static String d(FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            return "N/A";
        }
        String t = formatStreamModel.t();
        int indexOf = t.indexOf("codecs=\"") + 8;
        int min = Math.min(t.indexOf("\"", indexOf + 1), indexOf + 4);
        StringBuilder sb = new StringBuilder(formatStreamModel.e);
        if (indexOf >= 8 && min >= 0) {
            sb.append(' ');
            sb.append((CharSequence) t, indexOf, min);
        }
        if (formatStreamModel.P()) {
            sb.append(' ');
            sb.append(formatStreamModel.i());
            sb.append('x');
            sb.append(formatStreamModel.d());
            int c = formatStreamModel.c();
            if (c > 0) {
                sb.append('@');
                sb.append(c);
            }
        }
        if (formatStreamModel.L()) {
            sb.append(" otf");
        }
        return sb.toString();
    }

    public static boolean e(cff cffVar) {
        cew cewVar;
        if (cffVar instanceof afwg) {
            return true;
        }
        if (cffVar instanceof cev) {
            cewVar = ((cev) cffVar).b;
        } else {
            cewVar = cffVar instanceof cfd ? ((cfd) cffVar).b : null;
        }
        if (cewVar == null) {
            return false;
        }
        int i = cewVar.a;
        return i == 400 || i == 403;
    }

    public static /* synthetic */ String f(int i) {
        return i != 1 ? "ERROR" : "WARNING";
    }

    public static ayoi g(tdb tdbVar, String str) {
        return tdbVar.a(str).ag(1L).J(aaku.k);
    }

    public static ayoi h(tdb tdbVar, String str) {
        return tdbVar.a(str).I(zwb.j).V(aaku.j).ag(1L).J(aaku.l);
    }

    public static boolean i(List list, List list2) {
        return !list.equals(list2);
    }
}
