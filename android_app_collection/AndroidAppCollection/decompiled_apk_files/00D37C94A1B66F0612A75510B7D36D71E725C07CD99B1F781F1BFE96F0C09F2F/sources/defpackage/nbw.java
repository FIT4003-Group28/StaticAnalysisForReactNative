package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nbw  reason: default package */
/* loaded from: classes3.dex */
public final class nbw {
    public final mxk a;
    public final nck b;
    public final nan c;
    public final mxl d;
    public final View e;
    public final View f;
    public final View g;
    public acti h;
    private final mvo i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final View q;
    private final View r;
    private final View s;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbw(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, View view, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_wide_form, (ViewGroup) null, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.j = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.k = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.l = findViewById3;
        this.f = findViewById2.findViewById(R.id.content_metadata_grid_layout);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.m = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.g = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.p = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.q = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.r = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.s = findViewById9;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, view, findViewById9, null, null, new View.OnClickListener() { // from class: nbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                nbw.this.d.a();
            }
        }, new ncg() { // from class: nbu
            @Override // defpackage.ncg
            public final void a(boolean z) {
                nbw.this.c.f(!z);
            }
        }, new ncj() { // from class: nbv
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nan nanVar = nbw.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nanVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new nan(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, true, fjnVar, akemVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nbt
            @Override // defpackage.mvn
            public final void a() {
                nbw.this.d.b();
            }
        });
        this.i = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
