package defpackage;
/* compiled from: PG */
/* renamed from: ccak  reason: default package */
/* loaded from: classes4.dex */
final class ccak extends ccan {
    final /* synthetic */ ccam a;

    public ccak(ccam ccamVar) {
        this.a = ccamVar;
    }

    @Override // defpackage.ccan
    public final void a() {
        ccam ccamVar = this.a;
        if (ccamVar.j) {
            if (!ccamVar.i.e) {
                return;
            }
            ccamVar.j = false;
            ccamVar.requestLayout();
        } else if (!ccamVar.i.f) {
        } else {
            ccamVar.j = true;
            ccamVar.requestLayout();
        }
    }
}
