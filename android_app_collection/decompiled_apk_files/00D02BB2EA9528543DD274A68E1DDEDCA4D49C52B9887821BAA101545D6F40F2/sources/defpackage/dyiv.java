package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dyiv  reason: default package */
/* loaded from: classes6.dex */
final class dyiv implements Comparator {
    final /* synthetic */ dyiw a;

    public dyiv(dyiw dyiwVar) {
        this.a = dyiwVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a = this.a.a(obj) - this.a.a(obj2);
        return a != 0 ? a : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
