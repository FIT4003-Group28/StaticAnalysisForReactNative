package defpackage;

import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: acgg  reason: default package */
/* loaded from: classes2.dex */
final class acgg implements ecs {
    final /* synthetic */ acgh a;

    public acgg(acgh acghVar) {
        this.a = acghVar;
    }

    @Override // defpackage.ecs
    public final void Qf() {
        acgh acghVar;
        jib jibVar;
        acgh acghVar2 = this.a;
        if (!acghVar2.aD) {
            return;
        }
        dbsg<ModAppBar> w = acghVar2.w();
        if (!w.a() || (jibVar = (acghVar = this.a).a) == null) {
            return;
        }
        bvsi bvsiVar = new bvsi(acghVar.H());
        bvsiVar.d(jibVar.u);
        this.a.ag.f(w.b(), bvsiVar.toString());
    }
}
