package defpackage;
/* compiled from: PG */
/* renamed from: bcnf  reason: default package */
/* loaded from: classes3.dex */
final class bcnf implements acnw {
    final /* synthetic */ bcnh a;

    public bcnf(bcnh bcnhVar) {
        this.a = bcnhVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                bcnh bcnhVar = this.a;
                bcnhVar.b.m(new cjte(deaf.SWIPE), bcnhVar.c);
                return;
            }
            bcnh bcnhVar2 = this.a;
            if (i2 < 0 || i2 >= bcnhVar2.a.size()) {
                return;
            }
            bcnhVar2.b.i(bcnhVar2.a.get(i2).c());
        }
    }
}
