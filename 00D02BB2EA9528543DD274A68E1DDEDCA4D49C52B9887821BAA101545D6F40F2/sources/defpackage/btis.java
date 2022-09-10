package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btis  reason: default package */
/* loaded from: classes4.dex */
final class btis implements degu<dpri> {
    final /* synthetic */ btiu a;

    public btis(btiu btiuVar) {
        this.a = btiuVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        btiu btiuVar = this.a;
        if (!btiuVar.a.aZ) {
            return;
        }
        btiuVar.c();
        gga ggaVar = this.a.a;
        cjxu.i(ggaVar, ggaVar.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dpri dpriVar) {
        this.a.b.h();
    }
}
