package defpackage;
/* compiled from: PG */
/* renamed from: afok  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afok implements ayqe {
    public final /* synthetic */ afob a;
    private final /* synthetic */ int b;

    public /* synthetic */ afok(afob afobVar, int i, byte[] bArr) {
        this.b = i;
        this.a = afobVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            afom afomVar = (afom) obj;
            return ayoi.w(new xxd(this.a.a, afomVar.a, 3)).V(new afoj(afomVar));
        }
        afom afomVar2 = (afom) obj;
        return ayoi.w(new xxd(afomVar2.a, this.a.a, 2)).V(new afoj(afomVar2, 1));
    }
}
