package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjl  reason: default package */
/* loaded from: classes6.dex */
public final class fjl<T> implements dzsj<T> {
    final /* synthetic */ fjm a;
    private final int b;

    public fjl(fjm fjmVar, int i) {
        this.a = fjmVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fjm fjmVar = this.a;
                dzsj<cqhn> il = fjmVar.b.eW.il();
                dzsj dzsjVar = fjmVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fjl(fjmVar, 2);
                    fjmVar.a = dzsjVar;
                }
                return (T) new bpeg(il, dzsjVar);
            } else if (i == 2) {
                return (T) new bped(this.a.b());
            } else {
                if (i != 3) {
                    fjm fjmVar2 = this.a;
                    ftt fttVar = fjmVar2.b;
                    return (T) new bnyd(fttVar.eV, fttVar.y(), fjmVar2.b.fO());
                }
                ftt fttVar2 = this.a.b;
                return (T) new booa(fttVar2.a, fttVar2.cp());
            }
        }
        return (T) new bpeb(this.a.b.eV);
    }
}
