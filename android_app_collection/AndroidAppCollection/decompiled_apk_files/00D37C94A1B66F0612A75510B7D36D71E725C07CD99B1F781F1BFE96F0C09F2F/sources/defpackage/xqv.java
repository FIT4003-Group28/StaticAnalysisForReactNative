package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xqv  reason: default package */
/* loaded from: classes4.dex */
public final class xqv implements xru {
    public final xrl a;
    public final xrw b;
    public final List c = new ArrayList();
    public final amuf d = amuk.f();
    public String e;
    public String f;
    public Uri g;
    public amuk h;

    public xqv(xrl xrlVar, xrw xrwVar) {
        this.a = xrlVar;
        this.b = xrwVar;
    }

    @Override // defpackage.xru
    public final void a() {
        ampq a = this.a.a(this.g);
        if (a.h()) {
            xro b = ((xrp) a.c()).b();
            b.c(2);
            this.a.g(b.a());
        }
        d();
    }

    @Override // defpackage.xru
    public final void b(String str) {
        ampq a = this.a.a(this.g);
        if (a.h()) {
            xro b = ((xrp) a.c()).b();
            b.c = str;
            b.c(3);
            this.a.g(b.a());
        }
        d();
    }

    @Override // defpackage.xru
    public final void c(Drawable drawable, int i) {
    }

    public final void d() {
        this.g = null;
        if (this.c.isEmpty()) {
            return;
        }
        Uri uri = (Uri) this.c.remove(0);
        this.g = uri;
        ampq a = this.a.a(uri);
        if (a.h()) {
            xro b = ((xrp) a.c()).b();
            b.c(1);
            this.a.g(b.a());
            this.b.c(this.e, this.f, this.g);
            return;
        }
        d();
    }
}
