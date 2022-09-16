package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import java.util.List;
/* compiled from: PG */
/* renamed from: wgv  reason: default package */
/* loaded from: classes4.dex */
public final class wgv implements wgk {
    public final wgj a;
    public final Activity b;
    public final whp c;
    public final wgm d;
    public boolean e;
    public cfa f;
    private final wge g;
    private final vzk h;
    private final wgi i;
    private final apzg j;
    private final afvn k;
    private final aafo l;

    public wgv(vza vzaVar, Activity activity, whp whpVar, aasc aascVar, vzk vzkVar, wge wgeVar, afvn afvnVar, wgi wgiVar, vyw vywVar, apzg apzgVar, aafo aafoVar, boolean z) {
        this(vzaVar, activity, whpVar, aascVar, vzkVar, afvnVar, wgeVar, wgiVar, apzgVar, aafoVar, z);
        List<View> a = vywVar.a();
        if (!a.isEmpty() || vywVar.b()) {
            vzaVar.h(true);
        }
        for (View view : a) {
            vzaVar.b.addView(view);
        }
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            this.i.aG(new wgh(wgg.CANCELLED, false));
        }
    }

    public final void c() {
        this.a.m();
        AccountIdentity accountIdentity = this.k.t() ? (AccountIdentity) this.k.c() : null;
        wgt wgtVar = new wgt(this);
        this.f = wgtVar;
        this.h.b(accountIdentity, wgtVar);
    }

    public final void d() {
        if (!this.e) {
            this.e = true;
            this.i.aG(new wgh(wgg.STARTED, false));
        }
        c();
    }

    @Override // defpackage.wff
    public final void i(aarx aarxVar) {
        throw null;
    }

    @Override // defpackage.wfg
    public final void j() {
        throw null;
    }

    @Override // defpackage.wfh
    public final void k() {
        throw null;
    }

    public wgv(wgj wgjVar, Activity activity, whp whpVar, aasc aascVar, vzk vzkVar, afvn afvnVar, wge wgeVar, wgi wgiVar, apzg apzgVar, aafo aafoVar, boolean z) {
        this.a = wgjVar;
        this.b = activity;
        this.c = whpVar;
        this.h = vzkVar;
        this.k = afvnVar;
        this.g = wgeVar;
        this.d = new wgm(wgeVar, aascVar, afvnVar, apzgVar);
        this.i = wgiVar;
        this.j = apzgVar;
        this.l = aafoVar;
        this.e = z;
    }

    @Override // defpackage.wfe
    public final void a(aarw aarwVar) {
        auvx auvxVar = aarwVar.d;
        if (auvxVar != null) {
            if (this.j != null) {
                aopa createBuilder = auvx.a.createBuilder(auvxVar);
                apzg apzgVar = this.j;
                createBuilder.copyOnWrite();
                auvx auvxVar2 = (auvx) createBuilder.instance;
                apzgVar.getClass();
                auvxVar2.c = apzgVar;
                auvxVar2.b |= 2;
                auvxVar = (auvx) createBuilder.mo39build();
            }
            aafo aafoVar = this.l;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(SignInEndpointOuterClass.signInEndpoint, auvxVar);
            aafoVar.c((apzg) aopcVar.mo39build(), null);
            return;
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = aarwVar.e;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null) {
            aowy aowyVar = aarwVar.a;
            if (aowyVar != null) {
                apzg apzgVar2 = aowyVar.j;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                if (apzgVar2.qn(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                    aafo aafoVar2 = this.l;
                    apzg apzgVar3 = aarwVar.a.j;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    aafoVar2.a(apzgVar3);
                    return;
                }
            }
            this.g.i(aarwVar, this.j, new wgu(this));
            return;
        }
        aafo aafoVar3 = this.l;
        aopc aopcVar2 = (aopc) apzg.a.createBuilder();
        aopcVar2.e(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand);
        aafoVar3.c((apzg) aopcVar2.mo39build(), null);
    }
}
