package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dpv  reason: default package */
/* loaded from: classes3.dex */
public final class dpv {
    final Map a = new HashMap();

    public final void a(String str, Callable callable) {
        this.a.put(str, callable);
    }
}
