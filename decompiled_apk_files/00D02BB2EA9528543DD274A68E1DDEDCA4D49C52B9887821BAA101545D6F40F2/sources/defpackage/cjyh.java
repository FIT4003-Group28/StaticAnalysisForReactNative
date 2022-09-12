package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cjyh  reason: default package */
/* loaded from: classes4.dex */
public class cjyh {
    public final dxio<cpwx> a;
    public final dxio<arne> b;
    public final dxio<btyy> c;
    public final dxio<btvo> d;
    public final dxio<cjqy> e;
    public final dxio<asik> f;
    @dzsi
    public dehn<Boolean> g;
    @dzsi
    public dehn<cpxx> h;
    private final Executor j;
    public boolean i = false;
    private final dbrn<cpwp, Boolean> k = new cjyg(this);

    public cjyh(dxio<cpwx> dxioVar, dxio<arne> dxioVar2, dxio<btyy> dxioVar3, Executor executor, dxio<btvo> dxioVar4, dxio<cjqy> dxioVar5, dxio<asik> dxioVar6) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.j = executor;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
    }

    private final void f() {
        this.g = deha.a(false);
        this.i = false;
    }

    public final synchronized void a() {
        this.h = null;
    }

    public final boolean b() {
        dehn<Boolean> dehnVar = this.g;
        if (dehnVar == null || !dehnVar.isDone()) {
            c();
            try {
                dehn<Boolean> dehnVar2 = this.g;
                if (dehnVar2 != null) {
                    dehnVar2.get(2L, TimeUnit.SECONDS);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                f();
            } catch (ExecutionException unused2) {
                f();
            } catch (TimeoutException unused3) {
                f();
            }
        }
        return this.i;
    }

    public final void c() {
        if (this.g == null) {
            if (Build.VERSION.SDK_INT < 28 || !this.d.a().getAssistantParameters().b) {
                f();
            } else {
                this.g = deew.h(cpwp.a(this.a.a().c), this.k, this.j);
            }
        }
    }

    public final dehn<Boolean> d() {
        dehn<cpxx> dehnVar;
        if (Build.VERSION.SDK_INT < 28 || !this.d.a().getAssistantParameters().b) {
            return deha.a(false);
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = this.a.a().g();
            }
            dehnVar = this.h;
        }
        return deew.h(dehnVar, new dbrn(this) { // from class: cjye
            private final cjyh a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cjyh cjyhVar = this.a;
                cpxx cpxxVar = (cpxx) obj;
                boolean a = cjyhVar.f.a().a();
                boolean z = cjyhVar.d.a().getAssistantParameters().f;
                boolean z2 = false;
                if ((cpxxVar == cpxx.ELIGIBLE || cpxxVar == cpxx.ELIGIBLE_SHOW_DIALOG) && (!a || z)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, dege.a);
    }

    public final dehn<Boolean> e(int i) {
        if (Build.VERSION.SDK_INT < 28 || !this.d.a().getAssistantParameters().b) {
            return deha.a(false);
        }
        final int i2 = i + (-1) != 0 ? 2 : 1;
        synchronized (this) {
            this.h = null;
        }
        final cpwx a = this.a.a();
        return a.g.c(new Callable(a, i2) { // from class: cpwt
            private final cpwx a;
            private final int b;

            {
                this.a = a;
                this.b = i2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpwx cpwxVar = this.a;
                int i3 = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("com.google.android.apps.gsa.staticplugins.opa.morris.shared.key_morris_content_values_insert_set_morris_opt_in_status", Integer.valueOf(i3));
                return Boolean.valueOf(!dbsd.a(cpwxVar.c.getContentResolver().insert(cpwx.a, contentValues), Uri.EMPTY));
            }
        });
    }
}
