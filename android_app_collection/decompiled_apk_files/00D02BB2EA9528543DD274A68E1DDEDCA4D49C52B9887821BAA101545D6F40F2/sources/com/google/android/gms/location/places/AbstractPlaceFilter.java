package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> Set<E> a(List<E> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(list));
    }
}
