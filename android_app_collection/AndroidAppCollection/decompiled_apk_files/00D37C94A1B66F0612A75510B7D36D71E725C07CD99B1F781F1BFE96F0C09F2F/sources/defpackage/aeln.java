package defpackage;

import android.util.LruCache;
/* compiled from: PG */
/* renamed from: aeln  reason: default package */
/* loaded from: classes.dex */
public final class aeln implements adzw {
    public final LruCache a = new LruCache(16);
    public final afjz b;

    public aeln(afjz afjzVar) {
        this.b = afjzVar;
    }

    @Override // defpackage.adzw
    public final boolean a(String str, String str2, long j) {
        aelc b = b(str);
        if (b == null) {
            return false;
        }
        return b.l(str, str2, j);
    }

    public final aelc b(String str) {
        aelc aelcVar = (aelc) this.a.get(str);
        if (aelcVar == null || !aelcVar.j()) {
            return null;
        }
        return aelcVar;
    }
}
