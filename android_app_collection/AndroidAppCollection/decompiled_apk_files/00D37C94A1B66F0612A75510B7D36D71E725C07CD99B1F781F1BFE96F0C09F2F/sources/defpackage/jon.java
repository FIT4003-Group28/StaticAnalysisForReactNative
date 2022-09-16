package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: jon  reason: default package */
/* loaded from: classes3.dex */
final class jon implements Runnable {
    final /* synthetic */ joo a;

    public jon(joo jooVar) {
        this.a = jooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ylr.c();
        HashMap hashMap = new HashMap(this.a.d);
        this.a.d.clear();
        if (!hashMap.isEmpty()) {
            this.a.b.b(new ArrayList(hashMap.keySet()), new jom(hashMap));
        }
        this.a.e = null;
    }
}
