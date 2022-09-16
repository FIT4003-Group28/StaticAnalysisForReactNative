package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements axou {
    private final a a;
    private final /* synthetic */ int b;

    public b(a aVar) {
        this.a = aVar;
    }

    public b(a aVar, int i) {
        this.b = i;
        this.a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static b b(a aVar) {
        return new b(aVar, 1);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b != 0) {
            return this.a.b;
        }
        String str = this.a.a;
        axzl.o(str);
        return str;
    }
}
