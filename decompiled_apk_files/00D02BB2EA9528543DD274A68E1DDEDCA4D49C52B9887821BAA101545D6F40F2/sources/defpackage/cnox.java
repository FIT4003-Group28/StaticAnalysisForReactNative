package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cnox  reason: default package */
/* loaded from: classes5.dex */
public final class cnox extends cnot<Boolean> {
    public final cnsb<?> b;

    public cnox(cnsb<?> cnsbVar, cpct<Boolean> cpctVar) {
        super(4, cpctVar);
        this.b = cnsbVar;
    }

    @Override // defpackage.cnos
    public final Feature[] a(cnrj<?> cnrjVar) {
        cnrjVar.e.get(this.b);
        return null;
    }

    @Override // defpackage.cnos
    public final boolean b(cnrj<?> cnrjVar) {
        return cnrjVar.e.get(this.b) != null;
    }

    @Override // defpackage.cnot, defpackage.cnoy
    public final /* bridge */ /* synthetic */ void e(cnpy cnpyVar, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnot
    public final void g(cnrj<?> cnrjVar) {
        cnsl remove = cnrjVar.e.remove(this.b);
        if (remove != null) {
            cntj<cnnq, ?> cntjVar = remove.b;
            ((cnso) cntjVar).a.b.a(cnrjVar.b, this.a);
            remove.a.a.b();
            return;
        }
        this.a.b(false);
    }
}
