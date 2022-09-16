package defpackage;

import java.util.Locale;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: sta  reason: default package */
/* loaded from: classes4.dex */
public final class sta implements tct {
    final axnm a;
    private final /* synthetic */ int b;

    public sta(axnm axnmVar) {
        this.a = axnmVar;
    }

    public sta(axnm axnmVar, int i) {
        this.b = i;
        this.a = axnmVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return auzm.b;
            }
            if (i == 2) {
                return awoh.b;
            }
            return awoo.b;
        }
        return avgd.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        boolean contains;
        int i = this.b;
        if (i == 0) {
            final avgd avgdVar = (avgd) obj;
            return ((ajil) this.a.get()).a().c(aynr.k(new Callable() { // from class: ssy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    sta staVar = sta.this;
                    avgd avgdVar2 = avgdVar;
                    ((ajil) staVar.a.get()).b();
                    if (avgdVar2.c) {
                        final ajil ajilVar = (ajil) staVar.a.get();
                        int size = avgdVar2.d.size();
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("TextToSpeechController");
                        sb.append(size - 1);
                        final String sb2 = sb.toString();
                        aynr j = aynr.j(new aynt() { // from class: ssw
                            @Override // defpackage.aynt
                            public final void a(aysm aysmVar) {
                                String str = sb2;
                                final ajil ajilVar2 = ajilVar;
                                final ssz sszVar = new ssz(str, aysmVar);
                                ayqi.f(aysmVar, banl.n(new aypv() { // from class: ssx
                                    @Override // defpackage.aypv
                                    public final void a() {
                                        ajil ajilVar3 = ajil.this;
                                        ajilVar3.a.e.c(sszVar);
                                    }
                                }));
                                ajilVar2.a.e.b(sszVar);
                            }
                        });
                        String str = "";
                        for (int i2 = 0; i2 < avgdVar2.d.size(); i2++) {
                            StringBuilder sb3 = new StringBuilder(33);
                            sb3.append("TextToSpeechController");
                            sb3.append(i2);
                            String sb4 = sb3.toString();
                            if (avgdVar2.f.size() > i2) {
                                String str2 = (String) avgdVar2.f.get(i2);
                                if (!str.equals(str2)) {
                                    Locale locale = new Locale(str2);
                                    yxz yxzVar = ajilVar.a;
                                    if (yxzVar.a.isLanguageAvailable(locale) >= 0) {
                                        yxzVar.a.setLanguage(locale);
                                    } else {
                                        zep.l("TTS Locale is not available");
                                    }
                                    str = str2;
                                }
                            }
                            ajilVar.a.a((String) avgdVar2.d.get(i2), 1, sb4);
                            if (avgdVar2.e.size() > i2) {
                                aooo aoooVar = (aooo) avgdVar2.e.get(i2);
                                ajilVar.a.a.playSilentUtterance(Math.round((aoooVar.b * 1000) + (aoooVar.c / 1000)), 1, sb4);
                            }
                        }
                        return j;
                    }
                    return aynr.f();
                }
            }));
        } else if (i == 1) {
            auzm auzmVar = (auzm) obj;
            return ((ajil) this.a.get()).a().c(aynr.k(new Callable(null) { // from class: ssv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((ajil) sta.this.a.get()).b();
                    return aynr.f();
                }
            }));
        } else if (i == 2) {
            awoh awohVar = (awoh) obj;
            tcu tcuVar = (tcu) this.a.get();
            if (awohVar.c.length() > 0) {
                String str = awohVar.c;
                synchronized (tgh.a) {
                    contains = tgh.a.contains(str);
                }
                if (contains) {
                    return aynr.f();
                }
            }
            String str2 = awohVar.c;
            synchronized (tgh.a) {
                tgh.a.add(str2);
            }
            awmt awmtVar = awohVar.d;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            return tcuVar.d(awmtVar, tcsVar, 1);
        } else {
            awoo awooVar = (awoo) obj;
            tcu tcuVar2 = (tcu) this.a.get();
            if (awooVar.c.size() > 0) {
                return aynr.h(aynx.y(awooVar.c).C(new szw(tcuVar2, tcsVar, 2)));
            }
            return aynr.f();
        }
    }
}
