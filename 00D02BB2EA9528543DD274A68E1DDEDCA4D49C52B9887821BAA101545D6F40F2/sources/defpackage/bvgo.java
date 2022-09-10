package defpackage;

import org.chromium.net.CronetException;
/* compiled from: PG */
/* renamed from: bvgo  reason: default package */
/* loaded from: classes4.dex */
public final class bvgo {
    public static btzy a(int i, @dzsi Throwable th) {
        btzy btzyVar;
        if (i != 1) {
            if (i != 7) {
                if (i != 9 && i != 11) {
                    if (i != 16) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    btzyVar = btzy.m;
                                } else if (i != 13) {
                                    if (i == 14) {
                                        if (th instanceof CronetException) {
                                            btzyVar = bvgp.a((CronetException) th).a;
                                        } else {
                                            btzyVar = btzy.j;
                                        }
                                    } else {
                                        btzyVar = btzy.a;
                                    }
                                }
                            }
                            btzyVar = btzy.j;
                        }
                    }
                }
                btzyVar = btzy.h;
            }
            btzyVar = btzy.n;
        } else {
            btzyVar = btzy.d;
        }
        Integer num = btzyVar.s;
        Integer valueOf = Integer.valueOf(i);
        return dbsd.a(num, valueOf) ? btzyVar : new btzy(btzyVar.p, btzyVar.q, btzyVar.r, valueOf, btzyVar.t);
    }
}
