package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akic  reason: default package */
/* loaded from: classes.dex */
public final class akic extends yua implements akgs {
    public Map a;
    public boolean b;
    public acvh c;
    private final String k;

    public akic(String str, String str2) {
        super(1, str, null);
        this.a = new HashMap();
        this.k = str2;
    }

    @Override // defpackage.akgs
    public final acvh c() {
        return this.c;
    }

    @Override // defpackage.yua
    public final Map f() {
        return this.a;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        byte[] bArr = cewVar.b;
        akhh akhhVar = null;
        if (bArr == null) {
            return null;
        }
        Map map = cewVar.c;
        this.a = map;
        if (this.b) {
            Map map2 = cewVar.c;
            int i = cewVar.a;
            return cfb.b(new akgn(bArr), acx.g(cewVar));
        } else if (!map.containsKey("content-type")) {
            return null;
        } else {
            String str = (String) this.a.get("content-type");
            if (TextUtils.equals(str, "application/x-protobuffer")) {
                byte[] bArr2 = cewVar.b;
                int i2 = cewVar.a;
                akhhVar = new akhg(bArr2, this.k, null);
            } else if (TextUtils.equals(str, "application/json; charset=UTF-8")) {
                byte[] bArr3 = cewVar.b;
                Map map3 = this.a;
                int i3 = cewVar.a;
                akhhVar = new akgq(bArr3, map3, this.k);
            }
            return cfb.b(akhhVar, acx.g(cewVar));
        }
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        akhh akhhVar = (akhh) obj;
    }

    public final void t(String str, String str2) {
        this.a.put(str, str2);
    }
}
