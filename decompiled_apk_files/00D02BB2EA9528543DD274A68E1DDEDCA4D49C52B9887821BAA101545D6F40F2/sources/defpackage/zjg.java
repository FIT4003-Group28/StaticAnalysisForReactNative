package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zjg  reason: default package */
/* loaded from: classes7.dex */
final class zjg implements View.OnClickListener {
    final /* synthetic */ zjm a;

    public zjg(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qbr qbrVar = this.a.a;
        if (qbrVar != null) {
            qbrVar.c();
        }
    }
}
