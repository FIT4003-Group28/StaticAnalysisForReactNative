package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: krs  reason: default package */
/* loaded from: classes3.dex */
public final class krs extends ajsl {
    private final View a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final float f;
    private final float g;
    private final float h;

    public krs(Context context) {
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_segment_header, (ViewGroup) null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.position);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.title);
        this.d = textView2;
        TextView textView3 = (TextView) inflate.findViewById(R.id.annotation);
        this.e = textView3;
        this.f = textView.getTextSize();
        this.g = textView2.getTextSize();
        this.h = textView3.getTextSize();
    }

    private final void f(ajrs ajrsVar, TextView textView, arag aragVar) {
        Spanned b = ajgl.b(aragVar);
        if (!TextUtils.isEmpty(b)) {
            if (ajrsVar != null && ajrsVar.j("nested_fragment_key", false)) {
                textView.setTextSize(0, this.b.getResources().getDimension(R.dimen.small_font_size));
            }
            textView.setContentDescription(ajgl.i(aragVar));
            textView.setText(b);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        audh audhVar = ((krr) obj).a;
        TextView textView = this.c;
        arag aragVar = audhVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        f(ajrsVar, textView, aragVar);
        TextView textView2 = this.d;
        arag aragVar2 = audhVar.b;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        f(ajrsVar, textView2, aragVar2);
        TextView textView3 = this.e;
        arag aragVar3 = audhVar.d;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        f(ajrsVar, textView3, aragVar3);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((krr) obj).a.e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.setTextSize(0, this.f);
        this.d.setTextSize(0, this.g);
        this.e.setTextSize(0, this.h);
    }
}
