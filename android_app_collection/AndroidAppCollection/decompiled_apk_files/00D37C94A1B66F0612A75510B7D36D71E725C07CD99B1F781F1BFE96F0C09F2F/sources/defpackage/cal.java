package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cal  reason: default package */
/* loaded from: classes2.dex */
public abstract class cal implements cak {
    public final List a;

    public cal(Object obj) {
        this(Collections.singletonList(new cdi(obj)));
    }

    public cal(List list) {
        this.a = list;
    }

    @Override // defpackage.cak
    public final List b() {
        return this.a;
    }

    @Override // defpackage.cak
    public final boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && ((cdi) this.a.get(0)).e());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
