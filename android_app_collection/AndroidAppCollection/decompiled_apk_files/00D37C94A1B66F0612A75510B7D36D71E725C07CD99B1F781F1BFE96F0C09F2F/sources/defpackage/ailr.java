package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ailr  reason: default package */
/* loaded from: classes.dex */
public final class ailr implements yiw {
    final /* synthetic */ PlayerResponseModel a;
    final /* synthetic */ ailu b;

    public ailr(ailu ailuVar, PlayerResponseModel playerResponseModel) {
        this.b = ailuVar;
        this.a = playerResponseModel;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r10 = (Void) obj;
        this.b.g = null;
        String B = this.a.B();
        this.b.p = null;
        ailu ailuVar = this.b;
        ails ailsVar = ailuVar.f;
        if (ailsVar != null) {
            ((aiso) ailsVar).b.d(new aikd(4, true, 1, ailuVar.c.b(exc), exc, B));
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r3 = (Void) obj;
        this.b.g = null;
        ailu ailuVar = this.b;
        ailuVar.g((PlayerResponseModel) obj2, ailuVar.o, null);
    }
}
