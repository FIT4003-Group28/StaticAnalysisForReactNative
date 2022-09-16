package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xlh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xlh implements DialogInterface.OnShowListener {
    public final /* synthetic */ xli a;
    private final /* synthetic */ int b;

    public /* synthetic */ xlh(xli xliVar, int i) {
        this.b = i;
        this.a = xliVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.b == 0) {
            this.a.k();
        } else {
            this.a.k();
        }
    }
}
