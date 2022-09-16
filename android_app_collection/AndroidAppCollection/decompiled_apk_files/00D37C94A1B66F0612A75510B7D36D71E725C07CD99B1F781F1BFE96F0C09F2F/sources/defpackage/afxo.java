package defpackage;
/* compiled from: PG */
/* renamed from: afxo  reason: default package */
/* loaded from: classes.dex */
public class afxo implements afyf {
    public final ykg a;
    private final afyf b;
    private final snc c;

    public afxo(ykg ykgVar, afyf afyfVar, snc sncVar) {
        this.a = ykgVar;
        this.b = afyfVar;
        this.c = sncVar;
    }

    @Override // defpackage.afyf
    public final void a(Object obj, yiw yiwVar) {
        afsk afskVar = (afsk) this.a.a(obj);
        long c = this.c.c();
        if (afskVar == null || c > afskVar.b) {
            this.b.a(obj, new afxn(this, yiwVar));
            return;
        }
        yiwVar.b(obj, afskVar.a);
        b(this.a);
    }

    protected void b(ykg ykgVar) {
    }
}
