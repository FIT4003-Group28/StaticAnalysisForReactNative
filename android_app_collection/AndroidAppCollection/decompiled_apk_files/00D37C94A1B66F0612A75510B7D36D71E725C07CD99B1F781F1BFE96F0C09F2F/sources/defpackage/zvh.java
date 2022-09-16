package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zvh  reason: default package */
/* loaded from: classes4.dex */
public final class zvh extends zva {
    public zvg ae;
    public ImageView af;
    public FrameLayout ag;
    MediaGridRecyclerView ah;
    public DeviceLocalFile ai;
    private boolean al;
    private int am;
    private boolean an;
    public Executor b;
    public zwj c;
    public int d;
    public zvo e;
    final aypf a = new aypf();
    private String ak = null;
    public List aj = amuk.q();

    private final boolean aE() {
        return this.am != 0;
    }

    public static zvh o(int i) {
        return s(i, false, false);
    }

    public static zvh s(int i, boolean z, boolean z2) {
        zvh zvhVar = new zvh();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_FILE_TYPE", i);
        bundle.putString("ARG_DIRECTORY_PATH", null);
        bundle.putBoolean("ARG_16_TO_9_RATIO", z);
        bundle.putInt("ARG_HEADER_RES", 0);
        bundle.putBoolean("ARG_USE_MEDIA_VIEW_MODEL", z2);
        zvhVar.ae(bundle);
        return zvhVar;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        if (!this.a.b) {
            this.a.qr();
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        zvo.y(this.ah);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (this.an) {
            return;
        }
        zne zneVar = new zne(mJ());
        List q = amuk.q();
        if (r()) {
            if (TextUtils.isEmpty(this.ak)) {
                q = zneVar.c(this.d);
            } else {
                q = (List) zneVar.d(this.d).get(this.ak);
            }
        }
        q(q);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        this.d = bundle2.getInt("ARG_FILE_TYPE");
        this.ak = bundle2.getString("ARG_DIRECTORY_PATH");
        this.al = bundle2.getBoolean("ARG_16_TO_9_RATIO", false);
        this.am = bundle2.getInt("ARG_HEADER_RES", 0);
        this.an = bundle2.getBoolean("ARG_USE_MEDIA_VIEW_MODEL", false);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nd zviVar;
        View inflate = layoutInflater.inflate(R.layout.media_grid_fragment, viewGroup, false);
        dt mJ = mJ();
        this.ah = (MediaGridRecyclerView) inflate.findViewById(R.id.media_grid_recycler_view);
        this.af = (ImageView) inflate.findViewById(R.id.media_grid_zero_state_grid);
        this.ag = (FrameLayout) inflate.findViewById(R.id.media_grid_zero_state);
        this.ah.setFocusableInTouchMode(false);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("layout_manager_state") : null;
        zvo zvoVar = new zvo(mJ, this.b, this.am);
        this.e = zvoVar;
        zvoVar.e = this.al;
        zvoVar.u(new zvd());
        this.ah.ad(this.e);
        if (parcelable != null) {
            this.ah.n.Y(parcelable);
        }
        if (aE()) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.ah.n;
            gridLayoutManager.g = new zvf(this, gridLayoutManager);
            this.ah.setBackgroundColor(0);
            this.ah.af(null);
        }
        MediaGridRecyclerView mediaGridRecyclerView = this.ah;
        Context rb = rb();
        if (aE()) {
            zviVar = new zuw(rb);
        } else {
            zviVar = new zvi(rb);
        }
        mediaGridRecyclerView.aC(zviVar);
        this.e.d = new zve(this);
        if (this.an) {
            this.a.d(this.c.c.R().as(new zvb(this)));
            this.a.d(this.c.a().as(new zvb(this, 1)));
        }
        return inflate;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("layout_manager_state", this.ah.n.P());
    }

    public final void p() {
        this.e.getClass();
    }

    public final void q(List list) {
        DeviceLocalFile deviceLocalFile;
        p();
        if (r() && (deviceLocalFile = this.ai) != null) {
            list.add(0, deviceLocalFile);
        }
        this.e.z(list);
        this.ag.setVisibility(8);
        this.ah.setVisibility(8);
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (aE()) {
            this.ah.setVisibility(0);
            r();
        } else if (z) {
            this.ag.setVisibility(4);
            final View view = this.O;
            if (view == null) {
                return;
            }
            view.post(new Runnable() { // from class: zvc
                @Override // java.lang.Runnable
                public final void run() {
                    zvh zvhVar = zvh.this;
                    View view2 = view;
                    if (!zvhVar.ap()) {
                        return;
                    }
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    if (width == 0 || height == 0) {
                        return;
                    }
                    int dimensionPixelSize = zvhVar.rh().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
                    int dimensionPixelSize2 = zvhVar.rh().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
                    int max = Math.max(1, width / dimensionPixelSize);
                    int i = width / max;
                    int max2 = Math.max(1, height / i);
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    TextView textView = (TextView) view2.findViewById(R.id.media_grid_zero_state_grid_text_primary);
                    TextView textView2 = (TextView) view2.findViewById(R.id.media_grid_zero_state_grid_text_secondary);
                    Paint paint = new Paint();
                    paint.setColor(ake.d(zvhVar.rb(), R.color.gallery_thumb_zero_state_grid_divider_color));
                    paint.setStyle(Paint.Style.FILL);
                    paint.setStrokeWidth(dimensionPixelSize2);
                    int i2 = 1;
                    while (i2 < max) {
                        float f = i2 * i;
                        Paint paint2 = paint;
                        canvas.drawLine(f, 0.0f, f, height, paint2);
                        i2++;
                        textView2 = textView2;
                        canvas = canvas;
                        paint = paint2;
                        textView = textView;
                    }
                    Paint paint3 = paint;
                    TextView textView3 = textView2;
                    TextView textView4 = textView;
                    Canvas canvas2 = canvas;
                    int i3 = dimensionPixelSize2 / 2;
                    for (int i4 = 0; i4 <= max2; i4++) {
                        float f2 = (i4 * i) + i3;
                        canvas2.drawLine(0.0f, f2, width, f2, paint3);
                    }
                    zvhVar.af.setImageBitmap(createBitmap);
                    int i5 = zvhVar.d;
                    if (i5 == 0) {
                        textView4.setText(zvhVar.rh().getText(R.string.gallery_thumb_zero_state_text_primary));
                        textView3.setText(zvhVar.rh().getText(R.string.gallery_thumb_zero_state_text_secondary));
                    } else if (i5 == 3) {
                        textView4.setText(zvhVar.rh().getText(R.string.gallery_thumb_videos_images_zero_state_text_primary));
                        textView3.setText(zvhVar.rh().getText(R.string.gallery_thumb_videos_images_zero_state_text_secondary));
                    } else {
                        textView4.setText(zvhVar.rh().getText(R.string.gallery_thumb_images_zero_state_text_primary));
                        textView3.setText(zvhVar.rh().getText(R.string.gallery_thumb_images_zero_state_text_secondary));
                    }
                    View findViewById = view2.findViewById(R.id.media_grid_zero_state_grid_text_container);
                    zgd.t(findViewById, zgd.p(((i3 + ((max2 > 2 ? 1 : 0) * i)) + (i / 2)) - (findViewById.getHeight() / 2)), ViewGroup.MarginLayoutParams.class);
                    zvhVar.ag.setVisibility(0);
                }
            });
        } else {
            this.ah.setVisibility(0);
        }
    }

    final boolean r() {
        return zwn.e(mJ(), 0);
    }
}
