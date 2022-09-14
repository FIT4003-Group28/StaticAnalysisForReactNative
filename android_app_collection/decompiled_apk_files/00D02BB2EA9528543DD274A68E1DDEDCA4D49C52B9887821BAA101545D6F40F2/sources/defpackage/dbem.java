package defpackage;

import android.content.Context;
import com.google.android.filament.EntityManager;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Scene;
import com.google.android.filament.VertexBuffer;
import com.google.ar.sceneform.rendering.EngineInstance;
import com.google.ar.sceneform.rendering.Material;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: dbem  reason: default package */
/* loaded from: classes5.dex */
public final class dbem {
    public static final /* synthetic */ int i = 0;
    private static final short[] j = {0, 1, 2};
    private static final float[] k = {-1.0f, 1.0f, 1.0f, -1.0f, -3.0f, 1.0f, 3.0f, 1.0f, 1.0f};
    private static final float[] l = {0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f};
    public final int a;
    public final VertexBuffer b;
    public final FloatBuffer c;
    public final FloatBuffer d;
    public dbes e;
    private final Scene m;
    private final IndexBuffer o;
    private int n = -1;
    public Material f = null;
    public Material g = null;
    public boolean h = false;

    public dbem(int i2, dbhq dbhqVar) {
        this.m = dbhqVar.k;
        this.a = i2;
        dbet a = EngineInstance.a();
        ShortBuffer allocate = ShortBuffer.allocate(3);
        allocate.put(j);
        int capacity = allocate.capacity();
        IndexBuffer.Builder builder = new IndexBuffer.Builder();
        builder.indexCount(capacity);
        builder.bufferType(IndexBuffer.Builder.IndexType.USHORT);
        IndexBuffer build = builder.build(a.a);
        this.o = build;
        allocate.rewind();
        dbjb.c(build);
        build.setBuffer(a.a, allocate);
        this.c = c();
        FloatBuffer c = c();
        this.d = c;
        FloatBuffer allocate2 = FloatBuffer.allocate(9);
        allocate2.put(k);
        VertexBuffer.Builder builder2 = new VertexBuffer.Builder();
        builder2.vertexCount(3);
        builder2.bufferCount(2);
        builder2.attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, 12);
        builder2.attribute(VertexBuffer.VertexAttribute.UV0, 1, VertexBuffer.AttributeType.FLOAT2, 0, 8);
        VertexBuffer build2 = builder2.build(a.a);
        this.b = build2;
        allocate2.rewind();
        dbjb.c(build2);
        build2.setBufferAt(a.a, 0, allocate2);
        b();
        build2.setBufferAt(a.a, 1, c);
        dbfx f = Material.f();
        Context c2 = dbhqVar.c();
        dbhqVar.c();
        f.c(c2, dbhr.a(1));
        f.a().thenAccept(new Consumer(this) { // from class: dbej
            private final dbem a;

            {
                this.a = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dbem dbemVar = this.a;
                dbemVar.f = (Material) obj;
                if (dbemVar.g == null) {
                    dbemVar.a(dbemVar.f);
                }
            }
        }).exceptionally(dbek.a);
    }

    private static FloatBuffer c() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(l);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    public final void a(Material material) {
        this.g = material;
        if (!this.h) {
            return;
        }
        dbes dbesVar = this.e;
        dbjb.c(dbesVar);
        material.e("cameraTexture", dbesVar);
        if (this.n == -1) {
            this.n = EntityManager.get().create();
            RenderableManager.Builder builder = new RenderableManager.Builder(1);
            builder.castShadows(false);
            builder.receiveShadows(false);
            builder.culling(false);
            builder.priority(7);
            builder.geometry(0, RenderableManager.PrimitiveType.TRIANGLES, this.b, this.o);
            Material material2 = this.g;
            dbjb.c(material2);
            builder.material(0, material2.h());
            builder.build(EngineInstance.a().a, this.n);
            this.m.addEntity(this.n);
            dbhs.b().f.a(this, new dbel(this.m, this.n, this.o, this.b));
            return;
        }
        RenderableManager m = EngineInstance.a().m();
        m.setMaterialInstanceAt(m.getInstance(this.n), 0, material.h());
    }

    public final void b() {
        for (int i2 = 1; i2 < 6; i2 += 2) {
            FloatBuffer floatBuffer = this.d;
            floatBuffer.put(i2, 1.0f - floatBuffer.get(i2));
        }
    }
}
