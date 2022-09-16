package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anpf  reason: default package */
/* loaded from: classes2.dex */
public final class anpf {
    private final bwqv a;

    public anpf(bwqv bwqvVar) {
        this.a = bwqvVar;
    }

    public final void a(akqq akqqVar, gfw gfwVar) {
        bwqv bwqvVar = this.a;
        Bundle bundle = new Bundle();
        ily ilyVar = new ily();
        ilyVar.q(akqqVar);
        bwqvVar.c(bundle, "placemark", ilyVar.d());
        anpg anpgVar = new anpg();
        anpgVar.B(bundle);
        gfwVar.aZ(anpgVar);
    }
}
