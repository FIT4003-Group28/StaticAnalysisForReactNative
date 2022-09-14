package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axgk  reason: default package */
/* loaded from: classes3.dex */
public final class axgk {
    public final btnc<String, dqaw> a;
    public final Set<String> b = new LinkedHashSet();
    public final int c;

    public axgk(int i) {
        this.c = i;
        this.a = new btnc<>(i);
    }

    public final dqaw a(String str) {
        dzvx.c(str, "obfuscatedGaiaId");
        return this.a.a(str);
    }

    public final void b(String str) {
        dzvx.c(str, "obfuscatedGaiaId");
        this.b.add(str);
    }

    public final boolean c(String str) {
        dzvx.c(str, "obfuscatedGaiaId");
        return this.b.contains(str);
    }
}
