package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: afga  reason: default package */
/* loaded from: classes.dex */
public final class afga {
    public final List a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c;
    public long d;
    public boolean e;
    public final pbo f;
    public final affq g;
    private final pwx h;
    private final boolean i;
    private volatile boolean j;

    public afga(pbo pboVar, pwx pwxVar, boolean z, affq affqVar) {
        this.f = pboVar;
        this.h = pwxVar;
        this.i = z;
        this.g = affqVar;
    }

    public final void a() {
        this.f.c(this.c);
    }

    public final void b(Object obj) {
        this.a.remove(obj);
        affz affzVar = (affz) this.b.remove(obj);
        if (affzVar != null) {
            this.c -= affzVar.a;
        }
        c();
    }

    public final void c() {
        int a = this.f.a();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.a.size()) {
                break;
            }
            affz affzVar = (affz) this.b.get(this.a.get(i));
            if (affzVar != null) {
                z |= affzVar.c;
                if (affzVar.d == -1) {
                    z3 = false;
                }
                z2 |= z3;
                i2 |= affzVar.b;
            }
            i++;
        }
        boolean z4 = !this.a.isEmpty() && (z || z2) && i2 != 0 && a < this.c;
        this.e = z4;
        int i3 = true != this.i ? 0 : -10;
        if (z4) {
            if (!this.j) {
                this.h.a(i3);
                this.j = true;
            }
        } else if (this.j) {
            this.h.c(i3);
            this.j = false;
        }
        this.d = -1L;
        if (this.e) {
            for (int i4 = 0; i4 < this.a.size(); i4++) {
                affz affzVar2 = (affz) this.b.get(this.a.get(i4));
                long j = affzVar2 != null ? affzVar2.d : -1L;
                if (j != -1) {
                    long j2 = this.d;
                    if (j2 == -1 || j < j2) {
                        this.d = j;
                    }
                }
            }
        }
    }
}
