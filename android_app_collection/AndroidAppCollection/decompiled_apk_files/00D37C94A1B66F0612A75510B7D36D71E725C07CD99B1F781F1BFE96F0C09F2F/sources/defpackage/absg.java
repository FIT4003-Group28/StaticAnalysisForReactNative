package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: absg  reason: default package */
/* loaded from: classes.dex */
public final class absg implements absb, absu {
    public int a;
    public int b;
    public abst c;
    public Handler d;
    public int e;
    private final absc f = new absc(this);

    @Override // defpackage.absb
    public final void a(int i) {
        this.e = i;
    }

    @Override // defpackage.absb
    public final void b() {
        abst abstVar = this.c;
        if (abstVar != null) {
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new Runnable() { // from class: absf
                    @Override // java.lang.Runnable
                    public final void run() {
                        absg.this.c.a();
                    }
                });
            } else {
                abstVar.a();
            }
        }
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        this.f.a();
        this.a = 0;
        this.b = 0;
        this.e = 0;
    }

    @Override // defpackage.absu
    public final boolean e(boolean z, absw abswVar, abry abryVar) {
        int i;
        int i2 = this.a;
        if (i2 == 0 || (i = this.b) == 0) {
            return false;
        }
        this.f.b(i2, i);
        this.f.e(z, abswVar, abryVar);
        return true;
    }
}
