package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.FirstTimeUnicornSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: wbc  reason: default package */
/* loaded from: classes4.dex */
public abstract class wbc {
    private static final boolean[][] f = {new boolean[]{false, false, false, true, false, false, true, true, true, true}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, true, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, true, true, true, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, true, true, true, true, true, false, true, false, false}, new boolean[]{false, true, true, true, true, true, true, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}};
    aqyo d;
    PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer e;
    private final aafo g;
    private final Handler h;
    private final wcy i;
    private boolean l = false;
    private final Set j = Collections.newSetFromMap(new WeakHashMap());
    private InlineAuthCommandOuterClass$InlineAuthCommand k = null;
    int a = 0;
    FingerprintAuthRendererOuterClass$FingerprintAuthRenderer b = null;
    PasswordAuthRendererOuterClass$PasswordAuthRenderer c = null;

    public wbc(aafo aafoVar, Handler handler, wcy wcyVar) {
        this.g = aafoVar;
        this.h = handler;
        this.i = wcyVar;
    }

    public final void a(wbi wbiVar) {
        this.j.add(wbiVar);
    }

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i) {
        for (wbi wbiVar : this.j) {
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.b & 2) == 0) {
            return;
        }
        aafo aafoVar = this.g;
        apzg apzgVar = inlineAuthCommandOuterClass$InlineAuthCommand.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        if (this.l) {
            aafo aafoVar = this.g;
            apzg apzgVar = this.k.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
        for (wbi wbiVar : this.j) {
            if (wbiVar != null) {
                wbiVar.b();
            }
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.b & 1) == 0) {
            return;
        }
        aafo aafoVar2 = this.g;
        apzg apzgVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.c(apzgVar2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f(wcx wcxVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void i(aqyo aqyoVar);

    public final void j(int i) {
        int i2 = this.a;
        this.a = i;
        if (!f[i2][i]) {
            j(3);
            return;
        }
        switch (i) {
            case 1:
                if (i2 == 8) {
                    d(2);
                    return;
                } else if (i2 == 9) {
                    d(3);
                    return;
                } else if (i2 == 6) {
                    d(1);
                    return;
                } else {
                    d(0);
                    return;
                }
            case 2:
                if (i2 == 8) {
                    c(2);
                    return;
                } else if (i2 == 9) {
                    c(3);
                    return;
                } else if (i2 == 6) {
                    c(1);
                    return;
                } else {
                    c(0);
                    return;
                }
            case 3:
                for (wbi wbiVar : this.j) {
                }
                j(2);
                return;
            case 4:
                this.h.post(new wbb(this, 1));
                return;
            case 5:
                for (wbi wbiVar2 : this.j) {
                    if (wbiVar2 != null) {
                        wbiVar2.a();
                    }
                }
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
                if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 8) == 0) {
                    return;
                }
                aafo aafoVar = this.g;
                apzg apzgVar = inlineAuthCommandOuterClass$InlineAuthCommand.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                return;
            case 6:
                this.h.post(new wbb(this));
                return;
            case 7:
                this.h.post(new wbb(this, 2));
                return;
            case 8:
                this.h.post(new wbb(this, 3));
                return;
            default:
                this.h.post(new wbb(this, 4));
                return;
        }
    }

    public void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        if (this.a != 0) {
            j(3);
            return;
        }
        this.k = inlineAuthCommandOuterClass$InlineAuthCommand;
        boolean z = true;
        boolean z2 = inlineAuthCommandOuterClass$InlineAuthCommand.h.size() != 0 && ((aunb) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0)).qn(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer);
        if (inlineAuthCommandOuterClass$InlineAuthCommand.h.size() == 0 || !((aunb) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0)).qn(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer)) {
            z = false;
        }
        aunb aunbVar = inlineAuthCommandOuterClass$InlineAuthCommand.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer) || z2 || z) {
            aunb aunbVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.g;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (aunbVar2.qn(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer)) {
                aunb aunbVar3 = inlineAuthCommandOuterClass$InlineAuthCommand.g;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                this.c = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aunbVar3.qm(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
            }
            if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 4) != 0) {
                aafo aafoVar = this.g;
                apzg apzgVar = inlineAuthCommandOuterClass$InlineAuthCommand.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
            if (inlineAuthCommandOuterClass$InlineAuthCommand.h.size() != 0) {
                aunb aunbVar4 = (aunb) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0);
                if (aunbVar4.qn(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer)) {
                    this.b = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) aunbVar4.qm(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer);
                } else if (aunbVar4.qn(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer)) {
                    this.c = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aunbVar4.qm(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
                } else if (aunbVar4.qn(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer)) {
                    this.d = (aqyo) aunbVar4.qm(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer);
                } else if (aunbVar4.qn(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer)) {
                    this.e = (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) aunbVar4.qm(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer);
                }
                if (l()) {
                    j(6);
                    return;
                } else if (this.d != null) {
                    j(8);
                    return;
                } else if (this.e != null) {
                    j(9);
                    return;
                } else {
                    j(7);
                    return;
                }
            }
            j(7);
            return;
        }
        if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 8) != 0) {
            aafo aafoVar2 = this.g;
            apzg apzgVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, null);
        }
        j(3);
    }

    public final boolean l() {
        return this.b != null && this.i.a();
    }

    public final void m() {
        this.l = true;
    }
}
