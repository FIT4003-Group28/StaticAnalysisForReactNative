package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: lrq  reason: default package */
/* loaded from: classes3.dex */
public final class lrq implements View.OnClickListener {
    public final View a;
    public String b;
    public Uri c;
    public apzg d;
    private final Context e;
    private final aafo f;

    public lrq(Context context, View view, aafo aafoVar) {
        this.e = context;
        view.getClass();
        this.a = view;
        this.f = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = this.d;
        if (apzgVar != null) {
            this.f.c(apzgVar, null);
        } else {
            zgt.G(this.e, this.b, this.c);
        }
    }
}
