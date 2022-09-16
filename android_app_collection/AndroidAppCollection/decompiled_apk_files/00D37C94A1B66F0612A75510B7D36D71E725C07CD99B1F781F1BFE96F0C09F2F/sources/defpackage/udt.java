package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udt  reason: default package */
/* loaded from: classes4.dex */
public final class udt {
    public final Set a;

    public udt() {
        this.a = new HashSet();
    }

    public udt(Set set) {
        this.a = set;
    }

    public final void a(ecv ecvVar) {
        this.a.add(ecvVar);
    }

    public final void b() {
        for (ecv ecvVar : this.a) {
            ecvVar.c();
        }
    }

    public final void c(ecw ecwVar) {
        for (ecv ecvVar : this.a) {
            ecvVar.b(ecwVar);
        }
    }
}
