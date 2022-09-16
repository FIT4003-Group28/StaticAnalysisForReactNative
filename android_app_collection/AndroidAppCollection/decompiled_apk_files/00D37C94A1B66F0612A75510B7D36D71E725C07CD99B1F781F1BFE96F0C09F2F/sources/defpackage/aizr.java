package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aizr  reason: default package */
/* loaded from: classes.dex */
public final class aizr {
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final azqb e;
    private final azqb f;
    private final aiix g;
    private final int h;
    private yiw i;
    private yiw j;

    public aizr(Context context, azqb azqbVar, azqb azqbVar2, aiix aiixVar, Executor executor, Executor executor2) {
        this.a = context;
        this.e = azqbVar;
        this.f = azqbVar2;
        this.g = aiixVar;
        this.c = executor;
        this.d = executor2;
        this.h = Math.min(1024, Math.max(zew.j(context), zew.l(context)));
    }

    public final yiw a() {
        if (this.j == null) {
            this.j = yiz.c(this.d, new aizq(this));
        }
        return this.j;
    }

    public final void b(aalc aalcVar) {
        int i = this.h;
        aalb b = aalcVar.b(i, (i * 9) / 16);
        Uri a = b == null ? null : b.a();
        if (a == null || aiix.e(this.g.a).X) {
            c(null, null);
            return;
        }
        this.b = a;
        ajmy ajmyVar = (ajmy) this.f.get();
        if (this.i == null) {
            this.i = yiz.c(this.c, new aizq(this, 1));
        }
        ajmyVar.l(a, this.i);
    }

    public final void c(Bitmap bitmap, Bitmap bitmap2) {
        ylr.c();
        ((aizp) this.e.get()).k(bitmap, bitmap2);
    }
}
