package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ave  reason: default package */
/* loaded from: classes2.dex */
public final class ave {
    public final long a;
    public final boolean b = false;
    public final List c;

    public ave(long j, List list) {
        this.a = j;
        this.c = list == null ? Collections.emptyList() : list;
    }

    public final bar a() {
        return (bar) this.c.get(0);
    }
}
