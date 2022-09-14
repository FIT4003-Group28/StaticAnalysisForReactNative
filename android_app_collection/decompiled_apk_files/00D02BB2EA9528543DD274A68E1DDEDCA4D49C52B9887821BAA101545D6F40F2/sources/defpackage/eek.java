package defpackage;

import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: eek  reason: default package */
/* loaded from: classes6.dex */
final class eek extends bvou {
    final /* synthetic */ egu a;
    final /* synthetic */ eeo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eek(eeo eeoVar, View view, egu eguVar) {
        super(view);
        this.b = eeoVar;
        this.a = eguVar;
    }

    @Override // defpackage.bvou
    public final void a() {
        Handler handler = new Handler();
        final egu eguVar = this.a;
        handler.post(new Runnable(this, eguVar) { // from class: eej
            private final eek a;
            private final egu b;

            {
                this.a = this;
                this.b = eguVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                eek eekVar = this.a;
                eekVar.b.d(this.b);
            }
        });
    }

    @Override // defpackage.bvou
    public final void b() {
        a();
    }
}
