package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mgt  reason: default package */
/* loaded from: classes3.dex */
public final class mgt extends ajsl {
    private final ajrx a;
    private final FrameLayout b;
    private final ChipCloudView c;
    private final HorizontalScrollView d;
    private final mgs e;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ajsa] */
    public mgt(Context context, gem gemVar, ajyi ajyiVar) {
        this.a = gemVar;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_side_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.cloud_chip_bottom_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.cloud_chip_margin);
        ChipCloudView chipCloudView = new ChipCloudView(context);
        this.c = chipCloudView;
        chipCloudView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        chipCloudView.a(dimensionPixelSize3, dimensionPixelSize3);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.d = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.e = new mgs(context, ajyiVar.get());
        gemVar.c(frameLayout);
        gemVar.b(false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.a).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apvg apvgVar;
        apvj apvjVar = (apvj) obj;
        this.b.removeAllViews();
        this.d.removeAllViews();
        this.c.removeAllViews();
        if (apvjVar.e) {
            this.c.b(1);
            this.d.addView(this.c);
            this.b.addView(this.d);
        } else {
            this.b.addView(this.c);
            this.c.b(apvjVar.c);
        }
        for (apvk apvkVar : apvjVar.b) {
            if (apvkVar.b == 91394224) {
                mgs mgsVar = this.e;
                ajrs d = mgsVar.d(ajrsVar);
                if (apvkVar.b == 91394224) {
                    apvgVar = (apvg) apvkVar.c;
                } else {
                    apvgVar = apvg.a;
                }
                this.c.addView(mgsVar.c(d, apvgVar));
            }
        }
        if (apvjVar.f) {
            emn.J(ajrsVar, 2);
        }
        this.a.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apvj) obj).d.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.e(this.c);
    }
}
