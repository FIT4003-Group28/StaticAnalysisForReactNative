package defpackage;
/* compiled from: PG */
/* renamed from: duf  reason: default package */
/* loaded from: classes6.dex */
public final class duf {
    public final dbch a;
    public final czz b;
    public float c;
    public float d;
    public final dbeb e = new dbeb();
    private final dbeb k = new dbeb();
    public final bnvs f = new bnvs();
    public final bnvs g = new bnvs();
    private final bnvs l = new bnvs();
    public final bnvs h = new bnvs();
    public final bnvq i = new bnvq();
    private final bnvs m = new bnvs();
    public final bnvs j = new bnvs();

    public duf(dbch dbchVar, czz czzVar) {
        this.a = dbchVar;
        this.b = czzVar;
    }

    public final void a(bnvs bnvsVar) {
        dbeb l = this.a.l();
        bnvsVar.a(l.a, l.b, l.c);
    }

    public final void b(bnvs bnvsVar) {
        dbeb t = this.a.t();
        bnvsVar.a(t.a, t.b, t.c);
    }

    public final boolean c(bnvs bnvsVar, bnvs bnvsVar2, bnvs bnvsVar3, @dzsi bnvs bnvsVar4) {
        this.m.b(bnvsVar3);
        if (bnvsVar4 != null) {
            this.m.h(bnvsVar4);
        }
        this.l.b(this.m);
        this.l.l(bnvsVar);
        if (this.l.c(bnvsVar2) < 0.0f) {
            return false;
        }
        this.k.b(this.m.e(), this.m.f(), this.m.g());
        dbeb d = this.a.d(this.k);
        float f = d.a;
        if (f >= 0.0f) {
            float f2 = d.b;
            if (f2 >= 0.0f && f < this.c && f2 < this.d) {
                return true;
            }
        }
        return false;
    }
}
