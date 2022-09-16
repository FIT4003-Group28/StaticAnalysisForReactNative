package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wdi  reason: default package */
/* loaded from: classes4.dex */
public final class wdi implements wdg {
    final adv a;

    public wdi(dp dpVar, Executor executor, wdf wdfVar) {
        this.a = new adv(dpVar, executor, new wdh(wdfVar), null);
    }

    @Override // defpackage.wdg
    public final void a(adu aduVar) {
        adv advVar = this.a;
        eo eoVar = advVar.a;
        if (eoVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (eoVar.Z()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            eo eoVar2 = advVar.a;
            adm admVar = (adm) eoVar2.f("androidx.biometric.BiometricFragment");
            if (admVar == null) {
                admVar = new adm();
                ex l = eoVar2.l();
                l.r(admVar, "androidx.biometric.BiometricFragment");
                l.k();
                eoVar2.ab();
            }
            Context a = adv.a(admVar);
            if (a == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client context was null.");
                return;
            }
            admVar.b.d = aduVar;
            int b = acy.b(aduVar, null);
            if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT < 30 && b == 15) {
                admVar.b.e = acz.d();
            } else {
                admVar.b.e = null;
            }
            if (admVar.r()) {
                admVar.b.g = admVar.N(R.string.confirm_device_credential_password);
            } else {
                admVar.b.g = null;
            }
            if (!admVar.r() || adq.a(a).b() == 0) {
                if (admVar.b.l) {
                    admVar.a.postDelayed(new adl(admVar, 1), 600L);
                    return;
                } else {
                    admVar.q();
                    return;
                }
            }
            admVar.b.j = true;
            admVar.n();
        }
    }
}
