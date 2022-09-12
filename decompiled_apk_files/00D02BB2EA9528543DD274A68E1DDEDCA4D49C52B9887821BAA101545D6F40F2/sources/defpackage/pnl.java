package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pnl  reason: default package */
/* loaded from: classes.dex */
public final class pnl {
    final Map<Integer, pny> a;
    dcdn<pnu, String> b;
    @dzsi
    File c;

    public pnl() {
        this.a = new LinkedHashMap();
        this.b = dcmn.a;
        this.c = null;
    }

    public final pnm a() {
        return new pnm(dcdn.r(this.a), this.c, this.b);
    }

    public pnl(pnm pnmVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = dcmn.a;
        this.c = null;
        linkedHashMap.putAll(pnmVar.a);
        this.c = pnmVar.b;
        this.b = pnmVar.c;
    }
}
