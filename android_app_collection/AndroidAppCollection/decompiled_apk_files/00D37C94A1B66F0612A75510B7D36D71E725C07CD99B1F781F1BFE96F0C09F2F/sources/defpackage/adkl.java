package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: adkl  reason: default package */
/* loaded from: classes.dex */
public final class adkl implements adka {
    public static final String a;
    private final yqh b;
    private final adkh c;

    static {
        String valueOf = String.valueOf(adkl.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adkl(yqh yqhVar, adkh adkhVar) {
        this.b = yqhVar;
        this.c = adkhVar;
    }

    @Override // defpackage.adka
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((adit) obj, 4);
    }

    public final adib b(adit aditVar, int i) {
        if (aditVar == null) {
            return null;
        }
        yqu c = yqv.c(String.valueOf(this.c.a()).concat("get_screen"));
        try {
            c.b = yqt.d(Collections.singletonMap("pairing_code", aditVar.c), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        yqv a2 = c.a();
        adkk adkkVar = new adkk(a2.a, i);
        adyf.d(this.b, a2, adkkVar);
        return adkkVar.a;
    }
}
