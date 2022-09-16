package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: oev  reason: default package */
/* loaded from: classes3.dex */
public final class oev implements feg {
    public boolean a;
    public ezu b;
    private final ofu c;
    private final FullscreenExitController d;
    private final ezh e;
    private final azqb f;
    private final adoa g;
    private final gcf h;
    private final Set i = new HashSet();
    private final evm j;
    private final jvo k;
    private final aacz l;

    public oev(ofu ofuVar, FullscreenExitController fullscreenExitController, ezh ezhVar, jvo jvoVar, azqb azqbVar, feh fehVar, gcf gcfVar, adoa adoaVar, evm evmVar, aacz aaczVar) {
        this.c = ofuVar;
        this.d = fullscreenExitController;
        this.e = ezhVar;
        this.k = jvoVar;
        this.f = azqbVar;
        this.g = adoaVar;
        this.h = gcfVar;
        this.j = evmVar;
        this.l = aaczVar;
        fehVar.a(this);
    }

    public final void a(njc njcVar) {
        this.i.add(njcVar);
    }

    public final void d(njc njcVar) {
        this.i.remove(njcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[LOOP:0: B:52:0x00f5->B:54:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160 A[LOOP:1: B:76:0x015a->B:78:0x0160, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ezu r13, defpackage.ampq r14) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oev.e(ezu, ampq):void");
    }

    @Override // defpackage.feg
    public final void kF() {
        this.a = false;
    }

    @Override // defpackage.feg
    public final void nr() {
        this.a = true;
        ezu ezuVar = this.b;
        if (ezuVar != null) {
            ezuVar.a.h();
            e(this.b, amon.a);
        }
    }
}
