package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wfd  reason: default package */
/* loaded from: classes4.dex */
public final class wfd implements ajru {
    final ajrf a;
    private final LinearLayout b;
    private final TextView c;
    private final TextView d;

    public wfd(Context context) {
        this.a = new ajrf(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.google_account_header, (ViewGroup) null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.name);
        this.d = (TextView) linearLayout.findViewById(R.id.email);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aoxk aoxkVar = (aoxk) obj;
        TextView textView = this.c;
        arag aragVar = aoxkVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.d;
        arag aragVar2 = aoxkVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        aqtd aqtdVar = aoxkVar.d;
        if (aqtdVar == null) {
            aqtdVar = aqtd.a;
        }
        this.a.d(new ajre(aqtdVar));
        View view = this.a.a;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.b.addView(view);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
