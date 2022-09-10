package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: voe  reason: default package */
/* loaded from: classes7.dex */
public class voe {
    public static final voe b = new vod(dcmn.a);
    public boolean a;
    private final Map<wut, wuv> c;

    public voe() {
        this.c = new HashMap();
    }

    public voe(Map<wut, wuv> map) {
        this.c = map;
    }

    @dzsi
    public wuv a(wuv wuvVar) {
        return this.c.put(wuvVar.x(), wuvVar);
    }

    public boolean b() {
        return this.a;
    }

    public final Collection<wuv> c() {
        return this.c.values();
    }

    @dzsi
    public final wuv d(wut wutVar) {
        return this.c.get(wutVar);
    }
}
