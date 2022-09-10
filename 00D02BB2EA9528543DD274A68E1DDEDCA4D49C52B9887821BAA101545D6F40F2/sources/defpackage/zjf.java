package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zjf  reason: default package */
/* loaded from: classes7.dex */
final class zjf implements View.OnClickListener {
    final /* synthetic */ zjm a;

    public zjf(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qbr qbrVar = this.a.a;
        if (qbrVar != null) {
            qbrVar.e();
        }
    }
}
