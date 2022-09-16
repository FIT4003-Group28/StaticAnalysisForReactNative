package defpackage;

import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ppd  reason: default package */
/* loaded from: classes4.dex */
public final class ppd implements pri {
    public final pri a;
    public boolean b;
    final /* synthetic */ ppe c;

    public ppd(ppe ppeVar, pri priVar) {
        this.c = ppeVar;
        this.a = priVar;
    }

    @Override // defpackage.pri
    public final int a(pit pitVar, pmv pmvVar, int i) {
        if (this.c.q()) {
            return -3;
        }
        if (this.b) {
            pmvVar.setFlags(4);
            return -4;
        }
        int a = this.a.a(pitVar, pmvVar, i);
        if (a == -5) {
            Format format = pitVar.b;
            ptx.a(format);
            int i2 = format.B;
            int i3 = 0;
            if (i2 == 0) {
                if (format.C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            ppe ppeVar = this.c;
            if (ppeVar.b != 0) {
                i2 = 0;
            }
            if (ppeVar.c == Long.MIN_VALUE) {
                i3 = format.C;
            }
            pis b = format.b();
            b.A = i2;
            b.B = i3;
            pitVar.b = b.a();
            return -5;
        }
        ppe ppeVar2 = this.c;
        long j = ppeVar2.c;
        if (j == Long.MIN_VALUE || ((a != -4 || pmvVar.f < j) && !(a == -3 && ppeVar2.d() == Long.MIN_VALUE && !pmvVar.e))) {
            return a;
        }
        pmvVar.clear();
        pmvVar.setFlags(4);
        this.b = true;
        return -4;
    }

    @Override // defpackage.pri
    public final int b(long j) {
        if (this.c.q()) {
            return -3;
        }
        return this.a.b(j);
    }

    @Override // defpackage.pri
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.pri
    public final boolean pZ() {
        return !this.c.q() && this.a.pZ();
    }
}
