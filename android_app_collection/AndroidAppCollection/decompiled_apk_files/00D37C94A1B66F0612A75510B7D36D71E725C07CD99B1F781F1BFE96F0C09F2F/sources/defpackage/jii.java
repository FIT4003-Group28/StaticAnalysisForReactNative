package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jii  reason: default package */
/* loaded from: classes3.dex */
public final class jii implements jip {
    private final azqb a;
    private final int b = 2;

    public jii(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.jip
    public final ayoi b() {
        return ((aynx) this.a.get()).W();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jii) {
            int i = ((jii) obj).b;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{2});
    }
}
