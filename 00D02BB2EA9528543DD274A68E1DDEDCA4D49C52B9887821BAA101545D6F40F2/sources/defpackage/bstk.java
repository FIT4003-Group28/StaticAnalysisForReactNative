package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bstk  reason: default package */
/* loaded from: classes4.dex */
final class bstk implements auc {
    final /* synthetic */ bstl a;

    public bstk(bstl bstlVar) {
        this.a = bstlVar;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        bstl bstlVar = this.a;
        if (!bstlVar.aX) {
            return false;
        }
        bstlVar.ae.i(cjtd.a(dtyb.dc));
        bszv.ba(this.a.bb(), new bsua());
        return true;
    }
}
