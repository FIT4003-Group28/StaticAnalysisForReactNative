package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: due  reason: default package */
/* loaded from: classes3.dex */
public final class due extends dux {
    public due(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "f70HkFQdiBT8cMNptimLJRMH1W3hPEd6hMsJ3HEMqd86My38P3Zp8TEoBc44fn1Y", "U4v8wqRVOlCdb08Y0ckEaEZgRwV3IyB603RZVIybJJ4=", aopaVar, i, 24);
    }

    private final void c() {
        qab b = this.a.b();
        if (b != null) {
            try {
                qaa e = b.e();
                String d = dts.d(e.a);
                if (d == null) {
                    return;
                }
                synchronized (this.g) {
                    aopa aopaVar = this.g;
                    aopaVar.copyOnWrite();
                    dnw dnwVar = (dnw) aopaVar.instance;
                    dnw dnwVar2 = dnw.a;
                    dnwVar.d |= 512;
                    dnwVar.ab = d;
                    aopa aopaVar2 = this.g;
                    boolean z = e.b;
                    aopaVar2.copyOnWrite();
                    dnw dnwVar3 = (dnw) aopaVar2.instance;
                    dnwVar3.d |= 2048;
                    dnwVar3.ad = z;
                    aopa aopaVar3 = this.g;
                    aopaVar3.copyOnWrite();
                    dnw dnwVar4 = (dnw) aopaVar3.instance;
                    dnwVar4.ac = 5;
                    dnwVar4.d |= 1024;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.dux
    protected final void a() {
        if (!this.a.l) {
            synchronized (this.g) {
                aopa aopaVar = this.g;
                String str = (String) this.d.invoke(null, this.a.a);
                aopaVar.copyOnWrite();
                dnw dnwVar = (dnw) aopaVar.instance;
                dnw dnwVar2 = dnw.a;
                str.getClass();
                dnwVar.d |= 512;
                dnwVar.ab = str;
            }
            return;
        }
        c();
    }

    @Override // defpackage.dux, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ks();
        return null;
    }

    @Override // defpackage.dux
    public final void ks() {
        dtq dtqVar = this.a;
        if (dtqVar.n) {
            super.ks();
        } else if (!dtqVar.l) {
        } else {
            c();
        }
    }
}
