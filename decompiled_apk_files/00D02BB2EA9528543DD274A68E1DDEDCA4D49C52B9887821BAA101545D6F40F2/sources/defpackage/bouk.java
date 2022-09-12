package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bouk  reason: default package */
/* loaded from: classes3.dex */
final class bouk implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ boul a;

    public bouk(boul boulVar) {
        this.a = boulVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        this.a.a.runOnUiThread(new Runnable(this) { // from class: bouj
            private final bouk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.a("android_rap");
            }
        });
        return bvwy.a;
    }
}
