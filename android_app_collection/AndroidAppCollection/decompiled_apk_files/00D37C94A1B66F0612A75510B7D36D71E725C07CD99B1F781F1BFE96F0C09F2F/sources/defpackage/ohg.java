package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ohg  reason: default package */
/* loaded from: classes3.dex */
public final class ohg implements ohb {
    static final amup b = amup.m(auzb.STARTUP_SIGNAL_BROWSE_FEED_LOADED, e(aspw.STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED, aspv.STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT), auzb.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED, e(aspw.STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED, aspv.STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT), auzb.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED, e(aspw.STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED, aspv.STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT));
    private final acrr c;

    public ohg(acrr acrrVar) {
        this.c = acrrVar;
    }

    static ohf e(aspw aspwVar, aspv aspvVar) {
        aspv aspvVar2;
        ohe oheVar = new ohe();
        if (aspwVar != null) {
            oheVar.a = aspwVar;
            if (aspvVar != null) {
                oheVar.b = aspvVar;
                aspw aspwVar2 = oheVar.a;
                if (aspwVar2 == null || (aspvVar2 = oheVar.b) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (oheVar.a == null) {
                        sb.append(" signalLogType");
                    }
                    if (oheVar.b == null) {
                        sb.append(" signalLogErrorType");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                return new ohf(aspwVar2, aspvVar2);
            }
            throw new NullPointerException("Null signalLogErrorType");
        }
        throw new NullPointerException("Null signalLogType");
    }

    @Override // defpackage.ohb
    public final aynv a(final auzb auzbVar) {
        return new aynv() { // from class: ohc
            @Override // defpackage.aynv
            public final aynu a(aynr aynrVar) {
                final ohg ohgVar = ohg.this;
                final auzb auzbVar2 = auzbVar;
                return aynrVar.q(new ayqb() { // from class: ohd
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        ohg ohgVar2 = ohg.this;
                        auzb auzbVar3 = auzbVar2;
                        if (((Throwable) obj) instanceof TimeoutException) {
                            ohf ohfVar = (ohf) ohg.b.get(auzbVar3);
                            if (ohfVar == null) {
                                throw new IllegalStateException("Unresolved startup signal error");
                            }
                            ohgVar2.f(null, ohfVar.b);
                        }
                    }
                });
            }
        };
    }

    @Override // defpackage.ohb
    public final void b() {
        f(aspw.STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED, null);
    }

    @Override // defpackage.ohb
    public final void c(auzb auzbVar) {
        ohf ohfVar = (ohf) b.get(auzbVar);
        if (ohfVar == null) {
            throw new IllegalStateException("Unresolved startup signal type");
        }
        f(ohfVar.a, null);
    }

    @Override // defpackage.ohb
    public final void d() {
        f(aspw.STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED, null);
    }

    public final void f(aspw aspwVar, aspv aspvVar) {
        aspt a = aspu.a();
        if (aspwVar != null) {
            a.copyOnWrite();
            ((aspu) a.instance).f(aspwVar);
        }
        if (aspvVar != null) {
            a.copyOnWrite();
            ((aspu) a.instance).e(aspvVar);
        }
        acrr acrrVar = this.c;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dF((aspu) a.mo39build());
        acrrVar.c((arrh) a2.mo39build());
    }
}
