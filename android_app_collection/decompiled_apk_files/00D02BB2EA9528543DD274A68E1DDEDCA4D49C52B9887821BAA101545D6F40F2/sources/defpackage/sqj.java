package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sqj  reason: default package */
/* loaded from: classes7.dex */
final class sqj implements degu<Void> {
    final /* synthetic */ sqk a;

    public sqj(sqk sqkVar) {
        this.a = sqkVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = sqk.l;
        this.a.u(R.string.GO_TAB_UNPINNING_FAILURE_TEXT);
        sqk sqkVar = this.a;
        sqkVar.k = false;
        sqkVar.j = true;
        sqkVar.t();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r3) {
        sqk sqkVar = this.a;
        cpv cpvVar = sqkVar.b;
        if (cpvVar == null || !cpvVar.e(sqkVar.a)) {
            return;
        }
        sqkVar.u(R.string.GO_TAB_UNPINNING_SUCCESS_ACCESSIBILITY_TEXT);
    }
}
