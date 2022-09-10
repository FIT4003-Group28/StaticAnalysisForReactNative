package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crmt  reason: default package */
/* loaded from: classes5.dex */
public final class crmt {
    private final Context a;
    private final vzc b;
    private final cqat c;
    private final dxio<jzv> d;
    private final bwqv e;
    @dzsi
    private vvy f;

    public crmt(bwqv bwqvVar, Context context, Executor executor, Executor executor2, dxio<jzv> dxioVar, cqat cqatVar) {
        dbsk.t(bwqvVar, "storage");
        this.e = bwqvVar;
        this.a = context;
        this.b = new vzc(context, executor, executor2);
        this.c = cqatVar;
        this.d = dxioVar;
    }

    @dzsi
    public final amte a() {
        vvy vvyVar = this.f;
        if (vvyVar == null) {
            vvyVar = this.b.d(vzd.DIRECTIONS_AS_CHANGED_IN_NAVIGATION);
            this.f = vvyVar;
        }
        if (vvyVar == null) {
            return null;
        }
        return vze.a(vvyVar, this.a);
    }

    public final boolean b() {
        Boolean bool = (Boolean) this.e.p(bwrj.WAYPOINTS_CHANGED_IN_NAVIGATION);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void c(@dzsi amte amteVar, boolean z) {
        vvy f = vze.f(this.c.b(), vun.e(amteVar), amteVar, this.d.a().a() ? 3 : 2, amteVar.i, vzd.DIRECTIONS_AS_CHANGED_IN_NAVIGATION);
        if (f == null) {
            return;
        }
        this.b.b(vzd.DIRECTIONS_AS_CHANGED_IN_NAVIGATION, f);
        this.e.o(bwrj.WAYPOINTS_CHANGED_IN_NAVIGATION, Boolean.valueOf(z));
        this.f = f;
    }

    public final void d() {
        this.b.a(vzd.DIRECTIONS_AS_CHANGED_IN_NAVIGATION);
        this.e.r(bwrj.WAYPOINTS_CHANGED_IN_NAVIGATION);
        this.f = null;
    }
}
