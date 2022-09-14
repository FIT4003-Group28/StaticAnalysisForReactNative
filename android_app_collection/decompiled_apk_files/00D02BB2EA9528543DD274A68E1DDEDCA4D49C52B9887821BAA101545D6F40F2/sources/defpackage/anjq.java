package defpackage;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjq  reason: default package */
/* loaded from: classes2.dex */
public final class anjq implements btzi {
    final /* synthetic */ anjr a;
    private final Map<btzi, bvrj> b = new HashMap();

    public anjq(anjr anjrVar) {
        this.a = anjrVar;
    }

    @Override // defpackage.btzi
    public final void QY(final btzr btzrVar, final btzy btzyVar) {
        this.a.b(btzrVar.a);
        for (final Map.Entry<btzi, bvrj> entry : this.b.entrySet()) {
            this.a.a.b(new Runnable(entry, btzrVar, btzyVar) { // from class: anjp
                private final Map.Entry a;
                private final btzr b;
                private final btzy c;

                {
                    this.a = entry;
                    this.b = btzrVar;
                    this.c = btzyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Map.Entry entry2 = this.a;
                    ((btzi) entry2.getKey()).QY(this.b, this.c);
                }
            }, entry.getValue());
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(final btzr btzrVar, Object obj) {
        final dssj dssjVar = (dssj) obj;
        this.a.b(btzrVar.a);
        for (final Map.Entry<btzi, bvrj> entry : this.b.entrySet()) {
            this.a.a.b(new Runnable(entry, btzrVar, dssjVar) { // from class: anjo
                private final Map.Entry a;
                private final btzr b;
                private final dssj c;

                {
                    this.a = entry;
                    this.b = btzrVar;
                    this.c = dssjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Map.Entry entry2 = this.a;
                    ((btzi) entry2.getKey()).QZ(this.b, this.c);
                }
            }, entry.getValue());
        }
    }

    public final void c(btzi btziVar, bvrj bvrjVar) {
        dbsk.b(bvrjVar != bvrj.CURRENT, "Cannot execute RpcCallbacks on Threads.CURRENT");
        this.b.put(btziVar, bvrjVar);
    }
}
