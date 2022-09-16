package defpackage;
/* compiled from: PG */
/* renamed from: amqb  reason: default package */
/* loaded from: classes.dex */
final class amqb extends amoo {
    final /* synthetic */ ampa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqb(amqf amqfVar, CharSequence charSequence, ampa ampaVar) {
        super(amqfVar, charSequence);
        this.g = ampaVar;
    }

    @Override // defpackage.amoo
    public final int a(int i) {
        return this.g.a.end();
    }

    @Override // defpackage.amoo
    public final int b(int i) {
        if (this.g.a.find(i)) {
            return this.g.a.start();
        }
        return -1;
    }
}
