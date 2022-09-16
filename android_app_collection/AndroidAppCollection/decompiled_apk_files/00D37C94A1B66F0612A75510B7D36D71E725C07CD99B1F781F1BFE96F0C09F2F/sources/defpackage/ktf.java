package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ktf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ktf implements ayqe {
    public final /* synthetic */ ktk a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktf(ktk ktkVar, int i) {
        this.b = i;
        this.a = ktkVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            agqv agqvVar = (agqv) obj;
            jml jmlVar = this.a.a;
            agqvVar.getClass();
            kso ksoVar = (kso) jmlVar.g(agqv.class, kso.class, agqvVar, null);
            if (ksoVar != null) {
                return ksoVar;
            }
            Log.e("CommuteShelfPresenter", "offlineRendererGenerator.generateRenderer() returned null");
            return new ksn().a();
        }
        agqh agqhVar = (agqh) obj;
        jml jmlVar2 = this.a.a;
        agqhVar.getClass();
        kso ksoVar2 = (kso) jmlVar2.g(agqh.class, kso.class, agqhVar, null);
        if (ksoVar2 != null) {
            return ksoVar2;
        }
        Log.e("CommuteShelfPresenter", "offlineRendererGenerator.generateRenderer() returned null");
        return new ksn().a();
    }
}
