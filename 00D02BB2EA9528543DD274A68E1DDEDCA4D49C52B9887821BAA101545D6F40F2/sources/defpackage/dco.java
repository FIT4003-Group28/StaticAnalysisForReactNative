package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: dco  reason: default package */
/* loaded from: classes5.dex */
public final class dco implements czf {
    private final dxio<dcn> a;

    public dco(dxio<dcn> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.czf
    public final cze a(Application application) {
        return new dcq(application, this.a);
    }
}
