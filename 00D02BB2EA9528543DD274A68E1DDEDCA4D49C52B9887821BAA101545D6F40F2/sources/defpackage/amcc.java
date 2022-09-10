package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amcc  reason: default package */
/* loaded from: classes.dex */
public final class amcc {
    public final Map<alyh, amcb> a = new HashMap();
    private final cqat b;
    private final akry c;

    public amcc(cqat cqatVar, akry akryVar) {
        this.b = cqatVar;
        this.c = akryVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(alyh alyhVar) {
        if (!this.a.containsKey(alyhVar)) {
            this.a.put(alyhVar, new amcb(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(alyh alyhVar) {
        this.a.remove(alyhVar);
    }
}
