package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lwq  reason: default package */
/* loaded from: classes7.dex */
public class lwq implements lwp {
    private final Context a;
    private final dbty<noi> b;
    private final atmi c;
    private final lrl d;
    private final kcv e;
    private final boolean f;
    private lwo g = lwo.LARGE;
    @dzsi
    private Runnable h;
    private boolean i;

    public lwq(Context context, dbty<noi> dbtyVar, atmi atmiVar, lrl lrlVar, kcv kcvVar, jzp jzpVar) {
        this.a = context;
        this.b = dbtyVar;
        this.c = atmiVar;
        this.d = lrlVar;
        this.e = kcvVar;
        this.f = jzpVar.a();
    }

    @Override // defpackage.lwp
    public atng a() {
        return this.c.ap();
    }

    @Override // defpackage.lwp
    public lrl b() {
        return this.d;
    }

    @Override // defpackage.lwp
    public lwo c() {
        return this.g;
    }

    @Override // defpackage.lwp
    public Boolean d() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.lwp
    public Boolean e() {
        return this.c.ag();
    }

    @Override // defpackage.lwp
    public CharSequence f() {
        return this.a.getString(R.string.CONTINUE_NAVIGATION);
    }

    @Override // defpackage.lwp
    public CharSequence g() {
        return this.a.getString(R.string.CONTINUE_NAVIGATION_SHORT);
    }

    @Override // defpackage.lwp
    public cqkl h() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.lwp
    public Boolean i() {
        return Boolean.valueOf(!o().booleanValue());
    }

    @Override // defpackage.lwp
    public Boolean j() {
        return Boolean.valueOf(this.e.p());
    }

    @Override // defpackage.lwp
    public cqkl k() {
        this.e.o();
        return cqkl.a;
    }

    @Override // defpackage.lwp
    public Boolean l() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.lwp
    public Boolean m() {
        return Boolean.valueOf(this.b.a() == noi.SMALL);
    }

    @Override // defpackage.lwp
    public Boolean n() {
        return Boolean.valueOf(this.b.a() == noi.MEDIUM);
    }

    @Override // defpackage.lwp
    public Boolean o() {
        boolean z = true;
        if (!m().booleanValue() && !n().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public atmi p() {
        return this.c;
    }

    public void q(lwo lwoVar) {
        dbsk.s(lwoVar);
        if (this.g != lwoVar) {
            this.g = lwoVar;
            this.c.au();
        }
    }

    public void r(@dzsi Runnable runnable) {
        this.h = runnable;
        this.c.au();
    }

    public void s(boolean z) {
        this.i = z;
        this.c.au();
    }

    public void t() {
        this.c.ay();
    }
}
