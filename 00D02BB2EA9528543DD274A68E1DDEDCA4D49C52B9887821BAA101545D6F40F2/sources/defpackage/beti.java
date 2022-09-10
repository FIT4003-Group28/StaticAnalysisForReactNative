package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: beti  reason: default package */
/* loaded from: classes3.dex */
final class beti implements View.OnClickListener {
    final /* synthetic */ betj a;

    public beti(betj betjVar) {
        this.a = betjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        betj betjVar = this.a;
        beqn beqnVar = betjVar.a;
        if (beqnVar == null) {
            return;
        }
        beqnVar.d(betjVar.c, betjVar.b);
        betj betjVar2 = this.a;
        betjVar2.d = !betjVar2.d;
        cqkx.p(betjVar2);
    }
}
