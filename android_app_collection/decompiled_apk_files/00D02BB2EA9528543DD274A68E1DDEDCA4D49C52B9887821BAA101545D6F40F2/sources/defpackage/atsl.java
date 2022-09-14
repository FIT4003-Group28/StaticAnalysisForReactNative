package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atsl  reason: default package */
/* loaded from: classes2.dex */
public class atsl extends atso implements atxy {
    public final izo a;

    public atsl(atsm atsmVar) {
        super(atsmVar);
        izo izoVar = atsmVar.n;
        dbsk.t(izoVar, "progressTimer");
        this.a = izoVar;
    }

    @Override // defpackage.izn
    public cqkl a() {
        cjql a = this.h.a();
        if (this.p != null && a != null) {
            this.j.n(a, new cjte(deaf.ACTION_BY_TIMER), this.p);
        }
        this.y = true;
        return t();
    }

    @Override // defpackage.atxy
    public izo b() {
        return this.a;
    }

    @Override // defpackage.atso, defpackage.atxw
    public cqkl c() {
        this.a.e();
        return super.c();
    }
}
