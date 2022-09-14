package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: cqpu  reason: default package */
/* loaded from: classes.dex */
public final class cqpu implements dbrn {
    final /* synthetic */ Collection a;

    public cqpu(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.dbrn
    /* renamed from: b */
    public final Boolean a(Object obj) {
        return Boolean.valueOf(this.a.add(obj));
    }
}
