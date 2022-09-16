package defpackage;
/* compiled from: PG */
/* renamed from: aczc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aczc implements ruw {
    public static final /* synthetic */ aczc a = new aczc();
    private final /* synthetic */ int b;

    private /* synthetic */ aczc() {
    }

    public /* synthetic */ aczc(int i) {
        this.b = i;
    }

    @Override // defpackage.ruw
    public final void c(Exception exc) {
        if (this.b == 0) {
            zep.f(aczd.a, "error updating Google Play Services for Cast sdk", exc);
        } else {
            afus.c(1, 12, "Failed to commit to snapshot for Mendel package com.youtube.mainapp.android", exc);
        }
    }
}
