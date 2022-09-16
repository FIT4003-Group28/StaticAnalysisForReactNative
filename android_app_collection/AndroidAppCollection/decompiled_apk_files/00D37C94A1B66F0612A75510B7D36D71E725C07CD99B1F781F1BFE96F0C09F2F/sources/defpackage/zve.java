package defpackage;

import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
/* compiled from: PG */
/* renamed from: zve  reason: default package */
/* loaded from: classes4.dex */
final class zve implements zvl {
    final /* synthetic */ zvh a;

    public zve(zvh zvhVar) {
        this.a = zvhVar;
    }

    @Override // defpackage.zvl
    public final void a() {
    }

    @Override // defpackage.zvl
    public final void b(zvo zvoVar, int i) {
        Object x = zvoVar.x(i);
        zvg zvgVar = this.a.ae;
        if (zvgVar == null || x == null) {
            return;
        }
        zvgVar.aK((DeviceLocalFile) x);
    }
}
