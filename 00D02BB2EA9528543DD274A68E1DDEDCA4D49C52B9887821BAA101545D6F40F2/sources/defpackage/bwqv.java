package defpackage;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bwqv  reason: default package */
/* loaded from: classes.dex */
public class bwqv {
    public final bwqw a;
    public final dbty<bvrb> b;
    public final String c;
    private final ConcurrentMap<bwqj, bwrs<?>> d;
    private final Map<bwrk, Serializable> e;
    private final bwrn f;
    private final cqat g;
    private final dzsj<dvsb> h;

    public bwqv(bwqw bwqwVar, dbty<bvrb> dbtyVar, dzsj<dvsb> dzsjVar, cqat cqatVar, String str) {
        dchm dchmVar = new dchm();
        dchmVar.j();
        this.d = dchmVar.e();
        dchm dchmVar2 = new dchm();
        dchmVar2.j();
        this.e = dchmVar2.e();
        this.f = new bwrn();
        new AtomicInteger(0);
        this.a = bwqwVar;
        this.b = dbtyVar;
        this.h = dzsjVar;
        this.g = cqatVar;
        this.c = str;
    }

    public static final <T extends Serializable> void t(bwrs<T> bwrsVar, bwrr<? super T> bwrrVar) {
        dbsk.s(bwrsVar);
        dbsk.s(bwrrVar);
        bwrsVar.i(bwrrVar);
    }

    @dzsi
    private final synchronized Serializable v(bwrk bwrkVar) {
        return this.e.get(bwrkVar);
    }

    @dzsi
    private final synchronized Serializable w(bwrk bwrkVar, @dzsi Serializable serializable) {
        Serializable serializable2 = this.e.get(bwrkVar);
        if (serializable2 != null) {
            return serializable2;
        }
        if (serializable != null) {
            this.e.put(bwrkVar, serializable);
        }
        return serializable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bwrs<?> bwrsVar, bwqi bwqiVar) {
        bwqj bwqjVar;
        bwqj bwqjVar2 = bwrsVar.a;
        if (bwqjVar2 == null) {
            bwqjVar = this.f.a(bwqiVar, this.g, this.h.a());
            bwrsVar.a = bwqjVar;
        } else {
            bwqi bwqiVar2 = bwqjVar2.c;
            String str = bwqjVar2.d;
            bwqj.c(this.g, this.h.a());
            bwqjVar = new bwqj(bwqiVar2, str);
            bwrsVar.a = bwqjVar;
        }
        this.d.put(bwqjVar, bwrsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bwrs<?> b(bwqj bwqjVar) {
        bwrs<?> bwrsVar = this.d.get(bwqjVar);
        if (bwrsVar != null) {
            return bwrsVar;
        }
        this.f.b(bwqjVar);
        final bwrs<?> bwrsVar2 = new bwrs<>(bwqjVar, null, false, false);
        bwrsVar2.a = bwqjVar;
        bwrs<?> putIfAbsent = this.d.putIfAbsent(bwqjVar, bwrsVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        final bwqj bwqjVar2 = bwrsVar2.a;
        this.b.a().b(new Runnable(this, bwqjVar2, bwrsVar2) { // from class: bwqr
            private final bwqv a;
            private final bwrm b;
            private final bwrs c;

            {
                this.a = this;
                this.b = bwqjVar2;
                this.c = bwrsVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwqv bwqvVar = this.a;
                bwrm bwrmVar = this.b;
                bwrs bwrsVar3 = this.c;
                dbsi<Serializable, String> q = bwqvVar.q(bwrmVar);
                bwrsVar3.f(q == null ? null : q.a);
            }
        }, bvrj.GMM_STORAGE);
        return bwrsVar2;
    }

    public final void c(Bundle bundle, String str, @dzsi Serializable serializable) {
        bwrs a;
        boolean z;
        if (serializable instanceof bwrs) {
            a = (bwrs) serializable;
            z = true;
        } else {
            a = bwrs.a(serializable);
            z = false;
        }
        a.e(this);
        bundle.putSerializable(str, new bwqu(a, z));
    }

    @dzsi
    public final <T extends Serializable> T d(Class<? super T> cls, Bundle bundle, String str) {
        bwrs<?> bwrsVar;
        bwqu bwquVar = (bwqu) bundle.getSerializable(str);
        if (bwquVar == null) {
            bwrsVar = null;
        } else {
            bwrs<?> bwrsVar2 = bwquVar.c;
            if (bwrsVar2 == null) {
                bwrsVar2 = b(bwquVar.a);
                bwquVar.c = bwrsVar2;
            }
            bwrsVar = !bwquVar.b ? (T) bwrsVar2.c() : bwrsVar2;
        }
        if (bwrsVar == null || cls.isInstance(bwrsVar)) {
            return bwrsVar;
        }
        bwqu bwquVar2 = (bwqu) bundle.getSerializable(str);
        if (bwquVar2 != null) {
            b(bwquVar2.a);
        }
        String valueOf = String.valueOf(bwrsVar.getClass());
        String valueOf2 = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" cannot be cast to ");
        sb.append(valueOf2);
        IOException iOException = new IOException(new ClassCastException(sb.toString()));
        bwrsVar.getClass();
        throw iOException;
    }

    @dzsi
    public final <S extends Serializable, T extends S> bwrs<T> e(Class<? extends S> cls, Bundle bundle, String str) {
        T c;
        bwrs<T> bwrsVar = (bwrs) d(bwrs.class, bundle, str);
        if (bwrsVar == null || (c = bwrsVar.c()) == null || cls.isInstance(c)) {
            return bwrsVar;
        }
        String valueOf = String.valueOf(c);
        String valueOf2 = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" cannot be cast to ");
        sb.append(valueOf2);
        IOException iOException = new IOException(new ClassCastException(sb.toString()));
        c.getClass();
        throw iOException;
    }

    public final <T extends Serializable> void f(bwrs<T> bwrsVar, bwrr<? super T> bwrrVar, boolean z) {
        dbsk.s(bwrsVar);
        dbsk.s(bwrrVar);
        bwrsVar.h(bwrrVar, this.b.a(), z);
    }

    public final <T extends Serializable> void g(bwrs<T> bwrsVar, bwrr<? super T> bwrrVar) {
        dbsk.s(bwrsVar);
        dbsk.s(bwrrVar);
        bwrsVar.g(bwrrVar, this.b.a());
    }

    public final dehn<Void> h(bwrj bwrjVar, String str, final dssj dssjVar) {
        final deig d = deig.d();
        final bwrk bwrkVar = new bwrk(bwrjVar, str);
        this.b.a().b(new Runnable(this, bwrkVar, dssjVar, d) { // from class: bwqm
            private final bwqv a;
            private final bwrm b;
            private final dssj c;
            private final deig d;

            {
                this.a = this;
                this.b = bwrkVar;
                this.c = dssjVar;
                this.d = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwqv bwqvVar = this.a;
                bwrm bwrmVar = this.b;
                dssj dssjVar2 = this.c;
                deig deigVar = this.d;
                bwqvVar.a.d(bwrmVar, dssjVar2.bS());
                deigVar.j(null);
            }
        }, bvrj.GMM_STORAGE);
        return d;
    }

    public final dehn<Void> i(final bwrj bwrjVar, final String str) {
        final deig d = deig.d();
        this.b.a().b(new Runnable(this, bwrjVar, str, d) { // from class: bwqn
            private final bwqv a;
            private final bwrj b;
            private final String c;
            private final deig d;

            {
                this.a = this;
                this.b = bwrjVar;
                this.c = str;
                this.d = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwqv bwqvVar = this.a;
                bwrj bwrjVar2 = this.b;
                String str2 = this.c;
                deig deigVar = this.d;
                bwqvVar.a.c(new bwrk(bwrjVar2, str2));
                deigVar.j(null);
            }
        }, bvrj.GMM_STORAGE);
        return d;
    }

    @dzsi
    public final <T extends dssj> T j(bwrj bwrjVar, dssr<T> dssrVar) {
        return (T) k(bwrjVar, "0", dssrVar);
    }

    @dzsi
    public final <T extends dssj> T k(bwrj bwrjVar, String str, dssr<T> dssrVar) {
        dbsi<byte[], String> a = this.a.a(new bwrk(bwrjVar, str));
        return (T) bvrs.b(a == null ? null : a.a, dssrVar);
    }

    public final <T extends dssj> dehn<T> l(final bwrj bwrjVar, final String str, final dssr<T> dssrVar) {
        final deig d = deig.d();
        this.b.a().b(new Runnable(this, d, bwrjVar, str, dssrVar) { // from class: bwqp
            private final bwqv a;
            private final deig b;
            private final bwrj c;
            private final String d;
            private final dssr e;

            {
                this.a = this;
                this.b = d;
                this.c = bwrjVar;
                this.d = str;
                this.e = dssrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.j(this.a.k(this.c, this.d, this.e));
            }
        }, bvrj.GMM_STORAGE);
        return d;
    }

    public final String m(@dzsi Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        bwrs<?> a = bwrs.a(serializable);
        a(a, bwqi.URI);
        a.e(this);
        bwqj bwqjVar = a.a;
        String str = bwqjVar.c.c;
        String str2 = bwqjVar.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    @Deprecated
    public final synchronized <T extends Serializable> void o(bwrj bwrjVar, T t) {
        bwrk bwrkVar = new bwrk(bwrjVar);
        this.e.put(bwrkVar, t);
        u(bwrkVar, t);
    }

    @dzsi
    @Deprecated
    public final <T extends Serializable> T p(bwrj bwrjVar) {
        bwrk bwrkVar = new bwrk(bwrjVar);
        T t = (T) v(bwrkVar);
        if (t != null) {
            return t;
        }
        bwqt bwqtVar = new bwqt(this, bwrkVar);
        this.b.a().c(bwqtVar, bvrj.GMM_STORAGE);
        return (T) w(bwrkVar, bwqtVar.a);
    }

    @dzsi
    public final dbsi<Serializable, String> q(bwrm bwrmVar) {
        byte[] bArr;
        bwro bwroVar;
        bvrj.GMM_STORAGE.c();
        dbsi<byte[], String> a = this.a.a(bwrmVar);
        if (a != null && (bArr = a.a) != null) {
            byte[] bArr2 = bArr;
            try {
                String str = this.c;
                bwrt bwrtVar = new bwrt(new ByteArrayInputStream(bArr2), this);
                bwrtVar.a();
                String readUTF = bwrtVar.readUTF();
                byte readByte = bwrtVar.readByte();
                if (readByte != 1) {
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("Object format version '");
                    sb.append((int) readByte);
                    sb.append("' is not the required '");
                    sb.append(1);
                    sb.append("'.");
                    throw new InvalidObjectException(sb.toString());
                }
                String readUTF2 = bwrtVar.readUTF();
                if (!str.equals(readUTF2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(readUTF2).length() + 46 + String.valueOf(str).length());
                    sb2.append("Object build number '");
                    sb2.append(readUTF2);
                    sb2.append("' is not the required '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw new InvalidObjectException(sb2.toString());
                }
                Class<?> cls = Class.forName(readUTF);
                if (bwro.class.isAssignableFrom(cls)) {
                    bwro bwroVar2 = (bwro) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    bwroVar2.g(bwrtVar);
                    bwroVar = bwroVar2;
                } else {
                    bwroVar = (Serializable) bwrtVar.readObject();
                }
                return dbsi.a(bwroVar, a.b);
            } catch (Exception e) {
                if (!(e instanceof InvalidClassException) && !(e instanceof IllegalArgumentException) && !(e instanceof InvalidObjectException)) {
                    bvoo.j(new RuntimeException("Failed to load item", e));
                }
                this.a.c(bwrmVar);
            }
        }
        return null;
    }

    @Deprecated
    public final synchronized void r(bwrj bwrjVar) {
        final bwrk bwrkVar = new bwrk(bwrjVar);
        this.e.remove(bwrkVar);
        this.b.a().b(new Runnable(this, bwrkVar) { // from class: bwqs
            private final bwqv a;
            private final bwrk b;

            {
                this.a = this;
                this.b = bwrkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwqv bwqvVar = this.a;
                try {
                    bwqvVar.a.c(this.b);
                } catch (Exception e) {
                    bvoo.k(e);
                }
            }
        }, bvrj.GMM_STORAGE);
    }

    public final void s(bwrj bwrjVar, dssj dssjVar) {
        h(bwrjVar, "0", dssjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(final bwrm bwrmVar, @dzsi final Serializable serializable) {
        this.b.a().b(new Runnable(this, bwrmVar, serializable) { // from class: bwqq
            private final bwqv a;
            private final bwrm b;
            private final Serializable c;

            {
                this.a = this;
                this.b = bwrmVar;
                this.c = serializable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwqv bwqvVar = this.a;
                bwrm bwrmVar2 = this.b;
                Serializable serializable2 = this.c;
                bvrj.GMM_STORAGE.c();
                try {
                    if (serializable2 != null) {
                        serializable2.getClass();
                        String str = bwqvVar.c;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bwru bwruVar = new bwru(byteArrayOutputStream, bwqvVar);
                        bwruVar.a();
                        bwruVar.writeUTF(serializable2.getClass().getName());
                        bwruVar.writeByte(1);
                        if (str != null) {
                            bwruVar.writeUTF(str);
                        }
                        if (serializable2 instanceof bwro) {
                            ((bwro) serializable2).f(bwruVar);
                        } else {
                            bwruVar.writeObject(serializable2);
                        }
                        bwruVar.close();
                        bwqvVar.a.d(bwrmVar2, byteArrayOutputStream.toByteArray());
                        return;
                    }
                    bwqvVar.a.c(bwrmVar2);
                } catch (Exception e) {
                    String valueOf = String.valueOf(serializable2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Failed to save item: ");
                    sb.append(valueOf);
                    bvoo.f(new RuntimeException(sb.toString(), e));
                }
            }
        }, bvrj.GMM_STORAGE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends java.io.Serializable> T n(java.lang.Class<? super T> r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L9
        L7:
            r0 = r1
            goto L2b
        L9:
            java.lang.String r0 = "-"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r2 = 2
            if (r0 == r2) goto L14
            goto L7
        L14:
            bwqj r0 = new bwqj     // Catch: java.lang.NumberFormatException -> L7
            bwqi r2 = defpackage.bwqi.URI     // Catch: java.lang.NumberFormatException -> L7
            r3 = 1
            r8 = r8[r3]     // Catch: java.lang.NumberFormatException -> L7
            cqat r3 = r6.g     // Catch: java.lang.NumberFormatException -> L7
            dzsj<dvsb> r4 = r6.h     // Catch: java.lang.NumberFormatException -> L7
            java.lang.Object r4 = r4.a()     // Catch: java.lang.NumberFormatException -> L7
            dvsb r4 = (defpackage.dvsb) r4     // Catch: java.lang.NumberFormatException -> L7
            defpackage.bwqj.c(r3, r4)     // Catch: java.lang.NumberFormatException -> L7
            r0.<init>(r2, r8)     // Catch: java.lang.NumberFormatException -> L7
        L2b:
            if (r0 != 0) goto L2e
            return r1
        L2e:
            bwrs r8 = r6.b(r0)
            java.io.Serializable r8 = r8.c()
            if (r8 != 0) goto L39
            return r1
        L39:
            boolean r0 = r7.isInstance(r8)
            if (r0 == 0) goto L40
            return r8
        L40:
            java.io.IOException r0 = new java.io.IOException
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 19
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r2)
            java.lang.String r2 = " cannot be cast to "
            r5.append(r2)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            r1.<init>(r7)
            r0.<init>(r1)
            r8.getClass()
            goto L7e
        L7d:
            throw r0
        L7e:
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqv.n(java.lang.Class, java.lang.String):java.io.Serializable");
    }
}
