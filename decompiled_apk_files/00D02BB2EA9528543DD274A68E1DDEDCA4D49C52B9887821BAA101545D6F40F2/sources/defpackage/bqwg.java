package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqwg  reason: default package */
/* loaded from: classes4.dex */
public final class bqwg extends bbth {
    public static final /* synthetic */ int d = 0;
    private final dxio<gdc> e;
    private final dxio<btvo> f;
    private boolean g;

    public bqwg(dxio<ckcw> dxioVar, dxio<btvo> dxioVar2, dxio<axrx> dxioVar3, dxio<akfa> dxioVar4, Activity activity, axru axruVar, dxio<gdc> dxioVar5, dxio<bvjj> dxioVar6) {
        super(dxioVar, dxioVar3, dxioVar2, dxioVar4, axruVar, dxioVar6, activity);
        this.f = dxioVar2;
        this.e = dxioVar5;
    }

    @Override // defpackage.bbth
    protected final void c(final Runnable runnable) {
        if (this.g) {
            return;
        }
        this.g = true;
        gcz a = this.e.a().a();
        a.i(R.string.STORAGE_PERMISSION_RATIONALE_DIALOG_TITLE);
        a.d(R.string.STORAGE_PERMISSION_RATIONALE_DIALOG_MESSAGE);
        a.i = cjtd.a(dtya.dj);
        a.h(R.string.OK_BUTTON, cjtd.a(dtya.dm), new gdd(runnable) { // from class: bqwd
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                Runnable runnable2 = this.a;
                int i = bqwg.d;
                runnable2.run();
            }
        });
        a.e(R.string.NO_THANKS, cjtd.a(dtya.dl), bqwe.a);
        a.f(cjtd.a(dtya.dk), bqwf.a);
        a.b();
    }

    @Override // defpackage.bbth
    protected final boolean d() {
        return this.f.a().getUgcParameters().au();
    }

    @Override // defpackage.bbth
    protected final int f() {
        return 4;
    }
}
