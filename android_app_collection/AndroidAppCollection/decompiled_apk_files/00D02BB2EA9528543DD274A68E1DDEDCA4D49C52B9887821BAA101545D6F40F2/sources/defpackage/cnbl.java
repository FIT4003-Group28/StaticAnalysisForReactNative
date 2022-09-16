package defpackage;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cnbl  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cnbl implements dbsz {
    static final dbsz a = new cnbl();

    private cnbl() {
    }

    @Override // defpackage.dbsz
    public final void NU(Object obj) {
        cnif cnifVar = (cnif) obj;
        int i = cnjc.a;
        try {
            cnifVar.d.f(cnifVar.a);
        } catch (RemoteException | IllegalStateException unused) {
        }
        cnifVar.c = null;
    }
}
