package defpackage;
/* compiled from: PG */
/* renamed from: txs  reason: default package */
/* loaded from: classes4.dex */
public final class txs implements axou {
    private final txo a;
    private final /* synthetic */ int b;

    public txs(txo txoVar) {
        this.a = txoVar;
    }

    public txs(txo txoVar, int i) {
        this.b = i;
        this.a = txoVar;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                tyk tykVar = this.a.c;
                axzl.o(tykVar);
                return tykVar;
            case 1:
                ampq ampqVar = this.a.d;
                axzl.o(ampqVar);
                return ampqVar;
            case 2:
                return this.a.i;
            case 3:
                ampq ampqVar2 = this.a.f;
                axzl.o(ampqVar2);
                return ampqVar2;
            case 4:
                tzq tzqVar = this.a.b;
                axzl.o(tzqVar);
                return tzqVar;
            case 5:
                return this.a.g;
            case 6:
                vjb vjbVar = this.a.a;
                axzl.o(vjbVar);
                return vjbVar;
            default:
                txo txoVar = this.a;
                return txoVar.e.h() ? (trv) txoVar.e.c() : txn.a;
        }
    }
}
