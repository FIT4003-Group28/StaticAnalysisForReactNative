package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.SettingDisplayInfo;
/* compiled from: PG */
/* renamed from: cpem  reason: default package */
/* loaded from: classes5.dex */
final class cpem implements cpdr {
    final /* synthetic */ Status a;

    public cpem(Status status) {
        this.a = status;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cpdq
    public final void b(Activity activity, int i) {
        throw new IllegalStateException("UdcApiImpl: No settings detail activity can be launched");
    }

    @Override // defpackage.cpdq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.cpdr
    public final SettingDisplayInfo d() {
        return null;
    }
}
