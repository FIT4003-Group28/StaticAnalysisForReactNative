package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxz  reason: default package */
/* loaded from: classes7.dex */
public final class lxz implements lzd {
    final /* synthetic */ lye a;

    public lxz(lye lyeVar) {
        this.a = lyeVar;
    }

    @Override // defpackage.lzd
    public final void a(dcdc<ldm> dcdcVar, lyy lyyVar) {
        bvrj.UI_THREAD.c();
        if (this.a.e.isEmpty()) {
            return;
        }
        for (lzd lzdVar : this.a.e) {
            lzdVar.a(dcdcVar, lyyVar);
        }
    }
}
