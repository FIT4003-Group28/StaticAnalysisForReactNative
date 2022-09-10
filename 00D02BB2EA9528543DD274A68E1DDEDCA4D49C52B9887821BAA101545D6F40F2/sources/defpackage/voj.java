package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: voj  reason: default package */
/* loaded from: classes7.dex */
public final class voj implements degu<GmmLocation> {
    final /* synthetic */ vok a;

    public voj(vok vokVar) {
        this.a = vokVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvrj.UI_THREAD.c();
        this.a.j = null;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(GmmLocation gmmLocation) {
        bvrj.UI_THREAD.c();
        this.a.j = null;
        this.a.f(gmmLocation.B());
    }
}
