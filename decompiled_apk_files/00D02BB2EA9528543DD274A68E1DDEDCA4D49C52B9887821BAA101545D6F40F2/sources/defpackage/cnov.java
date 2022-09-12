package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cnov  reason: default package */
/* loaded from: classes.dex */
public final class cnov extends cnot<Void> {
    public final cnsl b;

    public cnov(cnsl cnslVar, cpct<Void> cpctVar) {
        super(3, cpctVar);
        this.b = cnslVar;
    }

    @Override // defpackage.cnos
    public final Feature[] a(cnrj<?> cnrjVar) {
        return null;
    }

    @Override // defpackage.cnos
    public final boolean b(cnrj<?> cnrjVar) {
        return true;
    }

    @Override // defpackage.cnot, defpackage.cnoy
    public final /* bridge */ /* synthetic */ void e(cnpy cnpyVar, boolean z) {
    }

    @Override // defpackage.cnot
    public final void g(cnrj<?> cnrjVar) {
        this.b.a.a(cnrjVar.b, this.a);
        cnsb<?> b = this.b.a.b();
        if (b != null) {
            cnrjVar.e.put(b, this.b);
        }
    }
}
