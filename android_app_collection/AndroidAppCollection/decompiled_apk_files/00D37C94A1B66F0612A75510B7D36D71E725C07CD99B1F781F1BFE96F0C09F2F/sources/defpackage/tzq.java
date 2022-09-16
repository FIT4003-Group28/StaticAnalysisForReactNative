package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: tzq  reason: default package */
/* loaded from: classes4.dex */
public final class tzq implements vkq {
    public final Context a;
    public final ampq b = amon.a;
    public final HashMap c = new HashMap();
    private final HashMap e = new HashMap();
    private final snc d = new zgi(1);

    public tzq(Context context) {
        this.a = context;
    }

    public static String c(String str, String str2, int i) {
        return str + "|" + str2 + "|" + i;
    }

    public static String d(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.vkq
    public final vkp a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vkq
    public final vkp b(Uri uri) {
        synchronized (tzq.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.e.get(str) == null) {
                this.e.put(str, new vkf(new tzp(this, str), this.d, 10000L, TimeUnit.MILLISECONDS));
            }
            return (vkp) this.e.get(str);
        }
    }

    @Override // defpackage.vkq
    public final void f() {
    }
}
