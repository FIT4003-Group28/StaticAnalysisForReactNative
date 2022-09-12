package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eafh  reason: default package */
/* loaded from: classes6.dex */
public final class eafh {
    private final Set<eaes> a = new LinkedHashSet();

    public final synchronized void a(eaes eaesVar) {
        this.a.add(eaesVar);
    }

    public final synchronized void b(eaes eaesVar) {
        this.a.remove(eaesVar);
    }

    public final synchronized boolean c(eaes eaesVar) {
        return this.a.contains(eaesVar);
    }
}
