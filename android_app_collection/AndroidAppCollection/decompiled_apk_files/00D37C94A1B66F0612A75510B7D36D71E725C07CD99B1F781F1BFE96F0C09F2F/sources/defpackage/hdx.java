package defpackage;

import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
/* compiled from: PG */
/* renamed from: hdx  reason: default package */
/* loaded from: classes3.dex */
final class hdx implements zvl {
    final /* synthetic */ hdz a;

    public hdx(hdz hdzVar) {
        this.a = hdzVar;
    }

    @Override // defpackage.zvl
    public final void a() {
    }

    @Override // defpackage.zvl
    public final void b(zvo zvoVar, int i) {
        Object x = zvoVar.x(i);
        hdy hdyVar = this.a.d;
        if (hdyVar == null || x == null) {
            return;
        }
        hdyVar.lQ((DeviceLocalFile) x);
    }
}
