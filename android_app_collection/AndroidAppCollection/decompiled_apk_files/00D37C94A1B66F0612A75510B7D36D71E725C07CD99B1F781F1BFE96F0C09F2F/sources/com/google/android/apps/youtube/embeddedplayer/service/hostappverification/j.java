package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import java.util.Random;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class j implements cfc {
    private static final Random a = new Random();
    private int b = 2500;
    private int c;

    @Override // defpackage.cfc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cfc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cfc
    public final void c(cff cffVar) {
        int i;
        this.c++;
        int nextInt = a.nextInt(100);
        int i2 = this.b;
        this.b = nextInt + 1 + i2 + i2;
        if (this.c <= 3) {
            cew cewVar = cffVar.b;
            if (cewVar != null && (i = cewVar.a) >= 500 && i <= 599) {
                return;
            }
            throw cffVar;
        }
        throw cffVar;
    }
}
