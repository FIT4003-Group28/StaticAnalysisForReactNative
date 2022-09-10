package defpackage;
/* compiled from: PG */
/* renamed from: algk  reason: default package */
/* loaded from: classes2.dex */
public final class algk {
    public final vwv a;

    public algk(vwv vwvVar) {
        this.a = vwvVar;
    }

    public static String a(dowz dowzVar, boolean z) {
        String str;
        if ((dowzVar.a & 4) != 0) {
            douj doujVar = dowzVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            dbsi<String, String> l = alca.l(doujVar);
            if (!z || (str = l.b) == null) {
                String str2 = l.a;
                if (str2 != null) {
                    return str2;
                }
            } else {
                return str;
            }
        }
        return dowzVar.b;
    }
}
