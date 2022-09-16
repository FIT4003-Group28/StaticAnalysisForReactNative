package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: adpm  reason: default package */
/* loaded from: classes.dex */
public final class adpm implements acza {
    private static final String a = zep.a("MDX.CastSdkClientAdapter");
    private final axnm b;
    private final axnm c;
    private final axnm d;
    private final aczl e;
    private final axnm f;
    private final adih g;

    public adpm(axnm axnmVar, axnm axnmVar2, axnm axnmVar3, adih adihVar, aczl aczlVar, axnm axnmVar4, byte[] bArr) {
        this.b = axnmVar;
        this.c = axnmVar2;
        this.d = axnmVar3;
        this.g = adihVar;
        this.e = aczlVar;
        this.f = axnmVar4;
    }

    private final ampq d() {
        adqy adqyVar = ((adrj) this.b.get()).d;
        return !(adqyVar instanceof adoz) ? amon.a : ampq.j(((adoz) adqyVar).f());
    }

    @Override // defpackage.acza
    public final ampq a(qku qkuVar) {
        final acvg acviVar;
        CastDevice b = qkuVar.b();
        if (b == null) {
            zep.m(a, "Cast device should not be null if the session is resumed, this is possibly a bug with SDK callback.");
            return amon.a;
        }
        adqy adqyVar = ((adrj) this.b.get()).d;
        if (adqyVar != null) {
            int i = adqyVar.o().i;
            if (i == 0) {
                throw null;
            }
            if (i != 2 || !((adhz) adqyVar.k()).e().c.equals(b.b())) {
                zep.h(a, "SDK resumed session does not match existing MDx session, ignoring reconnection attempt.");
                this.e.a(atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_MISMATCH);
                return amon.a;
            } else if (adqyVar.a() == 1) {
                zep.h(a, "SDK session resumed while MDx session is still active, skipping reconnection attempt.");
                this.e.a(atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_SKIPPED);
                return amon.a;
            } else if (adqyVar.a() == 0) {
                zep.h(a, "SDK session resumed as matching MDx session is still connecting, attempt to continue connection flow normally.");
                return d();
            }
        }
        final adrj adrjVar = (adrj) this.b.get();
        final adhz a2 = adhz.a(b);
        zep.h(adrj.a, String.format("connectAndPlay to screen %s", a2.b()));
        final acvg b2 = ((acvh) adrjVar.e.get()).b(asny.LATENCY_ACTION_MDX_LAUNCH);
        adrjVar.f = b2;
        if (adrjVar.i.z) {
            acviVar = ((acvh) adrjVar.e.get()).b(asny.LATENCY_ACTION_MDX_CAST);
        } else {
            acviVar = new acvi();
        }
        ylx.k(((adra) adrjVar.h.get()).a(), anjk.a, new ylv() { // from class: adrf
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                adrj.this.n(a2, acviVar, b2, amon.a);
            }
        }, new ylw() { // from class: adrg
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                adrj.this.n(a2, acviVar, b2, (ampq) obj);
            }
        });
        return d();
    }

    @Override // defpackage.acza
    public final ampq b(CastDevice castDevice) {
        if (castDevice == null) {
            return amon.a;
        }
        ((adrj) this.b.get()).p(adhz.a(castDevice), ((adkr) this.d.get()).c(this.g.a()));
        return d();
    }

    @Override // defpackage.acza
    public final void c(String str, ampq ampqVar) {
        adrj adrjVar = (adrj) this.b.get();
        adff a2 = adff.a().a();
        if (!TextUtils.isEmpty(str)) {
            a2 = ((adfg) this.c.get()).a(str);
        }
        if (((adex) this.f.get()).b()) {
            int intValue = ((Integer) ((ampv) ampqVar).a).intValue();
            if (intValue == 2154) {
                adfe a3 = adff.a();
                a3.b(true);
                a2 = a3.a();
            } else if (intValue == 2155) {
                adfe a4 = adff.a();
                a4.b(true);
                a4.c(aifh.SEAMLESS);
                a2 = a4.a();
            }
        }
        adrjVar.b(a2, ampqVar);
    }
}
