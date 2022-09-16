package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
/* compiled from: PG */
/* renamed from: mol  reason: default package */
/* loaded from: classes3.dex */
final class mol extends mok {
    public mol(Context context, ajmy ajmyVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajxzVar, R.layout.reel_shelf_creation_item);
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
        if (intValue == -1 || this.d.getLayoutParams() == null) {
            return;
        }
        this.d.getLayoutParams().width = intValue;
    }
}
