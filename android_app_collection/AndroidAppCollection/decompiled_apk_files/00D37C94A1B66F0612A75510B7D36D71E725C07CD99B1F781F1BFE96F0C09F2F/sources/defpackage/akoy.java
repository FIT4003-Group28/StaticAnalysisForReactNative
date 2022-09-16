package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akoy  reason: default package */
/* loaded from: classes.dex */
public final class akoy implements ajru {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public akoy(Context context) {
        View inflate = View.inflate(context, R.layout.share_start_time_with_context, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.startAt);
        this.c = (TextView) inflate.findViewById(R.id.startTime);
        this.d = (TextView) inflate.findViewById(R.id.contextDescription);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(avnl avnlVar) {
        int i = avnlVar.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return;
        }
        TextView textView = this.b;
        arag aragVar = avnlVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.c;
        arag aragVar2 = avnlVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.d;
        arag aragVar3 = avnlVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar3));
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((avnl) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
