package defpackage;
/* compiled from: PG */
/* renamed from: etb  reason: default package */
/* loaded from: classes3.dex */
public abstract class etb {
    final etc b;
    oru c;
    Object d;
    final /* synthetic */ etd e;

    public etb(etd etdVar, etc etcVar) {
        this.e = etdVar;
        this.b = etcVar;
    }

    protected abstract Object a(byte[] bArr);

    protected abstract byte[] b(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Object c() {
        /*
            r4 = this;
            monitor-enter(r4)
            oru r0 = r4.c     // Catch: java.lang.Throwable -> L76
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L3f
        La:
            etc r0 = r4.b     // Catch: java.lang.Throwable -> L76
            java.io.File r2 = r0.a     // Catch: java.lang.Throwable -> L76
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L16
            r0 = r1
            goto L1c
        L16:
            java.io.File r0 = r0.a     // Catch: java.lang.Throwable -> L76
            byte[] r0 = defpackage.anhe.h(r0)     // Catch: java.lang.Throwable -> L76
        L1c:
            if (r0 == 0) goto L2e
            aoos r2 = defpackage.aoos.b()     // Catch: defpackage.aopx -> L2b java.lang.Throwable -> L76
            oru r3 = defpackage.oru.a     // Catch: defpackage.aopx -> L2b java.lang.Throwable -> L76
            aopi r0 = defpackage.aopi.parseFrom(r3, r0, r2)     // Catch: defpackage.aopx -> L2b java.lang.Throwable -> L76
            oru r0 = (defpackage.oru) r0     // Catch: defpackage.aopx -> L2b java.lang.Throwable -> L76
            goto L2f
        L2b:
            r4.d()     // Catch: java.lang.Throwable -> L76
        L2e:
            r0 = r1
        L2f:
            r4.c = r0     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L74
            aoob r0 = r0.e     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L76
            byte[] r0 = r0.I()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L76
            java.lang.Object r0 = r4.a(r0)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L76
            r4.d = r0     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L76
        L3f:
            oru r0 = r4.c     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> L76
            etd r2 = r4.e     // Catch: java.lang.Throwable -> L76
            afvn r2 = r2.b     // Catch: java.lang.Throwable -> L76
            boolean r2 = r2.t()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L63
            etd r2 = r4.e     // Catch: java.lang.Throwable -> L76
            afvn r2 = r2.b     // Catch: java.lang.Throwable -> L76
            afvm r2 = r2.c()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> L76
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L76
            monitor-exit(r4)
            return r0
        L63:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L76
            monitor-exit(r4)
            return r0
        L6d:
            monitor-exit(r4)
            return r1
        L6f:
            r4.d()     // Catch: java.lang.Throwable -> L76
            monitor-exit(r4)
            return r1
        L74:
            monitor-exit(r4)
            return r1
        L76:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etb.c():java.lang.Object");
    }

    public final synchronized void d() {
        this.b.a();
        this.c = null;
        this.d = null;
    }

    public final synchronized void e(Object obj) {
        aopa createBuilder = oru.a.createBuilder();
        if (this.e.b.t()) {
            String d = this.e.b.c().d();
            createBuilder.copyOnWrite();
            oru oruVar = (oru) createBuilder.instance;
            oruVar.b |= 1;
            oruVar.c = d;
        }
        long c = this.e.c.c();
        createBuilder.copyOnWrite();
        oru oruVar2 = (oru) createBuilder.instance;
        oruVar2.b |= 2;
        oruVar2.d = c;
        aoob x = aoob.x(b(obj));
        createBuilder.copyOnWrite();
        oru oruVar3 = (oru) createBuilder.instance;
        oruVar3.b |= 4;
        oruVar3.e = x;
        this.c = (oru) createBuilder.mo39build();
        this.d = obj;
        this.e.d.execute(new eta(this));
    }
}
