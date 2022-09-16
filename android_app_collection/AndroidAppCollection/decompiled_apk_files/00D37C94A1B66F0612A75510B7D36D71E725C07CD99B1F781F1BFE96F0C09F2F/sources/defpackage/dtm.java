package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dtm  reason: default package */
/* loaded from: classes3.dex */
public final class dtm extends drs {
    public Long a;
    public Long b;

    public dtm() {
    }

    @Override // defpackage.drs
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }

    public dtm(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
        }
    }
}
