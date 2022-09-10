package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: efw  reason: default package */
/* loaded from: classes6.dex */
public final class efw {
    private static final eatp j = eaul.g;
    @dzsi
    public Intent a;
    public boolean b;
    public final dxio<ckcw> c;
    final dxio<afeb> d;
    public final dxio<bvjj> e;
    public final dxio<Activity> f;
    final dxio<efm> g;
    final Executor h;
    final Executor i;

    public efw(dxio<ckcw> dxioVar, dxio<afeb> dxioVar2, dxio<bvjj> dxioVar3, dxio<Activity> dxioVar4, dxio<efm> dxioVar5, Executor executor, Executor executor2) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = dxioVar5;
        this.h = executor;
        this.i = executor2;
    }

    public static Intent a(Context context, @dzsi Intent intent, boolean z, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName(context.getPackageName(), str);
        intent2.setFlags(268435456);
        intent2.putExtra("IncognitoIntent.main_pid", Process.myPid());
        if (intent != null) {
            intent2.putExtra("IncognitoIntent.intent_to_reprocess", intent);
        }
        intent2.putExtra("IncognitoIntent.incognito_state", z);
        return intent2;
    }

    public final void b() {
        this.c.a().h();
        ((ActivityManager) this.f.a().getApplicationContext().getSystemService("activity")).clearApplicationUserData();
        d();
    }

    public final void c(final int i, final boolean z, final int i2) {
        boolean d = bvow.d(this.f.a().getApplicationContext(), i);
        int i3 = (10 - i2) + 1;
        if (!d || i2 <= 0) {
            ((ckco) this.c.a().a(ckfn.c)).a(i3);
            if (d) {
                return;
            }
            int i4 = z ? R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_ENTER_TEXT : R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_EXIT_TEXT;
            int h = this.d.a().h(this.f.a(), z);
            if (h == 1) {
                this.b = z;
                e(1);
                bvjk bvjkVar = bvjk.w;
                eatp eatpVar = j;
                this.e.a().ac(bvjkVar, eatpVar.f(eaol.a()));
                String z2 = this.e.a().z(bvjk.v, "");
                String z3 = this.e.a().z(bvjk.w, "");
                long i5 = z2.isEmpty() ? 0L : eatpVar.i(z2);
                long i6 = z3.isEmpty() ? 0L : eatpVar.i(z3);
                long j2 = i6 - i5;
                if (i5 != 0 && i6 != 0 && j2 > 0) {
                    ((ckcp) this.c.a().a(ckfn.u)).a(j2);
                }
                this.e.a().P(bvjk.v);
                this.e.a().P(bvjk.w);
                this.e.a().aq();
                d();
            } else if (h == 2) {
                this.b = !z;
                e(4);
                this.g.a().a(i4, new Runnable(this) { // from class: efo
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            } else if (h == 3) {
                this.b = !z;
                e(3);
                this.g.a().a(i4, new Runnable(this) { // from class: efp
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            } else if (h == 6) {
                this.b = !z;
                e(4);
                this.g.a().b(new Runnable(this) { // from class: efq
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                });
            } else if (h == 4) {
                this.b = !z;
                e(5);
                this.g.a().a(i4, new Runnable(this) { // from class: efr
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            } else if (h == 5) {
                this.b = !z;
                e(6);
                this.g.a().b(new Runnable(this) { // from class: efs
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                });
            } else if (h == 8) {
                this.b = !z;
                e(10);
                this.g.a().a(i4, new Runnable(this) { // from class: eft
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            } else {
                this.b = !z;
                e(9);
                this.g.a().a(i4, new Runnable(this) { // from class: efu
                    private final efw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            }
            this.e.a().m(bvjk.m, false);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, i, z, i2) { // from class: efn
            private final efw a;
            private final int b;
            private final boolean c;
            private final int d;

            {
                this.a = this;
                this.b = i;
                this.c = z;
                this.d = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b, this.c, this.d - 1);
            }
        }, 200L);
    }

    public final void d() {
        List<ActivityManager.RunningAppProcessInfo> b = bvow.b(this.f.a().getApplicationContext());
        if (b != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : b) {
                if (runningAppProcessInfo.processName.contains(this.f.a().getApplicationContext().getPackageName()) && !runningAppProcessInfo.processName.contains("incognito_restart_process")) {
                    ((ckcn) this.c.a().a(ckfn.t)).a();
                }
            }
        }
        this.c.a().j(this.h).Pk(new Runnable(this) { // from class: efv
            private final efw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                efw efwVar = this.a;
                Activity a = efwVar.f.a();
                boolean z = efwVar.b;
                Intent intent = efwVar.a;
                Intent putExtra = new Intent().setClassName(a, String.valueOf(a.getPackageName()).concat(".IncognitoActivity")).setFlags(268435456).addCategory("android.intent.category.LAUNCHER").putExtra("IncognitoIntent.incognito_state", z);
                if (intent != null) {
                    putExtra.putExtra("IncognitoIntent.intent_to_reprocess", intent);
                }
                efwVar.f.a().getApplicationContext().startActivity(putExtra);
                efwVar.f.a().finish();
            }
        }, this.i);
    }

    final void e(int i) {
        ((ckco) this.c.a().a(ckfn.n)).a(afed.a(i));
    }
}
