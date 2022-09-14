package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: apnb  reason: default package */
/* loaded from: classes2.dex */
public final class apnb extends bvwn<dmje> {
    private final dxio<ache> b;

    public apnb(dxio<ache> dxioVar) {
        super(dmje.c);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmje dmjeVar) {
        acgz b = achb.b();
        for (Map.Entry entry : Collections.unmodifiableMap(dmjeVar.a).entrySet()) {
            b.c((String) entry.getKey(), (String) entry.getValue());
        }
        this.b.a().k(false, true, achc.TIMELINE, b.b());
    }
}
