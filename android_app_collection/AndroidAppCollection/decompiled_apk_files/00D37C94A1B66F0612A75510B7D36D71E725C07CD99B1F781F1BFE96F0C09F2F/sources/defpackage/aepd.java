package defpackage;
/* compiled from: PG */
/* renamed from: aepd  reason: default package */
/* loaded from: classes.dex */
final class aepd implements aeoe {
    final /* synthetic */ aepe a;

    public aepd(aepe aepeVar) {
        this.a = aepeVar;
    }

    @Override // defpackage.aeoe
    public final void d(aeof aeofVar) {
        this.a.c = true;
        this.a.k = aeofVar.c();
        if (this.a.c) {
            long j = this.a.j;
            if (j != 0) {
                aeofVar.j(j);
            }
            aepe aepeVar = this.a;
            aepeVar.D(aepeVar.m);
            if (!this.a.g) {
                return;
            }
            this.a.u();
        }
    }

    @Override // defpackage.aeoe
    public final void e(aeof aeofVar, int i, int i2) {
    }

    @Override // defpackage.aeoe
    public final void s(int i) {
        int i2;
        if (i > 90 && ((i2 = this.a.l) == i || i2 == 100)) {
            i = 100;
        }
        this.a.l = i;
    }

    @Override // defpackage.aeoe
    public final void t() {
        aepe aepeVar = this.a;
        aepeVar.j = 0L;
        aepeVar.d = false;
        this.a.b.f();
    }

    @Override // defpackage.aeoe
    public final boolean u(int i, int i2) {
        String str = true != this.a.c ? "prepare" : "playback";
        StringBuilder sb = new StringBuilder(str.length() + 63);
        sb.append("MediaPlayer error during ");
        sb.append(str);
        sb.append(" [what=");
        sb.append(i);
        sb.append(", extra=");
        sb.append(i2);
        sb.append("]");
        zep.l(sb.toString());
        boolean o = this.a.a.o();
        long g = this.a.g();
        aepe aepeVar = this.a;
        afkn O = aepc.O(i, i2, false, o, g, aepeVar.h, aepeVar.n);
        this.a.E(true);
        this.a.b.g(O);
        return true;
    }

    @Override // defpackage.aeoe
    public final void v(int i, int i2) {
        String hexString = Integer.toHexString(i);
        String hexString2 = Integer.toHexString(i2);
        String.valueOf(hexString).length();
        String.valueOf(hexString2).length();
        if (i == 701) {
            String.valueOf(String.valueOf(this.a.h)).length();
            this.a.A(true);
        } else if (i != 702) {
        } else {
            this.a.A(false);
        }
    }

    @Override // defpackage.aeoe
    public final void w() {
        if (this.a.f) {
            this.a.f = false;
            if (this.a.e) {
                return;
            }
            if (this.a.d) {
                this.a.b.q();
                this.a.b.s(-1L);
                return;
            }
            this.a.b.m();
        }
    }
}
