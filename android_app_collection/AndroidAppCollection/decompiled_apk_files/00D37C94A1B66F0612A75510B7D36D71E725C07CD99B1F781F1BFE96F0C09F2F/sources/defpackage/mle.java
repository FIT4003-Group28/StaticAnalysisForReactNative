package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mle  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mle implements View.OnClickListener {
    public final /* synthetic */ mlf a;
    public final /* synthetic */ aafo b;
    private final /* synthetic */ int c;

    public /* synthetic */ mle(mlf mlfVar, aafo aafoVar) {
        this.a = mlfVar;
        this.b = aafoVar;
    }

    public /* synthetic */ mle(mlf mlfVar, aafo aafoVar, int i) {
        this.c = i;
        this.a = mlfVar;
        this.b = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            mlf mlfVar = this.a;
            aafo aafoVar = this.b;
            apzg apzgVar = mlfVar.a;
            if (apzgVar == null) {
                return;
            }
            aafoVar.c(apzgVar, null);
            return;
        }
        mlf mlfVar2 = this.a;
        aafo aafoVar2 = this.b;
        apzg apzgVar2 = mlfVar2.b;
        if (apzgVar2 == null) {
            return;
        }
        aafoVar2.c(apzgVar2, null);
    }
}
