package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgxy  reason: default package */
/* loaded from: classes4.dex */
public class cgxy implements cgvo {
    final /* synthetic */ cgxz a;
    private final bbtm b;

    public cgxy(cgxz cgxzVar, bbtm bbtmVar) {
        this.a = cgxzVar;
        this.b = bbtmVar;
    }

    @Override // defpackage.cgvo
    public Boolean a() {
        return Boolean.valueOf(this.a.t() != cgwf.EDITABLE);
    }

    @Override // defpackage.cgvo
    public cqkl b() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.cgvo
    public jic c() {
        return new jic(this.b.a(), ckqc.FULLY_QUALIFIED, 0, 250);
    }
}
