package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mlh  reason: default package */
/* loaded from: classes3.dex */
public final class mlh implements ajru {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final akbm d;

    public mlh(Context context, akbn akbnVar, akbi akbiVar) {
        View inflate = View.inflate(context, R.layout.menu_title, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        TextView textView = (TextView) inflate.findViewById(R.id.button);
        this.c = textView;
        akbm a = akbnVar.a(textView);
        this.d = a;
        a.g();
        a.d = akbiVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        ateu ateuVar = (ateu) obj;
        TextView textView = this.b;
        if ((ateuVar.b & 1) != 0) {
            aragVar = ateuVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        aunb aunbVar = ateuVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            this.c.setVisibility(0);
            this.d.e(R.dimen.menu_title_button_icon_padding);
            akbm akbmVar = this.d;
            aunb aunbVar2 = ateuVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            akbmVar.b((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer), ajrsVar.a);
            return;
        }
        this.c.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
