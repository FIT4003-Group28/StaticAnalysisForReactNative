package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvp  reason: default package */
/* loaded from: classes3.dex */
public final class mvp {
    public View A;
    public Drawable B;
    public final int a;
    public final int b;
    public final int c;
    public final ViewStub d;
    public final Context e;
    public final ajmy f;
    public final aafo g;
    public final ajyc h;
    public final wwk i;
    public final tjv j;
    public final wxc k;
    public final enm l;
    public final View m;
    public final Resources n;
    public nce o;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public TextView u;
    public RatingBar v;
    public TextView w;
    public TextView x;
    public TextView y;
    public ImageView z;

    /* JADX INFO: Access modifiers changed from: protected */
    public mvp(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, View view, int i) {
        this.e = context;
        this.f = ajmyVar;
        this.g = aafoVar;
        this.h = ajycVar;
        this.i = wwkVar;
        this.j = tjvVar;
        this.k = wxcVar;
        this.l = enmVar;
        view.getClass();
        this.m = view;
        this.n = context.getResources();
        this.a = zhn.j(context, R.attr.adBlue).orElse(0);
        this.b = zhn.j(context, R.attr.adText1).orElse(0);
        this.c = zhn.j(context, R.attr.adBackground1).orElse(0);
        this.d = (ViewStub) view.findViewById(i);
    }
}
