package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avpz  reason: default package */
/* loaded from: classes3.dex */
public final class avpz implements avjm {
    private final Set<avpy> a = new HashSet();
    private final crzd<avei> b = new crzd<>();
    private final crzd<avzv> c = new crzd<>();
    private final crzo<avkq> d = new crzo<>(avkq.a);

    private final void e() {
        this.d.b(avkq.b(dcbg.b(this.a).s(avpu.a).B()));
    }

    @Override // defpackage.avjm
    public final synchronized void a(avzv avzvVar, Executor executor) {
        this.c.a(avzvVar, executor);
    }

    public final synchronized crzm<avkq> b() {
        return this.d.a;
    }

    public final synchronized void c(avpy avpyVar, dbsz<avei> dbszVar) {
        if (this.a.remove(avpyVar)) {
            e();
            this.b.d(dbszVar);
        }
    }

    public final synchronized avpy d(dltz dltzVar) {
        avpy avpyVar;
        avpyVar = new avpy(this, dltzVar);
        this.a.add(avpyVar);
        e();
        this.c.d(new dbsz() { // from class: avpv
            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ((avzv) obj).a.c();
            }
        });
        return avpyVar;
    }
}
