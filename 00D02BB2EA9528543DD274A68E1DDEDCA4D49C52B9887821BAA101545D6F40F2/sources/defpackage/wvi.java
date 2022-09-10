package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wvi  reason: default package */
/* loaded from: classes7.dex */
public class wvi {
    @dzsi
    public volatile digv a;
    public final HashMap<String, djws> b = new HashMap<>();

    public wvi(vtn vtnVar, burz burzVar, Executor executor) {
        burzVar.b(digt.a, new wvh(this, vtnVar), executor);
    }

    public final djws a(drhj drhjVar) {
        djws djwsVar = this.b.get(drhjVar.b);
        return djwsVar == null ? djws.g : djwsVar;
    }
}
