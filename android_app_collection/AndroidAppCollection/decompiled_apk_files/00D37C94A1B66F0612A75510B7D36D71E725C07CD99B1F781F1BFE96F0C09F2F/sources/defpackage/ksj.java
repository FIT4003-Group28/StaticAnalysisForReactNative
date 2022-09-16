package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ksj  reason: default package */
/* loaded from: classes3.dex */
public final class ksj {
    public final yzj a;
    private final Activity b;
    private final afvn c;
    private final afwc d;
    private final aaxt e;
    private final yni f;
    private final aafo g;
    private final Executor h;

    public ksj(Activity activity, afvn afvnVar, afwc afwcVar, aaxt aaxtVar, yzj yzjVar, yni yniVar, aafo aafoVar, Executor executor) {
        this.b = activity;
        this.e = aaxtVar;
        this.c = afvnVar;
        this.d = afwcVar;
        this.a = yzjVar;
        this.f = yniVar;
        this.g = aafoVar;
        this.h = executor;
    }

    public final void a(aspb aspbVar, String str, byte[] bArr) {
        ylv ylvVar = new ylv() { // from class: ksg
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                ksj ksjVar = ksj.this;
                zep.d("Error rating", th);
                ksjVar.a.e(th);
            }
        };
        Runnable runnable = anlf.a;
        aspb aspbVar2 = aspb.LIKE;
        int ordinal = aspbVar.ordinal();
        if (ordinal == 0) {
            aaxr b = this.e.b();
            b.k(bArr);
            b.v(str);
            ylx.l(this.e.g(b), this.h, ylvVar, new ksh(this, str, aspbVar), runnable);
        } else if (ordinal == 1) {
            aaxq a = this.e.a();
            a.k(bArr);
            a.v(str);
            ylx.l(this.e.e(a), this.h, ylvVar, new ksh(this, str, aspbVar, 1), runnable);
        } else if (ordinal != 2) {
        } else {
            aaxs d = this.e.d();
            d.k(bArr);
            d.v(str);
            ylx.l(this.e.i(d), this.h, ylvVar, new ksh(this, str, aspbVar, 2), runnable);
        }
    }

    public final void b(aspb aspbVar, String str) {
        if (this.c.t()) {
            a(aspbVar, str, aadi.b);
        } else {
            this.d.c(this.b, null, new ksi(this, aspbVar, str));
        }
    }

    public final void c(String str, aspb aspbVar, List list) {
        if (list != null && list.size() > 0) {
            this.g.d(list, null);
        }
        this.f.f(new gae(str, aspbVar));
    }

    public final void d(String str, String str2) {
        str.getClass();
        zgt.G(this.b, str2, new Uri.Builder().scheme("http").authority("www.youtube.com").appendPath("playlist").appendQueryParameter("list", str).build());
    }
}
