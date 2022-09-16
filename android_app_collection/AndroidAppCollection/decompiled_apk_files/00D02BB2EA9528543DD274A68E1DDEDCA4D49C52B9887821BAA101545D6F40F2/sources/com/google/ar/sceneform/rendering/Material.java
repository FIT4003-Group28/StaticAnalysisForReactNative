package com.google.ar.sceneform.rendering;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Material {
    public static final String a = "Material";
    public final MaterialParameters b;
    public final dbfz c;
    private final dbgb d;

    private Material(Material material) {
        this(material.d);
        g(material.b);
    }

    public static dbfx f() {
        dbix.b();
        return new dbfx();
    }

    public final Material a() {
        return new Material(this);
    }

    public final void b(String str, float f) {
        this.b.setFloat(str, f);
        if (this.c.b()) {
            this.b.a(this.c.a());
        }
    }

    public final void c(String str, float f, float f2) {
        this.b.setFloat2(str, f, f2);
        if (this.c.b()) {
            this.b.a(this.c.a());
        }
    }

    public final void d(String str, dbep dbepVar) {
        this.b.setFloat3(str, dbepVar.a, dbepVar.b, dbepVar.c);
        if (this.c.b()) {
            this.b.a(this.c.a());
        }
    }

    public final void e(String str, dbes dbesVar) {
        this.b.a.put(str, new dbgh(str, dbesVar));
        if (this.c.b()) {
            this.b.a(this.c.a());
        }
    }

    public final void g(MaterialParameters materialParameters) {
        MaterialParameters materialParameters2 = this.b;
        materialParameters2.a.clear();
        for (dbgq dbgqVar : materialParameters.a.values()) {
            dbgq clone = dbgqVar.clone();
            materialParameters2.a.put(clone.e, clone);
        }
        if (this.c.b()) {
            this.b.a(this.c.a());
        }
    }

    public final MaterialInstance h() {
        if (this.c.b()) {
            return this.c.a();
        }
        throw new AssertionError("Filament Material Instance is null.");
    }

    public Material(dbgb dbgbVar) {
        this.b = new MaterialParameters();
        this.d = dbgbVar;
        dbgbVar.b();
        com.google.android.filament.Material material = ((dbgc) dbgbVar).a;
        if (material == null) {
            throw new IllegalStateException("Filament Material is null.");
        }
        dbga dbgaVar = new dbga(material.createInstance());
        this.c = dbgaVar;
        dbhs.b().h.a(this, new dbfy(dbgaVar, dbgbVar));
    }
}
