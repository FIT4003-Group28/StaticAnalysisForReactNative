package defpackage;
/* compiled from: PG */
/* renamed from: amqk  reason: default package */
/* loaded from: classes.dex */
public final class amqk {
    @dzsi
    public alxs a;
    @dzsi
    public alxs b;
    @dzsi
    public alwn c;

    public final alxo a(alwy alwyVar, int i) {
        if (alwyVar.e()) {
            return alxo.c;
        }
        if (alwyVar.a()) {
            return alwyVar.c(this.b, i);
        }
        alxp d = alwyVar.d(this.a);
        alwn alwnVar = this.c;
        alxp a = alwnVar != null ? d.a(alwnVar.A.L) : null;
        if (a != null) {
            return a.c(i);
        }
        return d.c(i);
    }

    public final alxo b(alvz alvzVar) {
        return a(alvzVar.i(), alvzVar.j());
    }

    public final alxp c(alwy alwyVar) {
        if (alwyVar.e()) {
            return alxp.e;
        }
        if (alwyVar.a()) {
            return alwyVar.d(this.b);
        }
        alxp d = alwyVar.d(this.a);
        alwn alwnVar = this.c;
        alxp a = alwnVar != null ? d.a(alwnVar.A.L) : null;
        return a != null ? a : d;
    }
}
