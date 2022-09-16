package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xff  reason: default package */
/* loaded from: classes4.dex */
public final class xff implements abdh {
    private final afwu a;
    private final xio b;
    private final Executor c;

    public xff(afwu afwuVar, xio xioVar, Executor executor) {
        afwuVar.getClass();
        this.a = afwuVar;
        xioVar.getClass();
        this.b = xioVar;
        executor.getClass();
        this.c = executor;
    }

    @Override // defpackage.abdh
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.execute(new xfe(this, parse));
        } else {
            b(parse);
        }
    }

    public final void b(Uri uri) {
        zgp b = zgp.b(uri);
        for (Map.Entry entry : this.b.f().entrySet()) {
            b.h((String) entry.getKey(), (String) entry.getValue());
        }
        Uri a = b.a();
        String.valueOf(String.valueOf(a)).length();
        afwt d = afwu.d("remarketing");
        d.b(a);
        this.a.a(d, afzr.a);
    }
}
