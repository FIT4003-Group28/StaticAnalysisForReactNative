package defpackage;

import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afgm  reason: default package */
/* loaded from: classes.dex */
public final class afgm extends ovx implements aevh {
    public final afge c;
    public final Handler d;
    private final afgq e;
    private final boolean f;
    private final Boolean g;
    private final Map h;
    private final afjz i;

    public afgm(owa owaVar, pbl pblVar, ovo ovoVar, long j, int i, owl[] owlVarArr, afgq afgqVar, boolean z, Handler handler, afge afgeVar, boolean z2, afjz afjzVar) {
        super(null, new owf(-1L, j, false, -1L, -1L, null, Collections.singletonList(new owi(0L, Collections.singletonList(new owc(i, Arrays.asList(owlVarArr), null))))), owaVar, pblVar, ovoVar, 0L, false, null, null, 0);
        this.e = afgqVar;
        this.f = z;
        this.d = handler;
        this.c = afgeVar;
        this.g = Boolean.valueOf(z2);
        this.i = afjzVar;
        this.h = new LinkedHashMap();
    }

    @Override // defpackage.ovx, defpackage.ovk
    public final void h(ovb ovbVar) {
        ovm ovmVar;
        if (ovbVar instanceof ovp) {
            oye oyeVar = ((ovp) ovbVar).i;
            if ((oyeVar instanceof oxm) && (ovmVar = ovbVar.c) != null) {
                this.h.put(ovmVar.a, (oxm) oyeVar);
            }
        }
        super.h(ovbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ovx
    public final ovb k(ovv ovvVar, ovw ovwVar, pbl pblVar, MediaFormat mediaFormat, ovu ovuVar, int i, int i2, boolean z) {
        long c;
        int i3;
        int i4;
        owm owmVar = ovwVar.c;
        ovm ovmVar = owmVar.e;
        long c2 = ovwVar.c(i);
        int a = ovwVar.a();
        afgq afgqVar = this.e;
        oxm oxmVar = (oxm) this.h.get(ovmVar.a);
        int a2 = afgqVar.a(i, oxmVar != null ? new ayy(oxmVar.b, oxmVar.c, oxmVar.d, oxmVar.e) : null);
        int i5 = (i + a2) - 1;
        if (i5 == a) {
            c = ovwVar.b(i5);
        } else {
            c = ovwVar.c(i5 + 1);
        }
        long j = c;
        owj d = ovwVar.d(i);
        long j2 = d.b;
        for (int i6 = 1; i6 < a2; i6++) {
            j2 += ovwVar.d(i + i6).b;
        }
        pbn pbnVar = new pbn(d.a(owmVar.g), d.a, j2, owmVar.h);
        long j3 = ovvVar.b - owmVar.f;
        if (ovwVar.a) {
            return new ovr(pblVar, pbnVar, ovmVar, c2, j, i, ovuVar.a, ovvVar.a);
        }
        if (this.f) {
            i4 = -1;
            i3 = -1;
        } else {
            int i7 = ovuVar.b;
            i3 = ovuVar.c;
            i4 = i7;
        }
        return new afgl(pblVar, pbnVar, i2, ovmVar, c2, j, i, j3, ovwVar.b, mediaFormat, i4, i3, ovvVar.d, z, ovvVar.a, a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ovx
    public final oxq l(String str) {
        int i = 1;
        if (true == this.i.L()) {
            i = 3;
        }
        if (p(str)) {
            return this.g.booleanValue() ? new aevi(i, this) : new pbe(i);
        }
        return new ozd();
    }
}
