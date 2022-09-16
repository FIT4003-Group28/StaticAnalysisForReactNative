package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
/* compiled from: PG */
/* renamed from: mos  reason: default package */
/* loaded from: classes3.dex */
public final class mos extends ajsl {
    public final aafo a;
    private final ajxz b;
    private final gem c;
    private final ajmy d;
    private final Context e;
    private final FrameLayout f;
    private ajsl g;
    private ajsl h;
    private ajsl i;

    public mos(Context context, ajxz ajxzVar, aafo aafoVar, gem gemVar, ajmy ajmyVar) {
        this.e = context;
        this.b = ajxzVar;
        this.a = aafoVar;
        this.c = gemVar;
        this.d = ajmyVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj;
        this.f.removeAllViews();
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 8) != 0) {
            if (this.h == null) {
                this.h = new mor(this.e, this.d, this.b);
            }
            this.g = this.h;
        } else {
            if (this.i == null) {
                this.i = new mol(this.e, this.d, this.b);
            }
            this.g = this.i;
        }
        zgd.v(this.f, -2, -2);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: moj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mos mosVar = mos.this;
                ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2 = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
                aafo aafoVar = mosVar.a;
                apzg apzgVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2.c;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        this.f.addView(this.g.a());
        this.g.oK(ajrsVar, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj).h.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajsl ajslVar = this.g;
        if (ajslVar != null) {
            ajslVar.qZ(ajsaVar);
        }
        this.f.setOnClickListener(null);
    }
}
