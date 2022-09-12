package defpackage;
/* compiled from: PG */
/* renamed from: kzh  reason: default package */
/* loaded from: classes7.dex */
public final class kzh {
    final /* synthetic */ kzt a;

    public kzh(kzt kztVar) {
        this.a = kztVar;
    }

    public final void a(boolean z) {
        this.a.i();
        if (!this.a.h.d()) {
            this.a.e();
            return;
        }
        nue nueVar = this.a.g.d;
        boolean z2 = !z;
        nueVar.f = z2;
        nud nudVar = nueVar.a;
        if (nudVar != null) {
            nudVar.setMustBeFocusedToBeActive(z2);
        }
        this.a.g.a(z);
        this.a.e();
        if (z) {
            return;
        }
        nol.b(this.a.l.findViewById(lbn.j));
    }
}
