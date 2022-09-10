package defpackage;

import android.text.Editable;
import android.text.Selection;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bxqh  reason: default package */
/* loaded from: classes4.dex */
public class bxqh extends ivk {
    public final gga e;
    public final bxqg f;
    public boolean g;
    @dzsi
    public Integer h;
    @dzsi
    public Integer i;
    @dzsi
    public cjtd j;
    private final eeu k;
    private final gll l;
    private final btvo m;
    private final dzsj<glj> n;
    private final iwj o;
    private final bxqf p;
    @dzsi
    private bxqe q;
    private boolean r;
    private String s;
    private cqss t;
    private int u;
    private int v;

    public bxqh(bxqd bxqdVar, bxqg bxqgVar) {
        super(bxqdVar.a);
        this.q = null;
        this.g = true;
        this.r = true;
        this.u = 33554435;
        this.v = ImageMetadata.LENS_FILTER_DENSITY;
        gga ggaVar = bxqdVar.b;
        this.e = ggaVar;
        this.k = bxqdVar.c;
        this.l = bxqdVar.d;
        this.m = bxqdVar.e;
        this.n = bxqdVar.f;
        this.f = bxqgVar;
        QF(izr.EDIT);
        o(false);
        this.t = ibl.ax();
        this.s = ggaVar.getString(R.string.SEARCH_HINT);
        this.h = 2131231588;
        this.i = Integer.valueOf((int) R.string.NAVIGATE_UP);
        this.j = cjtd.a(dtxv.F);
        this.p = new bxqf(this);
        this.o = new iwj(new bxqb(bxqdVar), new bxqc(this));
    }

    @Override // defpackage.ivk, defpackage.izs
    public String E() {
        if (this.m.getSearchParameters().b()) {
            String a = this.m.getSearchParameters().a();
            if (!dbsj.d(a)) {
                return a;
            }
        }
        return this.s;
    }

    @Override // defpackage.ivk, defpackage.izs
    public Integer G() {
        return Integer.valueOf(this.u);
    }

    @Override // defpackage.ivk, defpackage.izs
    public Integer H() {
        return Integer.valueOf(this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivk
    public final void Ou(CharSequence charSequence) {
        cqjz<?> b;
        dbsk.a(charSequence != null);
        CharSequence b2 = bvpb.b(charSequence);
        CharSequence b3 = bvpb.b(d());
        bxqe bxqeVar = this.q;
        if (bxqeVar != null) {
            String charSequence2 = b2.toString();
            int selectionEnd = Selection.getSelectionEnd(b2);
            if (selectionEnd < 0) {
                selectionEnd = b2.length();
            }
            bxqeVar.c(charSequence2, selectionEnd);
        }
        I(b2);
        K();
        if (b2.toString().isEmpty() || b3.toString().isEmpty()) {
            MainLayout a = ((gle) this.l).a();
            if (a != null && (b = cqhu.b(a.getRootView(), hqv.c)) != null) {
                b.j();
            }
            cqkx.p(this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivk
    public final void Ov(Editable editable) {
        super.Ov(editable);
        if (((bxno[]) editable.getSpans(0, editable.length(), bxno.class)).length > 0) {
            editable.setSpan(new bxnn(), 0, editable.length(), 33);
        }
    }

    @Override // defpackage.izs
    public izi ae() {
        return this.p;
    }

    @Override // defpackage.izs
    public izh af() {
        return this.o;
    }

    public void ag(cqss cqssVar) {
        this.t = cqssVar;
    }

    public void ah(boolean z) {
        this.r = z;
    }

    public void ai(bxqe bxqeVar) {
        this.q = bxqeVar;
    }

    public void aj(String str) {
        this.s = str;
    }

    public void ak(@dzsi Integer num) {
        this.h = null;
    }

    public void al(@dzsi cjtd cjtdVar) {
        this.j = null;
    }

    public void am(boolean z) {
        this.g = false;
    }

    public void an(int i) {
        this.u = i;
    }

    public void ao(int i) {
        this.v = i;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqkl c() {
        this.n.a().a();
        return cqkl.a;
    }

    @Override // defpackage.ivk
    public void f(CharSequence charSequence) {
        dbsk.a(charSequence != null);
        String e = dbsj.e(charSequence.toString());
        bxqe bxqeVar = this.q;
        if (bxqeVar != null) {
            bxqeVar.b(e);
        }
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqkl k() {
        if (!((efh) this.k).b) {
            return cqkl.a;
        }
        cqkx.p(this);
        I("");
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqss u() {
        return this.t;
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean x() {
        return Boolean.valueOf(this.r);
    }
}
