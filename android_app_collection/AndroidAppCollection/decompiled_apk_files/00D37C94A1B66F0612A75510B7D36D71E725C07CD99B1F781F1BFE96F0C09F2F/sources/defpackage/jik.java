package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jik  reason: default package */
/* loaded from: classes3.dex */
public final class jik implements jip {
    private final fcd a;

    public jik(fcd fcdVar) {
        this.a = fcdVar;
    }

    @Override // defpackage.jip
    public final ayoi b() {
        return this.a.b.I().A().W();
    }

    public final boolean equals(Object obj) {
        return obj instanceof jik;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
