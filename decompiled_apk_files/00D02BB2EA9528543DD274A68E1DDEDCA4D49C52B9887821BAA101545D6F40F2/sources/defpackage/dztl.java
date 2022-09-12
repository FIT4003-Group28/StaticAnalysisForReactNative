package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: dztl  reason: default package */
/* loaded from: classes6.dex */
class dztl extends dztk {
    public static final <T> int d(Iterable<? extends T> iterable, int i) {
        dzvx.c(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
