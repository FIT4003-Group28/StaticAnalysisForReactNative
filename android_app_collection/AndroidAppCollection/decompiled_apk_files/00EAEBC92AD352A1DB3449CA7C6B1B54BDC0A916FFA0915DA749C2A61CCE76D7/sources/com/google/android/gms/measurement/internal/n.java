package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f7511b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o f7512c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar) {
        Bundle bundle;
        this.f7512c = oVar;
        bundle = this.f7512c.f7540b;
        this.f7511b = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7511b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f7511b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
