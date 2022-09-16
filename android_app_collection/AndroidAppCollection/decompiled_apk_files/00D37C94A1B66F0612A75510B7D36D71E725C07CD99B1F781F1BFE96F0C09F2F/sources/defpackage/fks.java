package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fks  reason: default package */
/* loaded from: classes3.dex */
final class fks implements ajru {
    private final Context a;
    private final ajxz b;
    private final TextView c;

    public fks(Context context, ajxz ajxzVar) {
        this.a = context;
        this.b = ajxzVar;
        this.c = (TextView) View.inflate(context, 17367043, null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aten atenVar = (aten) obj;
        this.c.setText(abgc.h(atenVar));
        if (abgc.f(atenVar) != null) {
            TextView textView = this.c;
            ajxz ajxzVar = this.b;
            arhr b = arhr.b(abgc.f(atenVar).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(ajxzVar.a(b), 0, 0, 0);
            this.c.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelOffset(R.dimen.innertube_menu_padding));
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
