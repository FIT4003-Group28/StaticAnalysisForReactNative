package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: aycr  reason: default package */
/* loaded from: classes2.dex */
abstract class aycr implements aymm {
    private InputStream a;
    protected final aycl b;
    protected final axyb c;
    final int d;
    protected aycw e;
    protected aymk f;
    protected aymn g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private aycp n = aycp.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public aycr(aycl ayclVar, axyb axybVar, int i) {
        this.b = ayclVar;
        this.c = axybVar;
        this.d = i;
    }

    private final void p(Status status, Status status2, boolean z) {
        if (!o()) {
            aycp aycpVar = this.n;
            aycp aycpVar2 = aycp.UNINITIALIZED;
            l(aycp.CLOSED);
            if (aycpVar != aycpVar2) {
                this.f.l(status2);
            }
            if (!z) {
                aycl ayclVar = this.b;
                int i = this.d;
                Parcel obtain = Parcel.obtain();
                obtain.writeInt(0);
                int value = status.getCode().value() << 16;
                String description = status.getDescription();
                if (description != null && description.length() > 1000) {
                    description = description.substring(0, 1000);
                }
                if (description != null) {
                    value |= 32;
                    obtain.writeString(description);
                }
                azqn.j(obtain, value | 8);
                try {
                    ayclVar.n(i, obtain);
                } catch (StatusException e) {
                    aycl.e.logp(Level.WARNING, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
                }
                obtain.recycle();
            }
            if (aycpVar != aycpVar2) {
                a(status2);
            }
            n();
        }
    }

    private final void q() {
        aycq aycqVar;
        if (this.i == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.j.size() && (aycqVar = (aycq) this.j.get(i2)) != null; i2++) {
                i += aycqVar.c;
                if (aycqVar.d) {
                    this.i = i2 + 1;
                    r(i);
                    return;
                }
            }
        }
    }

    private final void r(int i) {
        aymk aymkVar = this.f;
        aymkVar.getClass();
        aymkVar.d(this.o);
        long j = i;
        this.f.e(this.o, j, j);
        this.o++;
    }

    private final boolean s() {
        return this.a != null || this.i > 0;
    }

    private final boolean t() {
        return this.k && this.h >= this.l;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public boolean d() {
        throw null;
    }

    public abstract void e(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Status status) {
        p(status, status, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Status status) {
        p(Status.c, status, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            aycp r1 = defpackage.aycp.UNINITIALIZED
            aycp r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L20
            if (r1 == r2) goto L17
            goto L72
        L17:
            aymn r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.k
            if (r1 == 0) goto L72
            goto L39
        L20:
            aymn r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.r
            if (r1 != 0) goto L72
            boolean r1 = r4.s()
            if (r1 == 0) goto L33
            int r1 = r4.p
            if (r1 == 0) goto L72
            goto L39
        L33:
            boolean r1 = r4.t()
            if (r1 == 0) goto L72
        L39:
            aycp r1 = r4.n
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
            boolean r1 = r4.s()
            if (r1 == 0) goto L5c
            r4.r = r0
            aymn r1 = r4.g
            r1.d(r4)
            goto L8
        L5c:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aycp r1 = defpackage.aycp.ALL_MESSAGES_DELIVERED
            r4.l(r1)
        L65:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aycp r1 = defpackage.aycp.SUFFIX_DELIVERED
            r4.l(r1)
            r4.b()
            goto L8
        L72:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycr.i():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j(Parcel parcel) {
        if (o()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (azqn.k(readInt, 8)) {
                Status i = azqn.i(readInt, parcel);
                p(i, i, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean k = azqn.k(readInt, 1);
            boolean k2 = azqn.k(readInt, 2);
            boolean k3 = azqn.k(readInt, 4);
            if (k) {
                e(parcel);
                l(aycp.PREFIX_DELIVERED);
            }
            if (k2) {
                if ((readInt & 64) != 0) {
                    azqn azqnVar = (azqn) this.c.c(aycl.g);
                    throw Status.h.withDescription("Parcelable messages not allowed").asException();
                }
                int readInt3 = parcel.readInt();
                byte[] c = aycn.c(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(c);
                }
                int i2 = readInt & 128;
                boolean z = i2 == 0;
                if (this.j == null) {
                    if (this.o != 0 || i2 != 0 || readInt2 != this.h) {
                        this.j = new ArrayList(16);
                    } else {
                        aqxo.y(this.a == null);
                        this.a = new aycm(c);
                        r(readInt3);
                    }
                }
                aycq aycqVar = new aycq(c, readInt3, z);
                int i3 = readInt2 - this.h;
                if (i3 < this.j.size()) {
                    this.j.set(i3, aycqVar);
                    q();
                } else if (i3 > this.j.size()) {
                    do {
                        this.j.add(null);
                    } while (i3 > this.j.size());
                    this.j.add(aycqVar);
                } else {
                    this.j.add(aycqVar);
                    q();
                }
            }
            if (k3) {
                c(readInt, parcel);
                this.l = readInt2;
                this.k = true;
            }
            int i4 = this.h;
            if (readInt2 == i4) {
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    this.h = i4 + 1;
                } else if (!k2 && !k3) {
                    arrayList.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            aymk aymkVar = this.f;
            if (aymkVar != null && dataSize != 0) {
                aymkVar.g(dataSize);
                this.f.f(this.m);
                this.m = 0;
            }
            i();
        } catch (StatusException e) {
            g(e.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(aycw aycwVar, aymn aymnVar) {
        this.e = aycwVar;
        this.f = aycwVar.a;
        this.g = aymnVar;
        if (!o()) {
            l(aycp.INITIALIZED);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(aycp aycpVar) {
        aycp aycpVar2 = this.n;
        aycp aycpVar3 = aycp.UNINITIALIZED;
        int ordinal = aycpVar.ordinal();
        boolean z = false;
        if (ordinal == 1) {
            if (aycpVar2 == aycp.UNINITIALIZED) {
                z = true;
            }
            aqxo.E(z, "%s -> %s", aycpVar2, aycpVar);
        } else if (ordinal == 2) {
            if (aycpVar2 == aycp.INITIALIZED || aycpVar2 == aycp.UNINITIALIZED) {
                z = true;
            }
            aqxo.E(z, "%s -> %s", aycpVar2, aycpVar);
        } else if (ordinal == 3) {
            if (aycpVar2 == aycp.PREFIX_DELIVERED) {
                z = true;
            }
            aqxo.E(z, "%s -> %s", aycpVar2, aycpVar);
        } else if (ordinal == 4) {
            if (aycpVar2 == aycp.ALL_MESSAGES_DELIVERED) {
                z = true;
            }
            aqxo.E(z, "%s -> %s", aycpVar2, aycpVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.n = aycpVar;
    }

    public final void m(int i) {
        this.p += i;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        final aycl ayclVar = this.b;
        if (d()) {
            ayck ayckVar = (ayck) ayclVar;
            if (ayckVar.c.decrementAndGet() == 0) {
                ayckVar.d.a(false);
            }
        }
        if (ayclVar.j.remove(Integer.valueOf(this.d)) == null || !ayclVar.j.isEmpty()) {
            return;
        }
        ayclVar.h.execute(new Runnable() { // from class: aycg
            @Override // java.lang.Runnable
            public final void run() {
                aycl ayclVar2 = aycl.this;
                synchronized (ayclVar2) {
                    if (ayclVar2.s(4)) {
                        ayclVar2.o(ayclVar2.l, true);
                    }
                }
            }
        });
    }

    protected final boolean o() {
        return this.n == aycp.CLOSED;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String valueOf = String.valueOf(this.n);
        boolean s = s();
        boolean z2 = this.g != null;
        sb = new StringBuilder(String.valueOf(simpleName).length() + 36 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(s);
        sb.append("/Lis=");
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aymm
    public final synchronized InputStream f() {
        aycm aycmVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (s()) {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                aycq aycqVar = (aycq) this.j.remove(0);
                int i2 = aycqVar.c;
                InputStream inputStream2 = aycqVar.a;
                aycmVar = new aycm(aycqVar.b);
            } else {
                byte[][] bArr = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((aycq) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                aycmVar = new aycm(bArr, i3);
            }
            this.h += i;
            q();
            inputStream = aycmVar;
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (t() && !o()) {
                l(aycp.ALL_MESSAGES_DELIVERED);
                i();
                return null;
            }
        }
        return inputStream;
    }
}
