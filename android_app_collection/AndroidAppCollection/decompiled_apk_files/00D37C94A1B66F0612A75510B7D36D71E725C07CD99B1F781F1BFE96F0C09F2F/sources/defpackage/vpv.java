package defpackage;
/* compiled from: PG */
/* renamed from: vpv  reason: default package */
/* loaded from: classes4.dex */
public final class vpv implements vpr {
    private final vpr a;

    public vpv(vpr vprVar) {
        this.a = vprVar;
    }

    public static final int b(String str) {
        return str == null ? vpu.a[0] : vpu.a[Math.abs(str.hashCode()) % 21];
    }

    public final CharSequence a(uos uosVar) {
        String[] strArr;
        String str;
        vpr vprVar = this.a;
        if (uosVar == null || (strArr = uosVar.a) == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                vpz vpzVar = ((vpt) vprVar).a;
                aqxo.y(vpzVar.e);
                agd agdVar = (agd) vpzVar.d.get();
                if (agdVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && agdVar != null; i++) {
                        vpy vpyVar = (vpy) agdVar.get(Character.valueOf(str2.charAt(i)));
                        if (vpyVar == null) {
                            break;
                        }
                        String str3 = vpyVar.a;
                        if (str3 != null) {
                            str = str3;
                        }
                        agdVar = vpyVar.b;
                    }
                }
                str2 = str == null ? new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString() : str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }
}
