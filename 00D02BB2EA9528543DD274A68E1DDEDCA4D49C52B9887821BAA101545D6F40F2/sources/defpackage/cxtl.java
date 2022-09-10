package defpackage;
/* compiled from: PG */
/* renamed from: cxtl  reason: default package */
/* loaded from: classes5.dex */
final class cxtl implements cxpm {
    final /* synthetic */ cxtp a;

    public cxtl(cxtp cxtpVar) {
        this.a = cxtpVar;
    }

    @Override // defpackage.cxpm
    public final void a(boolean z) {
        if (z) {
            this.a.a();
            cxwe cxweVar = this.a.j;
            if (cxweVar.m) {
                cxweVar.h.l(true);
            } else {
                cxweVar.n = true;
            }
        }
    }
}
