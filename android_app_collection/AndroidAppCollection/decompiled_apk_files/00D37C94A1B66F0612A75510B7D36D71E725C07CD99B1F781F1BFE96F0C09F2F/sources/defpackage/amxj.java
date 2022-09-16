package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amxj  reason: default package */
/* loaded from: classes.dex */
public interface amxj extends Collection {
    int a(Object obj);

    int c(Object obj, int i);

    @Override // java.util.Collection, defpackage.amxj
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    void f(Object obj, int i);

    boolean h(Object obj, int i);

    Set i();

    Set j();

    @Override // java.util.Collection, defpackage.amxj
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.amxj
    int size();
}
