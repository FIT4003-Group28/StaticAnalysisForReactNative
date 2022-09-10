package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eaqr  reason: default package */
/* loaded from: classes6.dex */
final class eaqr extends eatd {
    public eaqr() {
        super(eaop.o, eaqt.E, eaqt.F);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return eark.a(locale).m;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return eark.a(locale).f[i];
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        String[] strArr = eark.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new eapb(eaop.o, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return p(j, length);
    }
}
