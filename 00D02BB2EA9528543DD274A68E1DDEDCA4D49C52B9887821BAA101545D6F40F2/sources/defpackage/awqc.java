package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awqc  reason: default package */
/* loaded from: classes3.dex */
public final class awqc implements awuf {
    public final /* synthetic */ awqe a;

    public awqc(awqe awqeVar) {
        this.a = awqeVar;
    }

    @Override // defpackage.awuf
    public final void a() {
        awqe awqeVar = this.a;
        if (!awqeVar.aD) {
            return;
        }
        awqeVar.q();
        float max = Math.max(16.0f, this.a.ad.n().k);
        akox akoxVar = this.a.ad;
        alaa a = alad.a();
        a.c(this.a.ar.c());
        a.c = max;
        alao.d(akoxVar, a.a());
        ff J = this.a.J();
        this.a.aZ(ancv.w(anee.A(J.getString(R.string.CHANGE_PARKING_LOCATION_PICKER_TITLE), J.getString(R.string.CHANGE_PARKING_LOCATION_PICKER_SUBTITLE), null, null, dtyb.N, dtyb.L, dtyb.O)));
    }

    @Override // defpackage.awuf
    public final void b(String str) {
        awtm i = this.a.ar.i();
        i.f(str);
        i.b(this.a.ai.b());
        awtn k = i.k();
        this.a.g(k);
        this.a.ag.a().i(k);
    }
}
