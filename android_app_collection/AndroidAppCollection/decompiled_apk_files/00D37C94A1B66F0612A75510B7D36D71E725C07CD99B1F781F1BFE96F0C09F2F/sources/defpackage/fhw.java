package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fhw  reason: default package */
/* loaded from: classes3.dex */
final class fhw extends ajmg {
    final /* synthetic */ awob a;
    final /* synthetic */ Context b;
    final /* synthetic */ tcu c;
    final /* synthetic */ awny d;

    public fhw(awob awobVar, Context context, tcu tcuVar, awny awnyVar) {
        this.a = awobVar;
        this.b = context;
        this.c = tcuVar;
        this.d = awnyVar;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        if (imageView instanceof fib) {
            ((fib) imageView).b();
        }
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void c(ImageView imageView) {
        if (!(imageView instanceof fib)) {
            return;
        }
        awob awobVar = this.a;
        int i = 1;
        if ((awobVar.c & 8) != 0) {
            awny awnyVar = awobVar.g;
            if (awnyVar == null) {
                awnyVar = awny.a;
            }
            fib fibVar = (fib) imageView;
            int C = awwc.C(awnyVar.d);
            if (C == 0) {
                C = 1;
            }
            fibVar.r = C;
            aolu.s(awnyVar, imageView, this.b, this.c);
        }
        fib fibVar2 = (fib) imageView;
        int C2 = awwc.C(this.d.d);
        if (C2 != 0) {
            i = C2;
        }
        fibVar2.r = i;
    }
}
