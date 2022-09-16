package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeoz  reason: default package */
/* loaded from: classes.dex */
public final class aeoz implements aeoe {
    final /* synthetic */ aepa a;

    public aeoz(aepa aepaVar) {
        this.a = aepaVar;
    }

    private final void a(aeof aeofVar) {
        if (this.a.i()) {
            if (this.a.g != 0) {
                aeofVar.j(this.a.g);
            }
            aepa aepaVar = this.a;
            aepaVar.f(aepaVar.f);
            this.a.d(false);
            if (this.a.h) {
                this.a.b();
            } else {
                this.a.p = false;
            }
        }
    }

    @Override // defpackage.aeoe
    public final void d(aeof aeofVar) {
        this.a.m = true;
        aepc aepcVar = this.a.a;
        int c = aeofVar.c();
        int i = aepc.n;
        aepcVar.j = c;
        a(aeofVar);
    }

    @Override // defpackage.aeoe
    public final void e(aeof aeofVar, final int i, final int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.a.b.getMainLooper().getThread() == Thread.currentThread()) {
            afnh afnhVar = this.a.j;
            if (afnhVar != null) {
                afnhVar.v(i, i2);
            }
        } else {
            aepc aepcVar = this.a.a;
            int i3 = aepc.n;
            aepcVar.f.post(new Runnable() { // from class: aeoy
                @Override // java.lang.Runnable
                public final void run() {
                    aeoz aeozVar = aeoz.this;
                    int i4 = i;
                    int i5 = i2;
                    afnh afnhVar2 = aeozVar.a.j;
                    if (afnhVar2 != null) {
                        afnhVar2.v(i4, i5);
                    }
                }
            });
        }
        if (this.a.l) {
            return;
        }
        this.a.l = true;
        a(aeofVar);
    }

    @Override // defpackage.aeoe
    public final void s(int i) {
        if (i > 90) {
            aepc aepcVar = this.a.a;
            int i2 = aepc.n;
            int i3 = aepcVar.k;
            if (i3 == i || i3 == 100) {
                i = 100;
            }
        }
        aepc aepcVar2 = this.a.a;
        int i4 = aepc.n;
        aepcVar2.k = i;
    }

    @Override // defpackage.aeoe
    public final void t() {
        this.a.g = 0L;
        this.a.n = false;
        this.a.i.f();
        aepc aepcVar = this.a.a;
        int i = aepc.n;
        aepcVar.E(false);
    }

    @Override // defpackage.aeoe
    public final boolean u(int i, int i2) {
        afnh afnhVar;
        aepa aepaVar = this.a;
        if (aepaVar.k == null) {
            return true;
        }
        boolean z = aepaVar.m;
        StringBuilder sb = new StringBuilder(76);
        sb.append("AndroidFwPlayer: error [prepared=");
        sb.append(z);
        sb.append(", what=");
        sb.append(i);
        sb.append(", extra=");
        sb.append(i2);
        sb.append("]");
        zep.b(sb.toString());
        long j = this.a.g;
        aepc aepcVar = this.a.a;
        int i3 = aepc.n;
        boolean z2 = aepcVar.m.get() < 3;
        boolean o = this.a.a.a.o();
        aepa aepaVar2 = this.a;
        aeow aeowVar = aepaVar2.k;
        FormatStreamModel formatStreamModel = aeowVar.b;
        PlayerConfigModel playerConfigModel = aeowVar.e;
        afkn O = aepc.O(i, i2, z2, o, j, formatStreamModel, aepaVar2.q);
        if (!O.n()) {
            this.a.p = true;
            this.a.a.m.incrementAndGet();
            if (i == 100 && (afnhVar = this.a.j) != null) {
                afnhVar.o();
            }
            this.a.i.g(O);
            aepa aepaVar3 = this.a;
            aepc.L(aepaVar3.a, aepaVar3.k.b, aepaVar3.g);
        } else {
            this.a.p = false;
            this.a.a.f.post(new Runnable() { // from class: aeox
                @Override // java.lang.Runnable
                public final void run() {
                    aeoz.this.a.a.F(true);
                }
            });
            this.a.i.g(O);
            this.a.a.g = false;
        }
        return true;
    }

    @Override // defpackage.aeoe
    public final void v(int i, int i2) {
        String hexString = Integer.toHexString(i);
        String hexString2 = Integer.toHexString(i2);
        String.valueOf(hexString).length();
        String.valueOf(hexString2).length();
        if (i == 701) {
            this.a.d(true);
        } else if (i != 702) {
        } else {
            this.a.d(false);
        }
    }

    @Override // defpackage.aeoe
    public final void w() {
        aepc aepcVar = this.a.a;
        int i = aepc.n;
        if (aepcVar.h) {
            this.a.a.h = false;
            if (this.a.o) {
                return;
            }
            if (this.a.n) {
                this.a.i.q();
                this.a.i.s(-1L);
                return;
            }
            this.a.i.m();
        }
    }
}
