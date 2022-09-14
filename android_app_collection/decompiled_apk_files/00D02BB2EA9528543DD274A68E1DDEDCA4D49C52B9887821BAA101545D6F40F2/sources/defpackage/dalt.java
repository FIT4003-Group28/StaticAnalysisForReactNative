package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dalt  reason: default package */
/* loaded from: classes5.dex */
public final class dalt {
    public final List<String> a;
    public final List<Locale> b;

    public dalt(dals dalsVar) {
        this.a = new ArrayList(dalsVar.a);
        this.b = new ArrayList(dalsVar.b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
