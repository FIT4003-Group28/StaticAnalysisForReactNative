package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: addu  reason: default package */
/* loaded from: classes.dex */
public final class addu {
    private long A;
    private ConnectivityManager B;
    private bhc C;
    public final dp a;
    public final azqb b;
    public final bgo c;
    public final adgc d;
    public final acti e;
    public final adfa f;
    public acti g;
    public Context h;
    public ScrollView i;
    public TextView j;
    public LinearLayout k;
    public List l;
    public View.OnClickListener m;
    public View n;
    public TextView o;
    public TextView p;
    public View q;
    public View r;
    public View s;
    public BroadcastReceiver t;
    boolean u;
    public Handler v;
    private final adeo x;
    private final adnq y;
    private final snc z;
    private final Runnable D = new Runnable() { // from class: addq
        @Override // java.lang.Runnable
        public final void run() {
            addu.this.c();
        }
    };
    public final kt w = new addr(this);

    public addu(dp dpVar, azqb azqbVar, bgo bgoVar, adgc adgcVar, adeo adeoVar, adnq adnqVar, snc sncVar, acti actiVar, adfa adfaVar) {
        this.a = dpVar;
        this.b = azqbVar;
        this.c = bgoVar;
        this.d = adgcVar;
        this.x = adeoVar;
        this.y = adnqVar;
        this.z = sncVar;
        this.e = actiVar;
        this.f = adfaVar;
    }

    private final void e(boolean z) {
        int orElse;
        int i = 0;
        if (z) {
            orElse = zhn.j(this.h, R.attr.ytThemedBlue).orElse(0);
        } else {
            orElse = zhn.j(this.h, R.attr.ytStaticBrandRed).orElse(0);
        }
        this.j.setBackgroundColor(orElse);
        this.k.setVisibility(true != z ? 8 : 0);
        View view = this.n;
        if (true == z) {
            i = 8;
        }
        view.setVisibility(i);
        this.o.setVisibility(i);
        this.p.setVisibility(i);
    }

    public final void a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.mJ().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a.mJ(), (int) R.string.mdx_pref_pair_with_tv_no_browser_to_show_help_page, 1).show();
        }
    }

    public final void b(bhc bhcVar) {
        this.d.W(bhcVar);
        this.i.fullScroll(33);
    }

    public final void c() {
        bhc bhcVar;
        View inflate;
        addt addtVar;
        acup b;
        long c = this.z.c();
        long j = c - this.A;
        if (j < 300) {
            this.v.removeCallbacks(this.D);
            this.v.postDelayed(this.D, 300 - j);
            return;
        }
        this.A = c;
        List a = this.x.a();
        int size = a.size();
        while (true) {
            size--;
            if (size < 0) {
                bhcVar = null;
                break;
            } else if (((bhc) a.get(size)).m()) {
                bhcVar = (bhc) a.remove(size);
                break;
            }
        }
        Collections.sort(a, utr.j);
        boolean z = false;
        if (bhcVar != null) {
            a.add(0, bhcVar);
        }
        Resources resources = this.j.getResources();
        if (!a.isEmpty()) {
            e(true);
            if (bhcVar != null) {
                this.j.setText(Html.fromHtml(resources.getString(R.string.mdx_pref_pair_with_tv_header_connected, bhcVar.d)));
                if (!akzj.f(this.C, bhcVar)) {
                    zdg.c(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_connected_content_description, bhcVar.d));
                }
            } else {
                this.j.setText(R.string.mdx_pref_pair_with_tv_header_normal);
                bhc bhcVar2 = this.C;
                if (bhcVar2 != null) {
                    zdg.c(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_disconnected_content_description, bhcVar2.d));
                }
            }
        } else if (!this.u) {
            e(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_no_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_summary);
            this.p.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_button);
            this.g.n(new acte(acuo.b(27851)));
        } else {
            e(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_with_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_summary);
            this.p.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_button);
            this.g.n(new acte(acuo.b(27852)));
        }
        boolean isEmpty = this.y.e().isEmpty();
        boolean z2 = !isEmpty;
        int i = true != isEmpty ? 0 : 8;
        this.r.setVisibility(i);
        this.s.setVisibility(i);
        if (z2) {
            this.g.n(new acte(acuo.b(27853)));
        }
        this.q.setVisibility(bhcVar == null ? 0 : 8);
        if (bhcVar == null) {
            this.g.n(new acte(acuo.b(27849)));
        }
        this.C = bhcVar;
        int childCount = this.k.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            this.l.add(this.k.getChildAt(childCount));
        }
        this.k.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.h);
        int i2 = 0;
        while (i2 < a.size()) {
            if (!this.l.isEmpty()) {
                List list = this.l;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                inflate = (View) list.remove(i3);
                addtVar = (addt) inflate.getTag();
            } else {
                inflate = from.inflate(R.layout.mdx_pair_with_tv_row, this.k, z);
                addtVar = new addt(inflate, this.m);
                inflate.setTag(addtVar);
            }
            bhc bhcVar3 = (bhc) a.get(i2);
            acti actiVar = this.g;
            bhc bhcVar4 = this.C;
            addtVar.b.setText(bhcVar3.d);
            boolean m = bhcVar3.m();
            int i5 = bhcVar3.h;
            Resources resources2 = addtVar.a.getResources();
            zgd.t(addtVar.a, zgd.h(resources2.getDimensionPixelSize(m ? R.dimen.mdx_pair_with_tv_row_height_selected : R.dimen.mdx_pair_with_tv_row_height_unselected)), ViewGroup.LayoutParams.class);
            addtVar.c.setVisibility(true != m ? 8 : 0);
            if (m) {
                b = acuo.b(27848);
            } else {
                b = acuo.b(27847);
            }
            actiVar.n(new acte(b));
            addtVar.d.setContentDescription(resources2.getString(true != m ? R.string.mdx_pref_pair_with_tv_link_button_content_description : R.string.mdx_pref_pair_with_tv_unlink_button_content_description));
            addtVar.d.setTag(bhcVar3);
            if (m) {
                addtVar.d.setText(R.string.mdx_pref_pair_with_tv_unlink_button);
            } else {
                addtVar.d.setText(R.string.mdx_pref_pair_with_tv_link_button);
            }
            addtVar.d.setVisibility(true != ((!m && bhcVar4 != null) || i5 == 1) ? 0 : 8);
            addtVar.e.setVisibility(i5 != 1 ? 8 : 0);
            this.k.addView(inflate);
            i2++;
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        if (this.B == null) {
            this.B = (ConnectivityManager) this.h.getSystemService("connectivity");
        }
        NetworkInfo activeNetworkInfo = this.B.getActiveNetworkInfo();
        boolean z = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1) {
            z = false;
        }
        this.u = z;
    }
}
