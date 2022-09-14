package defpackage;

import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import com.google.ar.sceneform.rendering.EngineInstance;
/* compiled from: PG */
/* renamed from: dbfc  reason: default package */
/* loaded from: classes5.dex */
public final class dbfc {
    public final int a;
    public final dbez b;
    public dbdx c;
    public dbeb d;
    public dbeb e;
    private dbhq g;
    private dbfb h = new dbfb(this);
    public boolean f = false;

    public dbfc(dbez dbezVar, dbdx dbdxVar) {
        this.c = null;
        this.b = dbezVar;
        this.c = dbdxVar;
        this.d = dbezVar.a();
        this.e = dbezVar.b();
        dbezVar.d.add(this.h);
        int create = EntityManager.get().create();
        this.a = create;
        dbet a = EngineInstance.a();
        LightManager.Builder builder = new LightManager.Builder(LightManager.Type.DIRECTIONAL);
        builder.direction(dbezVar.b().a, dbezVar.b().b, dbezVar.b().c);
        builder.color(dbezVar.c().a, dbezVar.c().b, dbezVar.c().c);
        builder.intensity(dbezVar.c);
        builder.castShadows(dbezVar.a);
        builder.build(a.a, create);
    }

    public final void a(dbhq dbhqVar) {
        dbhqVar.k.addEntity(this.a);
        dbhqVar.c.add(this);
        this.g = dbhqVar;
    }

    public final void b() {
        dbhq dbhqVar = this.g;
        if (dbhqVar != null) {
            dbhqVar.k.remove(this.a);
            dbhqVar.c.remove(this);
        }
    }

    public final void c() {
        dbix.a();
        dbez dbezVar = this.b;
        if (dbezVar != null) {
            dbezVar.d.remove(this.h);
            this.h = null;
        }
        dbet a = EngineInstance.a();
        if (a == null || !a.a()) {
            return;
        }
        a.l().destroy(this.a);
        EntityManager.get().destroy(this.a);
    }

    protected final void finalize() {
        try {
            dbie.a().execute(new Runnable(this) { // from class: dbfa
                private final dbfc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        } catch (Exception unused) {
        } finally {
            super.finalize();
        }
    }
}
