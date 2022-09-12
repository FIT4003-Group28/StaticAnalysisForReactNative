package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: jvr  reason: default package */
/* loaded from: classes7.dex */
final class jvr<T> implements Comparator<T> {
    private final dbrn<T, String> a;

    public jvr(dbrn<T, String> dbrnVar) {
        this.a = dbrnVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return cmw.a(this.a.a(t)).compareTo(cmw.a(this.a.a(t2)));
    }
}
