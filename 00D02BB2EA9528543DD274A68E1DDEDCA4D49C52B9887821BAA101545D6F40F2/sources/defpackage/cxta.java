package defpackage;

import android.animation.AnimatorSet;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxta  reason: default package */
/* loaded from: classes5.dex */
public final class cxta implements cxsd {
    final /* synthetic */ cxti a;

    public cxta(cxti cxtiVar) {
        this.a = cxtiVar;
    }

    @Override // defpackage.cxsd
    public final void a() {
        List<CoalescedChannels> list = this.a.l;
        if (list != null && list.isEmpty()) {
            cxti cxtiVar = this.a;
            cxtiVar.b.removeView(cxtiVar.w);
            this.a.w = null;
            this.a.q.setVisibility(0);
        }
        AnimatorSet animatorSet = this.a.v;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.v.cancel();
        }
        cxti cxtiVar2 = this.a;
        cxtiVar2.v = cxqw.a(cxtiVar2.u);
        this.a.d();
    }

    @Override // defpackage.cxsd
    public final void b() {
        List<CoalescedChannels> list = this.a.l;
        if (list == null || !list.isEmpty() || this.a.f.e()) {
            return;
        }
        cxti cxtiVar = this.a;
        cxtiVar.b.removeView(cxtiVar.w);
        this.a.w = null;
        this.a.e();
    }
}
