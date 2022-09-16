package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqo  reason: default package */
/* loaded from: classes2.dex */
public abstract class bqo {
    public final bqk a(bqq bqqVar) {
        return b(Collections.singletonList(bqqVar));
    }

    public abstract bqk b(List list);

    public abstract bqk c(String str, int i, List list);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract bqk f(String str, int i, bqq bqqVar);

    public final bqk g(String str, int i, bqq bqqVar) {
        return c(str, i, Collections.singletonList(bqqVar));
    }
}
