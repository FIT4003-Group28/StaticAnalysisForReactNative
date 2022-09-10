package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: kvl  reason: default package */
/* loaded from: classes7.dex */
final class kvl implements dbty<akqq> {
    final /* synthetic */ kvm a;

    public kvl(kvm kvmVar) {
        this.a = kvmVar;
    }

    @Override // defpackage.dbty
    @dzsi
    public final /* bridge */ /* synthetic */ akqq a() {
        GmmLocation a = this.a.a.f.a().a();
        if (a != null) {
            return a.B();
        }
        return null;
    }
}
