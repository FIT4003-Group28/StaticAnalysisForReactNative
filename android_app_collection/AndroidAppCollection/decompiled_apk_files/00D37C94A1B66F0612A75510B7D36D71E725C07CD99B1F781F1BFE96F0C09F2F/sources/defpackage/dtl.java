package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dtl  reason: default package */
/* loaded from: classes3.dex */
public final class dtl {
    public final rcf a;
    public final rcn b;
    public final dtw c;
    public final dta d;
    private final dtk e;

    public dtl(rcf rcfVar, rcn rcnVar, dtw dtwVar, dtk dtkVar, dta dtaVar) {
        this.a = rcfVar;
        this.b = rcnVar;
        this.c = dtwVar;
        this.e = dtkVar;
        this.d = dtaVar;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        dnw a = rcn.a(this.b.e, rcm.a);
        hashMap.put("v", this.a.a);
        hashMap.put("gms", Boolean.valueOf(this.a.c));
        hashMap.put("int", a.s);
        hashMap.put("up", Boolean.valueOf(this.e.a));
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
