package defpackage;

import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fy  reason: default package */
/* loaded from: classes.dex */
public final class fy {
    final /* synthetic */ gn a;

    public fy(gn gnVar) {
        this.a = gnVar;
    }

    public final void a(fd fdVar, akq akqVar) {
        gn gnVar = this.a;
        if (gnVar.g.get(fdVar) == null) {
            gnVar.g.put(fdVar, new HashSet<>());
        }
        gnVar.g.get(fdVar).add(akqVar);
    }

    public final void b(fd fdVar, akq akqVar) {
        if (!akqVar.a()) {
            gn gnVar = this.a;
            HashSet<akq> hashSet = gnVar.g.get(fdVar);
            if (hashSet == null || !hashSet.remove(akqVar) || !hashSet.isEmpty()) {
                return;
            }
            gnVar.g.remove(fdVar);
            if (fdVar.i >= 5) {
                return;
            }
            gnVar.w(fdVar);
            gnVar.x(fdVar);
        }
    }
}
