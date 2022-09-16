package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajzd  reason: default package */
/* loaded from: classes.dex */
public final class ajzd implements View.OnClickListener, ajru {
    private final ajyb a;
    private final aafo b;
    private final ajya c;
    private final View d;
    private final TextView e;
    private aten f;
    private final acti g;

    public ajzd(Context context, aafo aafoVar, ajya ajyaVar, ajyb ajybVar) {
        this.b = aafoVar;
        ajyaVar.getClass();
        this.c = ajyaVar;
        this.a = ajybVar;
        this.g = (acti) zew.K(ajyaVar.a(), "com.google.android.libraries.youtube.logging.interaction_logger", acti.class);
        View inflate = View.inflate(context, R.layout.contextual_menu_item_layout, null);
        this.d = inflate;
        inflate.setOnClickListener(this);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.e = textView;
        textView.setImportantForAccessibility(2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ColorStateList f;
        acti actiVar;
        aten atenVar = (aten) obj;
        this.e.setText(abgc.h(atenVar));
        if (abgc.i(atenVar) - 1 == 1) {
            f = zhn.f(this.e.getContext(), R.attr.ytTextDisabled);
        } else {
            f = zhn.f(this.e.getContext(), R.attr.ytTextPrimary);
        }
        this.e.setTextColor(f);
        CharSequence text = this.e.getText();
        ateo ateoVar = atenVar.c;
        if (ateoVar == null) {
            ateoVar = ateo.a;
        }
        atem atemVar = ateoVar.g;
        if (atemVar == null) {
            atemVar = atem.a;
        }
        aovr aovrVar = atemVar.b;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) == 0) {
            this.d.setContentDescription(text);
        } else {
            View view = this.d;
            ateo ateoVar2 = atenVar.c;
            if (ateoVar2 == null) {
                ateoVar2 = ateo.a;
            }
            atem atemVar2 = ateoVar2.g;
            if (atemVar2 == null) {
                atemVar2 = atem.a;
            }
            aovr aovrVar2 = atemVar2.b;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            view.setContentDescription(aovrVar2.c);
        }
        this.f = atenVar;
        aoob c = abgc.c(atenVar);
        if (c.H() || (actiVar = this.g) == null) {
            return;
        }
        actiVar.u(new acte(c), null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajyb ajybVar = this.a;
        if (ajybVar != null) {
            ajybVar.a();
        }
        if (abgc.e(this.f) != null) {
            this.b.c(abgc.e(this.f), this.c.a());
            aoob aoobVar = abgc.e(this.f).c;
            if (this.g == null || aoobVar.H()) {
                return;
            }
            this.g.H(3, new acte(aoobVar), null);
        } else if (abgc.d(this.f) == null) {
        } else {
            this.b.c(abgc.d(this.f), this.c.a());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
