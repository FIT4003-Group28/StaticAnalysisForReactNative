package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kaa  reason: default package */
/* loaded from: classes3.dex */
public final class kaa extends ahyf {
    public boolean a;
    public Bitmap b;
    public int c;
    public int d;
    private final int e;
    private boolean f;
    private ImageView g;

    public kaa(Context context) {
        super(context);
        this.e = context.getResources().getInteger(R.integer.fade_duration_fast);
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.youtube_invideo_programming_overlay, (ViewGroup) null);
        this.g = (ImageView) inflate.findViewById(R.id.branding_watermark);
        return inflate;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        if (aa(1)) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(1, this.c, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(1, this.d, displayMetrics);
            this.g.getLayoutParams().width = (int) applyDimension;
            this.g.getLayoutParams().height = (int) applyDimension2;
            this.g.setImageBitmap(this.b);
        }
        if (aa(2)) {
            zag.o(this.g, this.a);
        }
        this.b = null;
    }

    public final void g(boolean z) {
        if (z != this.f) {
            return;
        }
        boolean z2 = !z;
        this.f = z2;
        if (z2) {
            kT();
        } else {
            kU();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        int i = this.e;
        kS.b = i;
        kS.a = i;
        return kS;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.a && !this.f;
    }
}
