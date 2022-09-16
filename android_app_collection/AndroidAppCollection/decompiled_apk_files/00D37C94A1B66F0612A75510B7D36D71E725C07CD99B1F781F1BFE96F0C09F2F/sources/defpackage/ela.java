package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ela  reason: default package */
/* loaded from: classes3.dex */
public final class ela extends ajsl {
    private final View a;
    private final TextView b;
    private final ajrp c;

    public ela(Context context, aafo aafoVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_add_channels, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.add_text);
        this.c = new ajrp(aafoVar, inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        apsn apsnVar = (apsn) obj;
        ajrp ajrpVar = this.c;
        acti actiVar = ajrsVar.a;
        arag aragVar = null;
        if ((apsnVar.b & 2) != 0) {
            apzgVar = apsnVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        TextView textView = this.b;
        if ((apsnVar.b & 1) != 0 && (aragVar = apsnVar.d) == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apsn) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.c();
    }
}
