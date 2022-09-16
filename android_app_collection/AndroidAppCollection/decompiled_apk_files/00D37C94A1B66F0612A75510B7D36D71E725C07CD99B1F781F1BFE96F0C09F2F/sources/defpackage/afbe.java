package defpackage;

import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afbe  reason: default package */
/* loaded from: classes.dex */
public final class afbe implements pri {
    public volatile pvf a;
    final /* synthetic */ afbf b;
    private final afak c;
    private final pvf d;

    public afbe(afbf afbfVar, orl orlVar, pvf pvfVar) {
        this.b = afbfVar;
        this.c = afbfVar.d.c(orlVar);
        this.d = pvfVar;
        this.a = afbfVar.h.a(orlVar);
    }

    private final boolean e() {
        return !this.d.equals(this.a);
    }

    @Override // defpackage.pri
    public final synchronized int a(pit pitVar, pmv pmvVar, int i) {
        int i2;
        if (e()) {
            return -3;
        }
        this.c.h();
        int a = this.c.a(pitVar, pmvVar, i);
        if (a == -5) {
            afbd afbdVar = this.b.e;
            Format format = pitVar.b;
            afms.a(format);
            final String str = format.a;
            if (str != null) {
                synchronized (((afao) afbdVar).d) {
                    afad afadVar = ((afao) afbdVar).h.c;
                    i2 = afadVar != null ? ((afac) afadVar).c : 1;
                }
                afbi afbiVar = ((afao) afbdVar).c;
                final afbl a2 = new afbl(afbiVar, afbiVar.c(), i2, ((afau) ((afao) afbdVar).e).j).a(aepk.a);
                final boolean z = ((afau) ((afao) afbdVar).e).j;
                final afao afaoVar = (afao) afbdVar;
                ((afao) afbdVar).f.post(new Runnable() { // from class: afam
                    @Override // java.lang.Runnable
                    public final void run() {
                        afao afaoVar2 = afao.this;
                        afaoVar2.c.m(str, z, a2, 2);
                    }
                });
            }
        }
        return a;
    }

    @Override // defpackage.pri
    public final synchronized int b(long j) {
        if (e()) {
            return 0;
        }
        return this.c.b(j);
    }

    @Override // defpackage.pri
    public final void c() {
    }

    @Override // defpackage.pri
    public final synchronized boolean pZ() {
        boolean z;
        if (!e()) {
            if (this.c.g()) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
