package defpackage;

import defpackage.dssj;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvxb  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvxb<RequestT extends dssj, ResponseT extends dssj> implements bvwz {
    public static final dcqe g = dcqe.c("bvxb");

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bvxa(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        ResponseT f = f(obj);
        if (f == null) {
            return null;
        }
        deig d = deig.d();
        HashMap hashMap = new HashMap();
        hashMap.put("base64data", ddae.e.i(f.bS()));
        d.j(hashMap);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract ResponseT e(RequestT requestt);

    @dzsi
    protected ResponseT f(Object obj) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract RequestT j(byte[] bArr);
}
