package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: mrd  reason: default package */
/* loaded from: classes3.dex */
public final class mrd {
    public apoj a;

    public mrd(apoj apojVar) {
        this.a = apojVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mrd) && akzj.f(((mrd) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
