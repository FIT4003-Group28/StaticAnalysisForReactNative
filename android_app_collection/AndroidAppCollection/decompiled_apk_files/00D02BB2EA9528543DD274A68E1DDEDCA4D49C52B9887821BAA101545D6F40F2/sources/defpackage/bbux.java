package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bbux  reason: default package */
/* loaded from: classes3.dex */
public final class bbux extends bbth {
    private final dxio<btvo> d;

    public bbux(dxio<axrx> dxioVar, axru axruVar, dxio<bvjj> dxioVar2, dxio<akfa> dxioVar3, Activity activity, dxio<ckcw> dxioVar4, dxio<btvo> dxioVar5) {
        super(dxioVar4, dxioVar, dxioVar5, dxioVar3, axruVar, dxioVar2, activity);
        this.d = dxioVar5;
    }

    @Override // defpackage.bbth
    protected final void c(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.bbth
    protected final boolean d() {
        dvky dvkyVar = this.d.a().getPhotoTakenNotificationParameters().m;
        if (dvkyVar == null) {
            dvkyVar = dvky.b;
        }
        return dvkyVar.a;
    }

    @Override // defpackage.bbth
    protected final int f() {
        return 1;
    }
}
