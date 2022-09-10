package defpackage;
/* compiled from: PG */
/* renamed from: aahv  reason: default package */
/* loaded from: classes2.dex */
public final class aahv {
    public static String a(diwb diwbVar) {
        if (diwbVar.x.size() <= 0) {
            ditt dittVar = diwbVar.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            if ((dittVar.a & 32) == 0) {
                return "";
            }
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            return dittVar2.g;
        }
        return diwbVar.x.get(0).b;
    }

    public static String b(diwb diwbVar) {
        return diwbVar.x.size() > 0 ? diwbVar.x.get(0).e : "";
    }

    public static String c(diwb diwbVar) {
        return diwbVar.x.size() > 0 ? diwbVar.x.get(0).a : "";
    }

    public static boolean d(diwb diwbVar) {
        dive diveVar = diwbVar.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        if (diveVar.a.size() == 0) {
            dive diveVar2 = diwbVar.v;
            if (diveVar2 == null) {
                diveVar2 = dive.d;
            }
            return !diveVar2.b;
        }
        return true;
    }
}
