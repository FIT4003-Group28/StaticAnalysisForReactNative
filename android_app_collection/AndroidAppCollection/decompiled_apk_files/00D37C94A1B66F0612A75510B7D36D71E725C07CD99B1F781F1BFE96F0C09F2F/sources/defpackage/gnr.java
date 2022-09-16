package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnr  reason: default package */
/* loaded from: classes3.dex */
public final class gnr implements aafo {
    private final aafo a;
    private final Map b;

    public gnr(aafo aafoVar, Map map) {
        aafoVar.getClass();
        this.a = aafoVar;
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        if (map == null) {
            this.a.c(apzgVar, this.b);
            return;
        }
        HashMap hashMap = new HashMap(this.b);
        hashMap.putAll(map);
        this.a.c(apzgVar, hashMap);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
