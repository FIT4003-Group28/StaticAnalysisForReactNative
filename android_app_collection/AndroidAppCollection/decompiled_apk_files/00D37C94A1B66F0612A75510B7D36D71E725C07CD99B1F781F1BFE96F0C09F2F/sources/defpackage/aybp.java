package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybp  reason: default package */
/* loaded from: classes2.dex */
public final class aybp implements Comparator {
    final /* synthetic */ aybq a;

    public aybp(aybq aybqVar) {
        this.a = aybqVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.a.a(obj);
        this.a.a(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
