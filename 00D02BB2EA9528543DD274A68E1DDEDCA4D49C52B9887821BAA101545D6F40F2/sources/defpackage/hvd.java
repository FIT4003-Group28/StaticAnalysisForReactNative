package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: hvd  reason: default package */
/* loaded from: classes.dex */
public final class hvd implements dbty<akqq> {
    final /* synthetic */ dxio a;

    public hvd(dxio dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.dbty
    @dzsi
    public final /* bridge */ /* synthetic */ akqq a() {
        GmmLocation a = ((ahjq) this.a.a()).a();
        if (a != null) {
            return a.B();
        }
        return null;
    }
}
