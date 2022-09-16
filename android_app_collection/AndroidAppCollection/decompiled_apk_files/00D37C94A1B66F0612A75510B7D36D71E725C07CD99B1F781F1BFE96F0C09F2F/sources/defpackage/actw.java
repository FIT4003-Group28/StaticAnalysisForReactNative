package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: actw  reason: default package */
/* loaded from: classes.dex */
final class actw {
    public aoqu a;
    public aoob b;
    private asjj c;

    public actw(aoqu aoquVar, aoob aoobVar) {
        b(aoquVar, aoobVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aoqu aoquVar, aoob aoobVar) {
        this.a = aoquVar;
        this.b = aoobVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof actw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        actw actwVar = (actw) obj;
        if (akzj.f(this.a, actwVar.a) && akzj.f(this.b, actwVar.b)) {
            asjj asjjVar = actwVar.c;
            if (akzj.f(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b}) * 31;
    }
}
