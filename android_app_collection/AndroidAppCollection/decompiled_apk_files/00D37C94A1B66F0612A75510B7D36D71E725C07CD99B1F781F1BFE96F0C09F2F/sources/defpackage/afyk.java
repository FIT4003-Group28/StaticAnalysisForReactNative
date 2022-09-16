package defpackage;
/* compiled from: PG */
/* renamed from: afyk  reason: default package */
/* loaded from: classes.dex */
public class afyk implements afyf {
    public final ykg a;
    public final snc b;
    private final afyf c;
    private final long d;

    /* JADX INFO: Access modifiers changed from: protected */
    public afyk(ykg ykgVar, afyf afyfVar, snc sncVar, long j) {
        this.a = ykgVar;
        this.c = afyfVar;
        this.b = sncVar;
        this.d = j;
    }

    public static afyk b(ykg ykgVar, afyf afyfVar, snc sncVar, long j) {
        ykgVar.getClass();
        sncVar.getClass();
        boolean z = false;
        if (j >= 0 && j <= 2592000000L) {
            z = true;
        }
        aqxo.q(z, "time to live must be >=0 and <= 2592000000");
        return new afyk(ykgVar, afyfVar, sncVar, j);
    }

    @Override // defpackage.afyf
    public final void a(Object obj, yiw yiwVar) {
        if (this.d > 0) {
            afsk afskVar = (afsk) this.a.a(obj);
            long c = this.b.c();
            if (afskVar != null) {
                long j = afskVar.b;
                if (c >= j && j + this.d >= c) {
                    yiwVar.b(obj, afskVar.a);
                    c(this.a);
                    return;
                }
            }
        }
        this.c.a(obj, new afyj(this, yiwVar));
    }

    protected void c(ykg ykgVar) {
    }
}
