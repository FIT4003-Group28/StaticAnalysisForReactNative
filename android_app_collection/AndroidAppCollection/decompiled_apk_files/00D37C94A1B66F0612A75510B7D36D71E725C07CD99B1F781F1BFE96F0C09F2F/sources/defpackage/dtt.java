package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dtt  reason: default package */
/* loaded from: classes3.dex */
public final class dtt extends drs {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    public dtt() {
    }

    @Override // defpackage.drs
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        return hashMap;
    }

    public dtt(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
            this.c = (Long) a.get(2);
            this.d = (Long) a.get(3);
        }
    }
}
