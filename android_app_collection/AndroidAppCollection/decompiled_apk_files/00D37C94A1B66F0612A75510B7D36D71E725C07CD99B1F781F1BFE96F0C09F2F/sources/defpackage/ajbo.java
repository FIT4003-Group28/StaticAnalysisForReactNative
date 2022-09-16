package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: ajbo  reason: default package */
/* loaded from: classes.dex */
public final class ajbo implements Comparator, Serializable {
    public final ajbn a = new ajbn();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ajbn.a(((ajbm) obj).n, ((ajbm) obj2).n);
    }
}
