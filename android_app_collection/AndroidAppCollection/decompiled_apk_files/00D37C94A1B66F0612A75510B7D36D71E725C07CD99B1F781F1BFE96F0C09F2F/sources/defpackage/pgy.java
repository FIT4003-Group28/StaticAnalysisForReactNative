package defpackage;

import android.util.LruCache;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: pgy  reason: default package */
/* loaded from: classes4.dex */
final class pgy extends LruCache {
    final /* synthetic */ pha a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgy(pha phaVar, int i) {
        super(i);
        this.a = phaVar;
    }

    protected final void a(String str, pgz pgzVar) {
        Long l;
        afki afkiVar = afki.ABR;
        try {
            final pgn pgnVar = pgzVar.a;
            ankt t = anlz.t(new Runnable() { // from class: pgx
                @Override // java.lang.Runnable
                public final void run() {
                    pgn.this.d();
                }
            }, this.a.c);
            aqxe aqxeVar = this.a.j.b.b.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            long j = 0;
            if (aqxeVar.a(45352574L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (aoqpVar.containsKey(45352574L)) {
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45352574L);
                    if (aqxfVar.b == 2) {
                        j = ((Long) aqxfVar.c).longValue();
                    }
                    l = Long.valueOf(j);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                l = 0L;
            }
            int intValue = Long.valueOf(l.longValue()).intValue();
            if (intValue == 0) {
                intValue = 1000;
            }
            t.get(intValue, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afkj.c(afki.CODEC_REUSE, e, "Interrupted while releasing codec %s.", str);
            Thread.currentThread().interrupt();
            this.a.i.b(e);
        } catch (ExecutionException e2) {
            e = e2;
            afkj.c(afki.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.i.b(e);
        } catch (TimeoutException e3) {
            e = e3;
            afkj.c(afki.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.i.b(e);
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        pgz pgzVar = (pgz) obj3;
        a((String) obj, (pgz) obj2);
    }
}
