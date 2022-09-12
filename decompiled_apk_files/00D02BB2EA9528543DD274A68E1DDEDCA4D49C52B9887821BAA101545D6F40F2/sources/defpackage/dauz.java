package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dauz  reason: default package */
/* loaded from: classes5.dex */
public final class dauz implements Iterable {
    final /* synthetic */ Object a;

    public dauz(Object obj) {
        this.a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dauy(this);
    }
}
