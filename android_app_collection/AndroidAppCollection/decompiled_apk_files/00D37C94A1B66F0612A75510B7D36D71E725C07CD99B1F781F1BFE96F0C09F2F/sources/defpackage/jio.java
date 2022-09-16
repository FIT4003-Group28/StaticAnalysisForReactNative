package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jio  reason: default package */
/* loaded from: classes3.dex */
public final class jio implements jip {
    private final yve a;
    private final ayqe b;

    public jio(yve yveVar, ayqe ayqeVar) {
        this.a = yveVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.jip
    public final ayoi b() {
        return this.a.d().I().C(this.b).n().W();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jio) {
            jio jioVar = (jio) obj;
            if (jioVar.a.equals(this.a) && jioVar.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
