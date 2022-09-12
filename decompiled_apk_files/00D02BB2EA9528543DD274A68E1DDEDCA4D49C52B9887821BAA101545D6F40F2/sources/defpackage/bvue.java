package defpackage;

import com.google.android.apps.gmm.shared.webview.NativeApiImpl;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvue  reason: default package */
/* loaded from: classes4.dex */
public final class bvue implements degu<Map<String, Object>> {
    final /* synthetic */ String a;
    final /* synthetic */ NativeApiImpl b;

    public bvue(NativeApiImpl nativeApiImpl, String str) {
        this.b = nativeApiImpl;
        this.a = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.b.h(this.a, 3, NativeApiImpl.c(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Map<String, Object> map) {
        Map<String, Object> map2 = map;
        bvtz bvtzVar = this.b.b;
        String str = this.a;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        bvtzVar.h(str, 1, map2);
    }
}
