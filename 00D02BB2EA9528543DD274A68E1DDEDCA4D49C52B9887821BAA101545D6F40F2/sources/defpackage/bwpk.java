package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwpk  reason: default package */
/* loaded from: classes4.dex */
public class bwpk extends bwpp {
    final /* synthetic */ bwpn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpk(bwpn bwpnVar, bttq bttqVar, CharSequence charSequence, CharSequence charSequence2) {
        super(bttqVar, charSequence, charSequence2);
        this.a = bwpnVar;
    }

    @Override // defpackage.jam
    public cqkl f() {
        Runnable runnable = this.a.b;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bwoc
    public cqkl q() {
        String P = this.a.a.P();
        if (P != null) {
            this.a.h.e(P, null);
        } else {
            this.a.h.j();
        }
        return cqkl.a;
    }
}
