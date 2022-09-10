package defpackage;

import defpackage.crpx;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mch  reason: default package */
/* loaded from: classes7.dex */
public final class mch<S extends crpx> {
    private final cqat a;
    private final asmp b;
    private final dbty<atyi<S>> c;
    private final aluu d;
    private final koc e;
    private final List<mcg<S>> f = new ArrayList();
    @dzsi
    private mcg<S> g = null;
    @dzsi
    private S h;

    public mch(cqat cqatVar, asmp asmpVar, dbty<atyi<S>> dbtyVar, aluu aluuVar, koc kocVar) {
        this.a = cqatVar;
        this.b = asmpVar;
        this.c = dbtyVar;
        this.d = aluuVar;
        this.e = kocVar;
    }

    public final void a(@dzsi S s) {
        this.h = s;
        for (mcg<S> mcgVar : this.f) {
            mcgVar.c(s);
        }
    }

    public final mcp b(@dzsi mco mcoVar) {
        mcg<S> mcgVar = new mcg<>(this.a, this.b, this.c.a(), this.d, this.e, mcoVar);
        this.f.add(mcgVar);
        mcgVar.c(this.h);
        return mcgVar;
    }

    public final void c(mcp mcpVar) {
        boolean z = false;
        dbsk.m(mcpVar != this.g, "Can't end visible search session.");
        int indexOf = this.f.indexOf(mcpVar);
        if (indexOf >= 0) {
            z = true;
        }
        dbsk.m(z, "Search session not known");
        mcg<S> mcgVar = this.f.get(indexOf);
        dbsk.m(!mcgVar.e, "Can't destroy a visible search session.");
        mcgVar.f = true;
        mcgVar.b.j();
        this.f.remove(mcgVar);
    }

    public final void d(mcp mcpVar) {
        boolean z = false;
        dbsk.m(this.g == null, "Cannot set two visible search sessions at once.");
        int indexOf = this.f.indexOf(mcpVar);
        if (indexOf >= 0) {
            z = true;
        }
        dbsk.m(z, "Search session not known");
        mcg<S> mcgVar = this.f.get(indexOf);
        this.g = mcgVar;
        mcgVar.d(true);
    }

    public final void e(mcp mcpVar) {
        dbsk.m(this.g == mcpVar, "Search session is not already visible.");
        mcg<S> mcgVar = this.g;
        dbsk.s(mcgVar);
        mcgVar.d(false);
        this.g = null;
    }
}
