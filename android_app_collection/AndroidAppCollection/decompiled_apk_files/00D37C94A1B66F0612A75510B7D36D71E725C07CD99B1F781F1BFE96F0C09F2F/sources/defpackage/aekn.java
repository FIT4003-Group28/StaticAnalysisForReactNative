package defpackage;
/* compiled from: PG */
/* renamed from: aekn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aekn implements ayqe {
    public final /* synthetic */ aeks a;
    private final /* synthetic */ int b;

    public /* synthetic */ aekn(aeks aeksVar) {
        this.a = aeksVar;
    }

    public /* synthetic */ aekn(aeks aeksVar, int i) {
        this.b = i;
        this.a = aeksVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            return zna.s(this.a.g.b((arzc) obj)).g();
        }
        return zna.s(this.a.g.a((aekp) obj)).g();
    }
}
