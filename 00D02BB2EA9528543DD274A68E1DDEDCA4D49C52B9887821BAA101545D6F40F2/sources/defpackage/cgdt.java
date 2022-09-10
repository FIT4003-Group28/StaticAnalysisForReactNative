package defpackage;
/* compiled from: PG */
/* renamed from: cgdt  reason: default package */
/* loaded from: classes4.dex */
final class cgdt extends czua {
    final /* synthetic */ ilo a;
    final /* synthetic */ cgdu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgdt(cgdu cgduVar, String str, ilo iloVar) {
        super(str);
        this.b = cgduVar;
        this.a = iloVar;
    }

    @Override // defpackage.czua
    public final void a(int i) {
        int i2 = i - 1;
        if (i2 == 0 || i2 == 3) {
            return;
        }
        this.b.c.e.W(this.a.ai().o());
        this.b.c.bF();
    }
}
