package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: vau  reason: default package */
/* loaded from: classes4.dex */
public final class vau {
    private static final amqf d = amqf.b('/').a();
    static final vat a = new vas(1);
    static final vat b = new vas();
    static final vat c = new vas(2);

    public static List a(String str) {
        return amxp.u(d.h(str), uag.p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(vat vatVar, aoqt aoqtVar) {
        String a2 = vatVar.a(aoqtVar);
        String b2 = vatVar.b(aoqtVar);
        if (!TextUtils.isEmpty(a2) || TextUtils.isEmpty(b2)) {
            vatVar.c(aoqtVar, null);
        } else {
            vatVar.c(aoqtVar, anuw.a(b2));
        }
        vatVar.d(aoqtVar);
    }
}
