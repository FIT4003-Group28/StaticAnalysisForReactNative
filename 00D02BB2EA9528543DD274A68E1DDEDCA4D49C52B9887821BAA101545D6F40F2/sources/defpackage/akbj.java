package defpackage;
/* compiled from: PG */
/* renamed from: akbj  reason: default package */
/* loaded from: classes2.dex */
public class akbj implements akbi {
    private final ahwl a;
    @dzsi
    private final btlu b;
    private final akbh c;
    private final jic d;

    public akbj(ahwl ahwlVar, @dzsi btlu btluVar, akbh akbhVar) {
        this.a = ahwlVar;
        this.b = btluVar;
        this.c = akbhVar;
        this.d = new jic(ahwlVar.u(), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.akbi
    public String a() {
        return this.a.t();
    }

    @Override // defpackage.akbi
    public jic b() {
        return this.d;
    }

    @Override // defpackage.akbi
    public cqkl c() {
        this.c.Pm(this.b, this.a);
        return cqkl.a;
    }
}
