package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jcv  reason: default package */
/* loaded from: classes3.dex */
public final class jcv extends jau {
    private final azqb a;

    public jcv(azqb azqbVar) {
        this.a = azqbVar;
    }

    private static amuk h(agqm agqmVar) {
        if (agqmVar == null) {
            return amuk.q();
        }
        amuf f = amuk.f();
        agql agqlVar = agqmVar.b;
        agql agqlVar2 = agqmVar.a;
        boolean z = agqmVar.e;
        if (agqlVar != null) {
            f.h(t(agqlVar, 2, z));
        }
        if (agqlVar2 != null) {
            f.h(t(agqlVar2, 3, z));
        }
        return f.g();
    }

    private static amvn i(amvn amvnVar) {
        avkl avklVar;
        amvl i = amvn.i();
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            agqm agqmVar = (agqm) it.next();
            String f = agqmVar.f();
            long j = agqmVar.c;
            if (j == 0) {
                avklVar = avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
            } else if (j == agqmVar.d) {
                avklVar = avkl.TRANSFER_STATE_COMPLETE;
            } else {
                avklVar = avkl.TRANSFER_STATE_TRANSFERRING;
            }
            i.c(jjd.f(f, avklVar, h(agqmVar), amon.a));
        }
        return i.g();
    }

    private final amvn j(amvn amvnVar) {
        agmc d = ((agrf) this.a.get()).a().d();
        amvl i = amvn.i();
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            agqm b = d.b((String) it.next(), null);
            if (b != null) {
                i.c(b);
            }
        }
        return i.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.avkn k(defpackage.agqv r4) {
        /*
            agqe r0 = r4.l
            agqz r1 = r4.o
            agqe r2 = defpackage.agqe.DELETED
            int r0 = r0.ordinal()
            r2 = 12
            if (r0 == r2) goto L68
            r2 = 14
            if (r0 == r2) goto L68
            switch(r0) {
                case 1: goto L5e;
                case 2: goto L37;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L29;
                case 6: goto L68;
                case 7: goto L68;
                case 8: goto L1f;
                default: goto L15;
            }
        L15:
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_UNKNOWN
            amon r2 = defpackage.amon.a
            r0.<init>(r1, r2)
            goto L71
        L1f:
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_PAUSED_BY_USER
            amon r2 = defpackage.amon.a
            r0.<init>(r1, r2)
            goto L71
        L29:
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_FAILED
            avkm r2 = defpackage.avkm.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE
            ampq r2 = defpackage.ampq.j(r2)
            r0.<init>(r1, r2)
            goto L71
        L37:
            if (r1 != 0) goto L43
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_UNKNOWN
            amon r2 = defpackage.amon.a
            r0.<init>(r1, r2)
            goto L71
        L43:
            android.util.Pair r0 = new android.util.Pair
            avkl r2 = r1.b
            agpw r1 = r1.g
            java.lang.String r3 = "sd_card_offline_disk_error"
            boolean r1 = r1.k(r3)
            if (r1 == 0) goto L58
            avkm r1 = defpackage.avkm.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE
            ampq r1 = defpackage.ampq.j(r1)
            goto L5a
        L58:
            amon r1 = defpackage.amon.a
        L5a:
            r0.<init>(r2, r1)
            goto L71
        L5e:
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_COMPLETE
            amon r2 = defpackage.amon.a
            r0.<init>(r1, r2)
            goto L71
        L68:
            android.util.Pair r0 = new android.util.Pair
            avkl r1 = defpackage.avkl.TRANSFER_STATE_FAILED
            amon r2 = defpackage.amon.a
            r0.<init>(r1, r2)
        L71:
            java.lang.Object r1 = r0.first
            avkl r1 = (defpackage.avkl) r1
            java.lang.Object r0 = r0.second
            ampq r0 = (defpackage.ampq) r0
            avkl r2 = defpackage.avkl.TRANSFER_STATE_UNKNOWN
            if (r1 != r2) goto L7f
            r4 = 0
            return r4
        L7f:
            java.lang.String r2 = r4.m()
            agqm r4 = r4.n
            amuk r4 = h(r4)
            avkn r4 = defpackage.jjd.f(r2, r1, r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcv.k(agqv):avkn");
    }

    private final Map r() {
        return ((agrf) this.a.get()).a().g().f();
    }

    private final void s(aajs aajsVar, agqv agqvVar) {
        avkn k = k(agqvVar);
        amvn i = i(j(jfw.f(r(), agqvVar.m())));
        if (k != null) {
            aajsVar.j(k);
        } else {
            aajsVar.g(emn.x(agqvVar.m()));
        }
        amzs it = i.iterator();
        while (it.hasNext()) {
            aajsVar.j((avkn) it.next());
        }
    }

    private static auzy t(agql agqlVar, int i, boolean z) {
        long j = agqlVar.d;
        long b = agqlVar.b();
        aopa createBuilder = auzy.a.createBuilder();
        createBuilder.copyOnWrite();
        auzy auzyVar = (auzy) createBuilder.instance;
        auzyVar.b |= 1;
        auzyVar.c = j;
        createBuilder.copyOnWrite();
        auzy auzyVar2 = (auzy) createBuilder.instance;
        int i2 = 2;
        auzyVar2.b |= 2;
        auzyVar2.d = b;
        createBuilder.copyOnWrite();
        auzy auzyVar3 = (auzy) createBuilder.instance;
        auzyVar3.e = i - 1;
        auzyVar3.b |= 4;
        if (j == b) {
            i2 = z ? 3 : 4;
        }
        createBuilder.copyOnWrite();
        auzy auzyVar4 = (auzy) createBuilder.instance;
        auzyVar4.f = i2 - 1;
        auzyVar4.b |= 8;
        aoob byteString = agqlVar.b.a.toByteString();
        createBuilder.copyOnWrite();
        auzy auzyVar5 = (auzy) createBuilder.instance;
        auzyVar5.b |= 16;
        auzyVar5.g = byteString;
        return (auzy) createBuilder.mo39build();
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        amvl i = amvn.i();
        Map r = r();
        for (agqv agqvVar : agwhVar.j()) {
            avkn k = k(agqvVar);
            if (k != null) {
                i.c(k);
            }
            i.j(i(j(jfw.f(r, agqvVar.m()))));
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void b(aajs aajsVar, agqv agqvVar) {
        s(aajsVar, agqvVar);
    }

    @Override // defpackage.jau
    protected final void d(aajs aajsVar, agqv agqvVar) {
        s(aajsVar, agqvVar);
    }

    @Override // defpackage.jau
    protected final void e(aajs aajsVar, String str) {
        aajsVar.g(emn.x(str));
    }
}
