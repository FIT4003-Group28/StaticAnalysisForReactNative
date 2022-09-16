package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mli  reason: default package */
/* loaded from: classes3.dex */
public final class mli extends ajsl {
    private final aafo a;
    private final View b;
    private final TextView c;

    public mli(Context context, aafo aafoVar) {
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row_header, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.content);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        atfp atfpVar = (atfp) obj;
        if ((atfpVar.b & 1) != 0) {
            aragVar = atfpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned a = aafv.a(aragVar, this.a, false);
        this.c.setText(a);
        this.b.setContentDescription(a);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        atfp atfpVar = (atfp) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
