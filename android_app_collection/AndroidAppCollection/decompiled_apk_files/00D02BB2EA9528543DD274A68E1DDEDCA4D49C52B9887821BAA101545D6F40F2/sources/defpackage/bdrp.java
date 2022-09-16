package defpackage;

import android.view.View;
import defpackage.bdrq;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bdrp  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdrp<T extends bdrq> extends cqiw<T> {
    public static final /* synthetic */ int j = 0;
    private final bdro a;
    public final long h;
    public final int i;

    public bdrp(bdro bdroVar, long j2, int i, Object... objArr) {
        super(dcft.e(dcbg.d(Arrays.asList(bdroVar, Long.valueOf(j2), Integer.valueOf(i)), Arrays.asList(objArr)), Object.class));
        this.a = bdroVar;
        this.h = j2;
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        cqgq a = itj.a();
        bdro bdroVar = this.a;
        bdro bdroVar2 = bdro.LEFT;
        a.g(Float.valueOf(-bdroVar.e));
        a.i(Float.valueOf(-this.a.f));
        a.d = 0;
        a.e = 0L;
        a.i = new cqgp(this) { // from class: bdrj
            private final bdrp a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgp
            public final void a(final View view, final cqkp cqkpVar) {
                bdrp bdrpVar = this.a;
                view.animate().setInterpolator(irf.a).setDuration(bdrpVar.i).setStartDelay(bdrpVar.h).withStartAction(new Runnable(view) { // from class: bdrm
                    private final View a;

                    {
                        this.a = view;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = this.a;
                        int i = bdrp.j;
                        view2.setVisibility(0);
                    }
                }).withEndAction(new Runnable(cqkpVar) { // from class: bdrn
                    private final cqkp a;

                    {
                        this.a = cqkpVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkp cqkpVar2 = this.a;
                        int i = bdrp.j;
                        ((bdrq) cqkpVar2).j();
                    }
                }).translationX(0.0f).translationY(0.0f).start();
            }
        };
        cqnf b = a.b();
        cqgq a2 = itj.a();
        a2.j();
        Float valueOf = Float.valueOf(0.0f);
        a2.g(valueOf);
        a2.i(valueOf);
        a2.d = 0;
        a2.e = 0L;
        cqnf b2 = a2.b();
        cqgq a3 = itj.a();
        a3.d = 0;
        a3.e = 0L;
        a3.e();
        return cqgr.fY(cqgr.aI(bdri.a), cqmn.a(cqgr.fI(4), cqjv.l(bdrk.a, cqjv.l(bdrl.a, b, b2), a3.b())), e());
    }

    protected abstract cqmj<T> e();
}
