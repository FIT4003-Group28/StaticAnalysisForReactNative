package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: wen  reason: default package */
/* loaded from: classes4.dex */
public final class wen implements ajru {
    private final acti a;
    private final View b;
    private final TextView c;

    public wen(Context context, int i, acti actiVar) {
        this.a = actiVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.c = textView;
        zhn.l(context, R.attr.ytTextAppearanceBody2b).ifPresent(new wev(textView, 1));
        Optional h = zhn.h(context, R.attr.ytTextSecondary);
        textView.getClass();
        h.ifPresent(new wel(textView));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aowz aowzVar = (aowz) obj;
        this.a.u(new acte(aowzVar.d), null);
        arag aragVar = aowzVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        this.c.setText(b);
        this.b.setContentDescription(b);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
