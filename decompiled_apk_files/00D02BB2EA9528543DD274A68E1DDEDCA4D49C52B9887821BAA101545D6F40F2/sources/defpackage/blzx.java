package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: blzx  reason: default package */
/* loaded from: classes3.dex */
final class blzx implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ blzy a;

    public blzx(blzy blzyVar) {
        this.a = blzyVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        this.a.a.runOnUiThread(new Runnable(this) { // from class: blzw
            private final blzx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                blzy blzyVar = this.a.a;
                blzyVar.a.g().f();
                blzyVar.b.a().c(dtxz.p, null);
            }
        });
        return bvwy.a;
    }
}
