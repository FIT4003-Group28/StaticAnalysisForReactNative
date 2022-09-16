package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cxlz  reason: default package */
/* loaded from: classes5.dex */
final class cxlz<T> {
    public final Object a = new Object();
    public volatile Map<String, T> b;
    public dbty<Map<String, T>> c;

    public cxlz(dbty<Map<String, T>> dbtyVar) {
        this.c = dbtyVar;
    }

    public final boolean a(Map<String, T> map) {
        dbsk.s(map);
        synchronized (this.a) {
            if (this.b != null) {
                return this.b.equals(map);
            }
            this.b = map;
            this.c = null;
            return true;
        }
    }
}
