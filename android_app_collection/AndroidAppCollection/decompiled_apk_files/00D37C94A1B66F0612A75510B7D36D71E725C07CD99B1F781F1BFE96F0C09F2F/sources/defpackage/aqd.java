package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aqd  reason: default package */
/* loaded from: classes2.dex */
public final class aqd implements apy {
    public static final aqd a = new aqd();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final l f = new l(this);
    public final Runnable g = new apz(this);
    final aqa h = new aqa(this);

    private aqd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (this.d) {
                this.f.d(aps.ON_RESUME);
                this.d = false;
                return;
            }
            this.e.removeCallbacks(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1 || !this.i) {
            return;
        }
        this.f.d(aps.ON_START);
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.b != 0 || !this.d) {
            return;
        }
        this.f.d(aps.ON_STOP);
        this.i = true;
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return this.f;
    }
}
