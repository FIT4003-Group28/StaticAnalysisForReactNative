package defpackage;
/* compiled from: PG */
/* renamed from: mbl  reason: default package */
/* loaded from: classes7.dex */
final class mbl implements Runnable {
    final /* synthetic */ mbp a;

    public mbl(mbp mbpVar) {
        this.a = mbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mbp mbpVar = this.a;
        if (!mbpVar.g.h(mbpVar.j)) {
            mbp mbpVar2 = this.a;
            mbpVar2.u.postDelayed(mbpVar2.B, 250L);
        }
    }
}
