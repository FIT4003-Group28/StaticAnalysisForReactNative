package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cxla  reason: default package */
/* loaded from: classes5.dex */
final class cxla {
    private final ConcurrentHashMap<String, cxlb<?>> a = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> cxlb<T> a(final cxji cxjiVar, final String str, final cxkx<T> cxkxVar) {
        dbty dbtyVar = new dbty(cxkxVar, cxjiVar, str) { // from class: cxky
            private final cxkx a;
            private final cxji b;
            private final String c;

            {
                this.a = cxkxVar;
                this.b = cxjiVar;
                this.c = str;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(this.b, this.c);
            }
        };
        cxlb<?> cxlbVar = this.a.get(str);
        if (cxlbVar == null) {
            cxlbVar = (cxlb) dbtyVar.a();
            cxlb cxlbVar2 = (cxlb) this.a.putIfAbsent(str, cxlbVar);
            if (cxlbVar2 == null) {
                Context context = cxjiVar.b;
                cxlw.b.n(str, new cxkz(cxlbVar));
                if (!cxlw.c) {
                    synchronized (cxlw.a) {
                        if (!cxlw.c) {
                            context.registerReceiver(new cxlw(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            cxlw.c = true;
                        }
                    }
                }
            } else {
                cxlbVar = cxlbVar2;
            }
        }
        cxla cxlaVar = cxlb.c;
        boolean z = cxlbVar.g;
        dbsk.g(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return cxlbVar;
    }
}
