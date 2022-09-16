package defpackage;

import android.os.CountDownTimer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acob  reason: default package */
/* loaded from: classes.dex */
public final class acob {
    public final acps a;
    public final acpk b;
    public CountDownTimer c;
    public boolean d;
    public final acqj e;

    public acob(acqj acqjVar, acps acpsVar, acpk acpkVar) {
        this.e = acqjVar;
        acpsVar.getClass();
        this.a = acpsVar;
        acpkVar.getClass();
        this.b = acpkVar;
        this.c = new acoa(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        abxa.b().n(14, 1, null);
        b();
        this.e.a();
    }

    public final void b() {
        CountDownTimer countDownTimer = this.c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
