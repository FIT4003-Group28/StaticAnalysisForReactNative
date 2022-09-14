package defpackage;
/* compiled from: PG */
/* renamed from: btnf  reason: default package */
/* loaded from: classes.dex */
public class btnf<Value> implements btni {
    private static final dcqe b = dcqe.c("btnf");
    protected final int a;
    @dzsi
    private btmk c;
    @dzsi
    private final btmv d;
    private dzmd<Value> e = new dzmd<>();
    private dzls f = new dzls();
    private int g;
    private final String h;
    private final btne i;

    public btnf(int i, btne btneVar, btmv btmvVar) {
        this.a = i;
        this.d = btmvVar;
        this.i = btneVar;
        String str = btneVar.e;
        this.h = str;
        ckcw ckcwVar = btmvVar == null ? null : btmvVar.c;
        if (ckcwVar != null) {
            this.c = new btml(ckcwVar).b(btneVar.f, btne.ALL_LONG_LRU.f, ckip.Q, ckip.R);
        }
        if (btmvVar != null) {
            btmvVar.a(this, str);
        }
    }

    private final synchronized void a(long j) {
        Value b2 = this.e.b(j);
        if (b2 != null) {
            this.g -= this.f.b(j);
            g(b2);
        }
    }

    @Override // defpackage.btni
    public final synchronized int b(float f) {
        int h;
        float f2 = 0.5f;
        if (f < 0.0f) {
            try {
                bvoo.h("fraction %f < 0", Float.valueOf(f));
                f = 0.5f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f > 1.0f) {
            bvoo.h("fraction %f > 1", Float.valueOf(f));
        } else {
            f2 = f;
        }
        h = h();
        m((int) (h * f2));
        this.e.z();
        this.f.n();
        return h - h();
    }

    @Override // defpackage.btni
    public final String c() {
        int i = i();
        int h = h();
        StringBuilder sb = new StringBuilder(47);
        sb.append("numItems: ");
        sb.append(i);
        sb.append(" measuredSize: ");
        sb.append(h);
        return sb.toString();
    }

    protected void g(Value value) {
    }

    public final synchronized int h() {
        return this.g;
    }

    public final synchronized int i() {
        return this.e.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x0014, B:10:0x001d, B:12:0x0021, B:33:0x00a6, B:35:0x00b3, B:37:0x00be, B:36:0x00b7, B:13:0x002e, B:26:0x0062, B:28:0x006e, B:30:0x0095, B:32:0x009d, B:29:0x0079, B:14:0x0033, B:18:0x0047, B:19:0x004a, B:20:0x004f, B:24:0x005d), top: B:45:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x0014, B:10:0x001d, B:12:0x0021, B:33:0x00a6, B:35:0x00b3, B:37:0x00be, B:36:0x00b7, B:13:0x002e, B:26:0x0062, B:28:0x006e, B:30:0x0095, B:32:0x009d, B:29:0x0079, B:14:0x0033, B:18:0x0047, B:19:0x004a, B:20:0x004f, B:24:0x005d), top: B:45:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x0014, B:10:0x001d, B:12:0x0021, B:33:0x00a6, B:35:0x00b3, B:37:0x00be, B:36:0x00b7, B:13:0x002e, B:26:0x0062, B:28:0x006e, B:30:0x0095, B:32:0x009d, B:29:0x0079, B:14:0x0033, B:18:0x0047, B:19:0x004a, B:20:0x004f, B:24:0x005d), top: B:45:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(long r13, Value r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btnf.j(long, java.lang.Object):void");
    }

    public final synchronized void k(Value value) {
        btmk btmkVar = this.c;
        if (btmkVar != null) {
            if (value != null) {
                btmkVar.a();
            } else {
                btmkVar.b();
            }
        }
    }

    public final synchronized Value l(long j) {
        Value value;
        dzmd<Value> dzmdVar = this.e;
        value = null;
        if (j != 0) {
            long[] jArr = dzmdVar.a;
            int b2 = dzmdVar.c & ((int) dzgv.b(j));
            long j2 = jArr[b2];
            if (j2 != 0) {
                if (j != j2) {
                    while (true) {
                        b2 = (b2 + 1) & dzmdVar.c;
                        long j3 = jArr[b2];
                        if (j3 == 0) {
                            break;
                        } else if (j == j3) {
                            dzmdVar.m(b2);
                            value = dzmdVar.b[b2];
                            break;
                        }
                    }
                } else {
                    dzmdVar.m(b2);
                    value = dzmdVar.b[b2];
                }
            }
        } else if (dzmdVar.d) {
            dzmdVar.m(dzmdVar.h);
            value = dzmdVar.b[dzmdVar.h];
        }
        k(value);
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void m(int i) {
        if (i != 0) {
            while (!this.e.isEmpty() && this.g > i) {
                n(this.e.p());
            }
            return;
        }
        this.f = new dzls();
        if (!this.e.isEmpty()) {
            dzlw dzlwVar = new dzlw(((dzma) this.e.v()).a);
            while (dzlwVar.hasNext()) {
                dzme dzmeVar = (dzme) dzlwVar.next();
                dzmeVar.b();
                g(dzmeVar.getValue());
                dzmeVar.b();
                dzmeVar.getValue();
            }
        }
        this.e = new dzmd<>();
        this.g = 0;
    }

    public final synchronized void n(long j) {
        a(j);
    }
}
