package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: akre  reason: default package */
/* loaded from: classes.dex */
public final class akre implements tct {
    public final akri a;
    private final Activity b;
    private final /* synthetic */ int c;

    public akre(Activity activity, akri akriVar) {
        this.b = activity;
        this.a = akriVar;
    }

    public akre(Activity activity, akri akriVar, int i) {
        this.c = i;
        this.b = activity;
        this.a = akriVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.c == 0) {
            return atud.b;
        }
        return apyu.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final tee teeVar = null;
        if (this.c == 0) {
            final atud atudVar = (atud) obj;
            if (!(this.a instanceof akrk)) {
                tda tdaVar = tcsVar.i;
                if (tdaVar != null) {
                    teeVar = tdaVar.b();
                }
                return aynr.t(new aypv() { // from class: akrd
                    @Override // defpackage.aypv
                    public final void a() {
                        akre akreVar = akre.this;
                        atud atudVar2 = atudVar;
                        tee teeVar2 = teeVar;
                        if ((atudVar2.c & 2) == 0) {
                            akri akriVar = akreVar.a;
                            awnn awnnVar = atudVar2.d;
                            if (awnnVar == null) {
                                awnnVar = awnn.a;
                            }
                            akriVar.f(awnnVar, teeVar2);
                            return;
                        }
                        akri akriVar2 = akreVar.a;
                        awnn awnnVar2 = atudVar2.d;
                        if (awnnVar2 == null) {
                            awnnVar2 = awnn.a;
                        }
                        augo b = augo.b(atudVar2.e);
                        if (b == null) {
                            b = augo.PRESENTATION_STYLE_UNKNOWN;
                        }
                        akriVar2.g(awnnVar2, teeVar2, b);
                    }
                });
            }
            String valueOf = String.valueOf(this.b.getClass().getName());
            return aynr.s(new IllegalStateException(valueOf.length() != 0 ? "Handler for OpenElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(valueOf) : new String("Handler for OpenElementsScreenCommand was asked from an Activity which doesn't provide one: ")));
        }
        final apyu apyuVar = (apyu) obj;
        if (!(this.a instanceof akrk)) {
            return aynr.t(new aypv(apyuVar, null) { // from class: akrb
                public final /* synthetic */ apyu a;

                @Override // defpackage.aypv
                public final void a() {
                    akre akreVar = akre.this;
                    apyu apyuVar2 = this.a;
                    if ((apyuVar2.c & 1) == 0) {
                        akreVar.a.b();
                        return;
                    }
                    akri akriVar = akreVar.a;
                    augo b = augo.b(apyuVar2.d);
                    if (b == null) {
                        b = augo.PRESENTATION_STYLE_UNKNOWN;
                    }
                    akriVar.c(b);
                }
            });
        }
        String valueOf2 = String.valueOf(this.b.getClass().getName());
        return aynr.s(new IllegalStateException(valueOf2.length() != 0 ? "Handler for CloseElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(valueOf2) : new String("Handler for CloseElementsScreenCommand was asked from an Activity which doesn't provide one: ")));
    }
}
