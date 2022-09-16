package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: pec  reason: default package */
/* loaded from: classes4.dex */
public final class pec {
    private static final Format b;
    private static final Long c;
    public final ConditionVariable a;
    private final pnj d;
    private final per e;
    private final HandlerThread f;
    private final pnw g;

    static {
        pis pisVar = new pis();
        pisVar.n = new DrmInitData(new DrmInitData.SchemeData[0]);
        b = pisVar.a();
        c = 2592000L;
    }

    public pec(UUID uuid, pnw pnwVar, aesn aesnVar, HashMap hashMap) {
        HandlerThread handlerThread = new HandlerThread("OfflineDrmLicenseHelper");
        this.f = handlerThread;
        handlerThread.start();
        this.a = new ConditionVariable();
        pnj pnjVar = new pnj();
        this.d = pnjVar;
        this.g = pnwVar;
        pnjVar.a(new Handler(handlerThread.getLooper()), new pea(this));
        this.e = new per(uuid, aesnVar, hashMap, new peb());
    }

    private final pej g(int i, byte[] bArr, Format format) {
        this.e.e(this.g);
        this.e.f(i, bArr);
        this.a.close();
        if (pof.class.equals(this.e.c(format))) {
            throw new pnd(new Exception("Could not acquire session"), 6001);
        }
        pne b2 = this.e.b(this.f.getLooper(), this.d, format);
        this.a.block();
        return (pej) b2;
    }

    private final byte[] h(int i, byte[] bArr, Format format) {
        pej g = g(i, bArr, format);
        pnd c2 = g.c();
        byte[] bArr2 = g.k;
        this.e.d(g);
        if (c2 != null) {
            throw c2;
        }
        return (byte[]) ptx.a(bArr2);
    }

    public final synchronized Pair a(byte[] bArr) {
        pej g = g(1, bArr, b);
        pnd c2 = g.c();
        Pair c3 = pnr.c(g);
        this.e.d(g);
        if (c2 != null) {
            if (c2.getCause() instanceof poc) {
                return Pair.create(0L, 0L);
            }
            throw c2;
        }
        ptx.a(c3);
        long longValue = ((Long) c3.first).longValue();
        Long l = c;
        return Pair.create(Long.valueOf(Math.min(longValue, l.longValue())), Long.valueOf(Math.min(((Long) c3.second).longValue(), l.longValue())));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:9:0x000d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public final synchronized java.lang.String b() {
        /*
            r1 = this;
            monitor-enter(r1)
            pnw r0 = r1.g     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.e()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            java.lang.String r0 = ""
            monitor-exit(r1)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pec.b():java.lang.String");
    }

    public final void c() {
        this.f.quit();
    }

    public final synchronized void d(byte[] bArr) {
        ptx.a(bArr);
        h(3, bArr, b);
    }

    public final synchronized byte[] e(Format format) {
        ptx.c(format.o != null);
        return h(2, null, format);
    }

    public final synchronized byte[] f(byte[] bArr) {
        ptx.a(bArr);
        return h(2, bArr, b);
    }
}
