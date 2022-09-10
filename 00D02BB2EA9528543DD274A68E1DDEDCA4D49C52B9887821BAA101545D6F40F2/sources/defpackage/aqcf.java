package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqcf  reason: default package */
/* loaded from: classes2.dex */
public final class aqcf implements degu<dcdc<ctyy>> {
    private final WeakReference<aqcg> a;

    public aqcf(aqcg aqcgVar) {
        this.a = new WeakReference<>(aqcgVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        aqcg aqcgVar = this.a.get();
        if (aqcgVar == null) {
            return;
        }
        aqcgVar.f = true;
        aqcgVar.PI();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dcdc<ctyy> dcdcVar) {
        dcdc<ctyy> dcdcVar2 = dcdcVar;
        aqcg aqcgVar = this.a.get();
        if (aqcgVar == null) {
            return;
        }
        aqcgVar.f = true;
        if (dcdcVar2 == null) {
            aqcgVar.h();
            return;
        }
        aqcgVar.j(dcdcVar2);
        cqkx.p(aqcgVar);
    }
}
