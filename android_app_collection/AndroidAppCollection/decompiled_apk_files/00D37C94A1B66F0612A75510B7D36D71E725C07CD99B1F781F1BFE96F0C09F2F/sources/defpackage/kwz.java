package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kwz  reason: default package */
/* loaded from: classes3.dex */
public final class kwz extends xo implements akgr, kuk {
    public final ajmy d;
    public final Resources e;
    public final Context f;
    public final aadd g;
    public Typeface i;
    public final aacz j;
    public kvu k;
    private final LayoutInflater n;
    private boolean o;
    private Typeface p;
    private final aafo q;
    private acvg r;
    public int h = 0;
    private final ArrayList l = new ArrayList();
    private final SparseIntArray m = new SparseIntArray();

    public kwz(Context context, aacz aaczVar, aadd aaddVar, aafo aafoVar, ajmy ajmyVar) {
        this.n = LayoutInflater.from(context);
        this.e = context.getResources();
        this.f = context;
        this.j = aaczVar;
        this.g = aaddVar;
        this.q = aafoVar;
        this.d = ajmyVar;
    }

    private final void x(String str) {
        acvg acvgVar = this.r;
        if (acvgVar == null || !this.o) {
            return;
        }
        acvgVar.c(str);
    }

    @Override // defpackage.kuk
    public final int a(int i) {
        if (i < 0 || i >= this.m.size()) {
            return -1;
        }
        return this.m.get(i);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.l.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        Object item = getItem(i);
        if (item instanceof akhl) {
            return 0;
        }
        if (item instanceof lbo) {
            return 2;
        }
        return item instanceof lbp ? 1 : 0;
    }

    @Override // defpackage.kuk
    public final List e() {
        ArrayList arrayList = new ArrayList(b());
        for (int i = 0; i < b(); i++) {
            Object item = getItem(i);
            if (item instanceof akhl) {
                arrayList.add((akhl) item);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kuk
    public final void g(Collection collection) {
        String str;
        this.m.clear();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            akhl akhlVar = (akhl) it.next();
            int i3 = akhlVar.f;
            if (i3 != i) {
                if (i3 != 0 && i != 0) {
                    this.m.put(this.l.size(), i2);
                    this.l.add(new lbp(this.e.getDimension(R.dimen.suggestion_category_divider_height)));
                }
                if (i3 != 0 && (str = akhlVar.g) != null && !str.isEmpty()) {
                    this.m.put(this.l.size(), i2);
                    this.l.add(new lbo(akhlVar.g));
                }
                i = i3;
            }
            this.m.put(this.l.size(), i2);
            this.l.add(akhlVar);
            i2++;
        }
        mr();
    }

    @Override // defpackage.kuk
    public final int getCount() {
        return b();
    }

    @Override // defpackage.kuk
    public final Object getItem(int i) {
        return this.l.get(i);
    }

    @Override // defpackage.kuk
    public final void h() {
        this.l.clear();
        this.m.clear();
        mr();
    }

    @Override // defpackage.kuk
    public final void i(Object obj) {
        this.l.remove(obj);
        this.m.clear();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) instanceof akhl) {
                this.m.put(i, i2);
                i++;
                i2++;
            } else {
                this.m.put(i, i2);
                i++;
            }
        }
        mr();
    }

    @Override // defpackage.akgr
    public final void j(acvg acvgVar) {
        this.r = acvgVar;
    }

    @Override // defpackage.kuk
    public final void k(boolean z) {
        this.o = z;
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [ampq] */
    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        StyleSpan[] styleSpanArr;
        x("ss_rds");
        int i2 = yoVar.f;
        if (i2 == 1) {
            ((kwv) yoVar).t.getLayoutParams().height = Math.round(((lbp) this.l.get(i)).a);
        } else if (i2 == 2) {
            ((kwu) yoVar).t.setText(((lbo) this.l.get(i)).a);
        } else {
            kwy kwyVar = (kwy) yoVar;
            akhl akhlVar = (akhl) this.l.get(i);
            kwyVar.y = akhlVar;
            Spanned spanned = akhlVar.h;
            if (spanned != null) {
                SpannableString spannableString = new SpannableString(akhlVar.a);
                for (StyleSpan styleSpan : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        kwz kwzVar = kwyVar.z;
                        if (kwzVar.i == null) {
                            kwzVar.i = Typeface.create("sans-serif-medium", 0);
                        }
                        kwz kwzVar2 = kwyVar.z;
                        if (kwzVar2.i == null) {
                            kwzVar2.i = Typeface.create("sans-serif-medium", 0);
                        }
                        spannableString.setSpan(new ajgg(kwzVar2.i), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                        kwz kwzVar3 = kwyVar.z;
                        int i3 = kwzVar3.h;
                        if (i3 == 0) {
                            i3 = zhn.j(kwzVar3.f, R.attr.ytTextPrimary).orElse(0);
                            kwzVar3.h = i3;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i3), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                    }
                }
                kwyVar.u.setText(spannableString);
            } else {
                kwyVar.u.setText(akhlVar.a);
            }
            kwyVar.v.setContentDescription(kwyVar.z.e.getString(R.string.accessibility_search_edit_suggestion, akhlVar.a));
            if (akhlVar.c()) {
                asxp asxpVar = kwyVar.z.g.a().e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                if (asxpVar.aq.equals("trending")) {
                    kwyVar.t.setImageResource(2131233380);
                    kwyVar.t.setTag(2131233380);
                } else {
                    kwyVar.t.setImageResource(2131233469);
                    kwyVar.t.setTag(2131233469);
                }
                kwyVar.t.setVisibility(0);
            } else if (akhlVar.b()) {
                kwyVar.t.setImageResource(2131233323);
                kwyVar.t.setVisibility(0);
            } else if (akhlVar.a()) {
                kwyVar.t.setVisibility(4);
                kwyVar.t.setImageResource(0);
            } else {
                kwyVar.t.setImageResource(2131233469);
                kwyVar.t.setTag(2131233469);
                kwyVar.t.setVisibility(0);
            }
            int i4 = akhlVar.j;
            int i5 = 12;
            if (i4 == 1) {
                kwyVar.w.setVisibility(8);
                kwyVar.v.setVisibility(0);
                kwyVar.x.setMinimumHeight(zew.i(kwyVar.z.e.getDisplayMetrics(), 48));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) kwyVar.t.getLayoutParams();
                layoutParams.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 48);
                layoutParams.height = -1;
                layoutParams.setMarginStart(zew.i(kwyVar.z.e.getDisplayMetrics(), 0));
                kwyVar.t.setLayoutParams(layoutParams);
                kw.h(kwyVar.t, zhn.f(kwyVar.z.f, R.attr.ytTextPrimary));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) kwyVar.w.getLayoutParams();
                layoutParams2.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 56);
                layoutParams2.height = zew.i(kwyVar.z.e.getDisplayMetrics(), 32);
                layoutParams2.setMarginEnd(zew.i(kwyVar.z.e.getDisplayMetrics(), 0));
                kwyVar.w.setLayoutParams(layoutParams2);
            } else if (i4 == 2) {
                int n = eog.n(kwyVar.z.g);
                if (n == 2) {
                    kwyVar.t.setVisibility(0);
                    kwyVar.x.setMinimumHeight(zew.i(kwyVar.z.e.getDisplayMetrics(), 48));
                    kwyVar.v.setVisibility(0);
                    kwyVar.w.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) kwyVar.t.getLayoutParams();
                    layoutParams3.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 56);
                    layoutParams3.height = zew.i(kwyVar.z.e.getDisplayMetrics(), 32);
                    layoutParams3.setMarginStart(zew.i(kwyVar.z.e.getDisplayMetrics(), 12));
                    kwyVar.t.setLayoutParams(layoutParams3);
                    kw.h(kwyVar.t, null);
                } else if (n == 3) {
                    kwyVar.t.setVisibility(0);
                    kwyVar.x.setMinimumHeight(zew.i(kwyVar.z.e.getDisplayMetrics(), 48));
                    kwyVar.v.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) kwyVar.w.getLayoutParams();
                    layoutParams4.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 56);
                    layoutParams4.height = zew.i(kwyVar.z.e.getDisplayMetrics(), 32);
                    layoutParams4.setMarginEnd(zew.i(kwyVar.z.e.getDisplayMetrics(), 12));
                    kwyVar.w.setLayoutParams(layoutParams4);
                    kw.h(kwyVar.t, zhn.f(kwyVar.z.f, R.attr.ytTextPrimary));
                } else if (n == 4) {
                    kwyVar.t.setVisibility(0);
                    kwyVar.x.setMinimumHeight(zew.i(kwyVar.z.e.getDisplayMetrics(), 52));
                    kwyVar.v.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) kwyVar.w.getLayoutParams();
                    layoutParams5.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 64);
                    layoutParams5.height = zew.i(kwyVar.z.e.getDisplayMetrics(), 36);
                    kwyVar.w.setLayoutParams(layoutParams5);
                    kw.h(kwyVar.t, zhn.f(kwyVar.z.f, R.attr.ytTextPrimary));
                } else {
                    kwyVar.t.setVisibility(0);
                    kwyVar.x.setMinimumHeight(zew.i(kwyVar.z.e.getDisplayMetrics(), 48));
                    kwyVar.v.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) kwyVar.w.getLayoutParams();
                    layoutParams6.width = zew.i(kwyVar.z.e.getDisplayMetrics(), 56);
                    layoutParams6.height = zew.i(kwyVar.z.e.getDisplayMetrics(), 32);
                    kwyVar.w.setLayoutParams(layoutParams6);
                    kw.h(kwyVar.t, zhn.f(kwyVar.z.f, R.attr.ytTextPrimary));
                }
                if (!akhlVar.i.isEmpty()) {
                    int i6 = zew.i(kwyVar.z.e.getDisplayMetrics(), 44);
                    amon amonVar = amon.a;
                    Iterator it = akhlVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        akhk akhkVar = (akhk) it.next();
                        ?? r12 = akhkVar.a;
                        if (i6 < akhkVar.b) {
                            amonVar = r12;
                            break;
                        }
                        amonVar = r12;
                    }
                    if (amonVar.h()) {
                        if (n == 2) {
                            kwyVar.t.setVisibility(0);
                            kwyVar.t.setImageDrawable(null);
                            kwyVar.z.d.g(kwyVar.t, Uri.parse((String) amonVar.c()));
                        } else {
                            kwyVar.w.setVisibility(0);
                            kwyVar.w.setImageDrawable(null);
                            kwyVar.z.d.g(kwyVar.w, Uri.parse((String) amonVar.c()));
                        }
                    } else if (n == 2) {
                        kwyVar.t.setImageDrawable(null);
                        kwyVar.t.setVisibility(4);
                    } else {
                        kwyVar.w.setImageDrawable(null);
                        kwyVar.w.setVisibility(4);
                    }
                } else if (n == 2) {
                    kwyVar.t.setImageDrawable(null);
                    kwyVar.t.setVisibility(4);
                } else {
                    kwyVar.w.setImageDrawable(null);
                    kwyVar.w.setVisibility(4);
                }
            }
            kwz kwzVar4 = kwyVar.z;
            TextView textView = kwyVar.u;
            if (true != eog.aR(kwzVar4.j)) {
                i5 = 20;
            }
            textView.setPaddingRelative(zew.i(kwzVar4.e.getDisplayMetrics(), i5), 0, zew.i(kwzVar4.e.getDisplayMetrics(), 0), 0);
            kwz kwzVar5 = kwyVar.z;
            TextView textView2 = kwyVar.u;
            int m = zew.m(kwzVar5.f);
            if (m == 3 || m == 4) {
                textView2.setTypeface(kwzVar5.w(textView2));
                textView2.setTextColor(zhn.j(kwzVar5.f, R.attr.ytTextPrimary).orElse(0));
                textView2.setTextSize(2, 20.0f);
            } else {
                textView2.setTypeface(kwzVar5.w(textView2));
                textView2.setTextColor(zhn.j(kwzVar5.f, R.attr.ytTextPrimary).orElse(0));
                textView2.setTextSize(2, 16.0f);
            }
        }
        x("ss_rdf");
        this.r = null;
    }

    @Override // defpackage.akgr
    public final acvg oj() {
        return this.r;
    }

    public final Typeface w(TextView textView) {
        if (this.p == null) {
            this.p = textView.getTypeface();
        }
        return this.p;
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        if (i != 1) {
            if (i == 2) {
                return new kwu(this.n.inflate(R.layout.search_suggestion_category, viewGroup, false), this.q, this.g);
            }
            View inflate = this.n.inflate(R.layout.search_suggestion_entry, viewGroup, false);
            inflate.setPaddingRelative(0, 0, 0, 0);
            return new kwy(this, inflate);
        }
        return new kwv(this.n.inflate(R.layout.search_suggestion_divider, viewGroup, false));
    }
}
