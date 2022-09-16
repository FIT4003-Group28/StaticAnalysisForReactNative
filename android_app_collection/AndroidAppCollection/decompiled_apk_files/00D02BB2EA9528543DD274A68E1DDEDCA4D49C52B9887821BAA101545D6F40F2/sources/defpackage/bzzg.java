package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzzg  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzzg implements cafn {
    protected final dwul a;
    protected final dwts b;
    protected final bzzf c;
    private final Activity d;
    private final btvo e;

    public bzzg(Activity activity, btvo btvoVar, dwul dwulVar, bzzf bzzfVar) {
        this.d = activity;
        this.e = btvoVar;
        this.a = dwulVar;
        dwts dwtsVar = dwulVar.l;
        this.b = dwtsVar == null ? dwts.g : dwtsVar;
        this.c = bzzfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static jax t(dvyw dvywVar) {
        return new bzze(dvywVar);
    }

    @Override // defpackage.cafn
    public cqkl m() {
        this.c.a(null);
        return cqkl.a;
    }

    @Override // defpackage.cafn
    public String n() {
        return this.b.d;
    }

    @Override // defpackage.cafn
    @dzsi
    public jic o() {
        dwts dwtsVar = this.b;
        if ((dwtsVar.a & 32) != 0) {
            return new jic(dwtsVar.f, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
        }
        return null;
    }

    @Override // defpackage.cafn
    @dzsi
    public jic p() {
        dwts dwtsVar = this.b;
        if ((dwtsVar.a & 16) != 0) {
            return new jic(dwtsVar.e, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
        }
        return null;
    }

    @Override // defpackage.cafn
    public jic q() {
        dori doriVar = this.a.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        dnwl dnwlVar = doriVar.e;
        if (dnwlVar == null) {
            dnwlVar = dnwl.f;
        }
        dnwr dnwrVar = dnwlVar.e;
        if (dnwrVar == null) {
            dnwrVar = dnwr.c;
        }
        return new jic(dnwrVar.b, ckqc.FIFE_MERGE, (cqtd) null, 0);
    }

    @Override // defpackage.cafn
    public Boolean r() {
        return Boolean.valueOf(this.e.getUgcParameters().an());
    }

    @Override // defpackage.cafn
    public String s() {
        return this.d.getString(true != r().booleanValue() ? R.string.DISMISS : R.string.IMPACT_INTERSTITIAL_CONTRIBUTE_MORE);
    }
}
