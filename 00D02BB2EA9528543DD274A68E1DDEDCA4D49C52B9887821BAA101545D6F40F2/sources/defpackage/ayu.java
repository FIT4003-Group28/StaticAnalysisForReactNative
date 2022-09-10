package defpackage;
/* compiled from: PG */
/* renamed from: ayu  reason: default package */
/* loaded from: classes3.dex */
final class ayu extends ayo {
    final ayv a;

    public ayu(ayv ayvVar) {
        this.a = ayvVar;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void a(ayn aynVar) {
        ayv ayvVar = this.a;
        int i = ayvVar.p - 1;
        ayvVar.p = i;
        if (i == 0) {
            ayvVar.q = false;
            ayvVar.s();
        }
        aynVar.E(this);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void e(ayn aynVar) {
        ayv ayvVar = this.a;
        if (!ayvVar.q) {
            ayvVar.r();
            this.a.q = true;
        }
    }
}
