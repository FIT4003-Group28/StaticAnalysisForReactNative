package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: miq  reason: default package */
/* loaded from: classes3.dex */
public final class miq extends ajsl implements miv {
    public final yni a;
    public arro b;
    public mip c;
    private final Context d;
    private final View e;
    private final gem f;
    private final TextView g;
    private final LayoutInflater h;
    private final ImageView i;
    private final miu j;
    private final LinearLayout k;
    private final DismissalFollowUpDialogFragmentController l;

    public miq(Context context, gem gemVar, yni yniVar, miu miuVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController) {
        this.d = context;
        this.f = gemVar;
        yniVar.getClass();
        this.a = yniVar;
        this.j = miuVar;
        this.l = dismissalFollowUpDialogFragmentController;
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        View inflate = from.inflate(R.layout.dismissal_reason_list_layout, (ViewGroup) null);
        this.e = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.k = (LinearLayout) inflate.findViewById(R.id.reasons);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.i = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                miq miqVar = miq.this;
                mip mipVar = miqVar.c;
                if (mipVar != null) {
                    ((min) mipVar).dismiss();
                    return;
                }
                arro arroVar = miqVar.b;
                if (arroVar == null) {
                    return;
                }
                miqVar.a.d(new aawj(null, arroVar));
            }
        });
        new ajyf(inflate, imageView);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arro arroVar = (arro) obj;
        ajrsVar.f("parent_renderer", arroVar);
        this.b = arroVar;
        int i = 0;
        zgd.t(this.k, zgd.r(ajrsVar.j("dismissal_follow_up_dialog", false) ? this.d.getResources().getDimensionPixelSize(R.dimen.dismissal_dialog_min_width) : -1), ViewGroup.LayoutParams.class);
        arrp[] arrpVarArr = (arrp[]) arroVar.e.toArray(new arrp[0]);
        ajrsVar.f("selection_listener", this);
        this.k.removeAllViews();
        for (arrp arrpVar : arrpVarArr) {
            miu miuVar = this.j;
            this.k.addView(miuVar.c(miuVar.d(ajrsVar), arrpVar));
        }
        TextView textView = this.g;
        if ((arroVar.b & 4) != 0) {
            aragVar = arroVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        ImageView imageView = this.i;
        if (true == zew.y(this.d)) {
            i = 8;
        }
        imageView.setVisibility(i);
        int a = aqmv.a(arroVar.f);
        if (a == 0 || a != 2) {
            elk.f(ajrsVar, zhn.d(this.d, R.attr.ytGeneralBackgroundA));
            this.g.setTextColor(zhn.d(this.d, R.attr.ytTextPrimary));
        } else {
            elk.f(ajrsVar, zhn.d(this.d, R.attr.ytBorderedButtonChipBackground));
            this.g.setTextColor(zhn.d(this.d, R.attr.ytTextSecondary));
        }
        this.f.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arro) obj).c.I();
    }

    @Override // defpackage.miv
    public final void f() {
        this.a.d(new ajym(this.b));
        atpl atplVar = this.l.a;
        if (atplVar != null) {
            this.a.d(new ajym(atplVar));
        }
        mip mipVar = this.c;
        if (mipVar != null) {
            ((min) mipVar).dismiss();
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.j.e(this.k);
    }
}
