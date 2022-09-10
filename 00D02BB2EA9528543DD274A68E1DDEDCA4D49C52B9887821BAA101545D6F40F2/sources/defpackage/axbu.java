package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axbu  reason: default package */
/* loaded from: classes3.dex */
final class axbu implements axce {
    final /* synthetic */ axbv a;
    private final Map<awvv<?>, awwa> b;
    private final awvx c;
    private final bvpj<awwb> d;
    private final bvrj e;

    public axbu(axbv axbvVar, Map<awvv<?>, awwa> map, awvx awvxVar, bvpj<awwb> bvpjVar, bvrj bvrjVar) {
        this.a = axbvVar;
        this.b = map;
        this.c = awvxVar;
        this.d = bvpjVar;
        this.e = bvrjVar;
    }

    @Override // defpackage.axce
    public final void a(@dzsi dviw dviwVar, @dzsi dviq dviqVar, @dzsi btlu btluVar, int i, Map<awvv<?>, awwa> map) {
        synchronized (this.a) {
            if (dviwVar != null) {
                this.a.d.b(dviwVar, dviqVar, btluVar, i);
            }
            for (Map.Entry<awvv<?>, awwa> entry : this.b.entrySet()) {
                awwa value = entry.getValue();
                if (map.containsKey(entry.getKey())) {
                    value = map.get(entry.getKey());
                }
                this.b.put(entry.getKey(), value);
            }
            this.a.d(false, this.b, this.c, this.d, this.e);
        }
    }
}
