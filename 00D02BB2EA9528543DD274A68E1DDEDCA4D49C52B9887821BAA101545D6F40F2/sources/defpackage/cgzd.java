package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cgzd  reason: default package */
/* loaded from: classes4.dex */
public class cgzd {
    public final Set<dspd> a;
    public final Set<dspd> b;

    public cgzd() {
        this.a = new HashSet();
        this.b = new HashSet();
    }

    public final boolean a(dspd dspdVar) {
        return this.a.contains(dspdVar);
    }

    public final boolean b(dspd dspdVar) {
        return this.b.contains(dspdVar);
    }

    public final void c(dspd dspdVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.a.add(dspdVar);
            } else {
                this.a.remove(dspdVar);
            }
        } else if (z2) {
            this.b.add(dspdVar);
        } else {
            this.b.remove(dspdVar);
        }
    }

    public cgzd(Collection<dspd> collection, Collection<dspd> collection2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        hashSet.addAll(collection);
        hashSet2.addAll(collection2);
    }
}
