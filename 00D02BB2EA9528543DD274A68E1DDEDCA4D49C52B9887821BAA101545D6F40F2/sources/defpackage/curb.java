package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: curb  reason: default package */
/* loaded from: classes5.dex */
public final class curb implements cuqx {
    public final curc c;
    private final cuiv d;
    private final ctyy e;
    private static final dehp f = cstu.b().a;
    private static final Executor g = new cuqz();
    static final Set<String> a = new HashSet();
    public static final HashMap<String, dehn<String>> b = new HashMap<>();

    public curb(curc curcVar, cuiv cuivVar, ctyy ctyyVar) {
        this.c = curcVar;
        this.d = cuivVar;
        this.e = ctyyVar;
    }

    private final void b(dehn<String> dehnVar) {
        deha.q(dehnVar, new cura(this), g);
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cuqx
    public final void a(cupu cupuVar, cugu cuguVar) {
        final String a2 = this.d.a(cuguVar.c(), cupuVar.a().a());
        File file = new File(a2);
        Set<String> set = a;
        synchronized (set) {
            if (file.exists()) {
                this.c.a(file.getAbsolutePath());
            } else if (set.contains(a2)) {
                this.c.a(null);
            } else {
                HashMap<String, dehn<String>> hashMap = b;
                if (hashMap.containsKey(a2)) {
                    dehn<String> dehnVar = hashMap.get(a2);
                    if (dehnVar != null) {
                        b(dehnVar);
                    }
                } else {
                    cuiv cuivVar = this.d;
                    ctyy ctyyVar = this.e;
                    cuir cuirVar = new cuir();
                    cukn a3 = cupuVar.a();
                    if (a3 != null) {
                        cuirVar.a = a3;
                        cuirVar.b = 27;
                        String str = "";
                        if (cuirVar.a == null) {
                            str = " lighterMediaId";
                        }
                        if (cuirVar.b == null) {
                            str = str.concat(" downloadRequestType");
                        }
                        if (!str.isEmpty()) {
                            String valueOf = String.valueOf(str);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        dehn<String> b2 = cuivVar.b(ctyyVar, cuguVar, new cuis(cuirVar.a, cuirVar.b.intValue()));
                        hashMap.put(a2, b2);
                        b2.Pk(new Runnable(a2) { // from class: cuqy
                            private final String a;

                            {
                                this.a = a2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2 = this.a;
                                synchronized (curb.a) {
                                    curb.a.add(str2);
                                    curb.b.remove(str2);
                                }
                            }
                        }, f);
                        b(b2);
                    } else {
                        throw new NullPointerException("Null lighterMediaId");
                    }
                }
            }
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
    }
}
