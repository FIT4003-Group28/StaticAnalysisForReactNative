package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qtl  reason: default package */
/* loaded from: classes4.dex */
public final class qtl extends qtj {
    public final qvk b;

    public qtl(qvk qvkVar, rvh rvhVar) {
        super(3, rvhVar);
        this.b = qvkVar;
    }

    @Override // defpackage.qti
    public final boolean a(qum qumVar) {
        return true;
    }

    @Override // defpackage.qti
    public final Feature[] b(qum qumVar) {
        return this.b.a.b;
    }

    @Override // defpackage.qtj
    public final void c(qum qumVar) {
        this.b.a.b(qumVar.b, this.a);
        qvb a = this.b.a.a();
        if (a != null) {
            qumVar.f.put(a, this.b);
        }
    }

    @Override // defpackage.qtj, defpackage.qto
    public final /* bridge */ /* synthetic */ void g(que queVar, boolean z) {
    }
}
