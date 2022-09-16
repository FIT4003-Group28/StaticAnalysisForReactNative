package defpackage;
/* compiled from: PG */
/* renamed from: txk  reason: default package */
/* loaded from: classes4.dex */
public final class txk implements axou {
    private final txj a;
    private final /* synthetic */ int b;

    public txk(txj txjVar) {
        this.a = txjVar;
    }

    public txk(txj txjVar, int i) {
        this.b = i;
        this.a = txjVar;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b == 0) {
            amqo amqoVar = this.a.b;
            axzl.o(amqoVar);
            return amqoVar;
        }
        ampq ampqVar = this.a.a;
        axzl.o(ampqVar);
        return ampqVar;
    }
}
