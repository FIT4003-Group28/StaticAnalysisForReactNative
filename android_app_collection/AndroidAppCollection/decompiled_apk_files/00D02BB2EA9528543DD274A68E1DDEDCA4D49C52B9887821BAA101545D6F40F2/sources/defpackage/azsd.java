package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azsd  reason: default package */
/* loaded from: classes3.dex */
public final class azsd extends ancv {
    public azsg a;
    public dxio<bwqv> aC;
    public dxio<axwy> aO;
    public dxio<axws> aP;
    public isr aQ;
    public bath aR;
    public Executor aS;
    @dzsi
    public andd aT;
    private boolean aU;
    private boolean aV;
    public azsc au;
    public dndr av;
    @dzsi
    String aw;
    @dzsi
    axuc ax;
    public boolean ay;
    @dzsi
    public akqq az;
    public boolean aA = true;
    @dzsi
    public String aB = null;
    @dzsi
    private Object aW = null;

    public static azsd g(azsg azsgVar, anee aneeVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("parameters", azsgVar);
        bundle.putSerializable("args", aneeVar);
        azsd azsdVar = new azsd();
        azsdVar.B(bundle);
        return azsdVar;
    }

    public static azsd i(dndr dndrVar, anee aneeVar, @dzsi ddho ddhoVar, @dzsi String str, @dzsi axuc axucVar, boolean z, boolean z2, bwqv bwqvVar) {
        return g(azsg.g(dndrVar, ddhoVar, str, axucVar, z, z2, bwqvVar), aneeVar);
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((azse) btsx.b(azse.class, this)).cy(this);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof axwc) {
            this.aU = true;
            this.aW = obj;
        }
    }

    @Override // defpackage.ancv
    protected final void aS(akpm akpmVar) {
        akqq akqqVar = this.az;
        if (akqqVar != null) {
            akyc i = akyt.i(akqqVar, 16.0f);
            i.b = aR();
            akpmVar.p(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ancv
    public final void aT() {
        super.aT();
        andd anddVar = this.aT;
        if (anddVar != null) {
            anddVar.b();
        }
    }

    @Override // defpackage.ancv
    public final /* bridge */ /* synthetic */ anct aX() {
        return this.au;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.aA = true;
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public final void am() {
        akpm akpmVar;
        if (this.aT != null && (akpmVar = this.ai) != null) {
            akpmVar.aj().ax(this.aT.b);
            this.aT.c();
        }
        super.am();
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Serializable serializable = this.o.getSerializable("parameters");
        dbsk.s(serializable);
        this.a = (azsg) serializable;
        anee aJ = aJ();
        this.az = aJ.g();
        this.av = this.a.a();
        this.aw = this.a.c();
        azsg azsgVar = this.a;
        bwqv a = this.aC.a();
        axuc axucVar = azsgVar.a;
        if (axucVar == null) {
            byte[] d = azsgVar.d();
            if (d == null) {
                axucVar = null;
            } else {
                int length = d.length;
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(d, 0, length);
                obtain.setDataPosition(0);
                try {
                    azsgVar.a = (axuc) a.d(axuc.class, (Bundle) Bundle.CREATOR.createFromParcel(obtain), "serializableAliasFlowData");
                    axucVar = azsgVar.a;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.ax = axucVar;
        this.aV = this.a.e();
        this.ay = this.a.f();
        azsc azscVar = new azsc(this, aJ);
        this.au = azscVar;
        this.g = azscVar;
        this.aU = false;
        if (bundle != null) {
            this.aB = bundle.getString("lastGoodGeocoderString");
        }
    }

    public final void q(akqq akqqVar, cjqm cjqmVar, @dzsi String str) {
        if (this.av == dndr.UNKNOWN_ALIAS_TYPE) {
            return;
        }
        ily ilyVar = new ily();
        ilyVar.z = this.av;
        ilyVar.q(akqqVar);
        ilo d = ilyVar.d();
        azsa azsaVar = new azsa(this);
        axuc axucVar = this.ax;
        axvp a = axucVar == null ? null : axvb.a(axucVar.a(J()));
        if (this.av == dndr.NICKNAME) {
            this.aO.a().l(bwrs.a(d.g().d()), this.ax);
            return;
        }
        this.aO.a().ac(this.av, azsaVar, a, this.aV, null, null, this.a.b(), this.aw, d, str);
        Nw(aneh.c(akqqVar, cjqmVar));
        Nz(null);
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.aU || !this.aV) {
            if (!this.aR.a(this.av).f || this.ai == null) {
                return;
            }
            this.aT = new andd(this.aQ, this.aS, new andc(this) { // from class: azrx
                private final azsd a;

                {
                    this.a = this;
                }

                @Override // defpackage.andc
                public final Object a() {
                    return this.a.au.d();
                }
            }, new anda(this) { // from class: azry
                private final azsd a;

                {
                    this.a = this;
                }

                @Override // defpackage.anda
                public final Object a() {
                    return Boolean.valueOf(this.a.ai.U());
                }
            }, new Runnable(this) { // from class: azrz
                private final azsd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a.g);
                }
            });
            this.ai.aj().aw(this.aT.b);
            this.aT.b();
            return;
        }
        Object obj = this.aW;
        if (obj != null) {
            Nw(obj);
        }
        aU();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        String str = this.aB;
        if (str != null) {
            bundle.putString("lastGoodGeocoderString", str);
        }
    }
}
