package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: awvp  reason: default package */
/* loaded from: classes3.dex */
public final class awvp extends awwj {
    public dcep<awvv<?>> a;
    public int b;

    @Override // defpackage.awwj
    public final void a(Set<awvv<?>> set) {
        this.a = dcep.K(set);
    }

    @Override // defpackage.awwj
    public final void b(int i) {
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new NullPointerException("Null prefetchType");
    }
}
