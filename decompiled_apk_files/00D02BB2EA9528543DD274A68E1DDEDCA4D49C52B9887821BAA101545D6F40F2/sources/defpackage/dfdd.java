package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dfdd  reason: default package */
/* loaded from: classes6.dex */
final class dfdd extends dcsn {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.HOURS.toSeconds(1);
    private final Context c;
    private final dfcy d;
    private final dfdh e;

    public dfdd(Context context, int i, String str) {
        super(null);
        this.c = context;
        this.d = new dfcy(context.getPackageName(), i, str, 4);
        this.e = new dfdh(b);
    }

    private final void e(dcrj dcrjVar, int i, long j) {
        ddyw bK;
        final dfdm d;
        dfcy dfcyVar = this.d;
        String b2 = dfcy.b(dcrjVar);
        Throwable th = i == 2 ? (Throwable) dfcy.a(dcrjVar, dcqj.a) : null;
        if (!dbsj.d(b2) || th != null) {
            dcqp g = dcrjVar.g();
            Level d2 = dcrjVar.d();
            String a2 = g.a();
            String b3 = g.b();
            int c = g.c();
            ddyv bZ = ddyw.j.bZ();
            ddyb ddybVar = dfcy.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddyw ddywVar = (ddyw) bZ.b;
            ddybVar.getClass();
            ddywVar.b = ddybVar;
            ddywVar.a |= 1;
            String name = Thread.currentThread().getName();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddyw ddywVar2 = (ddyw) bZ.b;
            name.getClass();
            ddywVar2.a = 2 | ddywVar2.a;
            ddywVar2.c = name;
            int intValue = d2.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddyw ddywVar3 = (ddyw) bZ.b;
            int i2 = ddywVar3.a | 4;
            ddywVar3.a = i2;
            ddywVar3.d = intValue;
            a2.getClass();
            int i3 = i2 | 8;
            ddywVar3.a = i3;
            ddywVar3.e = a2;
            b3.getClass();
            int i4 = i3 | 16;
            ddywVar3.a = i4;
            ddywVar3.f = b3;
            int i5 = i4 | 32;
            ddywVar3.a = i5;
            ddywVar3.g = c;
            if (b2 != null) {
                b2.getClass();
                ddywVar3.a = i5 | 128;
                ddywVar3.h = b2;
            }
            if (th != null) {
                ddzb a3 = deag.a(th);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddyw ddywVar4 = (ddyw) bZ.b;
                ddzc bK2 = a3.bK();
                bK2.getClass();
                ddywVar4.i = bK2;
                ddywVar4.a |= 512;
            }
            bK = bZ.bK();
        } else {
            bK = null;
        }
        if (bK == null) {
            d = null;
        } else if (dcrjVar.h() != null) {
            d = dfcyVar.d(bK, i, j, dcrjVar.i());
        } else {
            d = dfcyVar.d(bK, i, j, new Object[0]);
        }
        if (d == null) {
            return;
        }
        cnjv e = new cnjz(this.c, "CLIENT_LOGGING_PROD", (String) dfcy.a(dcrjVar, dfcz.a)).e(new cnjx(d) { // from class: dfdc
            private final dfdm a;

            {
                this.a = d;
            }

            @Override // defpackage.cnjx
            public final byte[] a() {
                dfdm dfdmVar = this.a;
                int i6 = dfdd.a;
                return dfdmVar.bK().bS();
            }
        });
        e.d(dfcy.c(dcrjVar));
        e.a();
    }

    @Override // defpackage.dcrl
    public final boolean b(Level level) {
        return level.intValue() >= Level.SEVERE.intValue();
    }

    @Override // defpackage.dcrl
    public final void c(dcrj dcrjVar) {
        dfdh dfdhVar = this.e;
        synchronized (dfdhVar) {
            long e = dcrjVar.e();
            if (e >= dfdhVar.b || dfdhVar.c.size() >= 1000) {
                Collection<dfdg> values = dfdhVar.c.values();
                long nanos = TimeUnit.SECONDS.toNanos(dfdhVar.a);
                Iterator<dfdg> it = values.iterator();
                int size = dfdhVar.c.size();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dfdg next = it.next();
                    if (next.a().e() + nanos >= e && size <= 1000) {
                        dfdhVar.b = next.a().e() + nanos;
                        break;
                    }
                    if (next.b().get() > 0) {
                        dfdhVar.d.add(next);
                    }
                    it.remove();
                    size--;
                }
            }
            dcqp g = dcrjVar.g();
            dfdg dfdgVar = dfdhVar.c.get(g);
            if (dfdgVar == null) {
                LinkedHashMap<dcqp, dfdg> linkedHashMap = dfdhVar.c;
                dfda dfdaVar = new dfda();
                dfdaVar.b = new AtomicLong(0L);
                if (dcrjVar != null) {
                    dfdaVar.a = dcrjVar;
                    String str = " logData";
                    if (dfdaVar.a != null) {
                        str = "";
                    }
                    if (dfdaVar.b == null) {
                        str = str.concat(" count");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    linkedHashMap.put(g, new dfdb(dfdaVar.a, dfdaVar.b));
                    e(dcrjVar, 2, 1L);
                    return;
                }
                throw new NullPointerException("Null logData");
            }
            dfdgVar.b().getAndIncrement();
            dfdh dfdhVar2 = this.e;
            ArrayList arrayList = new ArrayList();
            dfdhVar2.d.drainTo(arrayList);
            dcdc r = dcdc.r(arrayList);
            int size2 = r.size();
            for (int i = 0; i < size2; i++) {
                dfdg dfdgVar2 = (dfdg) r.get(i);
                e(dfdgVar2.a(), 3, dfdgVar2.b().get());
            }
        }
    }

    @Override // defpackage.dcsn, defpackage.dcrl
    public final void d(RuntimeException runtimeException, dcrj dcrjVar) {
    }
}
