package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ebf  reason: default package */
/* loaded from: classes3.dex */
public final class ebf implements ajru {
    private final ajmy a;
    private final LinearLayout b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;

    public ebf(Context context, ajmy ajmyVar) {
        this.a = ajmyVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.minor_moment_header, (ViewGroup) null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.title);
        this.d = (ImageView) linearLayout.findViewById(R.id.thumbnail);
        this.e = (TextView) linearLayout.findViewById(R.id.caption);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atfz atfzVar = (atfz) obj;
        TextView textView = this.c;
        arag aragVar = atfzVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.e;
        arag aragVar2 = atfzVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        this.a.g(this.d, Uri.parse(atfzVar.c));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
