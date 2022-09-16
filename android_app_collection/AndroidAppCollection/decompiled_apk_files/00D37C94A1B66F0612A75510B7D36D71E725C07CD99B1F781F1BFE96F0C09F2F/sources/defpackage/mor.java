package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mor  reason: default package */
/* loaded from: classes3.dex */
public final class mor extends mok {
    public final View g;
    public final ImageView h;
    public final int i;
    public View.OnLayoutChangeListener j;
    private final View k;

    public mor(Context context, ajmy ajmyVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajxzVar, R.layout.reel_shelf_thumbnail_creation_item);
        this.k = this.d.findViewById(R.id.reel_item_portrait_container);
        this.g = this.d.findViewById(R.id.avatar_gradient);
        this.h = (ImageView) this.d.findViewById(R.id.creator_avatar);
        this.i = zhn.d(context, R.attr.ytBrandBackgroundSolid);
    }

    @Override // defpackage.mok, defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mok
    public final void f(ajrs ajrsVar, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        super.d(ajrsVar, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        int intValue = ((Integer) ajrsVar.d("width", -1)).intValue();
        if (intValue != -1) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            double d = intValue;
            Double.isNaN(d);
            layoutParams.height = (int) (d / 0.5625d);
            this.k.getLayoutParams().width = intValue;
            this.h.getLayoutParams().width = intValue;
            this.h.getLayoutParams().height = intValue;
        }
        avhn avhnVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (this.h.getWidth() != 0) {
            g(avhnVar);
        } else if (this.j != null) {
        } else {
            moq moqVar = new moq(this, avhnVar);
            this.j = moqVar;
            this.h.addOnLayoutChangeListener(moqVar);
        }
    }

    public final void g(avhn avhnVar) {
        if (this.h.getWidth() == 0) {
            return;
        }
        this.b.e(this.h);
        Uri r = akel.r(avhnVar, this.h.getWidth(), this.h.getHeight());
        mop mopVar = new mop(this);
        if (r != null) {
            this.b.l(r, mopVar);
        } else {
            mopVar.a(null, null);
        }
    }

    @Override // defpackage.mok, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        View.OnLayoutChangeListener onLayoutChangeListener = this.j;
        if (onLayoutChangeListener != null) {
            this.h.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.j = null;
        }
        this.b.e(this.h);
    }
}
