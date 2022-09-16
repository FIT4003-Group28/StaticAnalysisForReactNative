package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akot  reason: default package */
/* loaded from: classes.dex */
public final class akot implements ajru {
    public final CompoundButton a;
    public final akll b;
    private final View c;
    private final TextView d;
    private final TextView e;

    public akot(Context context, akll akllVar) {
        View inflate = View.inflate(context, R.layout.share_panel_title, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.a = (CompoundButton) inflate.findViewById(R.id.native_share_checkbox);
        this.e = (TextView) inflate.findViewById(R.id.native_share_checkbox_text);
        this.b = akllVar;
        akpk.g(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        apnn apnnVar;
        avni avniVar = (avni) obj;
        TextView textView = this.d;
        arag aragVar2 = null;
        if ((avniVar.b & 1) != 0) {
            aragVar = avniVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        apnm apnmVar = avniVar.d;
        if (apnmVar == null) {
            apnmVar = apnm.a;
        }
        if ((apnmVar.b & 2) != 0) {
            apnm apnmVar2 = avniVar.d;
            if (apnmVar2 == null) {
                apnmVar2 = apnm.a;
            }
            apnnVar = apnmVar2.c;
            if (apnnVar == null) {
                apnnVar = apnn.a;
            }
        } else {
            apnnVar = null;
        }
        if (apnnVar != null) {
            this.a.setChecked(apnnVar.d);
            this.a.setOnCheckedChangeListener(new akoq(this));
            TextView textView2 = this.e;
            if ((apnnVar.b & 1) != 0 && (aragVar2 = apnnVar.c) == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
            this.e.setOnClickListener(new akor(this));
            this.a.setVisibility(0);
            this.e.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
        this.e.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.setOnCheckedChangeListener(null);
    }
}
