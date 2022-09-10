package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.dyvl;
import java.io.InputStream;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: deye  reason: default package */
/* loaded from: classes6.dex */
abstract class deye<L extends dyvl> implements dyvk {
    @dzsi
    private InputStream a;
    protected final dexw b;
    protected final dyel c;
    final int d;
    @dzsi
    protected deyt e;
    @dzsi
    protected dyvi f;
    @dzsi
    protected L g;
    @dzsi
    public ArrayList<deyd> h;
    public boolean i;
    public deyc j = deyc.UNINITIALIZED;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public deye(dexw dexwVar, dyel dyelVar, int i) {
        this.b = dexwVar;
        this.c = dyelVar;
        this.d = i;
    }

    private final boolean p() {
        return this.a != null || this.l > 0;
    }

    private final boolean q() {
        return this.i && this.k >= this.m;
    }

    private final void r(dyjb dyjbVar, dyjb dyjbVar2, boolean z) {
        if (!i()) {
            deyc deycVar = this.j;
            deyc deycVar2 = deyc.UNINITIALIZED;
            h(deyc.CLOSED);
            if (deycVar != deycVar2) {
                this.f.m();
            }
            if (!z) {
                dexw dexwVar = this.b;
                int i = this.d;
                Parcel obtain = Parcel.obtain();
                obtain.writeInt(0);
                int i2 = dyjbVar.p.r << 16;
                String str = dyjbVar.q;
                if (str != null && str.length() > 1000) {
                    str = str.substring(0, 1000);
                }
                if (str != null) {
                    i2 |= 32;
                    obtain.writeString(str);
                }
                dezb.c(obtain, i2 | 8);
                try {
                    dexwVar.o(i, obtain);
                } catch (RemoteException | dyjc unused) {
                }
                obtain.recycle();
            }
            if (deycVar != deycVar2) {
                d(dyjbVar2);
            }
            g();
        }
    }

    private final void s() {
        deyd deydVar;
        if (this.l == 0) {
            for (int i = 0; i < this.h.size() && (deydVar = this.h.get(i)) != null; i++) {
                if (deydVar.d) {
                    this.l = i + 1;
                    t();
                    return;
                }
            }
        }
    }

    private final void t() {
        dbsk.s(this.f);
        this.f.g();
        this.f.h();
        this.o++;
    }

    public boolean a() {
        throw null;
    }

    public abstract void b(int i, Parcel parcel);

    protected abstract void c();

    protected abstract void d(dyjb dyjbVar);

    public abstract void e(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(deyt deytVar, L l) {
        this.e = deytVar;
        this.f = deytVar.a;
        this.g = l;
        if (!i()) {
            h(deyc.INITIALIZED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        final dexw dexwVar = this.b;
        if (a()) {
            dexv dexvVar = (dexv) dexwVar;
            if (dexvVar.c.decrementAndGet() == 0) {
                dexvVar.d.b(false);
            }
        }
        if (dexwVar.h.remove(Integer.valueOf(this.d)) == null || !dexwVar.h.isEmpty()) {
            return;
        }
        dexwVar.f.execute(new Runnable(dexwVar) { // from class: dexs
            private final dexw a;

            {
                this.a = dexwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dexw dexwVar2 = this.a;
                synchronized (dexwVar2) {
                    if (dexwVar2.q(4)) {
                        dexwVar2.n(dexwVar2.j, true);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(deyc deycVar) {
        deyc deycVar2 = this.j;
        deyc deycVar3 = deyc.UNINITIALIZED;
        int ordinal = deycVar.ordinal();
        boolean z = false;
        if (ordinal == 1) {
            if (deycVar2 == deyc.UNINITIALIZED) {
                z = true;
            }
            dbsk.r(z, "%s -> %s", deycVar2, deycVar);
        } else if (ordinal == 2) {
            if (deycVar2 == deyc.INITIALIZED || deycVar2 == deyc.UNINITIALIZED) {
                z = true;
            }
            dbsk.r(z, "%s -> %s", deycVar2, deycVar);
        } else if (ordinal == 3) {
            if (deycVar2 == deyc.PREFIX_DELIVERED) {
                z = true;
            }
            dbsk.r(z, "%s -> %s", deycVar2, deycVar);
        } else if (ordinal == 4) {
            if (deycVar2 == deyc.ALL_MESSAGES_DELIVERED) {
                z = true;
            }
            dbsk.r(z, "%s -> %s", deycVar2, deycVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.j = deycVar;
    }

    protected final boolean i() {
        return this.j == deyc.CLOSED;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            deyc r1 = defpackage.deyc.UNINITIALIZED
            deyc r1 = r4.j
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L20
            if (r1 == r2) goto L17
            goto L72
        L17:
            L extends dyvl r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.i
            if (r1 == 0) goto L72
            goto L39
        L20:
            L extends dyvl r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.r
            if (r1 != 0) goto L72
            boolean r1 = r4.p()
            if (r1 == 0) goto L33
            int r1 = r4.p
            if (r1 == 0) goto L72
            goto L39
        L33:
            boolean r1 = r4.q()
            if (r1 == 0) goto L72
        L39:
            deyc r1 = r4.j
            int r1 = r1.ordinal()
            if (r1 == r3) goto L4a
            if (r1 != r2) goto L44
            goto L65
        L44:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L4a:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.p()
            if (r1 == 0) goto L5c
            r4.r = r0
            L extends dyvl r1 = r4.g
            r1.c(r4)
            goto L8
        L5c:
            boolean r1 = r4.i
            if (r1 == 0) goto L8
            deyc r1 = defpackage.deyc.ALL_MESSAGES_DELIVERED
            r4.h(r1)
        L65:
            boolean r1 = r4.i
            if (r1 == 0) goto L8
            deyc r1 = defpackage.deyc.SUFFIX_DELIVERED
            r4.h(r1)
            r4.c()
            goto L8
        L72:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deye.j():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(dyjb dyjbVar) {
        r(dyjb.c, dyjbVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(dyjb dyjbVar) {
        r(dyjbVar, dyjbVar, false);
    }

    public final void m(int i) {
        this.p += i;
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n(Parcel parcel) {
        parcel.dataSize();
        if (i()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (dezb.a(readInt, 8)) {
                dyjb b = dezb.b(readInt, parcel);
                r(b, b, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean a = dezb.a(readInt, 1);
            boolean a2 = dezb.a(readInt, 2);
            boolean a3 = dezb.a(readInt, 4);
            if (a) {
                e(parcel);
                h(deyc.PREFIX_DELIVERED);
            }
            if (a2) {
                if ((readInt & 64) != 0) {
                    deyv.a(this.c);
                    throw dyjb.h.g("Parcelable messages not allowed").l();
                }
                int readInt3 = parcel.readInt();
                byte[] b2 = dexy.b(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(b2);
                }
                int i = readInt & 128;
                boolean z = i == 0;
                if (this.h == null) {
                    if (this.o != 0 || i != 0 || readInt2 != this.k) {
                        this.h = new ArrayList<>(16);
                    } else {
                        dbsk.l(this.a == null);
                        this.a = new dexx(b2);
                        t();
                    }
                }
                deyd deydVar = new deyd(b2, readInt3, z);
                int i2 = readInt2 - this.k;
                if (i2 < this.h.size()) {
                    this.h.set(i2, deydVar);
                    s();
                } else if (i2 > this.h.size()) {
                    do {
                        this.h.add(null);
                    } while (i2 > this.h.size());
                    this.h.add(deydVar);
                } else {
                    this.h.add(deydVar);
                    s();
                }
            }
            if (a3) {
                b(readInt, parcel);
                this.m = readInt2;
                this.i = true;
            }
            int i3 = this.k;
            if (readInt2 == i3) {
                ArrayList<deyd> arrayList = this.h;
                if (arrayList == null) {
                    this.k = i3 + 1;
                } else if (!a2 && !a3) {
                    arrayList.remove(0);
                    this.k++;
                }
            }
            int dataSize = this.n + parcel.dataSize();
            this.n = dataSize;
            dyvi dyviVar = this.f;
            if (dyviVar != null && dataSize != 0) {
                dyviVar.e(dataSize);
                this.f.i();
                this.n = 0;
            }
            j();
        } catch (dyjc e) {
            l(e.a);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.i;
        String valueOf = String.valueOf(this.j);
        boolean p = p();
        boolean z2 = this.g != null;
        sb = new StringBuilder(String.valueOf(simpleName).length() + 36 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(p);
        sb.append("/Lis=");
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.dyvk
    @dzsi
    public final synchronized InputStream o() {
        dexx dexxVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (p()) {
            int i = this.l;
            this.l = 0;
            if (i == 1) {
                deyd remove = this.h.remove(0);
                int i2 = remove.c;
                InputStream inputStream2 = remove.a;
                dexxVar = new dexx(remove.b);
            } else {
                byte[][] bArr = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = this.h.remove(0).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                dexxVar = new dexx(bArr, i3);
            }
            this.k += i;
            s();
            inputStream = dexxVar;
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (q() && !i()) {
                h(deyc.ALL_MESSAGES_DELIVERED);
                j();
                return null;
            }
        }
        return inputStream;
    }
}
