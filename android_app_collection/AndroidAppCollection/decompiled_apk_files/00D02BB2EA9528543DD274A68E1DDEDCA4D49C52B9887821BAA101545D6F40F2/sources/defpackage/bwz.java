package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwz  reason: default package */
/* loaded from: classes.dex */
public final class bwz {
    public final Map<btw, bwr<?>> a = new HashMap();

    public bwz() {
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(btw btwVar, bwr<?> bwrVar) {
        Map<btw, bwr<?>> map = this.a;
        if (bwrVar.equals(map.get(btwVar))) {
            map.remove(btwVar);
        }
    }
}
