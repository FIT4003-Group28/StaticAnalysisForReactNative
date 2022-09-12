package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnag  reason: default package */
/* loaded from: classes5.dex */
public final class cnag implements cnnu {
    public final cnac a;
    public final int b;

    public cnag(cnaf cnafVar) {
        this.a = cnafVar.a;
        this.b = cnafVar.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cnag)) {
            return false;
        }
        cnag cnagVar = (cnag) obj;
        return cnagVar.b == this.b && cnvv.a(cnagVar.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
