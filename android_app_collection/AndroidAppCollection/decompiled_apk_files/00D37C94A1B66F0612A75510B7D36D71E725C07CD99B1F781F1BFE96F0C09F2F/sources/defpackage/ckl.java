package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckl  reason: default package */
/* loaded from: classes2.dex */
final class ckl implements Iterable {
    public final List a;

    public ckl() {
        this(new ArrayList(2));
    }

    public ckl(List list) {
        this.a = list;
    }

    public static ckk b(ctn ctnVar) {
        return new ckk(ctnVar, cux.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ckl c() {
        return new ckl(new ArrayList(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(ctn ctnVar) {
        return this.a.contains(b(ctnVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
