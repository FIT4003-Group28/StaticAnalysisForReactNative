package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: adxw  reason: default package */
/* loaded from: classes.dex */
public final class adxw {
    private final azqb a;
    private final azqb b;

    public adxw(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public final CronetEngine a(boolean z) {
        return (CronetEngine) (z ? this.b : this.a).get();
    }
}
