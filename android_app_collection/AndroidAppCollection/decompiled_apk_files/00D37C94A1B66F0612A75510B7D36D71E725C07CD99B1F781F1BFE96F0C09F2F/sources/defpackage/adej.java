package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: adej  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adej implements View.OnClickListener {
    public final /* synthetic */ adek a;
    private final /* synthetic */ int b;

    public /* synthetic */ adej(adek adekVar, int i) {
        this.b = i;
        this.a = adekVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.dismiss();
        } else {
            this.a.ku();
        }
    }
}
