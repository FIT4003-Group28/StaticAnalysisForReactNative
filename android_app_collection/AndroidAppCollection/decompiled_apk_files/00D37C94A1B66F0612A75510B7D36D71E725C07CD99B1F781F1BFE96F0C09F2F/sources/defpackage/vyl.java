package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vyl  reason: default package */
/* loaded from: classes4.dex */
public final class vyl extends ajsl {
    public final wfg a;
    public apzg b;
    private final View c;
    private final TextView d;

    public vyl(Context context, final aafo aafoVar, wfg wfgVar) {
        this.a = wfgVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_channel_layout, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.channel);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: vyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vyl vylVar = vyl.this;
                aafo aafoVar2 = aafoVar;
                if (aafoVar2 != null) {
                    aafoVar2.c(vylVar.b, null);
                    vylVar.a.j();
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aowx aowxVar = (aowx) obj;
        TextView textView = this.d;
        if (textView != null) {
            if ((aowxVar.b & 1) != 0) {
                aragVar = aowxVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
        }
        apzg apzgVar = aowxVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.b = apzgVar;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aowx) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
