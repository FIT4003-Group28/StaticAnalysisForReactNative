package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jhu  reason: default package */
/* loaded from: classes3.dex */
abstract class jhu implements jip {
    private final String a;

    public jhu(String str) {
        this.a = str;
    }

    protected abstract aajl a();

    @Override // defpackage.jip
    public final ayoi b() {
        return a().h(this.a, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jhu) {
            return ((jhu) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a()});
    }
}
