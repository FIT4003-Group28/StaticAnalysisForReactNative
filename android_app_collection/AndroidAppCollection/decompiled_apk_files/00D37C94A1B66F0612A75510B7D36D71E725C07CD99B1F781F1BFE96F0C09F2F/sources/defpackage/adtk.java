package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adtk  reason: default package */
/* loaded from: classes.dex */
public final class adtk implements adss {
    private final adss a;
    private final List b = new ArrayList();
    private volatile adtd c = null;

    static {
        zep.a("MDX.transport");
    }

    public adtk(adss adssVar) {
        this.a = adssVar;
    }

    public final synchronized void a(adtj adtjVar) {
        if (this.c != null) {
            adtjVar.a(this.c);
        } else {
            this.b.add(adtjVar);
        }
    }

    @Override // defpackage.adss
    public final synchronized void b(adtd adtdVar) {
        if (this.b.isEmpty() || !adil.MDX_SESSION_STATUS.equals(adtdVar.a)) {
            this.a.b(adtdVar);
            return;
        }
        this.c = adtdVar;
        String.format("Found MdxSessionStatus: %s", adtdVar);
        for (adtj adtjVar : this.b) {
            adtjVar.a(adtdVar);
        }
    }

    public final synchronized void c() {
        this.c = null;
        this.b.clear();
    }
}
