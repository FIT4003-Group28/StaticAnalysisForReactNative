package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xfz  reason: default package */
/* loaded from: classes4.dex */
public final class xfz extends ahyf implements xfk {
    public xig a;
    private final xif b;
    private final xhy c;
    private LinearLayout d;
    private ImageView e;
    private xgu f;
    private boolean g;

    public xfz(Context context) {
        super(context);
        this.b = new xif(context);
        this.c = new xhy();
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.mdx_ad_overlay, frameLayout);
        this.d = (LinearLayout) frameLayout.findViewById(R.id.ad_text_and_ad_choices_button);
        this.e = (ImageView) frameLayout.findViewById(R.id.ad_choices);
        this.d.setOnClickListener(new xfy(this));
        frameLayout.getWidth();
        return frameLayout;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ((FrameLayout) view).getWidth();
        int i = 0;
        if (aa(2)) {
            this.c.a(false);
        }
        if (aa(1)) {
            boolean z = this.f.e.b;
            if (this.g != z) {
                ImageView imageView = this.e;
                if (true != z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                this.d.setEnabled(z);
                this.g = z;
            }
            boolean mZ = mZ();
            this.b.e(this.f.f, mZ);
            this.c.e(Boolean.valueOf(this.f.b), mZ);
        }
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return xrz.q(this.f, 1);
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        this.a = xigVar;
        this.b.f = xigVar;
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        this.f = xguVar;
        if (nI()) {
            this.b.e(this.f.f, mZ());
        }
        if (!mZ()) {
            this.c.e(false, false);
            super.kT();
        } else {
            kU();
        }
        Y(1);
    }
}
