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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kws  reason: default package */
/* loaded from: classes3.dex */
public final class kws extends BaseAdapter implements akgr, kuk {
    public final ajmy a;
    public final Resources b;
    public final Context c;
    public final aadd d;
    public Typeface f;
    public kvm g;
    public final aacz h;
    private final LayoutInflater k;
    private boolean l;
    private Typeface m;
    private final aafo n;
    private acvg o;
    public int e = 0;
    private final ArrayList i = new ArrayList();
    private final SparseIntArray j = new SparseIntArray();

    public kws(Context context, aacz aaczVar, aadd aaddVar, aafo aafoVar, ajmy ajmyVar) {
        this.k = LayoutInflater.from(context);
        this.b = context.getResources();
        this.c = context;
        this.h = aaczVar;
        this.d = aaddVar;
        this.n = aafoVar;
        this.a = ajmyVar;
    }

    private final void d(String str) {
        acvg acvgVar = this.o;
        if (acvgVar == null || !this.l) {
            return;
        }
        acvgVar.c(str);
    }

    @Override // defpackage.kuk
    public final int a(int i) {
        if (i < 0 || i >= this.j.size()) {
            return -1;
        }
        return this.j.get(i);
    }

    public final Typeface b(TextView textView) {
        if (this.m == null) {
            this.m = textView.getTypeface();
        }
        return this.m;
    }

    @Override // defpackage.kuk
    public final List e() {
        ArrayList arrayList = new ArrayList(getCount());
        for (int i = 0; i < getCount(); i++) {
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
        this.j.clear();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            akhl akhlVar = (akhl) it.next();
            int i3 = akhlVar.f;
            if (i3 != i) {
                if (i3 != 0 && i != 0) {
                    this.j.put(this.i.size(), i2);
                    this.i.add(new lbp(this.b.getDimension(R.dimen.suggestion_category_divider_height)));
                }
                if (i3 != 0 && (str = akhlVar.g) != null && !str.isEmpty()) {
                    this.j.put(this.i.size(), i2);
                    this.i.add(new lbo(akhlVar.g));
                }
                i = i3;
            }
            this.j.put(this.i.size(), i2);
            this.i.add(akhlVar);
            i2++;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter, defpackage.kuk
    public final int getCount() {
        return this.i.size();
    }

    @Override // android.widget.Adapter, defpackage.kuk
    public final Object getItem(int i) {
        return this.i.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof akhl) {
            return 0;
        }
        if (item instanceof lbo) {
            return 2;
        }
        return item instanceof lbp ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [ampq] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        d("ss_rds");
        Object item = getItem(i);
        if (item instanceof akhl) {
            akhl akhlVar = (akhl) item;
            if (view == null) {
                view2 = this.k.inflate(R.layout.search_suggestion_entry, viewGroup, false);
                view2.setPaddingRelative(0, 0, 0, 0);
            } else {
                view2 = view;
            }
            kwr kwrVar = (kwr) view2.getTag(R.id.search_suggestions_tag);
            if (kwrVar == null) {
                kwrVar = new kwr(this, view2);
                kwrVar.c.setOnClickListener(new kwo(this, kwrVar));
                view2.setTag(R.id.search_suggestions_tag, kwrVar);
            }
            kwrVar.f = akhlVar;
            Spanned spanned = akhlVar.h;
            int i2 = 1;
            if (spanned != null) {
                SpannableString spannableString = new SpannableString(akhlVar.a);
                StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
                int length = styleSpanArr.length;
                int i3 = 0;
                while (i3 < length) {
                    StyleSpan styleSpan = styleSpanArr[i3];
                    if (styleSpan.getStyle() == i2) {
                        kws kwsVar = kwrVar.g;
                        if (kwsVar.f == null) {
                            kwsVar.f = Typeface.create("sans-serif-medium", 0);
                        }
                        kws kwsVar2 = kwrVar.g;
                        if (kwsVar2.f == null) {
                            kwsVar2.f = Typeface.create("sans-serif-medium", 0);
                        }
                        spannableString.setSpan(new ajgg(kwsVar2.f), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                        kws kwsVar3 = kwrVar.g;
                        int i4 = kwsVar3.e;
                        if (i4 == 0) {
                            i4 = zhn.j(kwsVar3.c, R.attr.ytTextPrimary).orElse(0);
                            kwsVar3.e = i4;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i4), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                    }
                    i3++;
                    i2 = 1;
                }
                kwrVar.b.setText(spannableString);
            } else {
                kwrVar.b.setText(akhlVar.a);
            }
            kwrVar.c.setContentDescription(kwrVar.g.b.getString(R.string.accessibility_search_edit_suggestion, akhlVar.a));
            if (akhlVar.c()) {
                asxp asxpVar = kwrVar.g.d.a().e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                if (asxpVar.aq.equals("trending")) {
                    kwrVar.a.setImageResource(2131233380);
                    kwrVar.a.setTag(2131233380);
                } else {
                    kwrVar.a.setImageResource(2131233469);
                    kwrVar.a.setTag(2131233469);
                }
                kwrVar.a.setVisibility(0);
            } else if (akhlVar.b()) {
                kwrVar.a.setImageResource(2131233323);
                kwrVar.a.setVisibility(0);
            } else if (akhlVar.a()) {
                kwrVar.a.setVisibility(4);
                kwrVar.a.setImageResource(0);
            } else {
                kwrVar.a.setImageResource(2131233469);
                kwrVar.a.setTag(2131233469);
                kwrVar.a.setVisibility(0);
            }
            int i5 = akhlVar.j;
            int i6 = 12;
            if (i5 == 1) {
                kwrVar.d.setVisibility(8);
                kwrVar.c.setVisibility(0);
                kwrVar.e.setMinimumHeight(zew.i(kwrVar.g.b.getDisplayMetrics(), 48));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) kwrVar.a.getLayoutParams();
                layoutParams.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 48);
                layoutParams.height = -1;
                layoutParams.setMarginStart(zew.i(kwrVar.g.b.getDisplayMetrics(), 4));
                kwrVar.a.setLayoutParams(layoutParams);
                kw.h(kwrVar.a, zhn.f(kwrVar.g.c, R.attr.ytTextPrimary));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) kwrVar.d.getLayoutParams();
                layoutParams2.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 56);
                layoutParams2.height = zew.i(kwrVar.g.b.getDisplayMetrics(), 32);
                layoutParams2.setMarginEnd(zew.i(kwrVar.g.b.getDisplayMetrics(), 0));
                kwrVar.d.setLayoutParams(layoutParams2);
            } else if (i5 == 2) {
                int n = eog.n(kwrVar.g.d);
                if (n == 2) {
                    kwrVar.a.setVisibility(0);
                    kwrVar.e.setMinimumHeight(zew.i(kwrVar.g.b.getDisplayMetrics(), 48));
                    kwrVar.c.setVisibility(0);
                    kwrVar.d.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) kwrVar.a.getLayoutParams();
                    layoutParams3.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 56);
                    layoutParams3.height = zew.i(kwrVar.g.b.getDisplayMetrics(), 32);
                    layoutParams3.setMarginStart(zew.i(kwrVar.g.b.getDisplayMetrics(), 12));
                    kwrVar.a.setLayoutParams(layoutParams3);
                    kw.h(kwrVar.a, null);
                } else if (n == 3) {
                    kwrVar.a.setVisibility(0);
                    kwrVar.e.setMinimumHeight(zew.i(kwrVar.g.b.getDisplayMetrics(), 48));
                    kwrVar.c.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) kwrVar.d.getLayoutParams();
                    layoutParams4.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 56);
                    layoutParams4.height = zew.i(kwrVar.g.b.getDisplayMetrics(), 32);
                    layoutParams4.setMarginEnd(zew.i(kwrVar.g.b.getDisplayMetrics(), 12));
                    kwrVar.d.setLayoutParams(layoutParams4);
                    kw.h(kwrVar.a, zhn.f(kwrVar.g.c, R.attr.ytTextPrimary));
                } else if (n == 4) {
                    kwrVar.a.setVisibility(0);
                    kwrVar.e.setMinimumHeight(zew.i(kwrVar.g.b.getDisplayMetrics(), 52));
                    kwrVar.c.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) kwrVar.d.getLayoutParams();
                    layoutParams5.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 64);
                    layoutParams5.height = zew.i(kwrVar.g.b.getDisplayMetrics(), 36);
                    kwrVar.d.setLayoutParams(layoutParams5);
                    kw.h(kwrVar.a, zhn.f(kwrVar.g.c, R.attr.ytTextPrimary));
                } else {
                    kwrVar.a.setVisibility(0);
                    kwrVar.e.setMinimumHeight(zew.i(kwrVar.g.b.getDisplayMetrics(), 48));
                    kwrVar.c.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) kwrVar.d.getLayoutParams();
                    layoutParams6.width = zew.i(kwrVar.g.b.getDisplayMetrics(), 56);
                    layoutParams6.height = zew.i(kwrVar.g.b.getDisplayMetrics(), 32);
                    kwrVar.d.setLayoutParams(layoutParams6);
                    kw.h(kwrVar.a, zhn.f(kwrVar.g.c, R.attr.ytTextPrimary));
                }
                if (!akhlVar.i.isEmpty()) {
                    int i7 = zew.i(kwrVar.g.b.getDisplayMetrics(), 44);
                    amon amonVar = amon.a;
                    Iterator it = akhlVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        akhk akhkVar = (akhk) it.next();
                        ?? r11 = akhkVar.a;
                        if (i7 < akhkVar.b) {
                            amonVar = r11;
                            break;
                        }
                        amonVar = r11;
                    }
                    if (amonVar.h()) {
                        if (n == 2) {
                            kwrVar.a.setVisibility(0);
                            kwrVar.a.setImageDrawable(null);
                            kwrVar.g.a.g(kwrVar.a, Uri.parse((String) amonVar.c()));
                        } else {
                            kwrVar.d.setVisibility(0);
                            kwrVar.d.setImageDrawable(null);
                            kwrVar.g.a.g(kwrVar.d, Uri.parse((String) amonVar.c()));
                        }
                    } else if (n == 2) {
                        kwrVar.a.setImageDrawable(null);
                        kwrVar.a.setVisibility(4);
                    } else {
                        kwrVar.d.setImageDrawable(null);
                        kwrVar.d.setVisibility(4);
                    }
                } else if (n == 2) {
                    kwrVar.a.setImageDrawable(null);
                    kwrVar.a.setVisibility(4);
                } else {
                    kwrVar.d.setImageDrawable(null);
                    kwrVar.d.setVisibility(4);
                }
            }
            kws kwsVar4 = kwrVar.g;
            TextView textView = kwrVar.b;
            if (true != eog.aR(kwsVar4.h)) {
                i6 = 20;
            }
            textView.setPaddingRelative(zew.i(kwsVar4.b.getDisplayMetrics(), i6), 0, zew.i(kwsVar4.b.getDisplayMetrics(), 0), 0);
            kws kwsVar5 = kwrVar.g;
            TextView textView2 = kwrVar.b;
            int m = zew.m(kwsVar5.c);
            if (m == 3 || m == 4) {
                textView2.setTypeface(kwsVar5.b(textView2));
                textView2.setTextColor(zhn.j(kwsVar5.c, R.attr.ytTextPrimary).orElse(0));
                textView2.setTextSize(2, 20.0f);
            } else {
                textView2.setTypeface(kwsVar5.b(textView2));
                textView2.setTextColor(zhn.j(kwsVar5.c, R.attr.ytTextPrimary).orElse(0));
                textView2.setTextSize(2, 16.0f);
            }
        } else if (item instanceof lbo) {
            lbo lboVar = (lbo) item;
            view2 = view == null ? this.k.inflate(R.layout.search_suggestion_category, viewGroup, false) : view;
            kwq kwqVar = (kwq) view2.getTag(R.id.search_category_tag);
            if (kwqVar == null) {
                kwqVar = new kwq(view2, this.n, this.d);
                view2.setTag(R.id.search_category_tag, kwqVar);
            }
            kwqVar.a.setText(lboVar.a);
        } else if (item instanceof lbp) {
            lbp lbpVar = (lbp) item;
            view2 = view == null ? this.k.inflate(R.layout.search_suggestion_divider, viewGroup, false) : view;
            ((ImageView) view2.findViewById(R.id.divider)).getLayoutParams().height = Math.round(lbpVar.a);
        } else {
            view2 = null;
        }
        d("ss_rdf");
        this.o = null;
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // defpackage.kuk
    public final void h() {
        this.i.clear();
        this.j.clear();
        notifyDataSetChanged();
    }

    @Override // defpackage.kuk
    public final void i(Object obj) {
        this.i.remove(obj);
        this.j.clear();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) instanceof akhl) {
                this.j.put(i, i2);
                i++;
                i2++;
            } else {
                this.j.put(i, i2);
                i++;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        Object item = getItem(i);
        return !(item instanceof lbo) && !(item instanceof lbp);
    }

    @Override // defpackage.akgr
    public final void j(acvg acvgVar) {
        this.o = acvgVar;
    }

    @Override // defpackage.kuk
    public final void k(boolean z) {
        this.l = z;
    }

    @Override // defpackage.akgr
    public final acvg oj() {
        return this.o;
    }
}
