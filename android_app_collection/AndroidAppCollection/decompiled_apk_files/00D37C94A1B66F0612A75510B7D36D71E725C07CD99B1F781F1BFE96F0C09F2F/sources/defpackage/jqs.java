package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jqs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jqs implements View.OnClickListener {
    public final /* synthetic */ jqu a;
    private final /* synthetic */ int b;

    public /* synthetic */ jqs(jqu jquVar, int i) {
        this.b = i;
        this.a = jquVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
