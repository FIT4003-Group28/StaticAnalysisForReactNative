package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgxf  reason: default package */
/* loaded from: classes4.dex */
public class cgxf implements cgvf {
    final /* synthetic */ cgxg a;
    private final jic b;
    private final String c;
    private final int d;

    public cgxf(cgxg cgxgVar, dnmf dnmfVar, String str, int i) {
        this.a = cgxgVar;
        this.b = new jic(dnmfVar.a, ckqc.FIFE, 0);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.cgvf
    public jic a() {
        return this.b;
    }

    @Override // defpackage.cgvf
    public String b() {
        return this.c;
    }

    @Override // defpackage.cgvf
    public cqkl c() {
        cgxg cgxgVar = this.a;
        bbut bbutVar = cgxgVar.a;
        ckne ckneVar = cgxgVar.b;
        int i = this.d;
        bbtv v = bbty.v();
        v.b(false);
        bbutVar.o(ckneVar, i, v.a(), null);
        return cqkl.a;
    }
}
