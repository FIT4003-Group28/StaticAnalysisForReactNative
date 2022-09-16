package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ebs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ebs implements View.OnClickListener {
    public final /* synthetic */ ebt a;
    private final /* synthetic */ int b;

    public /* synthetic */ ebs(ebt ebtVar, int i) {
        this.b = i;
        this.a = ebtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ebt ebtVar = this.a;
            ebtVar.b.a(ebtVar.c, "yt_android_signout");
        } else if (i == 1) {
            this.a.c();
        } else {
            this.a.a.k("User requested sign out.");
        }
    }
}
