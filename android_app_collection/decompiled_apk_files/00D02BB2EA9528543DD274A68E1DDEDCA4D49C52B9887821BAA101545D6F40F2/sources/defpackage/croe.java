package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: croe  reason: default package */
/* loaded from: classes5.dex */
public final class croe implements crgy {
    public final dbsg<atbs> a;
    public boolean b;
    private final btrm c;
    private final cqat d;
    private final ckcp e;
    private final ckcp f;
    private final cjyh g;
    private final Map<croc, crod> h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;

    public croe(btrm btrmVar, cqat cqatVar, ckcw ckcwVar, dbsg<atbs> dbsgVar, cjyh cjyhVar) {
        croc[] values;
        this.c = btrmVar;
        this.d = cqatVar;
        this.a = dbsgVar;
        this.e = (ckcp) ckcwVar.a(ckhi.E);
        this.f = (ckcp) ckcwVar.a(ckhi.D);
        this.g = cjyhVar;
        EnumMap enumMap = new EnumMap(croc.class);
        for (croc crocVar : croc.values()) {
            enumMap.put((EnumMap) crocVar, (croc) new crod(ckcwVar, crocVar));
        }
        this.h = Collections.unmodifiableMap(enumMap);
    }

    private final croc d() {
        if (!this.b) {
            return croc.IDLE;
        }
        return this.k ? this.l ? croc.PIP : croc.FOREGROUND : this.l ? croc.INVISIBLE_PIP : croc.BACKGROUND;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        synchronized (this) {
            c(true, false, false);
        }
        btrm btrmVar = this.c;
        dceq a = dcet.a();
        a.b(crih.class, new crof(crih.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.c.a(this);
        synchronized (this) {
            c(false, this.k, this.l);
        }
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        croc d = d();
        this.b = z;
        this.k = z2;
        this.l = z3;
        croc d2 = d();
        if (d2 == d) {
            return;
        }
        long e = this.d.e();
        long j = e - this.j;
        this.j = e;
        crod crodVar = this.h.get(d);
        dbsk.s(crodVar);
        crod.a(crodVar, j);
        if (d == croc.IDLE) {
            this.i = this.d.e();
            for (crod crodVar2 : this.h.values()) {
                crodVar2.c = 0L;
            }
        } else if (d == croc.PIP) {
            crod crodVar3 = this.h.get(d2);
            dbsk.s(crodVar3);
            ckcp ckcpVar = crodVar3.b;
            if (ckcpVar != null) {
                ckcpVar.a(j);
            }
            if (this.g.b()) {
                crod crodVar4 = this.h.get(croc.PIP_ASSISTANT_DRIVING_MODE_ELIGIBLE);
                dbsk.s(crodVar4);
                crod.a(crodVar4, j);
            }
        } else if (d == croc.BACKGROUND && this.g.b()) {
            crod crodVar5 = this.h.get(croc.BACKGROUND_ASSISTANT_DRIVING_MODE_ELIGIBLE);
            dbsk.s(crodVar5);
            crod.a(crodVar5, j);
        }
        if (d2 != croc.IDLE) {
            return;
        }
        this.e.a(e - this.i);
        if (this.g.b()) {
            this.f.a(e - this.i);
        }
        for (crod crodVar6 : this.h.values()) {
            ckcp ckcpVar2 = crodVar6.a;
            if (ckcpVar2 != null) {
                ckcpVar2.a(crodVar6.c);
            }
        }
    }
}
