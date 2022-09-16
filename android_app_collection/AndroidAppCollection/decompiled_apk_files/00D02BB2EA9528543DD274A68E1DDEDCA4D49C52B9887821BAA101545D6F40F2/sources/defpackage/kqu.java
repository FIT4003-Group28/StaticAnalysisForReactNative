package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kqu  reason: default package */
/* loaded from: classes7.dex */
public class kqu implements ndu {
    final /* synthetic */ krc a;

    public kqu(krc krcVar) {
        this.a = krcVar;
    }

    @Override // defpackage.ndu
    public cqkl a() {
        String l = this.a.q.l();
        this.a.n();
        this.a.q.k(l);
        if (l != null) {
            krc krcVar = this.a;
            krcVar.f.c(l, krcVar.r, krcVar.k);
        }
        return cqkl.a;
    }

    @Override // defpackage.ndu
    public Boolean b() {
        return Boolean.valueOf(this.a.b.h());
    }

    @Override // defpackage.ndu
    public Boolean c() {
        return this.a.q.j();
    }
}
