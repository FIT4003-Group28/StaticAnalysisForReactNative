package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: axpf  reason: default package */
/* loaded from: classes2.dex */
public final class axpf {
    public long a;
    public final List b = Collections.synchronizedList(new ArrayList());

    public final void a(axpc axpcVar) {
        this.b.remove(axpcVar);
    }
}
