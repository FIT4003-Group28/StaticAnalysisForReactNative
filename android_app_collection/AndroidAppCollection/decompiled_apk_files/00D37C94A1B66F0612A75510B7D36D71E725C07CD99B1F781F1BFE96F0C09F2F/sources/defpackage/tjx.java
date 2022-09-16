package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: tjx  reason: default package */
/* loaded from: classes4.dex */
public final class tjx implements Application.ActivityLifecycleCallbacks {
    public final tky a;
    public final tkj b;
    public final tjp c;
    private final tjw d = new tjw();

    public tjx(tjp tjpVar, View view, tkz tkzVar, tjq tjqVar) {
        tky tkyVar = new tky(tkzVar, tjqVar);
        this.a = tkyVar;
        tkyVar.d(view);
        this.b = new tkt(tjpVar);
        this.c = tjpVar;
        Application a = tjpVar.a();
        if (a == null || !tjqVar.b) {
            return;
        }
        tld a2 = tkzVar.a();
        if (a2 != null) {
            tkyVar.a = a2.d;
        }
        a.registerActivityLifecycleCallbacks(this);
    }

    public final tjt a(tla tlaVar) {
        tla tlaVar2 = tla.START;
        int ordinal = tlaVar.ordinal();
        if (ordinal == 15) {
            this.b.a(this.a, tlaVar);
            this.a.n = true;
        } else if (ordinal == 16) {
            this.b.a(this.a, tlaVar);
            this.a.n = false;
        } else {
            switch (ordinal) {
                case 0:
                    tky tkyVar = this.a;
                    tkyVar.l = false;
                    tkyVar.b = System.currentTimeMillis();
                    this.b.a(this.a, tlaVar);
                    this.a.o(tla.START);
                    break;
                case 1:
                case 2:
                case 3:
                    this.b.a(this.a, tlaVar);
                    this.a.o(tlaVar);
                    break;
                case 4:
                    this.b.a(this.a, tlaVar);
                    this.a.o(tla.COMPLETE);
                    break;
                case 5:
                    this.b.a(this.a, tlaVar);
                    this.a.l = false;
                    break;
                case 6:
                case 7:
                case 8:
                    this.b.a(this.a, tlaVar);
                    this.a.l = true;
                    break;
                case 9:
                    this.b.a(this.a, tlaVar);
                    this.a.r();
                    break;
                default:
                    this.b.a(this.a, tlaVar);
                    break;
            }
        }
        tjt i = this.a.i(tlaVar);
        if (!tlaVar.s) {
            this.a.n(tlaVar);
        }
        if (tlaVar.a() && tlaVar != tla.COMPLETE) {
            this.a.p(tlaVar.t + 1);
        }
        return i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View a = this.a.a();
        if (a == null || tjw.a(a) != activity) {
            return;
        }
        this.a.a = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        View a = this.a.a();
        if (a == null || tjw.a(a) != activity) {
            return;
        }
        this.a.a = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public tjx(tkz tkzVar, tjq tjqVar) {
        tky tkyVar = new tky(tkzVar, tjqVar);
        this.a = tkyVar;
        this.b = new tlb(tkyVar);
        this.c = null;
    }
}
