package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahfv  reason: default package */
/* loaded from: classes.dex */
public final class ahfv extends acvk {
    private final aijs b;
    private final ahfs c;
    private final Map d;

    public ahfv(int i, aijs aijsVar, boolean z, ahfs ahfsVar, Map map) {
        super("watch", i, z);
        aijsVar.getClass();
        this.b = aijsVar;
        this.c = ahfsVar;
        map.getClass();
        this.d = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final boolean a(ymg ymgVar) {
        boolean a = super.a(ymgVar);
        if (!a || ymgVar.getClass() == ahgv.class || ymgVar.getClass() == ahgw.class || ymgVar.getClass() == ahgr.class) {
            return a;
        }
        f("abandoned_watch");
        return true;
    }

    @Override // defpackage.acvk
    public final dvo b() {
        g("vis", this.b.a());
        g("bwm", String.format(Locale.US, "%d:%.3f", Long.valueOf(this.c.a.get()), Float.valueOf(this.c.b.get() / 1000.0f)));
        if (this.c.e() > 0) {
            g("cache_bytes", String.valueOf(this.c.e()));
        }
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final void c(ymg ymgVar, Set set, Set set2) {
        super.c(ymgVar, set, set2);
        for (Map.Entry entry : this.d.entrySet()) {
            g((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
