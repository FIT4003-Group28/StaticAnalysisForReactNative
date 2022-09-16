package defpackage;

import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: ezm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ezm implements View.OnClickListener {
    public final /* synthetic */ ezn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ezm(ezn eznVar) {
        this.a = eznVar;
    }

    public /* synthetic */ ezm(ezn eznVar, int i) {
        this.b = i;
        this.a = eznVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            eog.g(this.a.a.a, Uri.parse("https://support.google.com/nexus/answer/2840815"));
            return;
        }
        ios iosVar = this.a.b;
        if (iosVar == null) {
            return;
        }
        iosVar.a();
    }
}
