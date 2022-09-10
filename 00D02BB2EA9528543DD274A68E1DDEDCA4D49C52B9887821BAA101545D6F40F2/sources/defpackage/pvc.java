package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pvc  reason: default package */
/* loaded from: classes7.dex */
public final class pvc implements dbty<Integer> {
    final /* synthetic */ pve a;

    public pvc(pve pveVar) {
        this.a = pveVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Integer a() {
        pve pveVar = this.a;
        if (!pveVar.k.aD) {
            return 0;
        }
        View c = pveVar.q.c();
        return Integer.valueOf(c.getBottom() - vfv.f(c));
    }
}
