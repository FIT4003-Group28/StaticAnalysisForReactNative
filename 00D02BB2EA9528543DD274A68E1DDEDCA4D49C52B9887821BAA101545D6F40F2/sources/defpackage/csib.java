package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csib  reason: default package */
/* loaded from: classes5.dex */
public final class csib {
    public final csga a;
    private final csih h;
    public final cshr<csgt> c = new csia(this);
    public int d = 0;
    public Runnable e = null;
    public final int f = 0;
    public Runnable g = null;
    public final csie b = new csie();

    public csib(csga csgaVar, csih csihVar) {
        this.a = csgaVar;
        this.h = csihVar;
    }

    public final void a() {
        if (this.e != null) {
            return;
        }
        Runnable runnable = new Runnable(this) { // from class: cshw
            private final csib a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        this.e = runnable;
        int i = this.d;
        if (i > 0) {
            czhz.f(runnable, i);
        } else {
            czhz.e(runnable);
        }
    }

    public final void b() {
        this.e = null;
        csie csieVar = this.b;
        if (!csieVar.c.isEmpty() || !csieVar.a.isEmpty() || !csieVar.b.isEmpty() || !csieVar.e.isEmpty()) {
            dazk a = dbaa.a("GIL:AutoProcessBatch");
            try {
                this.a.a(new csfz(this) { // from class: cshx
                    private final csib a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.csfz
                    public final List a() {
                        final csib csibVar = this.a;
                        csie csieVar2 = csibVar.b;
                        dazk a2 = dbaa.a("GIL:CreateInsertGrafts");
                        try {
                            for (csgt csgtVar : csieVar2.a) {
                                if (csgtVar.d == -1) {
                                    csieVar2.b(csgtVar);
                                }
                            }
                            csieVar2.a.clear();
                            for (csgt csgtVar2 : csieVar2.d) {
                                csgtVar2.d = -1;
                            }
                            csieVar2.d.clear();
                            a2.close();
                            dazk a3 = dbaa.a("GIL:CreateVisibilityGrafts");
                            try {
                                for (csgt csgtVar3 : csieVar2.b) {
                                    dbsk.p(csgtVar3.e(), "Not impressed: %s", csgtVar3);
                                    ddhj a4 = csgtVar3.a();
                                    csha cshaVar = csgtVar3.a;
                                    ddhj b = ddhj.b(((cshb) cshaVar.b).d);
                                    if (b == null) {
                                        b = ddhj.VISIBILITY_VISIBLE;
                                    }
                                    if (b != a4) {
                                        ddhj b2 = ddhj.b(((cshb) cshaVar.b).d);
                                        if (b2 == null) {
                                            b2 = ddhj.VISIBILITY_VISIBLE;
                                        }
                                        int ordinal = b2.ordinal();
                                        if (ordinal == 2 || ordinal == 4) {
                                            if (a4 != ddhj.VISIBILITY_HIDDEN) {
                                                dbsk.m(a4 != ddhj.VISIBILITY_VISIBLE, "Repressed VE was visible.");
                                            }
                                        }
                                        if (cshaVar.c) {
                                            cshaVar.bF();
                                            cshaVar.c = false;
                                        }
                                        cshb cshbVar = (cshb) cshaVar.b;
                                        cshbVar.d = a4.g;
                                        cshbVar.a |= 2;
                                        ArrayList arrayList = new ArrayList();
                                        cshv.a(csgtVar3, arrayList);
                                        csid c = csieVar2.c(arrayList, 0);
                                        ddhj b3 = ddhj.b(((cshb) arrayList.get(0)).d);
                                        if (b3 == null) {
                                            b3 = ddhj.VISIBILITY_VISIBLE;
                                        }
                                        if (b3 == ddhj.VISIBILITY_VISIBLE) {
                                            c.a(new csip(2, arrayList, c.e.size()));
                                            csic csicVar = new csic(c);
                                            ddxx ddxxVar = ((cshb) csgtVar3.a.b).c;
                                            if (ddxxVar == null) {
                                                ddxxVar = ddxx.j;
                                            }
                                            ddxz ddxzVar = ddxxVar.i;
                                            if (ddxzVar == null) {
                                                ddxzVar = ddxz.d;
                                            }
                                            if ((2 & ddxzVar.a) != 0) {
                                                csicVar.a(csgtVar3);
                                            }
                                        } else {
                                            c.a(new csip(3, arrayList, -1));
                                        }
                                    }
                                }
                                csieVar2.b.clear();
                                a3.close();
                                if (!csieVar2.e.isEmpty()) {
                                    a3 = dbaa.a("GIL:CreateRemoveGrafts");
                                    try {
                                        for (Map.Entry<csgt, Collection<cshb>> entry : csieVar2.e.entrySet()) {
                                            Collection<cshb> value = entry.getValue();
                                            for (cshb cshbVar2 : value) {
                                                csgt key = entry.getKey();
                                                ddhj b4 = ddhj.b(cshbVar2.d);
                                                if (b4 == null) {
                                                    b4 = ddhj.VISIBILITY_VISIBLE;
                                                }
                                                if (b4 == ddhj.VISIBILITY_VISIBLE) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    dsqp dsqpVar = (dsqp) cshbVar2.cu(5);
                                                    dsqpVar.bC(cshbVar2);
                                                    csha cshaVar2 = (csha) dsqpVar;
                                                    ddhj ddhjVar = ddhj.VISIBILITY_HIDDEN;
                                                    if (cshaVar2.c) {
                                                        cshaVar2.bF();
                                                        cshaVar2.c = false;
                                                    }
                                                    cshb cshbVar3 = (cshb) cshaVar2.b;
                                                    cshbVar3.d = ddhjVar.g;
                                                    cshbVar3.a |= 2;
                                                    arrayList2.add((cshb) cshaVar2.bK());
                                                    if (key != null) {
                                                        cshv.a(key, arrayList2);
                                                    }
                                                    csieVar2.c(arrayList2, 0).a(new csip(3, arrayList2, -1));
                                                }
                                            }
                                            value.clear();
                                            csieVar2.f = value;
                                        }
                                        a3.close();
                                        csieVar2.e.clear();
                                    } finally {
                                    }
                                }
                                if (csibVar.d >= 0) {
                                    return csibVar.b.a();
                                }
                                if (csibVar.g != null) {
                                    return null;
                                }
                                csibVar.g = new Runnable(csibVar) { // from class: cshy
                                    private final csib a;

                                    {
                                        this.a = csibVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final csib csibVar2 = this.a;
                                        csibVar2.g = null;
                                        dazk a5 = dbaa.a("GIL:AutoProcessLogBatch");
                                        try {
                                            csibVar2.a.a(new csfz(csibVar2) { // from class: cshz
                                                private final csib a;

                                                {
                                                    this.a = csibVar2;
                                                }

                                                @Override // defpackage.csfz
                                                public final List a() {
                                                    return this.a.b.a();
                                                }
                                            });
                                            a5.close();
                                        } catch (Throwable th) {
                                            try {
                                                a5.close();
                                            } catch (Throwable th2) {
                                                deki.a(th, th2);
                                            }
                                            throw th;
                                        }
                                    }
                                };
                                czhz.f(csibVar.g, -csibVar.d);
                                return null;
                            } finally {
                            }
                        } finally {
                            try {
                                a2.close();
                            } catch (Throwable th) {
                                deki.a(th, th);
                            }
                        }
                    }
                });
                a.close();
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
                throw th;
            }
        }
    }
}
