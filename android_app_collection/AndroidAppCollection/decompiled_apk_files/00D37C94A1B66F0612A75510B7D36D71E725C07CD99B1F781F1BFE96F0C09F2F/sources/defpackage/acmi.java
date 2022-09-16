package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acmi  reason: default package */
/* loaded from: classes.dex */
public final class acmi implements View.OnClickListener, ajru {
    private final ajyb a;
    private final aafo b;
    private final ajxz c;
    private final ajya d;
    private final View e;
    private final TextView f;
    private final ImageView g;
    private aten h;

    public acmi(Context context, aafo aafoVar, ajxz ajxzVar, ajya ajyaVar, ajyb ajybVar) {
        this.b = aafoVar;
        ajyaVar.getClass();
        this.d = ajyaVar;
        this.c = ajxzVar;
        this.a = ajybVar;
        View inflate = View.inflate(context, R.layout.lc_input_select_spinner_dropdown_item, null);
        this.e = inflate;
        zag.l(inflate, inflate.getBackground(), 0);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        int i;
        aten atenVar = (aten) obj;
        this.f.setText(abgc.h(atenVar));
        arhs f = abgc.f(atenVar);
        if (f != null) {
            ajxz ajxzVar = this.c;
            arhr b = arhr.b(f.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        if (i != 0) {
            this.g.setImageResource(i);
            this.g.setVisibility(0);
        } else {
            this.g.setImageResource(17170445);
            this.g.setVisibility(8);
        }
        this.h = atenVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajyb ajybVar = this.a;
        if (ajybVar != null) {
            ajybVar.a();
        }
        apzg e = abgc.e(this.h);
        if (e != null) {
            this.b.c(e, this.d.a());
            return;
        }
        apzg d = abgc.d(this.h);
        if (d == null) {
            return;
        }
        this.b.c(d, this.d.a());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
