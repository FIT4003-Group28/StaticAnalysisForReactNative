package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crjk  reason: default package */
/* loaded from: classes5.dex */
public final class crjk extends ArrayList<crjo> {
    public final List<crjh> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final crjo a(amvh amvhVar) {
        int size = size();
        int i = 0;
        while (i < size) {
            crjo crjoVar = get(i);
            i++;
            if (amvhVar.f(crjoVar.a)) {
                return crjoVar;
            }
        }
        return null;
    }

    public final void b(crjh crjhVar) {
        this.a.add(crjhVar);
    }
}
