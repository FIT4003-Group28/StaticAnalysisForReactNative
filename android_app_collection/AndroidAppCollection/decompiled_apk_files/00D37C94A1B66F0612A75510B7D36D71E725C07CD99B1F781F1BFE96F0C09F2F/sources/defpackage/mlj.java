package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mlj  reason: default package */
/* loaded from: classes3.dex */
public final class mlj extends ajsl {
    private final Context a;
    private final aafo b;
    private final View c;
    private final TextView d;
    private final TextView e;

    public mlj(Context context, aafo aafoVar) {
        this.a = context;
        this.b = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.content);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        atfq atfqVar = (atfq) obj;
        arag aragVar = atfqVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        this.d.setText(b);
        CharSequence k = ajgl.k("  ", aafv.c((arag[]) atfqVar.c.toArray(new arag[0]), this.b, false));
        this.e.setText(k);
        this.c.setContentDescription(this.a.getString(R.string.accessibility_watch_metadata_row, b, k));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atfq) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
