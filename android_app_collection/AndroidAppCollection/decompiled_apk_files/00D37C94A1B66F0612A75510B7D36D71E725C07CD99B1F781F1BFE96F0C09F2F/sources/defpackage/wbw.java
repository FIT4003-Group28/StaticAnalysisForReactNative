package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
/* compiled from: PG */
/* renamed from: wbw  reason: default package */
/* loaded from: classes4.dex */
public final class wbw extends wbc {
    private final eo f;
    private wca g;

    public wbw(aafo aafoVar, Handler handler, wdc wdcVar, dt dtVar) {
        super(aafoVar, handler, wdcVar);
        this.f = dtVar.getSupportFragmentManager();
    }

    @Override // defpackage.wbc
    public final void b() {
        this.g.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void c(int i) {
        super.c(i);
        this.g.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void d(int i) {
        super.d(i);
        this.g.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer) {
        wca wcaVar = this.g;
        wcaVar.s();
        wcaVar.aE(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void f(wcx wcxVar) {
        wca wcaVar = this.g;
        wcaVar.s();
        wcaVar.aE(wcxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        wca wcaVar = this.g;
        wcaVar.s();
        wcaVar.aE(passwordAuthRendererOuterClass$PasswordAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) {
        wca wcaVar = this.g;
        wcaVar.s();
        wcaVar.aE(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void i(aqyo aqyoVar) {
        wca wcaVar = this.g;
        wcaVar.s();
        wcaVar.aE(aqyoVar);
    }

    @Override // defpackage.wbc
    public final void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        wca wcaVar = (wca) this.f.f("INLINE_AUTH_FRAGMENT_TAG");
        this.g = wcaVar;
        if (wcaVar == null) {
            wca wcaVar2 = new wca();
            wcaVar2.af = this;
            this.g = wcaVar2;
            ex l = this.f.l();
            l.r(this.g, "INLINE_AUTH_FRAGMENT_TAG");
            l.a();
        } else if (!wcaVar.at()) {
            this.g.af = this;
            ex l2 = this.f.l();
            l2.n(this.g);
            l2.a();
        }
        super.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
