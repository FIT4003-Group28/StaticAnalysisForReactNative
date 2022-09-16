package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: jsy  reason: default package */
/* loaded from: classes3.dex */
public final class jsy extends ajzq implements jjh {
    public final jji a;
    private final RecyclerView b;
    private final fbu c;
    private Parcelable d;

    public jsy(ajsg ajsgVar, ajyx ajyxVar, jna jnaVar, yni yniVar, yzj yzjVar, ajsi ajsiVar, akar akarVar, aadd aaddVar, aynx aynxVar, fbu fbuVar, akam akamVar, RecyclerView recyclerView, jji jjiVar) {
        super(akam.a(akamVar), recyclerView, ajsgVar, ajyxVar, jnaVar, yniVar, akarVar.a(jnaVar, jjiVar.b), yzjVar, jjiVar.b, ajsiVar, akai.Ws, ajzs.d, aaddVar, aynxVar);
        this.b = recyclerView;
        this.a = jjiVar;
        this.c = fbuVar;
        if (akamVar instanceof jsx) {
            this.d = ((jsx) akamVar).a;
        }
    }

    @Override // defpackage.jjh
    public final jji a() {
        return this.a;
    }

    @Override // defpackage.ajwb, defpackage.akaf
    public final void c() {
        super.c();
        Parcelable parcelable = this.d;
        if (parcelable != null) {
            xw xwVar = this.b.n;
            xwVar.getClass();
            xwVar.Y(parcelable);
            this.d = null;
        }
    }

    public final void d(boolean z, String... strArr) {
        Parcelable parcelable;
        xw xwVar;
        if (z) {
            xw xwVar2 = this.b.n;
            xwVar2.getClass();
            parcelable = xwVar2.P();
        } else {
            parcelable = null;
        }
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            ajyj s = s(str);
            if (s instanceof jsv) {
                jsv jsvVar = (jsv) s;
                if (this.c.b() && str.equals("downloads_page_downloads_item_section_identifier")) {
                    jsvVar.K(false);
                }
                jsvVar.ad();
            } else {
                String valueOf = String.valueOf(str);
                zep.b(valueOf.length() != 0 ? "Item section not found or not a ContinuableController: ".concat(valueOf) : new String("Item section not found or not a ContinuableController: "));
            }
        }
        if (parcelable == null || (xwVar = this.b.n) == null) {
            return;
        }
        xwVar.Y(parcelable);
    }

    @Override // defpackage.ajwb, defpackage.akai
    public final void ll() {
        d(true, "downloads_page_downloads_item_section_identifier");
    }

    @Override // defpackage.ajwb, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        akam pn = super.pn();
        RecyclerView recyclerView = this.b;
        recyclerView.getClass();
        xw xwVar = recyclerView.n;
        xwVar.getClass();
        return new jsx(pn, xwVar.P());
    }
}
