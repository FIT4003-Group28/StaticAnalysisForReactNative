package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: gja  reason: default package */
/* loaded from: classes3.dex */
final class gja implements ankb {
    private final yzj a;
    private final WeakReference b;

    public gja(aafo aafoVar, yzj yzjVar) {
        this.b = new WeakReference(aafoVar);
        this.a = yzjVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        zep.d("Error creating post", th);
        this.a.e(th);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aafo aafoVar;
        arnz arnzVar = (arnz) obj;
        if (arnzVar == null || (aafoVar = (aafo) this.b.get()) == null) {
            return;
        }
        if ((arnzVar.b & 4) != 0) {
            arnh arnhVar = arnzVar.f;
            if (arnhVar == null) {
                arnhVar = arnh.a;
            }
            if ((arnhVar.b & 32) != 0) {
                apzg apzgVar = arnhVar.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        }
        for (int i = 0; i < arnzVar.e.size(); i++) {
            aafoVar.a((apzg) arnzVar.e.get(i));
        }
    }
}
