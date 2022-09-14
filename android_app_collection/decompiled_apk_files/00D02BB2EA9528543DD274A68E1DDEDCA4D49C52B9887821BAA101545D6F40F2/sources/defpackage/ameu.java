package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ameu  reason: default package */
/* loaded from: classes.dex */
final class ameu implements chv<Drawable> {
    final /* synthetic */ ckqk a;
    final /* synthetic */ Context b;
    final /* synthetic */ amfd c;

    public ameu(amfd amfdVar, ckqk ckqkVar, Context context) {
        this.c = amfdVar;
        this.a = ckqkVar;
        this.b = context;
    }

    @Override // defpackage.chv
    public final boolean Nl(bwx bwxVar) {
        int i = amfd.r;
        if (bwxVar != null) {
            bwxVar.getMessage();
        }
        this.a.b();
        return true;
    }

    @Override // defpackage.chv
    public final /* bridge */ /* synthetic */ boolean Nm(Drawable drawable, int i) {
        final Drawable drawable2 = drawable;
        ((ckco) this.c.b.a().a(ckip.Z)).a(amfd.l(i));
        this.a.a(null);
        if (!this.c.k.a().booleanValue() || !(drawable2 instanceof BitmapDrawable)) {
            return false;
        }
        Executor executor = this.c.f;
        final Context context = this.b;
        executor.execute(new Runnable(this, drawable2, context) { // from class: amet
            private final ameu a;
            private final Drawable b;
            private final Context c;

            {
                this.a = this;
                this.b = drawable2;
                this.c = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ameu ameuVar = this.a;
                Drawable drawable3 = this.b;
                ameuVar.c.l.a().a(((BitmapDrawable) drawable3).getBitmap(), this.c);
            }
        });
        return false;
    }
}
