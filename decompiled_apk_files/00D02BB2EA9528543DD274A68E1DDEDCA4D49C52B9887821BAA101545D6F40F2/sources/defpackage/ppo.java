package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ppo  reason: default package */
/* loaded from: classes7.dex */
public final class ppo implements bvwz {
    public final gga a;
    public final pnq b;
    public final bvjj c;
    public boolean d = false;

    public ppo(gga ggaVar, pnq pnqVar, bvjj bvjjVar) {
        this.a = ggaVar;
        this.b = pnqVar;
        this.c = bvjjVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new ppn(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "ooocc";
    }
}
