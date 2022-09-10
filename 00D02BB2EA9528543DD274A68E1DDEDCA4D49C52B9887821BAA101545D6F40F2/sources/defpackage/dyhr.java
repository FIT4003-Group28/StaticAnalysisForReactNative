package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dyhr  reason: default package */
/* loaded from: classes6.dex */
public final class dyhr<T> implements Iterable<T> {
    public final dyhs<T> a;
    public final int b;
    final /* synthetic */ dyhw c;

    public dyhr(dyhw dyhwVar, dyhs<T> dyhsVar, int i) {
        this.c = dyhwVar;
        this.a = dyhsVar;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new dyhq(this);
    }
}
