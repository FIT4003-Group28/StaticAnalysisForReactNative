package defpackage;

import android.os.RemoteException;
import com.google.android.apps.gmm.place.timeline.service.postvisitbadge.PostVisitBadgeService;
/* compiled from: PG */
/* renamed from: bmtb  reason: default package */
/* loaded from: classes3.dex */
public final class bmtb extends aclc {
    final /* synthetic */ PostVisitBadgeService a;

    public bmtb(PostVisitBadgeService postVisitBadgeService) {
        this.a = postVisitBadgeService;
    }

    @Override // defpackage.acld
    public final void b(String str, long j, final aclb aclbVar) {
        try {
            bvrj.UI_THREAD.d();
            this.a.a.a(new eapd(j), str).Pk(new Runnable(aclbVar) { // from class: bmta
                private final aclb a;

                {
                    this.a = aclbVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aclb aclbVar2 = this.a;
                    try {
                        bvrj.UI_THREAD.d();
                        aclbVar2.e();
                    } catch (RemoteException unused) {
                    }
                }
            }, this.a.c);
        } catch (RuntimeException e) {
            bvoo.g(e);
            throw e;
        }
    }
}
