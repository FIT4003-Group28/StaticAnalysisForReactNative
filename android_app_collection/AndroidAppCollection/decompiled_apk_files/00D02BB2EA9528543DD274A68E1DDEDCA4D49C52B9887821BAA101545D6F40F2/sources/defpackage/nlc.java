package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: nlc  reason: default package */
/* loaded from: classes7.dex */
final class nlc implements crzp<btlu> {
    final /* synthetic */ nle a;

    public nlc(nle nleVar) {
        this.a = nleVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (!Objects.equals(this.a.m, l)) {
            nle nleVar = this.a;
            nleVar.m = l;
            nleVar.g = null;
            nleVar.e = dcdc.e();
            nleVar.h = null;
            nleVar.k = true;
            if (btlu.i(nleVar.m) == btlt.GOOGLE) {
                return;
            }
            nleVar.h(dcdc.e());
        }
    }
}
