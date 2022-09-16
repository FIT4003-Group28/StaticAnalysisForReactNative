package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: eny  reason: default package */
/* loaded from: classes3.dex */
public final class eny implements enw {
    public final yve a;
    public final azqb b;
    public final enz c;
    private final fnm d;

    public eny(yve yveVar, enz enzVar, fnm fnmVar, azqb azqbVar) {
        this.c = enzVar;
        this.a = yveVar;
        this.d = fnmVar;
        this.b = azqbVar;
    }

    public static boolean d(eoe eoeVar, enz enzVar, eoe eoeVar2) {
        aqxo.p(eoeVar2 != eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED);
        if (eoeVar == eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED) {
            eoeVar = eoeVar2;
        }
        if (eoeVar != eoe.BACKGROUND_AUDIO_POLICY_ON) {
            if (eoeVar != eoe.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES) {
                return false;
            }
            if (!enzVar.a.isWiredHeadsetOn() && !enzVar.a.isBluetoothA2dpOn() && !enzVar.a.isBluetoothScoOn()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.enw
    public final ankt a() {
        return anii.i(this.a.a(), new anir() { // from class: enx
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                eny enyVar = eny.this;
                eof eofVar = (eof) obj;
                if ((eofVar.b & 2) == 0 || !eofVar.d) {
                    return enyVar.a.b(egf.n);
                }
                return ankq.a;
            }
        }, anjk.a);
    }

    @Override // defpackage.enw
    public final ankt b() {
        eoe a = eoe.a(((eof) this.a.c()).c);
        if (a == null) {
            a = eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
        }
        if (a == eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED) {
            return ankq.a;
        }
        if (!d(a, this.c, (eoe) this.b.get())) {
            fnm fnmVar = this.d;
            fnmVar.a.stopService((Intent) fnmVar.b.get());
        }
        return a();
    }

    @Override // defpackage.enw
    public final boolean c() {
        return !((eof) this.a.c()).d;
    }
}
