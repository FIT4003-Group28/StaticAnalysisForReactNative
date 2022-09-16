package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
/* compiled from: PG */
/* renamed from: mok  reason: default package */
/* loaded from: classes3.dex */
class mok extends ajsl {
    protected final Context a;
    protected final ajmy b;
    protected final ajxz c;
    protected final View d;
    protected final ImageView e;
    protected final TextView f;

    public mok(Context context, ajmy ajmyVar, ajxz ajxzVar, int i) {
        this.a = context;
        this.b = ajmyVar;
        this.c = ajxzVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.reel_shelf_creation_button);
        this.f = (TextView) inflate.findViewById(R.id.reel_shelf_creation_title);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj).h.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajsl
    /* renamed from: f */
    public void d(ajrs ajrsVar, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        arag aragVar;
        int intValue;
        int dimensionPixelSize;
        ajxz ajxzVar = this.c;
        arhs arhsVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.d;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        this.e.setImageResource(ajxzVar.a(b));
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 8) != 0 && (intValue = ((Integer) ajrsVar.d("avatar_size", 0)).intValue()) > (dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_item_circle_channel_thumbnail_padding))) {
            int i = intValue - dimensionPixelSize;
            this.e.getLayoutParams().width = i;
            this.e.getLayoutParams().height = i;
        }
        TextView textView = this.f;
        String str = null;
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 4) != 0) {
            aragVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.f;
        aovs aovsVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) != 0) {
            aovs aovsVar2 = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        }
        textView2.setContentDescription(str);
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        this.b.e(this.e);
    }
}
