package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: igo  reason: default package */
/* loaded from: classes3.dex */
public final class igo extends ajsl {
    private final View a;
    private final TextView b;
    private final TextView c;

    public igo(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.comment_zero_state, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.comment_zero_state_primary_text);
        this.c = (TextView) inflate.findViewById(R.id.comment_zero_state_secondary_text);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aqce aqceVar = (aqce) obj;
        TextView textView = this.b;
        arag aragVar = aqceVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.c;
        arag aragVar2 = aqceVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqce) obj).d.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
