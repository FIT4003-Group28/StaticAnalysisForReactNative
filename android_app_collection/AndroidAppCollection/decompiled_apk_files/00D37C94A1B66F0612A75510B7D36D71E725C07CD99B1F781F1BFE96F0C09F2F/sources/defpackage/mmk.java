package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mmk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmk implements View.OnClickListener {
    public final /* synthetic */ mml a;
    public final /* synthetic */ apzg b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmk(mml mmlVar, apzg apzgVar) {
        this.a = mmlVar;
        this.b = apzgVar;
    }

    public /* synthetic */ mmk(mml mmlVar, apzg apzgVar, int i) {
        this.c = i;
        this.a = mmlVar;
        this.b = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            mml mmlVar = this.a;
            mmlVar.a.c(this.b, null);
            return;
        }
        mml mmlVar2 = this.a;
        mmlVar2.a.c(this.b, null);
    }
}
