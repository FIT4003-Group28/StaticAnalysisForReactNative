package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnifiedSharePanelRendererOuterClass;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: akow  reason: default package */
/* loaded from: classes.dex */
public final class akow implements ajru {
    public final aafo a;
    private final View b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final Context f;
    private final int g;

    public akow(Context context, aafo aafoVar) {
        View inflate = View.inflate(context, R.layout.share_panel_title_v15, null);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.c = (LinearLayout) inflate.findViewById(R.id.share_panel_title_layout);
        this.e = (TextView) inflate.findViewById(R.id.add_contacts_button);
        this.a = aafoVar;
        this.f = context;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_title_padding);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        final avnk avnkVar = (avnk) obj;
        TextView textView = this.d;
        arag aragVar2 = null;
        if ((avnkVar.b & 1) != 0) {
            aragVar = avnkVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.e;
        if ((avnkVar.b & 2) != 0 && (aragVar2 = avnkVar.d) == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, aafv.a(aragVar2, this.a, false));
        this.e.setOnClickListener(new View.OnClickListener() { // from class: akou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                akow akowVar = akow.this;
                avnk avnkVar2 = avnkVar;
                if (!zdg.e(view.getContext())) {
                    return;
                }
                arag aragVar3 = avnkVar2.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                Iterator it = aragVar3.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        apzgVar = null;
                        break;
                    }
                    arai araiVar = (arai) it.next();
                    if ((araiVar.b & 512) != 0) {
                        apzgVar = araiVar.m;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    }
                }
                if (apzgVar == null) {
                    return;
                }
                akowVar.a.c(apzgVar, null);
            }
        });
        this.e.setMovementMethod(LinkMovementMethod.getInstance());
        this.e.setHighlightColor(0);
        if ((avnkVar.b & 16) != 0) {
            this.c.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            layoutParams.width = -2;
            this.d.setLayoutParams(layoutParams);
            akoy a = new akox(this.f).a();
            this.c.addView(a.a);
            aunb aunbVar = avnkVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            a.d((avnl) aunbVar.qm(UnifiedSharePanelRendererOuterClass.shareStartTimeWithContextRenderer));
        }
        View view = this.b;
        int i = this.g;
        view.setPadding(i, i, i, i);
        akpk.g(this.b);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.setVisibility(8);
    }
}
