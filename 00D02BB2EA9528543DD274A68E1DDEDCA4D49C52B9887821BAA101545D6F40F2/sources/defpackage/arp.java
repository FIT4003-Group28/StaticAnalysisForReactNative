package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arp  reason: default package */
/* loaded from: classes2.dex */
public final class arp {
    final aqy a;
    final List<arq> b = new ArrayList();
    public ara c;
    private final aqw d;

    public arp(aqy aqyVar) {
        this.a = aqyVar;
        this.d = aqyVar.f;
    }

    public final String a() {
        return this.d.a();
    }

    public final ComponentName b() {
        return this.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arq c(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i).b.equals(str)) {
                return this.b.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + a() + " }";
    }
}
