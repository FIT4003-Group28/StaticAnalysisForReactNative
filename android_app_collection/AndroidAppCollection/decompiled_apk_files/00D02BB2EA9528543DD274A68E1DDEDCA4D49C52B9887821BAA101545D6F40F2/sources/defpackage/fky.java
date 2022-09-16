package defpackage;
/* compiled from: PG */
/* renamed from: fky  reason: default package */
/* loaded from: classes6.dex */
final class fky<T> implements dzsj<T> {
    final /* synthetic */ fkz a;
    private final int b;

    public fky(fkz fkzVar, int i) {
        this.a = fkzVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) new sei(this.a.a.eW.m());
        }
        fkz fkzVar = this.a;
        return (T) new sev(fkzVar.a.eW.m(), fkzVar.a.eW.al(), fkzVar.a.eW.K());
    }
}
