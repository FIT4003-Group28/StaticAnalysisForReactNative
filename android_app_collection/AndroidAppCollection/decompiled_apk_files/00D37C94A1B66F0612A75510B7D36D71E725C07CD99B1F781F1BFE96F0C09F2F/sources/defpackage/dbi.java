package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbi  reason: default package */
/* loaded from: classes3.dex */
public final class dbi {
    final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = new HashMap();
    final Set c = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(ddm ddmVar) {
        this.c.add(ddmVar);
    }

    public final synchronized void b(ddm ddmVar) {
        this.c.remove(ddmVar);
        if (this.c.isEmpty()) {
            this.b.clear();
            this.a.clear();
        }
    }
}
