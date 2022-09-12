package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: debo  reason: default package */
/* loaded from: classes6.dex */
final class debo {
    public static <E> Collection<E> a(Collection<E> collection) {
        ArrayList c = dchl.c(collection);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            dbsk.t(c.get(i), "this list cannot contain null");
        }
        return c;
    }
}
