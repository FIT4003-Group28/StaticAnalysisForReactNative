package defpackage;

import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxyd  reason: default package */
/* loaded from: classes4.dex */
public class bxyd implements bxxo {
    public static final cqtd a = cqrt.g(2131232726, ibm.n());
    private static final Html.ImageGetter j = bxxz.a;
    public final btrm b;
    public final bxxp c;
    public final bxyt d;
    public final bxtx e;
    public final boolean f;
    public final boolean g;
    public final dxio<afha> h;
    public List<cqix<?>> i = dcdc.e();
    private final gga k;
    private final bxtu l;
    @dzsi
    private acpa m;
    private final bxeg n;

    public bxyd(boolean z, bxxp bxxpVar, gga ggaVar, btrm btrmVar, bxeg bxegVar, bxyu bxyuVar, bxzr bxzrVar, bxtu bxtuVar, bxtx bxtxVar, ania aniaVar, dxio dxioVar) {
        this.k = ggaVar;
        this.b = btrmVar;
        this.n = bxegVar;
        this.f = z;
        this.c = bxxpVar;
        this.d = bxyuVar.a(bxzrVar, bxym.INITIAL_PAGE);
        this.l = bxtuVar;
        this.e = bxtxVar;
        this.h = dxioVar;
        this.g = aniaVar.a();
    }

    @Override // defpackage.bxxo
    public dehn<Void> a(boolean z) {
        bxyc bxycVar = new bxyc(this);
        if (!this.n.a.getSuggestParameters().q) {
            deha.q(this.l.a(z), bvqj.a(bxycVar), dege.a);
        } else {
            this.l.b(bxycVar, z);
        }
        return bxycVar.a;
    }

    @Override // defpackage.bxxo
    public List<cqix<?>> b() {
        return this.i;
    }

    @Override // defpackage.bxxo
    public String c() {
        return this.k.getString(R.string.PERSONALIZED_HISTORY_TOOLTIP_HEADER);
    }

    @Override // defpackage.bxxo
    public acpa d() {
        if (this.m == null) {
            String string = this.k.getString(true != this.g ? R.string.PERSONALIZED_HISTORY_TOOLTIP_CONTENT_WAA_DISABLED : R.string.PERSONALIZED_HISTORY_TOOLTIP_CONTENT_WAA_ENABLED);
            bxya bxyaVar = new bxya(this);
            String valueOf = String.valueOf(string);
            Spanned fromHtml = Html.fromHtml(valueOf.length() != 0 ? "&#8203;".concat(valueOf) : new String("&#8203;"), j, new bxyf(bxyaVar, this.k.getResources().getColor(R.color.google_blue700)));
            this.m = new acpc(fromHtml, fromHtml, a);
        }
        return this.m;
    }
}
