package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bvwx  reason: default package */
/* loaded from: classes4.dex */
public final class bvwx implements bvwz {
    public final Runnable a;
    private final String b = "raqa";

    public bvwx(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bvww(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return this.b;
    }
}
