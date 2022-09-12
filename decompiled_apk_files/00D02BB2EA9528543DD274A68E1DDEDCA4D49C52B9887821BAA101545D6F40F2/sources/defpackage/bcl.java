package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcl  reason: default package */
/* loaded from: classes.dex */
public abstract class bcl {
    public final bcg a(bcn bcnVar) {
        return b(Collections.singletonList(bcnVar));
    }

    public abstract bcg b(List<? extends bcn> list);

    public abstract void c(String str);

    public final bcg d(String str, int i, bcb bcbVar) {
        return e(str, i, Collections.singletonList(bcbVar));
    }

    public abstract bcg e(String str, int i, List<bcb> list);

    public abstract bcg f(String str, int i, bci bciVar);
}
