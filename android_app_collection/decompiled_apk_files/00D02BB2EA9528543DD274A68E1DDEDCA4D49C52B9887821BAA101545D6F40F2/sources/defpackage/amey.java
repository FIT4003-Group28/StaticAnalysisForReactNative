package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amey  reason: default package */
/* loaded from: classes.dex */
final class amey implements chv<Bitmap> {
    final /* synthetic */ ckqk a;
    final /* synthetic */ amfd b;

    public amey(amfd amfdVar, ckqk ckqkVar) {
        this.b = amfdVar;
        this.a = ckqkVar;
    }

    @Override // defpackage.chv
    public final boolean Nl(bwx bwxVar) {
        int i = amfd.r;
        if (bwxVar != null) {
            bwxVar.getMessage();
        }
        Executor executor = this.b.e;
        final ckqk ckqkVar = this.a;
        ckqkVar.getClass();
        executor.execute(new Runnable(ckqkVar) { // from class: amew
            private final ckqk a;

            {
                this.a = ckqkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
        return true;
    }

    @Override // defpackage.chv
    public final /* bridge */ /* synthetic */ boolean Nm(Bitmap bitmap, int i) {
        final Bitmap bitmap2 = bitmap;
        ((ckco) this.b.b.a().a(ckip.Z)).a(amfd.l(i));
        Executor executor = this.b.e;
        final ckqk ckqkVar = this.a;
        executor.execute(new Runnable(ckqkVar, bitmap2) { // from class: amex
            private final ckqk a;
            private final Bitmap b;

            {
                this.a = ckqkVar;
                this.b = bitmap2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        });
        return true;
    }
}
