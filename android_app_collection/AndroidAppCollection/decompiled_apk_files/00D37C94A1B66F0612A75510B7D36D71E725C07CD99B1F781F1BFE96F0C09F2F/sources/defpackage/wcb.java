package defpackage;

import android.app.Activity;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
/* compiled from: PG */
/* renamed from: wcb  reason: default package */
/* loaded from: classes4.dex */
public final class wcb extends wbc {
    private wby f;
    private final eo g;

    public wcb(aafo aafoVar, Handler handler, wdc wdcVar, Activity activity) {
        super(aafoVar, handler, wdcVar);
        this.g = ((dt) activity).getSupportFragmentManager();
    }

    @Override // defpackage.wbc
    public final void b() {
        this.f.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void c(int i) {
        super.c(i);
        this.f.aG();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void d(int i) {
        super.d(i);
        this.f.aG();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer) {
        wby wbyVar = this.f;
        wbyVar.aH();
        wbyVar.aI(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void f(wcx wcxVar) {
        wby wbyVar = this.f;
        wbyVar.aH();
        wbyVar.aI(wcxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        wby wbyVar = this.f;
        wbyVar.aH();
        wbyVar.aI(passwordAuthRendererOuterClass$PasswordAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) {
        wby wbyVar = this.f;
        wbyVar.aH();
        wbyVar.aI(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wbc
    public final void i(aqyo aqyoVar) {
        wby wbyVar = this.f;
        wbyVar.aH();
        wbyVar.aI(aqyoVar);
    }

    @Override // defpackage.wbc
    public final void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        wby wbyVar = (wby) this.g.f("INLINE_AUTH_FRAGMENT_TAG");
        this.f = wbyVar;
        if (wbyVar == null) {
            wby wbyVar2 = new wby();
            wbyVar2.ae = this;
            this.f = wbyVar2;
            ex l = this.g.l();
            l.r(this.f, "INLINE_AUTH_FRAGMENT_TAG");
            l.a();
        } else if (!wbyVar.at()) {
            this.f.ae = this;
            ex l2 = this.g.l();
            l2.n(this.f);
            l2.a();
        }
        super.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
