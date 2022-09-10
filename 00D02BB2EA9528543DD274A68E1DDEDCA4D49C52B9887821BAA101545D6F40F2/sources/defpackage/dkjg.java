package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dkjg  reason: default package */
/* loaded from: classes6.dex */
public final class dkjg extends dsqp<dkks, dkjg> implements dkkt {
    public dkjg() {
        super(dkks.K);
    }

    @Override // defpackage.dkkt
    public final List<Integer> a() {
        return Collections.unmodifiableList(((dkks) this.b).y);
    }

    @Override // defpackage.dkkt
    public final int b() {
        return ((dkks) this.b).H;
    }

    @Override // defpackage.dkkt
    public final void c() {
        int i = ((dkks) this.b).u;
    }

    @Override // defpackage.dkkt
    public final int d() {
        int a = dkkb.a(((dkks) this.b).m);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
