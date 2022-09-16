package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: btnc  reason: default package */
/* loaded from: classes.dex */
public class btnc<Key, Value> implements btni {
    private static final dcqe a = dcqe.c("btnc");
    @dzsi
    private btmk b;
    protected int c;
    @dzsi
    private final btmv d;
    private dzqn<Key, Value> e;
    private dzpp<Key> f;
    private int g;
    private String h;
    private final btmz i;

    public btnc(int i) {
        this(i, null, null);
    }

    private final synchronized Value g(Key key) {
        Value remove;
        remove = this.e.remove(key);
        if (remove != null) {
            this.g -= this.f.b(key);
            d(key, remove);
        }
        return remove;
    }

    protected void Px(Key key, Value value) {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0010, B:10:0x0016, B:11:0x0026, B:13:0x002a, B:15:0x002e, B:37:0x00b8, B:39:0x00c6, B:40:0x00c9, B:16:0x003b, B:29:0x0072, B:31:0x007e, B:33:0x00a5, B:35:0x00ad, B:36:0x00b6, B:32:0x0089, B:17:0x0040, B:19:0x0051, B:21:0x0057, B:22:0x005a, B:23:0x005f, B:25:0x0067, B:27:0x006d), top: B:48:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0010, B:10:0x0016, B:11:0x0026, B:13:0x002a, B:15:0x002e, B:37:0x00b8, B:39:0x00c6, B:40:0x00c9, B:16:0x003b, B:29:0x0072, B:31:0x007e, B:33:0x00a5, B:35:0x00ad, B:36:0x00b6, B:32:0x0089, B:17:0x0040, B:19:0x0051, B:21:0x0057, B:22:0x005a, B:23:0x005f, B:25:0x0067, B:27:0x006d), top: B:48:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0010, B:10:0x0016, B:11:0x0026, B:13:0x002a, B:15:0x002e, B:37:0x00b8, B:39:0x00c6, B:40:0x00c9, B:16:0x003b, B:29:0x0072, B:31:0x007e, B:33:0x00a5, B:35:0x00ad, B:36:0x00b6, B:32:0x0089, B:17:0x0040, B:19:0x0051, B:21:0x0057, B:22:0x005a, B:23:0x005f, B:25:0x0067, B:27:0x006d), top: B:48:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void Pz(Key r12, Value r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btnc.Pz(java.lang.Object, java.lang.Object):void");
    }

    @dzsi
    public synchronized Value a(Key key) {
        Value value;
        dzqn<Key, Value> dzqnVar = this.e;
        if (key != null) {
            Key[] keyArr = dzqnVar.b;
            int a2 = dzgv.a(key.hashCode()) & dzqnVar.d;
            Key key2 = keyArr[a2];
            if (key2 != null) {
                if (!key.equals(key2)) {
                    while (true) {
                        a2 = (a2 + 1) & dzqnVar.d;
                        Key key3 = keyArr[a2];
                        if (key3 != null) {
                            if (key.equals(key3)) {
                                dzqnVar.i(a2);
                                value = dzqnVar.c[a2];
                                break;
                            }
                        } else {
                            value = dzqnVar.a;
                            break;
                        }
                    }
                } else {
                    dzqnVar.i(a2);
                    value = dzqnVar.c[a2];
                }
            } else {
                value = dzqnVar.a;
            }
        } else if (dzqnVar.e) {
            dzqnVar.i(dzqnVar.i);
            value = dzqnVar.c[dzqnVar.i];
        } else {
            value = dzqnVar.a;
        }
        m(value);
        return value;
    }

    @Override // defpackage.btni
    public final synchronized int b(float f) {
        int j;
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
        j = j();
        q((int) (j * f2));
        this.e.p();
        this.f.l();
        return j - j();
    }

    @Override // defpackage.btni
    public final String c() {
        int k = k();
        int j = j();
        StringBuilder sb = new StringBuilder(47);
        sb.append("numItems: ");
        sb.append(k);
        sb.append(" measuredSize: ");
        sb.append(j);
        return sb.toString();
    }

    protected void d(Key key, Value value) {
    }

    public synchronized void e() {
        q(0);
    }

    public int i(Value value) {
        return 1;
    }

    public final synchronized int j() {
        return this.g;
    }

    public final synchronized int k() {
        return this.e.k;
    }

    public final synchronized boolean l() {
        return this.e.isEmpty();
    }

    public final synchronized void m(Value value) {
        btmk btmkVar = this.b;
        if (btmkVar != null) {
            if (value != null) {
                btmkVar.a();
            } else {
                btmkVar.b();
            }
        }
    }

    @dzsi
    public synchronized Value n(Key key) {
        Value value;
        value = this.e.get(key);
        m(value);
        return value;
    }

    public final synchronized Value o(Key key) {
        return g(key);
    }

    public final synchronized Collection<Value> p() {
        return new ArrayList(this.e.values());
    }

    public final synchronized void q(int i) {
        if (i != 0) {
            while (!this.e.isEmpty() && this.g > i) {
                Key firstKey = this.e.firstKey();
                Px(firstKey, o(firstKey));
            }
            return;
        }
        this.f = new dzpp<>();
        if (!this.e.isEmpty()) {
            dzrn<dzqo<Key, Value>> Td = this.e.o().Td();
            while (Td.hasNext()) {
                dzqo<Key, Value> next = Td.next();
                d(next.getKey(), next.getValue());
                next.getKey();
                next.getValue();
                Px(next.getKey(), next.getValue());
            }
        }
        this.e = new dzqn<>();
        this.g = 0;
    }

    public final btna<Key, Value> r() {
        return new btna<>(this.e);
    }

    public btnc(int i, @dzsi btmz btmzVar, @dzsi btmv btmvVar) {
        this(i, btmzVar, null, btmvVar);
    }

    public btnc(int i, @dzsi btmz btmzVar, @dzsi Object obj, @dzsi btmv btmvVar) {
        ckcw ckcwVar;
        this.e = new dzqn<>();
        this.f = new dzpp<>();
        this.c = i;
        this.d = btmvVar;
        if (btmzVar == null) {
            this.i = btmz.OTHER;
        } else {
            this.i = btmzVar;
        }
        String str = this.i.z;
        this.h = str;
        if (obj != null) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            this.h = sb.toString();
        }
        if (btmvVar != null && (ckcwVar = btmvVar.c) != null) {
            this.b = new btml(ckcwVar).b(this.i.A, btmz.ALL_LRU.A, ckip.O, ckip.P);
        }
        if (btmvVar != null) {
            btmvVar.a(this, this.h);
        }
    }
}
