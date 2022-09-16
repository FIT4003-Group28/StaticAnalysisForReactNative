package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: advo  reason: default package */
/* loaded from: classes.dex */
public final class advo {
    public final Context a;
    public final akfg b;
    public final acth c;
    public akfi d;

    public advo(Context context, akfg akfgVar, acth acthVar) {
        this.a = context;
        this.b = akfgVar;
        this.c = acthVar;
    }

    public final void a() {
        b(this.a.getString(R.string.mdx_tv_signin_error_snackbar_message), actj.MDX_TV_SIGN_IN_SNACKBAR_CANCELED);
    }

    public final void b(String str, actj actjVar) {
        akfg akfgVar = this.b;
        akfh l = akfgVar.l();
        l.k(str);
        l.m(null, null);
        l.l(new advn(this, actjVar));
        l.j(false);
        akfgVar.n(l.b());
    }
}
