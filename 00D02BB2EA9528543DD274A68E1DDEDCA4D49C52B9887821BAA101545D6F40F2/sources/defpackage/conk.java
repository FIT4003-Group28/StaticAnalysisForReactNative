package defpackage;

import com.google.android.gms.location.DeviceOrientation;
/* compiled from: PG */
/* renamed from: conk  reason: default package */
/* loaded from: classes5.dex */
public final class conk extends cokr {
    private final cnsd<cojl> a;

    public conk(cnsd<cojl> cnsdVar) {
        this.a = cnsdVar;
    }

    public final synchronized void b() {
        this.a.b();
    }

    @Override // defpackage.coks
    public final synchronized void e(DeviceOrientation deviceOrientation) {
        this.a.a(new conj(deviceOrientation));
    }
}
