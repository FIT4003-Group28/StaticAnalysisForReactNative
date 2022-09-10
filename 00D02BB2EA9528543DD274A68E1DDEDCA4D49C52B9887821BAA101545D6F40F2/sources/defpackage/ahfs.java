package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahfs  reason: default package */
/* loaded from: classes2.dex */
public class ahfs implements agzu {
    public final gga a;
    public final dxio<bsvm> b;
    public final cjqy c;
    public final mw<ahfs> d;
    private final cjqq e;
    private final bbdv f;
    private final Executor g;
    private final int h;
    private final String i;
    private final String j;
    private final dqem k;
    private boolean l;

    public ahfs(gga ggaVar, cjqq cjqqVar, bbdv bbdvVar, dxio<bsvm> dxioVar, Executor executor, cjqy cjqyVar, int i, String str, String str2, mw<ahfs> mwVar, dqem dqemVar, boolean z) {
        this.a = ggaVar;
        this.e = cjqqVar;
        this.f = bbdvVar;
        this.b = dxioVar;
        this.g = executor;
        this.c = cjqyVar;
        this.h = i;
        this.i = str;
        this.j = str2;
        this.d = mwVar;
        this.k = dqemVar;
        this.l = z;
    }

    @Override // defpackage.agzu
    public Boolean a() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.agzu
    public String b() {
        return this.j;
    }

    @Override // defpackage.agzu
    public cqkl c() {
        deha.q(this.f.p(this.k), new ahfr(this, this.e.f(this.a.findViewById(R.id.for_you_page))), this.g);
        return cqkl.a;
    }

    @Override // defpackage.agzu
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxu.bI;
        b.i(this.h);
        return b.a();
    }

    @Override // defpackage.agzu
    public String e() {
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_PREFERENCE_CARD_PROVIDE_FEEDBACK_LINK, new Object[]{this.j, this.i});
    }

    public dspd f() {
        dqem dqemVar = this.k;
        if (dqemVar.b == 2) {
            return (dspd) dqemVar.c;
        }
        return dspd.b;
    }

    public void g(boolean z) {
        this.l = z;
    }
}
