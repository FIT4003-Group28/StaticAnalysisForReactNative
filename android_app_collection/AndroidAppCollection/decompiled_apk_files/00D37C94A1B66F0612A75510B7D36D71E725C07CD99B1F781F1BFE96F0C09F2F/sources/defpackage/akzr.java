package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: akzr  reason: default package */
/* loaded from: classes.dex */
public final class akzr implements akzs {
    private final /* synthetic */ int a;

    public akzr() {
    }

    public akzr(int i) {
        this.a = i;
    }

    @Override // defpackage.akzs
    public final alcw a(alcw alcwVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1 || alcwVar == null) {
                return null;
            }
            aopa mo52toBuilder = alcwVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            alcw alcwVar2 = (alcw) mo52toBuilder.instance;
            alcwVar2.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            alcwVar2.D = false;
            return (alcw) mo52toBuilder.mo39build();
        }
        return alcwVar;
    }
}
