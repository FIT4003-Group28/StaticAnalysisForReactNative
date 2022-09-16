package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezd  reason: default package */
/* loaded from: classes.dex */
public final class aezd extends aezc {
    final /* synthetic */ aeze a;

    public aezd(aeze aezeVar) {
        this.a = aezeVar;
    }

    @Override // defpackage.aezc, defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
        synchronized (this.a) {
            try {
                this.a.m(j);
                super.e(j, i, i2, i3, baaVar);
            } catch (aeug | aeyr | aeyt e) {
                this.a.n(e);
            }
        }
    }
}
