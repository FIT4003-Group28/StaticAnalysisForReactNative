package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: baiu  reason: default package */
/* loaded from: classes2.dex */
final class baiu extends bakb {
    public baiu() {
        super(bahp.o, baiw.r, baiw.s);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int b(Locale locale) {
        return bajg.a(locale).m;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long i(long j, String str, Locale locale) {
        String[] strArr = bajg.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new bahy(bahp.o, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String l(int i, Locale locale) {
        return bajg.a(locale).f[i];
    }
}
