package defpackage;
/* compiled from: PG */
/* renamed from: csam  reason: default package */
/* loaded from: classes5.dex */
final class csam extends dyfb {
    public csak b;
    public final cxaj d;
    public final Object a = new Object();
    public boolean c = false;

    public csam(cxaj cxajVar) {
        this.d = cxajVar;
        cxajVar.k = "application/grpc";
    }

    @Override // defpackage.dyfb
    public final dyfe a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new csal();
            }
            csak csakVar = new csak(this.d);
            this.b = csakVar;
            return csakVar;
        }
    }
}
