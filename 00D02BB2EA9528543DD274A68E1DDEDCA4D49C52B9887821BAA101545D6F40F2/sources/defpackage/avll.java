package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avll  reason: default package */
/* loaded from: classes3.dex */
public final class avll {
    public final crzo<avlj> a = new crzo<>();
    public final crzd<avlm> b = new crzd<>();

    public avll(Set<avlm> set, Executor executor) {
        for (avlm avlmVar : set) {
            this.b.a(avlmVar, executor);
        }
    }

    public final crzm<avlj> a() {
        return this.a.a;
    }
}
