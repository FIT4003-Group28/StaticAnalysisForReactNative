package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vsa  reason: default package */
/* loaded from: classes7.dex */
final class vsa implements amfq {
    final /* synthetic */ vtl a;
    final /* synthetic */ vsf b;

    public vsa(vsf vsfVar, vtl vtlVar) {
        this.b = vsfVar;
        this.a = vtlVar;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        cqtd i = amfuVar.i(bvlw.a);
        if (!amfuVar.a() || i == null) {
            return;
        }
        final Drawable a = i.a(this.b.b);
        Executor executor = this.b.a;
        final vtl vtlVar = this.a;
        executor.execute(new Runnable(vtlVar, a) { // from class: vrz
            private final vtl a;
            private final Drawable b;

            {
                this.a = vtlVar;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        });
    }
}
