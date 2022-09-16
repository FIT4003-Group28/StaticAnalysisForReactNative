package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgu  reason: default package */
/* loaded from: classes2.dex */
public final class bgu extends asd {
    final /* synthetic */ bgv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgu(bgv bgvVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.b = bgvVar;
    }

    @Override // defpackage.asd
    public final void b(int i) {
        this.b.c.m.post(new bgt(this, i));
    }

    @Override // defpackage.asd
    public final void c(int i) {
        this.b.c.m.post(new bgt(this, i, 1));
    }
}
