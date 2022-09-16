package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wwv  reason: default package */
/* loaded from: classes4.dex */
public final class wwv extends acvk {
    private final ahfs b;
    private final aijs c;
    private final Map d;

    public wwv(ahfs ahfsVar, int i, aijs aijsVar, boolean z, Map map) {
        super("video_to_ad", i, z);
        this.b = ahfsVar;
        this.c = aijsVar;
        map.getClass();
        this.d = map;
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
        aqxo.p(ymgVar instanceof wyg);
        wyg wygVar = (wyg) ymgVar;
        String str = wygVar.a;
        String str2 = wygVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 4 + str2.length());
        sb.append(str);
        sb.append("_to_");
        sb.append(str2);
        f(sb.toString());
    }
}
