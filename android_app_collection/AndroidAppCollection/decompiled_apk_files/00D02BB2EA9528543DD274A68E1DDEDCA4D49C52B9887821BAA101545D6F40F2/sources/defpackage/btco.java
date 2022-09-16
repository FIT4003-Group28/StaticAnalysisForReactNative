package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: btco  reason: default package */
/* loaded from: classes4.dex */
public final class btco implements Runnable {
    public final btvo a;
    public final z<List<Locale>> b = new z<>();
    private final ckmc c;
    private final dehp d;
    private final bvjj e;

    public btco(ckmc ckmcVar, btvo btvoVar, bvjj bvjjVar, dehp dehpVar) {
        this.c = ckmcVar;
        this.d = dehpVar;
        this.a = btvoVar;
        this.e = bvjjVar;
    }

    public static boolean a(Locale locale) {
        return locale.getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.m(bvjk.T, false) || !a(Locale.getDefault())) {
            this.b.g(dcdc.e());
            return;
        }
        dkmu dkmuVar = this.a.getLanguageSettingParameters().h;
        if (dkmuVar == null) {
            dkmuVar = dkmu.e;
        }
        if (!dkmuVar.a) {
            this.b.g(dcdc.e());
            return;
        }
        btcn btcnVar = new btcn(this);
        dehp dehpVar = this.d;
        final ckmc ckmcVar = this.c;
        ckmcVar.getClass();
        deha.q(dehpVar.c(new Callable(ckmcVar) { // from class: btcm
            private final ckmc a;

            {
                this.a = ckmcVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d();
            }
        }), btcnVar, this.d);
    }
}
