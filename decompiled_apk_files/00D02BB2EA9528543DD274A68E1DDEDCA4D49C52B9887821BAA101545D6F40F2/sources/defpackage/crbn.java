package defpackage;
/* compiled from: PG */
/* renamed from: crbn  reason: default package */
/* loaded from: classes5.dex */
final class crbn extends ard {
    final /* synthetic */ crbo a;

    public crbn(crbo crboVar) {
        this.a = crboVar;
    }

    @Override // defpackage.ard
    public final void a(arq arqVar) {
        crbo crboVar = this.a;
        int i = crboVar.e;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                crboVar.e = 3;
                crbq crbqVar = crboVar.f;
                if (crbqVar == null) {
                    return;
                }
                crbqVar.a();
                return;
            } else if (i2 == 2) {
                crboVar.c = arqVar;
                return;
            } else if (i2 != 3) {
                return;
            } else {
                crboVar.e = 1;
                crbq crbqVar2 = crboVar.f;
                if (crbqVar2 != null) {
                    synchronized (crbqVar2.a.i) {
                        crbqVar2.a.e();
                        crbqVar2.a.i.h();
                    }
                }
                crboVar.c = null;
                return;
            }
        }
        throw null;
    }
}
