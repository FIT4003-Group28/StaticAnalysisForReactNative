package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;
/* compiled from: PG */
/* renamed from: dgwm  reason: default package */
/* loaded from: classes6.dex */
final class dgwm extends dgtl<Locale> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Locale a(dgxe dgxeVar) {
        String str = null;
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(dgxeVar.h(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Locale locale) {
        Locale locale2 = locale;
        dgxgVar.j(locale2 == null ? null : locale2.toString());
    }
}
