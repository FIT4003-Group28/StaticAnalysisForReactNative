package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chrg  reason: default package */
/* loaded from: classes4.dex */
public final class chrg extends bbth {
    public static final /* synthetic */ int e = 0;
    public drrx d;
    private final dxio<gdc> f;
    private final dxio<btvo> g;
    private boolean h;

    public chrg(dxio<ckcw> dxioVar, dxio<btvo> dxioVar2, dxio<axrx> dxioVar3, dxio<akfa> dxioVar4, Activity activity, axru axruVar, dxio<gdc> dxioVar5, dxio<bvjj> dxioVar6) {
        super(dxioVar, dxioVar3, dxioVar2, dxioVar4, axruVar, dxioVar6, activity);
        this.d = drrx.UNKNOWN_MODE;
        this.g = dxioVar2;
        this.f = dxioVar5;
    }

    private static boolean g(drrx drrxVar) {
        return drrx.PHOTO.equals(drrxVar);
    }

    @Override // defpackage.bbth
    protected final void c(final Runnable runnable) {
        if (this.h) {
            return;
        }
        this.h = true;
        if (!g(this.d)) {
            gcz a = this.f.a().a();
            a.i(R.string.STORAGE_PERMISSION_RATIONALE_DIALOG_TITLE);
            a.d(R.string.STORAGE_PERMISSION_RATIONALE_DIALOG_MESSAGE);
            a.i = cjtd.a(dtyd.cs);
            a.h(R.string.OK_BUTTON, cjtd.a(dtyd.cv), new gdd(runnable) { // from class: chrd
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                    Runnable runnable2 = this.a;
                    int i = chrg.e;
                    runnable2.run();
                }
            });
            a.e(R.string.NO_THANKS, cjtd.a(dtyd.cu), chre.a);
            a.f(cjtd.a(dtyd.ct), chrf.a);
            a.b();
            return;
        }
        runnable.run();
    }

    @Override // defpackage.bbth
    protected final boolean d() {
        if (g(this.d)) {
            dvky dvkyVar = this.g.a().getPhotoTakenNotificationParameters().m;
            if (dvkyVar == null) {
                dvkyVar = dvky.b;
            }
            return dvkyVar.a;
        }
        return this.g.a().getContributionsPageParameters().d;
    }

    @Override // defpackage.bbth
    protected final int f() {
        return g(this.d) ? 3 : 2;
    }
}
