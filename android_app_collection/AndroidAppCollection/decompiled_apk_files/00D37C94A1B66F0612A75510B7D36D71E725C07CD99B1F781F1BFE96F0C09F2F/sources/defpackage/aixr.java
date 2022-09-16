package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aixr  reason: default package */
/* loaded from: classes.dex */
public final class aixr {
    public final List a = new ArrayList();
    public Long b;
    public aeui c;
    public aeui d;

    public final void a(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.a.addAll(list);
    }

    public final void b(long j) {
        if (this.b == null) {
            this.b = Long.valueOf(j);
        }
    }
}
