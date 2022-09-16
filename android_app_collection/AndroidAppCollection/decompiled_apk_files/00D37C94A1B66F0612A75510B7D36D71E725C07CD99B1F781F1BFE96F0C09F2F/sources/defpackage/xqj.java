package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xqj  reason: default package */
/* loaded from: classes4.dex */
public final class xqj {
    public final Set a = Collections.synchronizedSet(new HashSet());
    public final Context b;
    public final xpx c;
    public xrp d;
    private final Executor e;
    private final Executor f;

    public xqj(Context context, xpx xpxVar, Executor executor, Executor executor2) {
        this.b = context;
        this.c = xpxVar;
        this.e = executor;
        this.f = executor2;
    }

    public final void a(final xrp xrpVar) {
        this.d = xrpVar;
        this.f.execute(new Runnable() { // from class: xqf
            @Override // java.lang.Runnable
            public final void run() {
                xqj xqjVar = xqj.this;
                xrp xrpVar2 = xrpVar;
                for (xqi xqiVar : xqjVar.a) {
                    xqiVar.qW(xrpVar2);
                }
            }
        });
    }

    public final void b(final xrp xrpVar, final apoj apojVar) {
        this.f.execute(new Runnable() { // from class: xqh
            @Override // java.lang.Runnable
            public final void run() {
                xqj xqjVar = xqj.this;
                xrp xrpVar2 = xrpVar;
                apoj apojVar2 = apojVar;
                for (xqi xqiVar : xqjVar.a) {
                    xqiVar.g(xrpVar2, apojVar2);
                }
            }
        });
    }

    public final void c(xqi xqiVar) {
        this.a.add(xqiVar);
    }

    public final void d() {
        this.d = null;
    }

    public final void e(final xrp xrpVar) {
        if (xrpVar == null) {
            return;
        }
        if (xrpVar.c == null && xrpVar.a != null) {
            final xpw xpwVar = new xpw() { // from class: xqe
                @Override // defpackage.xpw
                public final void a(Drawable drawable) {
                    xqj xqjVar = xqj.this;
                    xrp xrpVar2 = xrpVar;
                    xro b = xrpVar2.b();
                    b.a = xxs.c(xqjVar.b, drawable, xrpVar2.b);
                    xqjVar.a(b.a());
                }
            };
            this.e.execute(new Runnable() { // from class: xqg
                @Override // java.lang.Runnable
                public final void run() {
                    xqj xqjVar = xqj.this;
                    xrp xrpVar2 = xrpVar;
                    xqjVar.c.a(xrpVar2.a, xpwVar);
                }
            });
        }
        if (xrpVar.c == null) {
            return;
        }
        a(xrpVar);
    }

    public final void f(xqi xqiVar) {
        this.a.remove(xqiVar);
    }
}
