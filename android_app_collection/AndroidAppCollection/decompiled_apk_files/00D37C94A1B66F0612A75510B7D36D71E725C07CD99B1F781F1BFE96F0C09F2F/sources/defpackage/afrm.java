package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: afrm  reason: default package */
/* loaded from: classes.dex */
public final class afrm extends afrn {
    public atat a;
    public boolean ae = false;
    private RecyclerView af;
    private ImageView ag;
    private int ah;
    private int ai;
    private int aj;
    public aqsi b;
    public ajmy c;
    public nj d;
    public aafo e;

    @Override // defpackage.dp
    public final void Y() {
        avhn avhnVar;
        super.Y();
        int dimensionPixelSize = mJ().getResources().getDimensionPixelSize(R.dimen.custom_thumbnail_picker_padding);
        this.O.getClass();
        Rect rect = new Rect();
        this.O.getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        int i = this.aj;
        int i2 = (width - ((i + 1) * dimensionPixelSize)) / i;
        this.ah = i2;
        this.ai = (int) (i2 * 0.5625f);
        ViewGroup.LayoutParams layoutParams = this.af.getLayoutParams();
        int i3 = 2;
        if (this.aj != 2) {
            i3 = 1;
        }
        layoutParams.height = (this.ai * i3) + (dimensionPixelSize * (i3 + 1));
        this.af.setLayoutParams(layoutParams);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.aj, null);
        gridLayoutManager.q = true;
        this.af.ag(gridLayoutManager);
        afrs afrsVar = new afrs(mJ(), this.ag, this.c);
        atat atatVar = this.a;
        if ((atatVar.b & 512) != 0) {
            avhnVar = atatVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = avhn.a;
        }
        afrsVar.a(avhnVar);
        this.af.ad(new afrl(this, this.a));
    }

    public final void a(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = this.ah;
        layoutParams.height = this.ai;
        imageView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.edit_thumbnails_fragment, viewGroup, false);
        this.ag = (ImageView) inflate.findViewById(R.id.thumbnail_viewer);
        this.af = (RecyclerView) inflate.findViewById(R.id.thumbnail_picker);
        Rect rect = new Rect();
        inflate.getWindowVisibleDisplayFrame(rect);
        this.aj = rect.width() > mJ().getResources().getDimensionPixelSize(R.dimen.custom_thumbnail_picker_max_phone_width) ? 4 : 2;
        aunb aunbVar = this.b.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        this.a = (atat) aunbVar.qm(atau.a);
        return inflate;
    }
}
