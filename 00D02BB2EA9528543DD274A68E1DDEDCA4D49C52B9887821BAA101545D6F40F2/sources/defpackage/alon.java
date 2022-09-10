package defpackage;
/* compiled from: PG */
/* renamed from: alon  reason: default package */
/* loaded from: classes.dex */
public final class alon<T> extends btrh<T> {
    private final int d;

    public alon(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            algo algoVar = (algo) obj;
            if (((alom) this.a).m.a().booleanValue()) {
                return;
            }
            aktc aktcVar = algoVar.a;
            if (!(aktcVar instanceof alks)) {
                return;
            }
            alks alksVar = (alks) aktcVar;
            alksVar.p(aktn.TAP, alksVar);
            return;
        }
        alho alhoVar = (alho) obj;
        if (((alom) this.a).m.a().booleanValue()) {
            return;
        }
        alaq alaqVar = alhoVar.a;
        if (!(alaqVar instanceof aljo)) {
            return;
        }
        ((aljo) alaqVar).o(aktn.TAP);
    }
}
