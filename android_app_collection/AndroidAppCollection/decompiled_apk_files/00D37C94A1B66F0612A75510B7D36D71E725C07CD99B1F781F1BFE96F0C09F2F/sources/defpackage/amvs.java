package defpackage;
/* compiled from: PG */
/* renamed from: amvs  reason: default package */
/* loaded from: classes.dex */
final class amvs extends amuk {
    final /* synthetic */ amvt a;

    public amvs(amvt amvtVar) {
        this.a = amvtVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.amub
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
