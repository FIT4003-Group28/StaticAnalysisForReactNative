package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyf  reason: default package */
/* loaded from: classes3.dex */
public final class kyf extends ajsl {
    public final aafo a;
    public aqul b;
    public actl c;
    private final ajyc d;
    private final ajxz e;
    private final View f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final View j;

    public kyf(Context context, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        this.d = ajycVar;
        ajxzVar.getClass();
        this.e = ajxzVar;
        View inflate = View.inflate(context, R.layout.multi_action_emergency_support, null);
        this.f = inflate;
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        this.h = (TextView) inflate.findViewById(R.id.action);
        this.i = (TextView) inflate.findViewById(R.id.details);
        this.j = inflate.findViewById(R.id.contextual_menu_anchor);
        inflate.setOnClickListener(new kye(this));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        aqul aqulVar = (aqul) obj;
        this.b = aqulVar;
        this.c = ajrsVar;
        if (aqulVar != null) {
            this.f.setVisibility(0);
            atep atepVar = null;
            ajrsVar.a.u(new acte(aqulVar.h), null);
            if ((aqulVar.b & 4) == 0) {
                this.g.setVisibility(8);
            } else {
                ajxz ajxzVar = this.e;
                arhs arhsVar = aqulVar.e;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                this.g.setImageResource(ajxzVar.a(b));
                this.g.setVisibility(0);
            }
            TextView textView = this.h;
            if ((aqulVar.b & 1) != 0) {
                aragVar = aqulVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = this.i;
            if ((aqulVar.b & 2) != 0) {
                aragVar2 = aqulVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            ajyc ajycVar = this.d;
            View view = this.f;
            View view2 = this.j;
            ates atesVar = aqulVar.g;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            if ((atesVar.b & 1) != 0) {
                ates atesVar2 = aqulVar.g;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atep atepVar2 = atesVar2.c;
                if (atepVar2 == null) {
                    atepVar2 = atep.a;
                }
                atepVar = atepVar2;
            }
            ajycVar.e(view, view2, atepVar, aqulVar, ajrsVar.a);
            return;
        }
        this.f.setVisibility(8);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqul) obj).h.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
