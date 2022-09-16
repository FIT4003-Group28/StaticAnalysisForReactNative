package defpackage;

import android.util.SparseArray;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tgt  reason: default package */
/* loaded from: classes4.dex */
public final class tgt implements tcp {
    public static final SparseArray b;
    public final int c;
    public boolean d;
    public final long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    private final thu k;
    private final Executor l;
    private final String m;
    private int n;
    private String o;
    private final akvy p;

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(16, thq.FIRST_ROOT_PREPARATION);
        sparseArray.put(6, thq.ROOT_MOUNTING);
    }

    public tgt(int i, String str, thu thuVar, Executor executor) {
        thm thmVar = thm.b;
        this.n = -1;
        this.d = false;
        this.o = null;
        this.c = i;
        this.l = executor;
        this.k = thuVar;
        this.e = aolu.x();
        this.p = thl.a();
        this.m = str;
    }

    @Override // defpackage.ddb
    public final void a(String str, String str2) {
        if ("CellLogId".equals(str)) {
            try {
                this.n = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.n = -1;
            }
        } else if (!"CELL_NODE_ID".equals(str)) {
        } else {
            this.o = str2;
        }
    }

    @Override // defpackage.tcp
    public final void c() {
        this.d = true;
    }

    @Override // defpackage.tcp
    public final void d() {
        this.f = aolu.x();
        this.l.execute(new Runnable() { // from class: tgs
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                tgt tgtVar = tgt.this;
                if (tgtVar.d) {
                    return;
                }
                if (tgt.b.get(tgtVar.c) == null) {
                    str = thq.UNKNOWN.m;
                } else {
                    str = ((thq) tgt.b.get(tgtVar.c)).m;
                }
                tgtVar.f(str, tgtVar.e, tgtVar.f);
                if (tgtVar.i > 0 && tgtVar.j > 0) {
                    tgtVar.f(thq.FIRST_ROOT_MATERIALIZATION.m, tgtVar.i, tgtVar.j);
                }
                if (tgtVar.g <= 0 || tgtVar.h <= 0) {
                    return;
                }
                tgtVar.f(thq.FIRST_ROOT_MEASUREMENT.m, tgtVar.g, tgtVar.h);
            }
        });
    }

    @Override // defpackage.tcp
    public final boolean e() {
        return !this.d;
    }

    public final void f(String str, long j, long j2) {
        tho a = thp.a();
        a.h = this.p;
        a.c(amyg.a);
        String str2 = this.o;
        if (str2 != null) {
            a.a = str2;
        }
        thn a2 = thr.a();
        a2.b(str);
        a2.a = Long.valueOf(j);
        a2.b = Long.valueOf(j2);
        a2.e = a.a();
        thr a3 = a2.a();
        int i = this.n;
        if (i > 0) {
            this.k.e(this.m, i, a3);
        } else {
            this.k.f(this.m, a3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ddb
    public final void b(String str) {
        char c;
        if (this.c != 16) {
            return;
        }
        switch (str.hashCode()) {
            case -2086025552:
                if (str.equals("start_create_layout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -935948671:
                if (str.equals("start_measure")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 749650793:
                if (str.equals("end_create_layout")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1694616058:
                if (str.equals("end_measure")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.i = aolu.x();
            this.j = -1L;
        } else if (c == 1) {
            this.j = aolu.x();
        } else if (c == 2) {
            this.g = aolu.x();
            this.h = -1L;
        } else if (c != 3) {
        } else {
            this.h = aolu.x();
        }
    }
}
