package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ppk  reason: default package */
/* loaded from: classes7.dex */
public final class ppk implements bvwz {
    public final gga a;
    public final pnq b;
    public final Executor c;
    public final String d;
    public final String e;
    public final int f;

    public ppk(gga ggaVar, pnq pnqVar, Executor executor, String str, String str2, int i) {
        this.a = ggaVar;
        this.b = pnqVar;
        this.c = executor;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new ppi(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "dccm";
    }
}
