package defpackage;

import android.widget.Toast;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbu  reason: default package */
/* loaded from: classes4.dex */
final class bwbu implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bwbv a;

    public bwbu(bwbv bwbvVar) {
        this.a = bwbvVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        Map<String, Object> map2 = map;
        String str = map2 != null ? (String) map2.get("msg") : null;
        if (!dbsj.d(str)) {
            Toast.makeText(this.a.a, str, 0).show();
        }
        return bvwy.a;
    }
}
