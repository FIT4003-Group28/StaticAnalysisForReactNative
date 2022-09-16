package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dtj  reason: default package */
/* loaded from: classes3.dex */
public final class dtj extends drs {
    public Long a;
    public Boolean b;
    public Boolean c;

    public dtj() {
    }

    @Override // defpackage.drs
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public dtj(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Boolean) a.get(1);
            this.c = (Boolean) a.get(2);
        }
    }
}
