package defpackage;
/* compiled from: PG */
/* renamed from: fuq  reason: default package */
/* loaded from: classes3.dex */
public final class fuq {
    private final aafo a;
    private final acth b;
    private final akcn c;
    private final srr d;

    public fuq(aafo aafoVar, acth acthVar, akcn akcnVar, srr srrVar) {
        this.a = aafoVar;
        this.b = acthVar;
        this.c = akcnVar;
        this.d = srrVar;
    }

    public final void a(apzj apzjVar) {
        if (this.c.c(apzjVar.g)) {
            int i = apzjVar.b;
            if ((i & 1) != 0) {
                aafo aafoVar = this.a;
                apzg apzgVar = apzjVar.c;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            } else if ((i & 2) != 0) {
                aafo aafoVar2 = this.a;
                apzg apzgVar2 = apzjVar.d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.a(apzgVar2);
                this.b.oi().u(new acte(apzjVar.f), null);
            }
            this.c.a(apzjVar.g);
        }
    }

    public final void b() {
        this.d.a();
    }
}
