package defpackage;

import android.os.RemoteException;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ShareCreationPrerequisitesState;
/* compiled from: PG */
/* renamed from: aiap  reason: default package */
/* loaded from: classes2.dex */
final class aiap implements degu<ShareCreationPrerequisitesState> {
    private final String a;
    private final ckcq b;
    private final ahyy c;

    public aiap(ahyy ahyyVar, String str, ckcq ckcqVar) {
        this.c = ahyyVar;
        this.a = str;
        this.b = ckcqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.degu
    /* renamed from: c */
    public final void b(ShareCreationPrerequisitesState shareCreationPrerequisitesState) {
        try {
            this.c.e(shareCreationPrerequisitesState);
        } catch (RemoteException e) {
            bvoo.i(new IllegalStateException(e));
        }
        this.b.b();
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.f(new IllegalStateException("Unknown exception: ", th));
        b(new ShareCreationPrerequisitesState(this.a, 4, dcdc.f(5)));
    }
}
