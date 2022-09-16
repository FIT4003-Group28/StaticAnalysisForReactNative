package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agld  reason: default package */
/* loaded from: classes.dex */
final class agld implements agls {
    final /* synthetic */ aglg a;

    public agld(aglg aglgVar) {
        this.a = aglgVar;
    }

    @Override // defpackage.agls
    public final void a(agqf agqfVar) {
        agqa agqaVar = agqfVar.c;
        if (agqaVar != null) {
            this.a.a(agqaVar.a);
        }
        agpj.w(this.a.a.g(agqfVar.a));
    }

    @Override // defpackage.agls
    public final void b(Collection collection) {
        this.a.b(collection);
    }

    @Override // defpackage.agls
    public final void c(agqf agqfVar, Collection collection, HashSet hashSet, attl attlVar, int i, byte[] bArr, Set set, agqn agqnVar) {
    }
}
