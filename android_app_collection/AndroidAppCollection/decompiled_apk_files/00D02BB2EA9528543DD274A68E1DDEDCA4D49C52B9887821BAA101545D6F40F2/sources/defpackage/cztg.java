package defpackage;
/* compiled from: PG */
/* renamed from: cztg  reason: default package */
/* loaded from: classes5.dex */
public final class cztg implements czsw, czsx {
    private final czsw a;
    private final czsx b;

    public cztg(czsw czswVar, czsx czsxVar) {
        this.a = czswVar;
        this.b = czsxVar;
    }

    @Override // defpackage.czsx
    public final int a(String str) {
        return this.b.a(str);
    }

    public final CharSequence b(cztb cztbVar) {
        String[] a;
        String str;
        czsw czswVar = this.a;
        if (cztbVar == null || cztbVar.a() == null) {
            return null;
        }
        for (String str2 : cztbVar.a()) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                cztm cztmVar = ((czte) czswVar).a;
                dbsk.l(cztmVar.d);
                cztl cztlVar = cztmVar.c.get();
                if (cztlVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && cztlVar != null; i++) {
                        cztk cztkVar = cztlVar.get(Character.valueOf(str2.charAt(i)));
                        if (cztkVar == null) {
                            break;
                        }
                        String str3 = cztkVar.b;
                        if (str3 != null) {
                            str = str3;
                        }
                        cztlVar = cztkVar.a;
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
