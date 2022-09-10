package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dvd  reason: default package */
/* loaded from: classes6.dex */
public final class dvd extends duw implements dua {
    public final duv a;
    public final dbhq c;
    public final duf f;
    @dzsi
    public dws g;
    private final dbcs h;
    public final Set<dtv> d = new LinkedHashSet();
    private final Set<dbsz<duh>> i = new LinkedHashSet();
    @dzsi
    public duh e = null;

    public dvd(duv duvVar, dbhq dbhqVar, dbcs dbcsVar, czz czzVar) {
        this.a = duvVar;
        this.c = dbhqVar;
        this.h = dbcsVar;
        dbch dbchVar = dbcsVar.a;
        dbchVar.c = 50.0f;
        if (!dbchVar.d) {
            dbchVar.e();
        }
        dug.a(dbchVar, 1);
        dug.a(czzVar, 2);
        this.f = new duf(dbchVar, czzVar);
    }

    @Override // defpackage.duw
    @dzsi
    public final dvd C() {
        return this;
    }

    @Override // defpackage.duw
    public final dbcn D() {
        return this.h;
    }

    @Override // defpackage.dua
    public final void a(dtv dtvVar) {
        dbsk.l(this.d.add(dtvVar));
        dtvVar.e(this);
    }

    @Override // defpackage.dua
    public final void b(dtv dtvVar) {
        dbsk.l(this.d.remove(dtvVar));
        dtvVar.f();
    }

    public final void c() {
        for (dtv dtvVar : this.d) {
            dtvVar.f();
        }
        this.d.clear();
        for (dtu dtuVar : F()) {
            dtuVar.f();
        }
        this.i.clear();
        this.e = null;
    }
}
