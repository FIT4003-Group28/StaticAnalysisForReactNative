package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.libraries.messaging.lighter.ui.common.LoadingView;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import com.google.android.libraries.messaging.lighter.ui.statusbar.TextStatusBarHolderView;
import com.google.android.material.appbar.AppBarLayout;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cuzt  reason: default package */
/* loaded from: classes5.dex */
public class cuzt extends FrameLayout implements cuxo {
    public cvak a;
    public final cuwz b;
    dafk c;
    cvfr d;
    public cvfr e;
    public final TextStatusBarHolderView f;
    private final LinearLayout g;
    private final AppBarLayout h;
    private final CoordinatorLayout i;
    private final MaterialProgressBar j;
    private final ViewGroup k;
    private final LoadingView l;
    private OverlayView m;
    private final LighterWebView n;
    private cuvl o;
    private cvgi p;
    private cvbs q;
    private final int r;
    private boolean s;
    private cuuc t;
    private cuvx u;
    private String v;
    private String w;
    private final MessageListView x;
    private final TextStatusBarHolderView y;

    public cuzt(Context context) {
        this(context, null);
    }

    private final void G(int i) {
        int computeVerticalScrollRange = this.x.computeVerticalScrollRange();
        int height = (i - ((View) this.b).getHeight()) - this.r;
        if (this.f.c()) {
            height -= this.f.getHeight();
        }
        if (h()) {
            height -= this.y.getHeight();
        }
        if (height < computeVerticalScrollRange + cuwg.a(getContext(), 30.0f)) {
            this.h.setExpanded(false, true);
            this.x.setNestedScrollingEnabled(true);
            return;
        }
        this.h.setExpanded(true, true);
        this.x.setNestedScrollingEnabled(false);
    }

    private final void H() {
        od.m(this.g, 4);
    }

    private final void I() {
        od.m(this.g, 0);
    }

    @Override // defpackage.cuxo
    public final void A() {
        this.f.a(this.d);
        cvfr cvfrVar = this.e;
        if (cvfrVar != null) {
            this.f.d(cvfrVar);
        }
    }

    @Override // defpackage.cuxo
    public final MessageListView B() {
        return this.x;
    }

    @Override // defpackage.cuxo
    public final void C(cvfr cvfrVar) {
        this.y.d(cvfrVar);
    }

    @Override // defpackage.cuxo
    public final void D() {
        this.f.b();
        this.f.a(this.d);
        Context context = getContext();
        cvfn cvfnVar = new cvfn(context);
        cvfnVar.setContentText(context.getResources().getString(R.string.network_connection_error));
        this.d = cvfnVar;
        this.f.d(cvfnVar);
    }

    @Override // defpackage.cuxo
    public final void E(String str) {
        dafk n = dafk.n(findViewById(R.id.messages_list), str, -2);
        this.c = n;
        ((TextView) n.e.findViewById(R.id.snackbar_text)).setAllCaps(false);
        this.c.c();
    }

    @Override // defpackage.cuxo
    public final void F(String str, View.OnClickListener onClickListener) {
        dafk n = dafk.n(findViewById(R.id.messages_list), str, 0);
        this.c = n;
        ((TextView) n.e.findViewById(R.id.snackbar_action)).setAllCaps(false);
        dafk dafkVar = this.c;
        dafkVar.p(getContext().getText(R.string.snackbar_retry), onClickListener);
        dafkVar.q(akm.c(getContext(), R.color.snackbar_retry_color));
        dafkVar.u(akm.c(getContext(), R.color.snackbar_retry_background_color));
        this.c.e.findViewById(R.id.snackbar_action).setBackgroundColor(akm.c(getContext(), R.color.snackbar_retry_background_color));
        this.c.c();
    }

    @Override // defpackage.cuxo
    public final void a() {
        G(getHeight());
    }

    @Override // defpackage.cuxo
    public final void b() {
        cuvl cuvlVar = this.o;
        if (cuvlVar == null) {
            cuvp cuvpVar = new cuvp(getContext());
            this.o = cuvpVar;
            addView(cuvpVar, new FrameLayout.LayoutParams(-1, -1));
        } else {
            ((View) cuvlVar).setVisibility(0);
        }
        H();
    }

    @Override // defpackage.cuxo
    public final void c() {
        cuvl cuvlVar = this.o;
        if (cuvlVar != null) {
            ((View) cuvlVar).setVisibility(8);
        }
        I();
    }

    @Override // defpackage.cuxo
    public final void d() {
        cvgi cvgiVar = this.p;
        if (cvgiVar == null) {
            this.p = new cvgn(getContext());
            this.g.addView((View) this.p, new LinearLayout.LayoutParams(-1, -2));
        } else {
            ((View) cvgiVar).setVisibility(0);
        }
        ((View) this.p).requestFocus();
        ((View) this.b).setVisibility(8);
        this.k.setVisibility(8);
    }

    @Override // defpackage.cuxo
    public final void e() {
        cvgi cvgiVar = this.p;
        if (cvgiVar != null) {
            ((View) cvgiVar).setVisibility(8);
        }
        ((View) this.b).setVisibility(0);
        this.k.setVisibility(0);
    }

    @Override // defpackage.cuxo
    public final void f() {
        cvbs cvbsVar = this.q;
        if (cvbsVar == null) {
            cvbv cvbvVar = new cvbv(getContext());
            this.q = cvbvVar;
            addView(cvbvVar, new FrameLayout.LayoutParams(-1, -1));
        } else {
            ((View) cvbsVar).setVisibility(0);
        }
        H();
    }

    @Override // defpackage.cuxo
    public final void g() {
        cvbs cvbsVar = this.q;
        if (cvbsVar != null) {
            ((View) cvbsVar).setVisibility(8);
        }
        I();
    }

    @Override // defpackage.cuxo
    public final boolean h() {
        return this.y.c();
    }

    @Override // defpackage.cuxo
    public final void i(cvfr cvfrVar) {
        this.y.a(cvfrVar);
    }

    @Override // defpackage.cuxo
    public final cvak j() {
        return this.a;
    }

    @Override // defpackage.cuxo
    public final void k() {
        this.j.setVisibility(0);
    }

    @Override // defpackage.cuxo
    public final void l() {
        this.j.setVisibility(8);
    }

    @Override // defpackage.cuxo
    public final void m() {
        this.l.a();
    }

    @Override // defpackage.cuxo
    public final void n() {
        this.l.b();
    }

    @Override // defpackage.cuxo
    public final cuwz o() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        dbsg dbsgVar;
        boolean z;
        dbsg dbsgVar2 = dbpy.a;
        dbsg dbsgVar3 = dbpy.a;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.v = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD");
            this.w = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE");
            Parcelable parcelable2 = bundle.getParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW");
            z = bundle.getBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY");
            str = bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL");
            try {
                if (bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER")) {
                    dbsgVar2 = cufz.e(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER")));
                }
                if (bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")) {
                    dbsgVar3 = cugq.m(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")));
                }
            } catch (JSONException unused) {
                cstl.a("ConversationView");
            }
            dbsgVar = dbsgVar3;
            parcelable = parcelable2;
        } else {
            str = null;
            dbsgVar = dbsgVar3;
            z = false;
        }
        super.onRestoreInstanceState(parcelable);
        if (!z || str == null) {
            return;
        }
        if (dbsgVar2.a()) {
            this.n.c((cufz) dbsgVar2.b(), this.g, dbsgVar, this.t, this.m, findViewById(R.id.app_bar).getHeight() == findViewById(R.id.app_bar).getBottom(), this.u);
        } else {
            this.n.b(str, dbpy.a, this.g);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW", onSaveInstanceState);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD", this.v);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE", this.w);
        bundle.putBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY", findViewById(R.id.lighter_web_view_body).getVisibility() == 0);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL", this.n.a.getUrl());
        if (this.n.c.a()) {
            dbsg<JSONObject> d = cufz.d(this.n.c.b());
            if (d.a()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER", d.b().toString());
            }
        }
        if (this.n.d.a()) {
            dbsg<JSONObject> l = this.n.d.b().l();
            if (l.a()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER", l.b().toString());
            }
        }
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        G(i2);
    }

    @Override // defpackage.cuxo
    public final cvgi p() {
        return this.p;
    }

    @Override // defpackage.cuxo
    public final cuvl q() {
        return this.o;
    }

    @Override // defpackage.cuxo
    public final cvbs r() {
        return this.q;
    }

    @Override // defpackage.cuxo
    public final String s() {
        return this.v;
    }

    @Override // defpackage.cuxo
    public void setActionHandler(cuuc cuucVar) {
        this.t = cuucVar;
    }

    @Override // defpackage.cuxo
    public void setComposeBoxPrefillSuggestionTextMessage(String str) {
        this.w = str;
    }

    @Override // defpackage.cuxo
    public void setComposerView(View view) {
        this.k.removeAllViews();
        if (view == null) {
            this.k.setVisibility(8);
            return;
        }
        this.k.addView(view);
        this.k.setVisibility(0);
    }

    public <T extends czvg & cvak> void setHeaderView(T t) {
        if (this.s) {
            throw new RuntimeException("Custom header view must be set before creating ConversationPresenter");
        }
        int indexOfChild = this.h.indexOfChild((View) this.a);
        this.h.d(this.a);
        this.h.removeView((View) this.a);
        T t2 = t;
        this.a = t2;
        this.h.addView((View) t2, indexOfChild);
        this.h.c(this.a);
    }

    @Override // defpackage.cuxo
    public void setMessageCallbackPayload(String str) {
        this.v = str;
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cuxn cuxnVar) {
        this.s = true;
        this.k.setOnClickListener(new View.OnClickListener(cuxnVar) { // from class: cuzs
            private final cuxn a;

            {
                this.a = cuxnVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cuxn cuxnVar2 = this.a;
                view.getContext();
                cuxnVar2.e();
            }
        });
        this.u = cuxnVar.d();
    }

    @Override // defpackage.cuxo
    public final String t() {
        return this.w;
    }

    @Override // defpackage.cuxo
    public final OverlayView u() {
        return this.m;
    }

    @Override // defpackage.cuxo
    public final View v() {
        return this.g;
    }

    @Override // defpackage.cuxo
    public final View w() {
        return this.h;
    }

    @Override // defpackage.cuxo
    public final LighterWebView x() {
        return this.n;
    }

    @Override // defpackage.cuxo
    public final void y() {
        dafk dafkVar = this.c;
        if (dafkVar == null || !dafkVar.f()) {
            return;
        }
        this.c.d();
    }

    @Override // defpackage.cuxo
    public final void z(cvfp cvfpVar) {
        this.f.b();
        this.f.a(this.d);
        Context context = getContext();
        cvfw cvfwVar = new cvfw(context, null, R.attr.textStatusBarStyle, R.style.Warning);
        cvfwVar.setContentText(context.getResources().getString(R.string.connection_error));
        cvfwVar.setActionText(context.getResources().getString(R.string.retry));
        this.d = cvfwVar;
        new cvfs(this.d).a = cvfpVar;
        this.f.d(this.d);
    }

    public cuzt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cuzt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = false;
        this.t = cuud.a;
        inflate(getContext(), R.layout.conversation_view_layout, this);
        this.g = (LinearLayout) findViewById(R.id.conversation_body);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_body);
        this.i = coordinatorLayout;
        this.a = (cvak) findViewById(R.id.conversation_header);
        this.x = (MessageListView) findViewById(R.id.messages_list);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        this.h = appBarLayout;
        this.f = (TextStatusBarHolderView) findViewById(R.id.top_status_bar_holder);
        this.y = (TextStatusBarHolderView) findViewById(R.id.bottom_status_bar_holder);
        this.b = (cuwz) findViewById(R.id.compose_view);
        this.j = (MaterialProgressBar) findViewById(R.id.conversation_progress_bar);
        this.k = (ViewGroup) findViewById(R.id.composer_entrypoint_view);
        this.m = (OverlayView) findViewById(R.id.conv_overlay_view);
        this.l = (LoadingView) findViewById(R.id.conversation_loading_view);
        this.r = getResources().getDimensionPixelSize(R.dimen.header_expanded_height);
        coordinatorLayout.setOnTouchListener(cuzr.a);
        this.m.setVisibility(8);
        this.n = (LighterWebView) findViewById(R.id.lighter_web_view_body);
        appBarLayout.setExpanded(true, false);
        appBarLayout.c(this.a);
    }
}
