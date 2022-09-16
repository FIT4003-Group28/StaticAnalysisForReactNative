package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ghz  reason: default package */
/* loaded from: classes3.dex */
public final class ghz extends aljg {
    final /* synthetic */ gic a;

    public ghz(gic gicVar) {
        this.a = gicVar;
    }

    private final void c(int i) {
        aopa createBuilder = awgp.a.createBuilder();
        createBuilder.copyOnWrite();
        ((awgp) createBuilder.instance).b = i - 2;
        acrr acrrVar = this.a.ak;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).eh((awgp) createBuilder.mo39build());
        acrrVar.c((arrh) a.mo39build());
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        if (i == 5) {
            c(5);
        } else if (i == 3) {
            c(3);
        } else if (i != 6) {
        } else {
            c(4);
        }
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
    }
}
