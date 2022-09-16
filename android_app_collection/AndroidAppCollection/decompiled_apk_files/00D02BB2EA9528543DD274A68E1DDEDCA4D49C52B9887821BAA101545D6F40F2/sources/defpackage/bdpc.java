package defpackage;

import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: bdpc  reason: default package */
/* loaded from: classes3.dex */
public final class bdpc {
    public final String a;
    public final ddcu b;
    public final LinkedHashMap<bbtj, cjtd> c = new LinkedHashMap<>();

    public bdpc(String str, ddcu ddcuVar) {
        this.a = str;
        this.b = ddcuVar;
    }

    public final void a(bbtj bbtjVar) {
        this.c.put(bbtjVar, null);
    }
}
