package defpackage;
/* compiled from: PG */
/* renamed from: jwb  reason: default package */
/* loaded from: classes3.dex */
public final class jwb {
    public ezx a = ezx.NONE;
    public ezx b;
    private final airr c;

    public jwb(airr airrVar) {
        this.c = airrVar;
    }

    public final void a(ezx ezxVar) {
        if (ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            return;
        }
        boolean z = true;
        this.c.E(ezxVar.b() && !ezxVar.e());
        airr airrVar = this.c;
        if (!ezxVar.j() && !ezxVar.e()) {
            z = false;
        }
        aijf aijfVar = airrVar.f;
        if (aijfVar.g != z) {
            aijfVar.g = z;
            aijfVar.i();
        }
        airr airrVar2 = this.c;
        boolean d = ezxVar.d();
        aijf aijfVar2 = airrVar2.f;
        if (d != aijfVar2.n) {
            aijfVar2.n = d;
            aijfVar2.i();
        }
        airr airrVar3 = this.c;
        boolean e = ezxVar.e();
        aijf aijfVar3 = airrVar3.f;
        if (e == aijfVar3.i) {
            return;
        }
        aijfVar3.i = e;
        aijfVar3.i();
    }

    public final void b(ezx ezxVar) {
        ezxVar.getClass();
        this.a = ezxVar;
        ezx ezxVar2 = this.b;
        if (ezxVar2 != null) {
            if (ezxVar != ezxVar2) {
                return;
            }
            this.b = null;
        }
        a(ezxVar);
    }
}
