package defpackage;
/* compiled from: PG */
/* renamed from: amwj  reason: default package */
/* loaded from: classes2.dex */
final class amwj implements alwb {
    final /* synthetic */ amwp a;

    public amwj(amwp amwpVar) {
        this.a = amwpVar;
    }

    @Override // defpackage.alwb
    public final void e(alwa alwaVar) {
        if (this.a.i) {
            return;
        }
        this.a.i = true;
        this.a.h.release();
    }
}
