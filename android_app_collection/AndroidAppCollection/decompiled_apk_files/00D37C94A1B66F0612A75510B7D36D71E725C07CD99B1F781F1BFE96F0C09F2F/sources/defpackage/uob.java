package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: uob  reason: default package */
/* loaded from: classes4.dex */
public final class uob {
    public Context a;
    public Class b;
    public uox c;
    private uof d;
    private uld e;
    private ExecutorService f;
    private ujx g;
    private toq h;
    private upq i;
    private umq j;

    public final uoc a() {
        uld uldVar;
        ExecutorService executorService;
        ujx ujxVar;
        Class cls;
        uox uoxVar;
        toq toqVar;
        upq upqVar;
        umq umqVar;
        if (!c().h()) {
            e(Executors.newCachedThreadPool(udy.c()));
        }
        ExecutorService executorService2 = (ExecutorService) c().c();
        b();
        uld uldVar2 = new uld();
        this.e = uldVar2;
        b();
        this.d = new uof(uldVar2);
        b();
        b().a.getClass();
        this.g = new uki(this.a, executorService2, b().c, b().a, null, null, null);
        uox uoxVar2 = this.c;
        if (!(uoxVar2 == null ? amon.a : ampq.j(uoxVar2)).h()) {
            b();
            this.c = new uov(this.a);
        }
        toq toqVar2 = this.h;
        if (toqVar2 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(toqVar2 instanceof top)) {
            b();
            g(new upu(uldVar2, toqVar2));
        }
        uof uofVar = this.d;
        if (uofVar == null || (uldVar = this.e) == null || (executorService = this.f) == null || (ujxVar = this.g) == null || (cls = this.b) == null || (uoxVar = this.c) == null || (toqVar = this.h) == null || (upqVar = this.i) == null || (umqVar = this.j) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" limitedAvailableAccountsModel");
            }
            if (this.e == null) {
                sb.append(" internalAccountsModel");
            }
            if (this.f == null) {
                sb.append(" backgroundExecutor");
            }
            if (this.g == null) {
                sb.append(" avatarImageLoader");
            }
            if (this.b == null) {
                sb.append(" accountClass");
            }
            if (this.c == null) {
                sb.append(" oneGoogleEventLogger");
            }
            if (this.h == null) {
                sb.append(" vePrimitives");
            }
            if (this.i == null) {
                sb.append(" visualElements");
            }
            if (this.j == null) {
                sb.append(" accountLayer");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uoc(uofVar, uldVar, executorService, ujxVar, cls, uoxVar, toqVar, upqVar, umqVar);
    }

    public final umq b() {
        umq umqVar = this.j;
        if (umqVar != null) {
            return umqVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final ampq c() {
        ExecutorService executorService = this.f;
        return executorService == null ? amon.a : ampq.j(executorService);
    }

    public final void d(umq umqVar) {
        if (umqVar != null) {
            this.j = umqVar;
            return;
        }
        throw new NullPointerException("Null accountLayer");
    }

    public final void e(ExecutorService executorService) {
        if (executorService != null) {
            this.f = executorService;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }

    public final void f(toq toqVar) {
        if (toqVar != null) {
            this.h = toqVar;
            return;
        }
        throw new NullPointerException("Null vePrimitives");
    }

    public final void g(upq upqVar) {
        if (upqVar != null) {
            this.i = upqVar;
            return;
        }
        throw new NullPointerException("Null visualElements");
    }
}
