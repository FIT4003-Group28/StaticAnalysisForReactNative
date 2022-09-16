package defpackage;
/* compiled from: PG */
/* renamed from: fsn  reason: default package */
/* loaded from: classes6.dex */
final class fsn<T> implements dzsj<T> {
    final /* synthetic */ fso a;
    private final int b;

    public fsn(fso fsoVar, int i) {
        this.a = fsoVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fso fsoVar = this.a;
            return (T) new bnhi(fsoVar.a.oh(), fsoVar.a.qY());
        }
        ftt fttVar = this.a.a;
        return (T) new bnhf(fttVar.eV, fttVar.qT());
    }
}
