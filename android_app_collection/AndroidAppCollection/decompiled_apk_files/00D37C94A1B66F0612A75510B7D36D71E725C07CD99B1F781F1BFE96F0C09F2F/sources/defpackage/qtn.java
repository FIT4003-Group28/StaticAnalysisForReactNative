package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qtn  reason: default package */
/* loaded from: classes4.dex */
public final class qtn extends qtj {
    public final qvb b;

    public qtn(qvb qvbVar, rvh rvhVar) {
        super(4, rvhVar);
        this.b = qvbVar;
    }

    @Override // defpackage.qti
    public final boolean a(qum qumVar) {
        return ((qvk) qumVar.f.get(this.b)) != null;
    }

    @Override // defpackage.qti
    public final Feature[] b(qum qumVar) {
        qvk qvkVar = (qvk) qumVar.f.get(this.b);
        if (qvkVar == null) {
            return null;
        }
        return qvkVar.a.b;
    }

    @Override // defpackage.qtj
    public final void c(qum qumVar) {
        qvk qvkVar = (qvk) qumVar.f.remove(this.b);
        if (qvkVar != null) {
            qwb qwbVar = qvkVar.b;
            qwbVar.a.b.a(qumVar.b, this.a);
            qvkVar.a.a.a();
            return;
        }
        this.a.d(false);
    }

    @Override // defpackage.qtj, defpackage.qto
    public final /* bridge */ /* synthetic */ void g(que queVar, boolean z) {
    }
}
