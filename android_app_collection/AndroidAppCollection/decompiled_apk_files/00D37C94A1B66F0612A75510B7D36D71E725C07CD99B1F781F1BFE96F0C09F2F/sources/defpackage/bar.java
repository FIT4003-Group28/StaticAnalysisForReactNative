package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bar  reason: default package */
/* loaded from: classes2.dex */
public final class bar {
    public final long a;
    public final List b;

    public bar(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public bar(List list) {
        List emptyList = Collections.emptyList();
        this.a = 0L;
        this.b = Collections.unmodifiableList(list);
        Collections.unmodifiableList(emptyList);
    }
}
