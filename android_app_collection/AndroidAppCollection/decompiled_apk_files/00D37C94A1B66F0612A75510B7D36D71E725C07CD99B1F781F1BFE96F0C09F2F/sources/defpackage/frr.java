package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: frr  reason: default package */
/* loaded from: classes3.dex */
public final class frr implements ezg {
    public static final String a = zep.a("MA.UMC");
    private final Handler b;
    private final Executor c;
    private final snc d;
    private final ezh e;
    private final fqd f;
    private final azqb g;
    private ampq h = amon.a;

    public frr(ezh ezhVar, Handler handler, Executor executor, snc sncVar, fqd fqdVar, azqb azqbVar) {
        this.e = ezhVar;
        this.b = handler;
        this.c = executor;
        this.d = sncVar;
        this.f = fqdVar;
        this.g = azqbVar;
    }

    private final void e() {
        if (this.h.h()) {
            ((frm) this.h.c()).c();
            this.h = amon.a;
            this.e.j(this);
        }
    }

    public final frm a(String str) {
        if (this.h.h()) {
            if (((frm) this.h.c()).b.equals(str)) {
                return (frm) this.h.c();
            }
            ((frm) this.h.c()).c();
        }
        this.h = ampq.j(new frm(this.b, this.d, this.f, this.g, str, this.c));
        this.e.i(this);
        return (frm) this.h.c();
    }

    public final void b(String str, frq frqVar) {
        frm a2 = a(str);
        String valueOf = String.valueOf(a2.b);
        if (valueOf.length() != 0) {
            "adding callback for ".concat(valueOf);
        }
        WeakReference weakReference = new WeakReference(frqVar);
        a2.c.add(weakReference);
        List list = a2.h;
        if (list != null) {
            frm.d(list, amuk.r(weakReference), amuk.q(), amuk.q(), amuk.q(), a2.b);
        }
    }

    public final void c(String str, frp frpVar) {
        frm a2 = a(str);
        WeakReference weakReference = new WeakReference(frpVar);
        a2.d.add(weakReference);
        List list = a2.h;
        if (list != null) {
            frm.d(list, amuk.q(), amuk.r(weakReference), amuk.q(), amuk.q(), a2.b);
        }
    }

    public final void d(String str) {
        if (!this.h.h() || !((frm) this.h.c()).b.equals(str)) {
            return;
        }
        e();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar != ezx.NONE || !this.h.h()) {
            return;
        }
        e();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
