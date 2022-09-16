package defpackage;

import android.os.Build;
import android.os.Looper;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.c;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: opf  reason: default package */
/* loaded from: classes3.dex */
public final class opf implements axou {
    private final /* synthetic */ int a;

    public opf() {
    }

    public opf(int i) {
        this.a = i;
    }

    public static aioe a() {
        return new aiod();
    }

    public static Boolean b() {
        return false;
    }

    public static snc c() {
        return new zgi(1);
    }

    public static Looper d() {
        final SettableFuture f = SettableFuture.f();
        snr.a(0, snr.f(swm.e(), snr.e("Lite", pgw.b))).newThread(new Runnable() { // from class: sni
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    Looper.prepare();
                    settableFuture.o(Looper.myLooper());
                    Looper.loop();
                    if ("robolectric".equals(Build.FINGERPRINT)) {
                        return;
                    }
                    uwp.h(qvl.d);
                } catch (Throwable th) {
                    settableFuture.o(Looper.myLooper());
                    throw th;
                }
            }
        }).start();
        try {
            Looper looper = (Looper) anlz.c(f);
            axzl.o(looper);
            return looper;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Integer e() {
        return Integer.valueOf(snr.c());
    }

    public static srk f(Map map, Map map2, Set set, teb tebVar, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5) {
        return new srk(map, map2, set, tebVar, ampqVar, ampqVar2, ampqVar3, ampqVar4, ampqVar5);
    }

    public static sus g(tfh tfhVar, tdb tdbVar, ampq ampqVar, teb tebVar, tfa tfaVar, axnm axnmVar, tax taxVar, azqb azqbVar, azqb azqbVar2, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5, ampq ampqVar6, ampq ampqVar7, ampq ampqVar8, ampq ampqVar9) {
        return new sus(tfhVar, tdbVar, ampqVar, tebVar, tfaVar, axnmVar, taxVar, azqbVar, azqbVar2, ampqVar2, ampqVar3, ampqVar4, ampqVar5, ampqVar6, ampqVar7, ampqVar8, ampqVar9);
    }

    public static tdw h(tei teiVar) {
        return swa.b(teiVar, suz.b, 160982084, svn.a);
    }

    public static tdw i(tei teiVar, final tcu tcuVar, final szk szkVar, ampq ampqVar, final azqb azqbVar, final tfy tfyVar) {
        Boolean bool = true;
        final boolean booleanValue = ((Boolean) ampqVar.e(bool)).booleanValue();
        return swa.c(teiVar, new svy() { // from class: stw
            @Override // defpackage.svy
            public final cyp a(cyv cyvVar, tda tdaVar, Object obj, String str, aodt aodtVar, suc sucVar, List list) {
                szk szkVar2 = szk.this;
                azqb azqbVar2 = azqbVar;
                boolean z = booleanValue;
                tcu tcuVar2 = tcuVar;
                tfy tfyVar2 = tfyVar;
                axmr axmrVar = (axmr) obj;
                stt sttVar = new stt();
                stt.c(sttVar, cyvVar, new stv());
                sttVar.a.A = szkVar2;
                sttVar.d.set(7);
                sttVar.a.d = tdaVar;
                sttVar.d.set(3);
                sttVar.a.b = axmrVar;
                sttVar.d.set(1);
                sttVar.a.a = list;
                sttVar.d.set(0);
                if (sucVar != null) {
                    sttVar.a.E = sucVar;
                }
                if (z) {
                    AtomicReference atomicReference = tdaVar.w;
                    stv stvVar = sttVar.a;
                    stvVar.y = atomicReference;
                    stvVar.z = azqbVar2;
                }
                if (str != null) {
                    sttVar.a.e = str;
                }
                sttVar.a.c = tcuVar2;
                sttVar.d.set(2);
                aodt aodtVar2 = new aodt();
                int b = axmrVar.b(24);
                aodt aodtVar3 = null;
                if (b != 0) {
                    aodtVar2.f(axmrVar.a(b + axmrVar.a), axmrVar.b);
                } else {
                    aodtVar2 = null;
                }
                sttVar.a.w = tfyVar2.g(aodtVar2);
                sttVar.d.set(5);
                aodt aodtVar4 = new aodt();
                int b2 = axmrVar.b(30);
                if (b2 != 0) {
                    aodtVar4.f(axmrVar.a(b2 + axmrVar.a), axmrVar.b);
                } else {
                    aodtVar4 = null;
                }
                sttVar.a.v = tfyVar2.g(aodtVar4);
                sttVar.d.set(4);
                aodt aodtVar5 = new aodt();
                int b3 = axmrVar.b(32);
                if (b3 != 0) {
                    aodtVar5.f(axmrVar.a(b3 + axmrVar.a), axmrVar.b);
                    aodtVar3 = aodtVar5;
                }
                sttVar.a.x = tfyVar2.g(aodtVar3);
                sttVar.d.set(6);
                return sttVar;
            }
        }, 158796298, svn.c, bool.booleanValue());
    }

    public static opf j() {
        return new opf(13);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return ahiu.d;
            case 1:
                return new aken(false);
            case 2:
            case 3:
                return null;
            case 4:
                return a();
            case 5:
                return "android_embedded_player";
            case 6:
                return null;
            case 7:
                return b();
            case 8:
                return new a();
            case 9:
                return new b();
            case 10:
                return new com.google.android.apps.youtube.embeddedplayer.service.innertube.a();
            case 11:
                return new c();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return new swm();
            case 16:
                return false;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
