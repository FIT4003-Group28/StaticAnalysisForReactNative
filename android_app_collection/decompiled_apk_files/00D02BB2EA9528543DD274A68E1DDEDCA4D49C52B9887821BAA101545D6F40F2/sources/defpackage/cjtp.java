package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cjtp  reason: default package */
/* loaded from: classes.dex */
public class cjtp extends cjtk {
    private static final int[] a = new int[0];
    private final ddmz b;
    private int[] c;
    private final dbsg<ddlp> d;
    @dzsi
    private ddbq e;

    public cjtp(long j, dbsg<ddlp> dbsgVar) {
        this(j, dbsgVar, null);
    }

    private final synchronized ddna z() {
        ddmz ca;
        ca = ddna.v.ca(this.b.bK());
        D(ca);
        return ca.bK();
    }

    @Override // defpackage.cjtk
    public synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        ddna z = z();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        z.getClass();
        dwunVar.m = z;
        dwunVar.a |= 128;
    }

    public synchronized void D(ddmz ddmzVar) {
        int[] iArr;
        double d;
        Matcher matcher;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = ddna.v;
        ((ddna) ddmzVar.b).j = ddna.cf();
        for (int i : this.c) {
            if (ddmzVar.c) {
                ddmzVar.bF();
                ddmzVar.c = false;
            }
            ddna ddnaVar2 = (ddna) ddmzVar.b;
            dsrf dsrfVar = ddnaVar2.j;
            if (!dsrfVar.a()) {
                ddnaVar2.j = dsqw.cg(dsrfVar);
            }
            ddnaVar2.j.h(i);
        }
        if (this.d.a()) {
            ddlp b = this.d.b();
            if (ddmzVar.c) {
                ddmzVar.bF();
                ddmzVar.c = false;
            }
            ddna ddnaVar3 = (ddna) ddmzVar.b;
            b.getClass();
            ddnaVar3.h = b;
            ddnaVar3.a |= 512;
        }
        ddls ddlsVar = ((ddna) ddmzVar.b).e;
        if (ddlsVar == null) {
            ddlsVar = ddls.k;
        }
        dsqp dsqpVar = (dsqp) ddlsVar.cu(5);
        dsqpVar.bC(ddlsVar);
        ddlr ddlrVar = (ddlr) dsqpVar;
        ddbq ddbqVar = this.e;
        if (ddbqVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar2 = (ddls) ddlrVar.b;
            ddbqVar.getClass();
            ddlsVar2.i = ddbqVar;
            ddlsVar2.a |= 2048;
        }
        cssm c = cssm.c();
        c.toString();
        long max = Math.max(0L, c.n);
        double d2 = c.o;
        Double.isNaN(d2);
        int max2 = (int) Math.max(0L, Math.min(2147483647L, Math.round(d2 / 1024.0d)));
        double d3 = c.p;
        Double.isNaN(d3);
        int max3 = (int) Math.max(0L, Math.min(2147483647L, Math.round(d3 / 1024.0d)));
        ddng bZ = ddnh.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddnh ddnhVar = (ddnh) bZ.b;
        int i2 = ddnhVar.a | 1;
        ddnhVar.a = i2;
        ddnhVar.b = max;
        int i3 = i2 | 4;
        ddnhVar.a = i3;
        ddnhVar.d = max2;
        ddnhVar.a = i3 | 2;
        ddnhVar.c = max3;
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                matcher = Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB").matcher(new String(ddau.a(new File("/proc/self/status")).a()));
            } catch (IOException | IllegalArgumentException e) {
                dcqe.b.v(dcqz.LARGE);
                e.getMessage();
                d = -1.0d;
            }
            if (matcher.find()) {
                d = Double.parseDouble(matcher.group(1));
                if (d == dcyn.a) {
                    dcqe.b.v(dcqz.LARGE);
                }
                int i4 = (int) d;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddnh ddnhVar2 = (ddnh) bZ.b;
                ddnhVar2.a |= 8;
                ddnhVar2.e = i4;
            } else {
                throw new IllegalArgumentException("invalid proc status");
            }
        }
        ddnh bK = bZ.bK();
        if (ddlrVar.c) {
            ddlrVar.bF();
            ddlrVar.c = false;
        }
        ddls ddlsVar3 = (ddls) ddlrVar.b;
        bK.getClass();
        ddlsVar3.g = bK;
        ddlsVar3.a |= 128;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar4 = (ddna) ddmzVar.b;
        ddls bK2 = ddlrVar.bK();
        bK2.getClass();
        ddnaVar4.e = bK2;
        ddnaVar4.a |= 128;
    }

    public final synchronized int c() {
        return ((ddna) this.b.b).b;
    }

    public final synchronized boolean d() {
        return (((ddna) this.b.b).a & 4) != 0;
    }

    public void e(List<cjsa> list) {
        t(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void t(List<cjsa> list) {
        ddxx c;
        ddxz e;
        ddxz c2;
        ddmz ddmzVar = this.b;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = ddna.v;
        ((ddna) ddmzVar.b).g = ddna.ck();
        for (cjsa cjsaVar : list) {
            ddmx bZ = ddmy.e.bZ();
            cjrc cjrcVar = cjsaVar.a;
            if (cjrcVar != null && (c2 = cjrcVar.c()) != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddmy ddmyVar = (ddmy) bZ.b;
                c2.getClass();
                ddmyVar.b = c2;
                ddmyVar.a |= 1;
            }
            String str = cjsaVar.b;
            if (str != null && (e = cjra.e(str)) != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddmy ddmyVar2 = (ddmy) bZ.b;
                e.getClass();
                ddmyVar2.c = e;
                ddmyVar2.a |= 2;
            }
            String str2 = cjsaVar.c;
            if (str2 != null && (c = cjrx.c(str2)) != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddmy ddmyVar3 = (ddmy) bZ.b;
                c.getClass();
                ddmyVar3.d = c;
                ddmyVar3.a |= 4;
            }
            ddmz ddmzVar2 = this.b;
            if (ddmzVar2.c) {
                ddmzVar2.bF();
                ddmzVar2.c = false;
            }
            ddna ddnaVar2 = (ddna) ddmzVar2.b;
            ddmy bK = bZ.bK();
            bK.getClass();
            dsrj<ddmy> dsrjVar = ddnaVar2.g;
            if (!dsrjVar.a()) {
                ddnaVar2.g = dsqw.cl(dsrjVar);
            }
            ddnaVar2.g.add(bK);
        }
    }

    public final synchronized int[] u() {
        return this.c;
    }

    public final synchronized void v(ddbq ddbqVar) {
        this.e = ddbqVar;
    }

    public final synchronized void w(ddlj ddljVar) {
        ddmz ddmzVar = this.b;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        ddljVar.getClass();
        ddnaVar.i = ddljVar;
        ddnaVar.a |= 1024;
    }

    public final synchronized void x(int[] iArr) {
        this.c = iArr;
    }

    public final synchronized void y(int i) {
        ddmz ddmzVar = this.b;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        ddnaVar.a |= 4;
        ddnaVar.b = i;
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: -1
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:25)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:136)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public cjtp(long r0, long r2, defpackage.dbsg<defpackage.ddlp> r4) {
        /*
            r-1 = this;
            r0.<init>(r1)
            int[] r1 = defpackage.cjtp.a
            r0.c = r1
            r1 = 0
            r0.e = r1
            ddna r1 = defpackage.ddna.v
            dsqp r1 = r1.bZ()
            ddmz r1 = (defpackage.ddmz) r1
            r0.b = r1
            r0.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjtp.<init>(long, dbsg, byte[]):void");
    }
}
