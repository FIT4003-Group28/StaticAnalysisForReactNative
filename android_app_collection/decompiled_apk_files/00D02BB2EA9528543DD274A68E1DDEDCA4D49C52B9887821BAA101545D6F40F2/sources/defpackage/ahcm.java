package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahcm  reason: default package */
/* loaded from: classes2.dex */
final class ahcm implements degu<Void> {
    final /* synthetic */ ahcn a;

    public ahcm(ahcn ahcnVar) {
        this.a = ahcnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        gga ggaVar = this.a.c;
        cjxu.i(ggaVar, ggaVar.getString(R.string.LOCALSTREAM_HIDE_TRIP_ERROR_TOAST_MESSAGE));
        this.a.h(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r3) {
        ahcn ahcnVar = this.a;
        if (!ahcnVar.l) {
            ahcnVar.l = true;
            cqkx.p(ahcnVar.f);
        }
        this.a.h(false);
    }
}
