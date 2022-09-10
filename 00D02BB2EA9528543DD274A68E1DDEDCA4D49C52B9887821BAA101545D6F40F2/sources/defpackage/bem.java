package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bem  reason: default package */
/* loaded from: classes3.dex */
public final class bem implements bep {
    public final bel a;
    public final Object b;
    private final beq<?>[] c;

    static {
        bbz.f("WorkConstraintsTracker");
    }

    public bem(Context context, bif bifVar, bel belVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = belVar;
        this.c = new beq[]{new ben(applicationContext, bifVar), new beo(applicationContext, bifVar), new bev(applicationContext, bifVar), new ber(applicationContext, bifVar), new beu(applicationContext, bifVar), new bet(applicationContext, bifVar), new bes(applicationContext, bifVar)};
        this.b = new Object();
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.Object] */
    public final void a(Iterable<bgh> iterable) {
        synchronized (this.b) {
            beq<?>[] beqVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                beqVarArr[i].d(null);
            }
            beq<?>[] beqVarArr2 = this.c;
            for (int i2 = 0; i2 < 7; i2++) {
                beq<?> beqVar = beqVarArr2[i2];
                beqVar.a.clear();
                for (bgh bghVar : iterable) {
                    if (beqVar.b(bghVar)) {
                        beqVar.a.add(bghVar.a);
                    }
                }
                if (beqVar.a.isEmpty()) {
                    beqVar.c.f(beqVar);
                } else {
                    bfb<?> bfbVar = beqVar.c;
                    synchronized (bfbVar.b) {
                        if (bfbVar.c.add(beqVar)) {
                            if (bfbVar.c.size() == 1) {
                                bfbVar.d = bfbVar.b();
                                bbz e = bbz.e();
                                bfbVar.getClass();
                                T t = bfbVar.d;
                                e.a(new Throwable[0]);
                                bfbVar.d();
                            }
                            beqVar.a(bfbVar.d);
                        }
                    }
                }
                beqVar.e(beqVar.d, beqVar.b);
            }
            beq<?>[] beqVarArr3 = this.c;
            for (int i3 = 0; i3 < 7; i3++) {
                beqVarArr3[i3].d(this);
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            beq<?>[] beqVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                beq<?> beqVar = beqVarArr[i];
                if (!beqVar.a.isEmpty()) {
                    beqVar.a.clear();
                    beqVar.c.f(beqVar);
                }
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this.b) {
            beq<?>[] beqVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                beq<?> beqVar = beqVarArr[i];
                Object obj = beqVar.b;
                if (obj != null && beqVar.c(obj) && beqVar.a.contains(str)) {
                    bbz e = bbz.e();
                    beqVar.getClass();
                    e.a(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
