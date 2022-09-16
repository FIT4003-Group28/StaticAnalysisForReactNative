package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Exchanger;
/* compiled from: PG */
/* renamed from: aevd  reason: default package */
/* loaded from: classes.dex */
public final class aevd extends ozd {
    final /* synthetic */ aeva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevd(aeva aevaVar) {
        super(0, null);
        this.a = aevaVar;
    }

    @Override // defpackage.ozd
    protected final void b(pct pctVar) {
        boolean z;
        Long l;
        Long l2;
        Exchanger exchanger;
        pctVar.z(12);
        String q = pctVar.q();
        pctVar.q();
        pctVar.n();
        pctVar.n();
        pctVar.n();
        pctVar.n();
        HashMap hashMap = new HashMap();
        String p = pctVar.p();
        while (true) {
            z = true;
            if (TextUtils.isEmpty(p)) {
                break;
            }
            List h = amqf.c(": ").h(p);
            if (h.size() >= 2) {
                hashMap.put((String) h.get(0), (String) h.get(1));
            }
            p = pctVar.p();
        }
        aeui aeuiVar = new aeui("http://youtube.com/streaming/metadata/segment/102015", hashMap);
        if (((q.hashCode() == -415751771 && q.equals("http://youtube.com/streaming/metadata/segment/102015")) ? (char) 0 : (char) 65535) != 0) {
            aeva aevaVar = this.a;
            Handler handler = aevaVar.c;
            if (handler == null || aevaVar.d == null) {
                return;
            }
            handler.post(new qvl(18));
            return;
        }
        Long c = aeuiVar.c("Sequence-Number");
        if (c != null) {
            aeva aevaVar2 = this.a;
            if (aevaVar2.g == null && (exchanger = aevaVar2.f) != null) {
                try {
                    Long valueOf = Long.valueOf(Math.max(c.longValue(), ((Long) exchanger.exchange(c)).longValue()));
                    this.a.g = valueOf;
                    if (!valueOf.equals(c)) {
                        aeva aevaVar3 = this.a;
                        afkl afklVar = afkl.DEFAULT;
                        long o = this.a.l.o();
                        StringBuilder sb = new StringBuilder(25);
                        sb.append("diff.");
                        sb.append(valueOf.longValue() - c.longValue());
                        aevaVar3.k(afklVar, "manifestless.head.race", o, sb.toString());
                        valueOf.longValue();
                        throw new ouf(new aeuz());
                    }
                } catch (InterruptedException e) {
                    throw new ouf(e);
                }
            } else {
                aevaVar2.g = c;
            }
            Long c2 = aeuiVar.c("Ingestion-Walltime-Us");
            aeva aevaVar4 = this.a;
            if (aevaVar4.i == null && c2 != null) {
                aevaVar4.i = c2;
            }
            synchronized (aevaVar4) {
                aeva aevaVar5 = this.a;
                if (!"T".equals(aeuiVar.d("Stream-Finished"))) {
                    aeva aevaVar6 = this.a;
                    if (!aevaVar6.b || (l = aevaVar6.g) == null || (l2 = aevaVar6.k) == null || !l2.equals(Long.valueOf(l.longValue()))) {
                        z = false;
                    }
                }
                aevaVar5.h = z;
            }
            return;
        }
        throw new ouf("Invalid manifestless sequence number");
    }

    public aevd() {
        super(0, null);
    }
}
