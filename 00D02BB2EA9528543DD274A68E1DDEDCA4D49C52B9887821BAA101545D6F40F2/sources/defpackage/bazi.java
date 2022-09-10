package defpackage;
/* compiled from: PG */
/* renamed from: bazi  reason: default package */
/* loaded from: classes3.dex */
public abstract class bazi extends bbal {
    protected final wdw p;
    protected final dxio<wdy> q;
    protected final dxio<wdx> r;
    protected final btrm s;

    /* JADX INFO: Access modifiers changed from: protected */
    public bazi(gga ggaVar, bwqv bwqvVar, btrm btrmVar, ania aniaVar, batz batzVar, wdw wdwVar, dxio<wdy> dxioVar, dxio<wdx> dxioVar2) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        this.s = btrmVar;
        this.p = wdwVar;
        this.q = dxioVar;
        this.r = dxioVar2;
    }

    private final void i(jhq jhqVar) {
        cjtd a;
        int i = axts.YOUR_PLACES_ITEM_OVERFLOW_MENU_HIDE_FROM_SEARCH_BOOKMARKS;
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = this.t.getString(i);
        if (A().booleanValue()) {
            a = cjtd.a(dtxu.b);
        } else {
            a = cjtd.a(dtxu.c);
        }
        jhmVar.f = a;
        jhmVar.d(new bazg(this));
        ((jhu) jhqVar).d(jhmVar.c());
    }

    private final void u(jhq jhqVar) {
        cjtd a;
        int i = axts.YOUR_PLACES_ITEM_OVERFLOW_MENU_SHOW_IN_SEARCH_BOOKMARKS;
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = this.t.getString(i);
        if (A().booleanValue()) {
            a = cjtd.a(dtxu.d);
        } else {
            a = cjtd.a(dtxu.e);
        }
        jhmVar.f = a;
        jhmVar.d(new bazh(this));
        ((jhu) jhqVar).d(jhmVar.c());
    }

    @dzsi
    protected abstract wdv v();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(jhq jhqVar) {
        wdv v;
        if (this.p.b() && (v = v()) != null) {
            if (this.q.a().b(v)) {
                i(jhqVar);
            } else {
                u(jhqVar);
            }
        }
    }

    public final void z(int i) {
        wdv v = v();
        if (v == null) {
            return;
        }
        this.r.a().a(v, i);
        this.s.b(new wdz());
    }
}
