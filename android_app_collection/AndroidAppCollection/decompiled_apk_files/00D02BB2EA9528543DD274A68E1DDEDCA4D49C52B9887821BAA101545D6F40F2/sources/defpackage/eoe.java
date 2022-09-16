package defpackage;
/* compiled from: PG */
/* renamed from: eoe  reason: default package */
/* loaded from: classes6.dex */
final class eoe<T> implements dzsj<T> {
    final /* synthetic */ eof a;
    private final int b;

    public eoe(eof eofVar, int i) {
        this.a = eofVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) new rbv(this.a.b.eV);
            }
            ftt fttVar = this.a.b;
            return (T) new rbw(fttVar.a, fttVar.hO());
        }
        eof eofVar = this.a;
        dzsj<rb> dzsjVar = eofVar.b.eV;
        dzsj dzsjVar2 = eofVar.a;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eoe(eofVar, 1);
            eofVar.a = dzsjVar2;
        }
        return (T) new rby(dzsjVar, dzsjVar2);
    }
}
