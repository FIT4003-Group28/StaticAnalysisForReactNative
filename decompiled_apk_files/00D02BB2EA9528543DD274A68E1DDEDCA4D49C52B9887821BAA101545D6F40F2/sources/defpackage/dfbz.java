package defpackage;

import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: dfbz  reason: default package */
/* loaded from: classes6.dex */
final class dfbz {
    public final Object a;
    public final LinkedHashMap<dfbd, dehn<?>> b = new LinkedHashMap<>();
    public int c;

    public dfbz(Object obj, int i) {
        this.a = obj;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return !this.b.isEmpty();
    }
}
