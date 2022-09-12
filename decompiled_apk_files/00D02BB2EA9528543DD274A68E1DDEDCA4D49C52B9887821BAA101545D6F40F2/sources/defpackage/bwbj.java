package defpackage;

import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbj  reason: default package */
/* loaded from: classes4.dex */
final class bwbj implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bwbk a;

    public bwbj(bwbk bwbkVar) {
        this.a = bwbkVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: bwbh
            private final bwbj a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String string;
                bwbj bwbjVar = this.a;
                Map map3 = this.b;
                gn g = bwbjVar.a.a.g();
                if (g != null && !g.J()) {
                    g.f();
                }
                if (map3 == null || map3.get("msg") == null) {
                    string = bwbjVar.a.a.getString(R.string.GENERIC_ERROR_MESSAGE);
                } else {
                    string = (String) map3.get("msg");
                }
                if (!dbsj.d(string)) {
                    dafk a = ckos.a(bwbjVar.a.a.findViewById(16908290), string, 5000);
                    a.p(bwbjVar.a.a.getString(R.string.OK_BUTTON), new bwbi(a));
                    a.c();
                }
            }
        });
        return bvwy.a;
    }
}
