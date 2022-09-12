package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wvd  reason: default package */
/* loaded from: classes7.dex */
final class wvd extends dees<Map<qdv, dopk>> {
    private int a;
    private final Map<qdv, dopk> b = new HashMap();

    public wvd(int i) {
        this.a = i;
    }

    private final void d() {
        int i = this.a - 1;
        this.a = i;
        if (i <= 0) {
            if (this.b.isEmpty()) {
                k(new qdt());
            } else {
                j(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(qdv qdvVar, dopk dopkVar) {
        this.b.put(qdvVar, dopkVar);
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        d();
    }
}
