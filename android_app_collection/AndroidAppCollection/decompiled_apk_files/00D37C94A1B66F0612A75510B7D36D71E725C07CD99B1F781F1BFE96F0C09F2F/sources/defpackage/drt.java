package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: drt  reason: default package */
/* loaded from: classes3.dex */
public final class drt extends drs {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public drt() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }

    @Override // defpackage.drs
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    public drt(String str) {
        String str2 = "E";
        this.a = str2;
        long j = -1;
        this.b = -1L;
        this.c = str2;
        this.d = str2;
        this.e = str2;
        HashMap a = a(str);
        if (a != null) {
            this.a = a.get(0) == null ? str2 : (String) a.get(0);
            this.b = a.get(1) != null ? ((Long) a.get(1)).longValue() : j;
            this.c = a.get(2) == null ? str2 : (String) a.get(2);
            this.d = a.get(3) == null ? str2 : (String) a.get(3);
            this.e = a.get(4) != null ? (String) a.get(4) : str2;
        }
    }
}
