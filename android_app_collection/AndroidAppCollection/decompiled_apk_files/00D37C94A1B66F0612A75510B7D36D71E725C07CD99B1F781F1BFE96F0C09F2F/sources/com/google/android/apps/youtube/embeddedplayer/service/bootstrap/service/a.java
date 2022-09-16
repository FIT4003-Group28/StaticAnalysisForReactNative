package com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements azqb {
    public final /* synthetic */ aaau a;
    private final /* synthetic */ int b;

    public /* synthetic */ a(aaau aaauVar, int i) {
        this.b = i;
        this.a = aaauVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.b == 0) {
            return this.a.a();
        }
        return this.a.c();
    }
}
