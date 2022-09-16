package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: altv  reason: default package */
/* loaded from: classes.dex */
public final class altv {
    public final List a;
    public final List b;

    public altv(altu altuVar) {
        this.a = new ArrayList(altuVar.a);
        this.b = new ArrayList(altuVar.b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
