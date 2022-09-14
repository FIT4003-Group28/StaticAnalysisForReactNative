package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aikm  reason: default package */
/* loaded from: classes2.dex */
final class aikm extends ckqk {
    final /* synthetic */ String a;
    final /* synthetic */ dbsz b;
    final /* synthetic */ aikp c;

    public aikm(aikp aikpVar, String str, dbsz dbszVar) {
        this.c = aikpVar;
        this.a = str;
        this.b = dbszVar;
    }

    @Override // defpackage.ckqk
    public final void a(final Bitmap bitmap) {
        this.c.a.put(this.a, bitmap);
        Executor executor = this.c.b;
        final dbsz dbszVar = this.b;
        executor.execute(new Runnable(dbszVar, bitmap) { // from class: aikl
            private final dbsz a;
            private final Bitmap b;

            {
                this.a = dbszVar;
                this.b = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.NU(this.b);
            }
        });
    }
}
