package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: jke  reason: default package */
/* loaded from: classes3.dex */
public final class jke extends ajsl {
    public final fma a;
    public ajrs b;
    private final faq c;
    private final ViewGroup d;
    private final ViewGroup e;
    private final ViewGroup f;
    private final Spinner g;
    private final jkd h;
    private final TextView i;
    private final akbm j;
    private final TextView k;

    public jke(Context context, faq faqVar, akbn akbnVar, akem akemVar) {
        this.c = faqVar;
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.client_sorting_section_header, (ViewGroup) null);
        this.d = viewGroup;
        Spinner spinner = (Spinner) from.inflate(R.layout.sort_filter, viewGroup, false);
        this.g = spinner;
        fma r = hqs.r(spinner, spinner, R.layout.sort_filter_spinner_contents, R.layout.sort_filter_item_header, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        this.a = r;
        this.h = new jkd(this);
        spinner.setAdapter((SpinnerAdapter) r);
        TextView textView = (TextView) viewGroup.findViewById(R.id.right_button);
        this.i = textView;
        this.j = akbnVar.a(textView);
        this.e = (ViewGroup) viewGroup.findViewById(R.id.left_view);
        this.f = (ViewGroup) viewGroup.findViewById(R.id.right_view);
        this.k = (TextView) viewGroup.findViewById(R.id.header_title);
        akemVar.b(spinner, akemVar.a(spinner, null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        apwx apwxVar = (apwx) obj;
        this.b = ajrsVar;
        fma fmaVar = this.a;
        apoj apojVar = null;
        if ((apwxVar.b & 1) != 0) {
            aragVar = apwxVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        fmaVar.b = ajgl.b(aragVar);
        TextView textView = this.k;
        arag aragVar2 = apwxVar.g;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar2));
        this.e.removeView(this.g);
        this.f.removeView(this.g);
        if (this.k.getVisibility() == 0) {
            this.f.addView(this.g);
        } else {
            this.e.addView(this.g);
        }
        this.g.setOnItemSelectedListener(null);
        fma fmaVar2 = this.a;
        aopu<apwv> aopuVar = apwxVar.d;
        ArrayList arrayList = new ArrayList();
        for (apwv apwvVar : aopuVar) {
            arrayList.add(new jkc(apwvVar));
        }
        fmaVar2.a(arrayList);
        int i = 0;
        while (true) {
            if (i >= apwxVar.d.size()) {
                i = 0;
                break;
            } else if (((apwv) apwxVar.d.get(i)).d) {
                break;
            } else {
                i++;
            }
        }
        this.h.a = i;
        this.g.setSelection(i, false);
        this.g.setOnItemSelectedListener(this.h);
        acti actiVar = ajrsVar.a;
        if (apwxVar.f.size() != 0) {
            Iterator it = apwxVar.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                apok apokVar = (apok) it.next();
                if ((apokVar.b & 1) != 0) {
                    apojVar = apokVar.c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                }
            }
        }
        if (apojVar != null) {
            this.j.e(R.dimen.text_button_icon_padding);
            this.j.g();
            this.j.b(apojVar, actiVar);
        } else {
            this.i.setVisibility(8);
        }
        this.c.a(this);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apwx) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.c(this);
    }
}
