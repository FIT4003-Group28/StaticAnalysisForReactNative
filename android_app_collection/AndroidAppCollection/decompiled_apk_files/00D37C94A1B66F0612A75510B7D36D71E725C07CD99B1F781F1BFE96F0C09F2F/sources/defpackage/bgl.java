package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgl  reason: default package */
/* loaded from: classes2.dex */
public final class bgl {
    public boolean a = false;
    private List b;

    public final bgm a() {
        return new bgm(this.b, this.a);
    }

    public final void b(bga bgaVar) {
        if (bgaVar != null) {
            List list = this.b;
            if (list == null) {
                this.b = new ArrayList();
            } else if (list.contains(bgaVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.b.add(bgaVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
