package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cmig  reason: default package */
/* loaded from: classes5.dex */
public final class cmig extends cmfy {
    private final cmnk f = new cmnk();

    @Override // defpackage.cmfy
    protected final cmga m(byte[] bArr, int i, boolean z) {
        cmfw c;
        this.f.c(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f.d() > 0) {
            if (this.f.d() >= 8) {
                int r = this.f.r();
                if (this.f.r() == 1987343459) {
                    cmnk cmnkVar = this.f;
                    int i2 = r - 8;
                    CharSequence charSequence = null;
                    cmfv cmfvVar = null;
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int r2 = cmnkVar.r();
                            int r3 = cmnkVar.r();
                            int i3 = r2 - 8;
                            String s = cmny.s(cmnkVar.a, cmnkVar.b, i3);
                            cmnkVar.h(i3);
                            i2 = (i2 - 8) - i3;
                            if (r3 == 1937011815) {
                                cmfvVar = cmip.b(s);
                            } else if (r3 == 1885436268) {
                                charSequence = cmip.d(null, s.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new cmgc("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (cmfvVar != null) {
                        cmfvVar.a = charSequence;
                        c = cmfvVar.a();
                    } else {
                        c = cmip.c(charSequence);
                    }
                    arrayList.add(c);
                } else {
                    this.f.h(r - 8);
                }
            } else {
                throw new cmgc("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new cmih(arrayList);
    }
}
