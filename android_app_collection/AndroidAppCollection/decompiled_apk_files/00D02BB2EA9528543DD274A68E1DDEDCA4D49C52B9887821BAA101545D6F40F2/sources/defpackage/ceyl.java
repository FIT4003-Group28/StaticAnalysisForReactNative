package defpackage;
/* compiled from: PG */
/* renamed from: ceyl  reason: default package */
/* loaded from: classes4.dex */
public final class ceyl<T> extends btrh<T> {
    private final int d;

    public ceyl(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((ceyj) this.a).q((bqje) obj);
        } else if (i != 1) {
            ((ceyj) this.a).v((cdjh) obj);
        } else {
            ((ceyj) this.a).u((bkpe) obj);
        }
    }
}
