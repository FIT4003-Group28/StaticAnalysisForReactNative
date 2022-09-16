package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataRowContainerRendererOuterClass;
/* compiled from: PG */
/* renamed from: neb  reason: default package */
/* loaded from: classes3.dex */
public final class neb extends ajsl {
    private final Context a;
    private final nea b;
    private final View c;
    private final ViewGroup d;
    private final int e;

    public neb(Context context, nea neaVar) {
        this.a = context;
        this.b = neaVar;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.rich_metadata_row_space_size);
        View inflate = LayoutInflater.from(context).inflate(R.layout.rich_metadata_row, (ViewGroup) null, false);
        this.c = inflate;
        this.d = (ViewGroup) inflate.findViewById(R.id.rich_metadata_row_container);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        for (aunb aunbVar : ((atfu) obj).b) {
            if (aunbVar.qn(MetadataRowContainerRendererOuterClass.richMetadataRenderer)) {
                atft atftVar = (atft) aunbVar.qm(MetadataRowContainerRendererOuterClass.richMetadataRenderer);
                nea neaVar = this.b;
                int aG = akel.aG(atftVar.c);
                int i = aG == 0 ? 1 : aG;
                ViewGroup viewGroup = this.d;
                Context context = (Context) ((axov) neaVar.a).a;
                context.getClass();
                ajmy ajmyVar = (ajmy) neaVar.b.get();
                ajmyVar.getClass();
                ajxz ajxzVar = (ajxz) neaVar.c.get();
                ajxzVar.getClass();
                aafo aafoVar = (aafo) neaVar.d.get();
                aafoVar.getClass();
                ftb ftbVar = (ftb) neaVar.e.get();
                ftbVar.getClass();
                viewGroup.getClass();
                ndz ndzVar = new ndz(context, ajmyVar, ajxzVar, aafoVar, ftbVar, i, viewGroup);
                ndzVar.oK(ajrsVar, atftVar);
                if (this.d.getChildCount() > 0) {
                    ViewGroup viewGroup2 = this.d;
                    Space space = new Space(this.a);
                    int i2 = this.e;
                    space.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
                    viewGroup2.addView(space);
                }
                this.d.addView(ndzVar.a);
            }
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        atfu atfuVar = (atfu) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.removeAllViews();
    }
}
