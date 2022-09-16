package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: eca  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eca implements View.OnClickListener {
    public final /* synthetic */ ecb a;
    private final /* synthetic */ int b;

    public /* synthetic */ eca(ecb ecbVar) {
        this.a = ecbVar;
    }

    public /* synthetic */ eca(ecb ecbVar, int i) {
        this.b = i;
        this.a = ecbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.a.c();
        } else {
            this.a.a.c();
        }
    }
}
