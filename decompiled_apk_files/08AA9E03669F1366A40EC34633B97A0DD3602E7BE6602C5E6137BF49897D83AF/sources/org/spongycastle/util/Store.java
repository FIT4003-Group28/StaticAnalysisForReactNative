package org.spongycastle.util;

import java.util.Collection;
/* loaded from: classes2.dex */
public interface Store<T> {
    Collection<T> getMatches(Selector<T> selector);
}
