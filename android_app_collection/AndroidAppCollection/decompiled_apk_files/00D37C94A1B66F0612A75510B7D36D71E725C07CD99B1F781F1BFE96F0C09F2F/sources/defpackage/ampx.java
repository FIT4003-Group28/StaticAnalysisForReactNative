package defpackage;
/* compiled from: PG */
/* renamed from: ampx  reason: default package */
/* loaded from: classes.dex */
final class ampx extends amoo {
    final /* synthetic */ ampy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampx(ampy ampyVar, amqf amqfVar, CharSequence charSequence) {
        super(amqfVar, charSequence);
        this.g = ampyVar;
    }

    @Override // defpackage.amoo
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.amoo
    public final int b(int i) {
        return this.g.a.c(this.b, i);
    }
}
