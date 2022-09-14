package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* renamed from: cwev  reason: default package */
/* loaded from: classes5.dex */
public final class cwev<AccountT> {
    public final cvvh<Drawable> a;
    public final AccountParticleDisc<AccountT> b;
    public final cwla c;
    public final cweg<AccountT> d;
    public final cwii e;
    public final cvzg<AccountT> f;
    public final cwiv<AccountT> g;
    public final int h;

    public cwev(cvzg<AccountT> cvzgVar, cwiv<AccountT> cwivVar, cwla cwlaVar, cweg<AccountT> cwegVar, AccountParticleDisc<AccountT> accountParticleDisc, int i, cwii cwiiVar) {
        this.g = cwivVar.a(dtgh.OBAKE_ENTRY_POINT_COMPONENT);
        this.f = cvzgVar;
        this.c = cwlaVar;
        this.d = cwegVar;
        this.a = new cvus(Drawable.class, cwiz.a(accountParticleDisc.getContext(), cwegVar.a(), new cwgf(accountParticleDisc.getContext()).a), cvvo.a);
        this.b = accountParticleDisc;
        this.e = cwiiVar;
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        cwes cwesVar = new cwes(this, new cweu(this));
        if (od.ak(this.b)) {
            cwesVar.onViewAttachedToWindow(this.b);
        }
        this.b.addOnAttachStateChangeListener(cwesVar);
    }
}
