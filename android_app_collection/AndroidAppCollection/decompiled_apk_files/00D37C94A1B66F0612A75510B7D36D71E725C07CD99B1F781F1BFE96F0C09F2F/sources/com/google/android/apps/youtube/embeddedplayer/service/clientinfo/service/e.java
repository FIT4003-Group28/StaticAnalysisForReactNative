package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.util.Base64;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements axou {
    private final d a;
    private final /* synthetic */ int b;

    public e(d dVar) {
        this.a = dVar;
    }

    public e(d dVar, int i) {
        this.b = i;
        this.a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static e b(d dVar) {
        return new e(dVar, 1);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b != 0) {
            return this.a.a;
        }
        String encodeToString = Base64.encodeToString(zgt.f(this.a.a.b().toByteArray()), 11);
        axzl.o(encodeToString);
        return encodeToString;
    }
}
