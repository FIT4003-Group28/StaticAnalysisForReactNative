package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wws  reason: default package */
/* loaded from: classes4.dex */
public final class wws extends acvk {
    private final ahfs b;
    private final aijs c;
    private final Map d;

    public wws(ahfs ahfsVar, int i, aijs aijsVar, boolean z, Map map) {
        super("ad_to_video", i, z);
        this.b = ahfsVar;
        this.c = aijsVar;
        map.getClass();
        this.d = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final boolean a(ymg ymgVar) {
        boolean a = super.a(ymgVar);
        if (a) {
            if (ymgVar instanceof ahgv) {
                if (((ahgv) ymgVar).b) {
                    f("ad_to_ad");
                    return true;
                }
            } else {
                f("ad_to_video_int");
            }
        }
        return a;
    }

    @Override // defpackage.acvk
    public final dvo b() {
        g("vis", this.c.a());
        g("mod_ad", "1");
        if (this.b.e() > 0) {
            g("cache_bytes", String.valueOf(this.b.e()));
        }
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final void c(ymg ymgVar, Set set, Set set2) {
        super.c(ymgVar, set, set2);
        if (!this.d.isEmpty()) {
            for (Map.Entry entry : this.d.entrySet()) {
                g((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
