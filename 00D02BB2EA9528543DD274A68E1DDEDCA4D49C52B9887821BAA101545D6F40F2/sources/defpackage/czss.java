package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: czss  reason: default package */
/* loaded from: classes5.dex */
public final class czss extends czsh {
    private final dtzt c;

    public czss(dtzt dtztVar) {
        this.c = dtztVar;
        this.b = 5;
    }

    @Override // defpackage.czsh
    public final fd a(Integer num, int i) {
        dtzt dtztVar = this.c;
        czsv czsvVar = new czsv();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", dtztVar.bS());
        czsvVar.B(bundle);
        return czsvVar;
    }
}
