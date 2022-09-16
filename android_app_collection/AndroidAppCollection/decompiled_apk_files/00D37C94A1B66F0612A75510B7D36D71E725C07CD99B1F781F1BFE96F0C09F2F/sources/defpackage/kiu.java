package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kiu  reason: default package */
/* loaded from: classes3.dex */
public final class kiu {
    public final float a;
    public ViewGroup b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    public avee g;
    public final /* synthetic */ kiv h;
    public xgi i;
    private ViewGroup j;

    public kiu(kiv kivVar, Context context) {
        this.h = kivVar;
        this.a = context.getResources().getDisplayMetrics().density;
        a();
    }

    public final void a() {
        this.g = null;
        b(false);
    }

    public final void b(boolean z) {
        if (z) {
            c();
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void c() {
        if (this.b != null) {
            return;
        }
        kiv kivVar = this.h;
        kivVar.n(kivVar.i);
        ViewGroup viewGroup = (ViewGroup) ((ViewStub) this.h.c.findViewById(R.id.survey_interstitial_stub)).inflate();
        this.b = viewGroup;
        this.f = (ImageView) viewGroup.findViewById(R.id.interstitial_background);
        ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.interstitial_dialog);
        this.j = viewGroup2;
        this.c = (TextView) viewGroup2.findViewById(R.id.interstitial_text);
        this.d = (TextView) this.j.findViewById(R.id.interstitial_start_button);
        this.e = (ImageView) this.j.findViewById(R.id.interstitial_logo);
        this.d.setOnClickListener(new kit(this));
        this.b.setOnClickListener(new kit(this, 1));
        this.j.setOnClickListener(ija.d);
    }
}
