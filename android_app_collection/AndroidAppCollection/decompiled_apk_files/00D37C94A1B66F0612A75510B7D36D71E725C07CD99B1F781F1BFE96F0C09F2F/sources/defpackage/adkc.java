package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adkc  reason: default package */
/* loaded from: classes.dex */
public final class adkc implements adka {
    public static final String a;
    private final yqh b;
    private final adkh c;
    private final int d;

    static {
        String valueOf = String.valueOf(adkc.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adkc(yqh yqhVar, adkh adkhVar, acwu acwuVar) {
        this.b = yqhVar;
        this.c = adkhVar;
        this.d = Math.max(1, acwuVar.P + 1);
    }

    @Override // defpackage.adka
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((Collection) obj, 4);
    }

    public final Map b(Collection collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyMap();
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            yqu c = yqv.c(String.valueOf(this.c.a()).concat("get_lounge_token_batch"));
            try {
                c.b = yqt.d(Collections.singletonMap("screen_ids", TextUtils.join(",", collection)), "ISO-8859-1");
            } catch (UnsupportedEncodingException unused) {
            }
            yqv a2 = c.a();
            adkb adkbVar = new adkb(a2.a, i);
            adyf.d(this.b, a2, adkbVar);
            Map map = adkbVar.a;
            if (map != null) {
                return map;
            }
        }
        return null;
    }
}
