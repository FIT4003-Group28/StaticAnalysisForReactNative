package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxu  reason: default package */
/* loaded from: classes3.dex */
public final class kxu extends ajsl {
    private final View a;
    private final TextView b;

    public kxu(Context context) {
        View inflate = View.inflate(context, R.layout.emergency_onebox, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aquj aqujVar = (aquj) obj;
        TextView textView = this.b;
        if ((aqujVar.b & 1) != 0) {
            aragVar = aqujVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aquj) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
