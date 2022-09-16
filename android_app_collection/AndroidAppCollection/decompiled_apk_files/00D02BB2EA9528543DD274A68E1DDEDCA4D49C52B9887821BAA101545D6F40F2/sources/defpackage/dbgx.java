package defpackage;

import android.content.Context;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.rendering.Material;
import com.google.ar.sceneform.rendering.Texture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: dbgx  reason: default package */
/* loaded from: classes5.dex */
public final class dbgx {
    public final dbhq a;
    public final CompletableFuture<Material> c;
    public Material d;
    public final Map<Plane, dbgy> b = new HashMap();
    public boolean e = true;
    public boolean f = true;
    public final Map<Plane, Material> g = new HashMap();
    public float h = 4.0f;

    public dbgx(dbhq dbhqVar) {
        this.a = dbhqVar;
        dbic a = Texture.Sampler.a();
        Texture.Sampler.MagFilter magFilter = Texture.Sampler.MagFilter.LINEAR;
        a.a = Texture.Sampler.MinFilter.values()[magFilter.ordinal()];
        a.b = magFilter;
        a.b(Texture.Sampler.WrapMode.REPEAT);
        Texture.Sampler a2 = a.a();
        dbia a3 = Texture.a();
        Context c = dbhqVar.c();
        dbhqVar.c();
        int a4 = dbhr.a(8);
        a3.b(dbja.a(c, a4));
        a3.a = c.getResources().getResourceName(a4);
        a3.c = a2;
        CompletableFuture<Texture> a5 = a3.a();
        dbfx f = Material.f();
        Context c2 = dbhqVar.c();
        dbhqVar.c();
        f.c(c2, dbhr.a(7));
        this.c = f.a().thenCombine((CompletionStage) a5, new BiFunction(this) { // from class: dbgw
            private final dbgx a;

            {
                this.a = this;
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                dbgx dbgxVar = this.a;
                Material material = (Material) obj;
                material.b.setTexture("texture", (Texture) obj2);
                if (material.c.b()) {
                    material.b.a(material.c.a());
                }
                material.b.setFloat3("color", 1.0f, 1.0f, 1.0f);
                if (material.c.b()) {
                    material.b.a(material.c.a());
                }
                material.c("uvScale", 8.0f, 4.569201f);
                for (Map.Entry<Plane, dbgy> entry : dbgxVar.b.entrySet()) {
                    if (!dbgxVar.g.containsKey(entry.getKey())) {
                        entry.getValue().d(material);
                    }
                }
                return material;
            }
        });
        dbfx f2 = Material.f();
        Context c3 = dbhqVar.c();
        dbhqVar.c();
        f2.c(c3, dbhr.a(6));
        f2.a().thenAccept(new Consumer(this) { // from class: dbgu
            private final dbgx a;

            {
                this.a = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dbgx dbgxVar = this.a;
                dbgxVar.d = (Material) obj;
                for (dbgy dbgyVar : dbgxVar.b.values()) {
                    dbgyVar.c(dbgxVar.d);
                }
            }
        }).exceptionally(dbgv.a);
    }
}
