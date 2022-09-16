package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: pui  reason: default package */
/* loaded from: classes4.dex */
public final class pui extends psi {
    private final pwu a;

    public pui() {
        super("Mp4WebvttDecoder");
        this.a = new pwu();
    }

    @Override // defpackage.psi
    protected final psk g(byte[] bArr, int i, boolean z) {
        psg c;
        this.a.E(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.a.a() > 0) {
            if (this.a.a() >= 8) {
                int d = this.a.d();
                if (this.a.d() == 1987343459) {
                    pwu pwuVar = this.a;
                    int i2 = d - 8;
                    CharSequence charSequence = null;
                    psf psfVar = null;
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int d2 = pwuVar.d();
                            int d3 = pwuVar.d();
                            int i3 = d2 - 8;
                            String B = pxi.B(pwuVar.a, pwuVar.b, i3);
                            pwuVar.H(i3);
                            i2 = (i2 - 8) - i3;
                            if (d3 == 1937011815) {
                                psfVar = puq.b(B);
                            } else if (d3 == 1885436268) {
                                charSequence = puq.a(null, B.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new psm("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (psfVar != null) {
                        psfVar.a = charSequence;
                        c = psfVar.a();
                    } else {
                        c = puq.c(charSequence);
                    }
                    arrayList.add(c);
                } else {
                    this.a.H(d - 8);
                }
            } else {
                throw new psm("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new ptm(arrayList, 3, null);
    }
}
