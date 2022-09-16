package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxv  reason: default package */
/* loaded from: classes3.dex */
public final class kxv implements ajru {
    private final View a;
    private final ajrx b;
    private final TextView c;

    public kxv(Context context, gem gemVar) {
        this.b = gemVar;
        View inflate = View.inflate(context, R.layout.exploratory_results_header, null);
        this.a = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aqxh aqxhVar = (aqxh) obj;
        TextView textView = this.c;
        if ((aqxhVar.b & 1) != 0) {
            aragVar = aqxhVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
