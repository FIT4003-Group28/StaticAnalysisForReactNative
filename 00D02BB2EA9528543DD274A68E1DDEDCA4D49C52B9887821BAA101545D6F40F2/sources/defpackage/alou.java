package defpackage;
/* compiled from: PG */
/* renamed from: alou  reason: default package */
/* loaded from: classes.dex */
public final class alou<T> extends btrh<T> {
    private final int d;

    public alou(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            alot alotVar = (alot) this.a;
            aktf aktfVar = (aktf) ((algu) obj).a(aktf.class);
            if (!(aktfVar instanceof aljo)) {
                return;
            }
            ((aljo) aktfVar).o(aktn.TAP);
            return;
        }
        alot alotVar2 = (alot) this.a;
        akte akteVar = (akte) ((algs) obj).a(akte.class);
        if (!(akteVar instanceof aljo)) {
            return;
        }
        ((aljo) akteVar).o(aktn.TAP);
    }
}
