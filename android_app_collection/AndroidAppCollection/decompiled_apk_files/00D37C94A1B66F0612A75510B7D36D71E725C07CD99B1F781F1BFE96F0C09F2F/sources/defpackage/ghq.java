package defpackage;

import android.content.Context;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ghq  reason: default package */
/* loaded from: classes3.dex */
public final class ghq implements abea {
    private final Context a;
    private final boolean b;

    public ghq(Context context, aacz aaczVar) {
        this.a = context;
        this.b = eog.aA(aaczVar);
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        if (!this.b || !ylr.d()) {
            return;
        }
        aopa s = abedVar.s();
        arow arowVar = ((aroy) s.instance).c;
        if (arowVar == null) {
            arowVar = arow.a;
        }
        arou b = arou.b(arowVar.I);
        if (b == null) {
            b = arou.UNKNOWN_FORM_FACTOR;
        }
        if (b != arou.LARGE_FORM_FACTOR && b != arou.SMALL_FORM_FACTOR && b != arou.UNKNOWN_FORM_FACTOR) {
            return;
        }
        arow arowVar2 = ((aroy) s.instance).c;
        if (arowVar2 == null) {
            arowVar2 = arow.a;
        }
        aopa mo52toBuilder = arowVar2.mo52toBuilder();
        arou a = ghs.a(this.a);
        mo52toBuilder.copyOnWrite();
        arow arowVar3 = (arow) mo52toBuilder.instance;
        arowVar3.I = a.f;
        arowVar3.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        s.copyOnWrite();
        aroy aroyVar = (aroy) s.instance;
        arow arowVar4 = (arow) mo52toBuilder.mo39build();
        arowVar4.getClass();
        aroyVar.c = arowVar4;
        aroyVar.b |= 1;
    }
}
