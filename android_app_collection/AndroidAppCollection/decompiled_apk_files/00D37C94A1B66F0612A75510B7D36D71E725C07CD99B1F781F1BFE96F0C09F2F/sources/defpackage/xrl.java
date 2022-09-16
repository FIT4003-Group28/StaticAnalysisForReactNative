package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xrl  reason: default package */
/* loaded from: classes4.dex */
public final class xrl {
    public final Context d;
    public final xpx e;
    public final Executor h;
    public final Executor i;
    public final List f = new ArrayList();
    public final HashMap g = new HashMap();
    public final azpq a = azpq.e();
    public final azpq b = azpq.e();
    public final azpq c = azpq.e();

    public xrl(Context context, xpx xpxVar, Executor executor, Executor executor2) {
        this.d = context;
        this.e = xpxVar;
        this.h = executor2;
        this.i = executor;
    }

    public final ampq a(Uri uri) {
        return !this.f.contains(uri) ? amon.a : ampq.i((xrp) this.g.get(uri));
    }

    public final amuk b() {
        ylr.c();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : this.f) {
            arrayList.add((xrp) this.g.get(uri));
        }
        return amuk.o(arrayList);
    }

    public final aypg c(final xrg xrgVar) {
        azpq azpqVar = this.c;
        xrgVar.getClass();
        return azpqVar.as(new ayqb() { // from class: xqx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xrg.this.a((xrf) obj);
            }
        });
    }

    public final aypg d(final xri xriVar) {
        azpq azpqVar = this.b;
        xriVar.getClass();
        return azpqVar.as(new ayqb() { // from class: xqy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xri.this.a((xrh) obj);
            }
        });
    }

    public final aypg e(final xrk xrkVar) {
        azpq azpqVar = this.a;
        xrkVar.getClass();
        return azpqVar.as(new ayqb() { // from class: xqz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xrk.this.a((xrj) obj);
            }
        });
    }

    public final void f(Uri uri) {
        xrp xrpVar = (xrp) this.g.get(uri);
        if (xrpVar != null) {
            xro b = xrpVar.b();
            b.a = null;
            this.g.put(uri, b.a());
        }
    }

    public final void g(final xrp xrpVar) {
        ylr.c();
        final int indexOf = this.f.indexOf(xrpVar.a);
        if (indexOf >= 0 && !((xrp) this.g.get(xrpVar.a)).equals(xrpVar)) {
            this.g.put(xrpVar.a, xrpVar);
            this.i.execute(new Runnable() { // from class: xrc
                @Override // java.lang.Runnable
                public final void run() {
                    xrl.this.c.c(xrf.c(xrpVar, indexOf));
                }
            });
        }
    }
}
