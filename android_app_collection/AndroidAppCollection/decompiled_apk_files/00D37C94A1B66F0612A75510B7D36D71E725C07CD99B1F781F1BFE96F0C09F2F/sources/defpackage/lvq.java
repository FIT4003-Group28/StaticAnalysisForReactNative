package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lvq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lvq implements ayqb {
    public final /* synthetic */ lvu a;
    private final /* synthetic */ int b;

    public /* synthetic */ lvq(lvu lvuVar) {
        this.a = lvuVar;
    }

    public /* synthetic */ lvq(lvu lvuVar, int i) {
        this.b = i;
        this.a = lvuVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            lvu lvuVar = this.a;
            if (((Integer) obj).intValue() != 2) {
                return;
            }
            lvuVar.b.l(true);
            return;
        }
        lvu lvuVar2 = this.a;
        zgd.t(lvuVar2.b, zgd.p(lvuVar2.g.l() ? ((zaw) obj).a.a.top : 0), ViewGroup.MarginLayoutParams.class);
    }
}
