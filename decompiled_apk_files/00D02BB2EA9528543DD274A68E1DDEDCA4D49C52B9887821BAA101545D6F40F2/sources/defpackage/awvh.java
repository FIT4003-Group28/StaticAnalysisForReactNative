package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awvh  reason: default package */
/* loaded from: classes.dex */
public final class awvh implements dbsz<awwb> {
    final awvx a;
    final /* synthetic */ awvi b;
    private final List<awwn> c;

    public awvh(awvi awviVar, List<awwn> list, awvx awvxVar) {
        this.b = awviVar;
        this.c = list;
        this.a = awvxVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(awwb awwbVar) {
        awwb awwbVar2 = awwbVar;
        for (awwn awwnVar : this.c) {
            awwnVar.b(awwbVar2, this.b.c.a());
        }
        this.b.c.c(false);
        this.b.c.b(false);
        if (!awwh.a(awwbVar2, dcep.M(awvv.a()))) {
            synchronized (this.b) {
                awvi awviVar = this.b;
                awviVar.d = null;
                awvh awvhVar = awviVar.e;
                if (awvhVar != null) {
                    awviVar.n(awvhVar);
                    this.b.e = null;
                }
            }
            this.b.b.a().a();
        }
    }
}
