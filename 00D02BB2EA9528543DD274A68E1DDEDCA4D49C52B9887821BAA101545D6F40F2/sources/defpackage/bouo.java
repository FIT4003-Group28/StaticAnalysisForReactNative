package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bouo  reason: default package */
/* loaded from: classes3.dex */
final class bouo implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ boup a;

    public bouo(boup boupVar) {
        this.a = boupVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        this.a.a.runOnUiThread(new Runnable(this) { // from class: boun
            private final bouo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dpya cO;
                boup boupVar = this.a.a;
                ilo c = boupVar.c.c();
                if (c == null || (cO = c.cO()) == null) {
                    return;
                }
                dpxx dpxxVar = cO.b;
                if (dpxxVar == null) {
                    dpxxVar = dpxx.d;
                }
                boupVar.b.a().m(dpxxVar.c, 1);
                boupVar.a.g().e();
            }
        });
        return bvwy.a;
    }
}
