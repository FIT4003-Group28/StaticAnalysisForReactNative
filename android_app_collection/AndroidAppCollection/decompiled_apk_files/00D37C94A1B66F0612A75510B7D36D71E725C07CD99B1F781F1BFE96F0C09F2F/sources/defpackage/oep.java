package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: oep  reason: default package */
/* loaded from: classes3.dex */
public final class oep implements gdr {
    public String a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public final void a(String str) {
        this.a = str;
        for (gdq gdqVar : this.b) {
            gdqVar.a();
        }
    }

    @Override // defpackage.gdr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.gdr
    public final void c(gdq gdqVar) {
        this.b.add(gdqVar);
    }

    @Override // defpackage.gdr
    public final void pe(gdq gdqVar) {
        this.b.remove(gdqVar);
    }
}
