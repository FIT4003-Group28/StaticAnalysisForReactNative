package com.google.firebase.components;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements c.e.b.n.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f8542a;

    private j(Set set) {
        this.f8542a = set;
    }

    public static c.e.b.n.a a(Set set) {
        return new j(set);
    }

    @Override // c.e.b.n.a
    public Object get() {
        return l.a(this.f8542a);
    }
}
