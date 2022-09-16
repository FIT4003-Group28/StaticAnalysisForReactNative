package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akpe  reason: default package */
/* loaded from: classes.dex */
public final class akpe implements ajru {
    public apzg a;
    private final ajxz b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public akpe(Context context, final akpd akpdVar, ajxz ajxzVar, final aafo aafoVar) {
        this.b = ajxzVar;
        View inflate = View.inflate(context, R.layout.sharing_option_button, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.text);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akpe akpeVar = akpe.this;
                aafo aafoVar2 = aafoVar;
                akpd akpdVar2 = akpdVar;
                apzg apzgVar = akpeVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
                ((aklo) akpdVar2).b.h();
            }
        });
        this.f = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_top_padding);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_bottom_padding);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_right_padding);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_left_padding);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_first_item_top_padding);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_last_item_bottom_padding);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arhr arhrVar;
        arag aragVar;
        apoj apojVar = (apoj) obj;
        boolean j = ajrsVar.j("isFirstItem", false);
        boolean j2 = ajrsVar.j("isLastItem", false);
        if (j) {
            this.c.setPadding(this.h, this.j, this.i, this.f);
        } else if (j2) {
            this.c.setPadding(this.h, this.g, this.i, this.k);
        } else {
            this.c.setPadding(this.h, this.g, this.i, this.f);
        }
        ajxz ajxzVar = this.b;
        if ((apojVar.b & 32) != 0) {
            arhs arhsVar = apojVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhrVar = arhr.b(arhsVar.c);
            if (arhrVar == null) {
                arhrVar = arhr.UNKNOWN;
            }
        } else {
            arhrVar = arhr.UNKNOWN;
        }
        int a = ajxzVar.a(arhrVar);
        if (a != 0) {
            this.d.setImageResource(a);
        }
        TextView textView = this.e;
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        apzg apzgVar = apojVar.p;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.a = apzgVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
