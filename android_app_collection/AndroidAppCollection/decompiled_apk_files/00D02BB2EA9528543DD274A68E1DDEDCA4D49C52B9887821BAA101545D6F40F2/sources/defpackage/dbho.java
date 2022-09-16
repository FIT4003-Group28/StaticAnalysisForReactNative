package defpackage;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbho  reason: default package */
/* loaded from: classes5.dex */
public final class dbho implements dbex {
    public IntBuffer c;
    public FloatBuffer d;
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public IndexBuffer h;
    public VertexBuffer i;
    public int k;
    private final dbeb l = dbeb.l();
    private final dbeb m = dbeb.l();
    public float a = 1.0f;
    public final dbeb b = dbeb.l();
    public final ArrayList<dbhn> j = new ArrayList<>();

    @Override // defpackage.dbex
    public final void a(dbeb dbebVar) {
        this.l.a(dbebVar);
    }

    @Override // defpackage.dbex
    public final dbeb b() {
        return new dbeb(this.l);
    }

    @Override // defpackage.dbex
    public final void c(dbeb dbebVar) {
        this.m.a(dbebVar);
    }

    @Override // defpackage.dbex
    public final dbeb d() {
        return new dbeb(this.m);
    }

    @Override // defpackage.dbex
    public final dbeb e() {
        return this.m.f(2.0f);
    }

    @Override // defpackage.dbex
    public final void f() {
        dbix.a();
        dbet a = EngineInstance.a();
        if (a == null || !a.a()) {
            return;
        }
        VertexBuffer vertexBuffer = this.i;
        if (vertexBuffer != null) {
            a.h(vertexBuffer);
            this.i = null;
        }
        IndexBuffer indexBuffer = this.h;
        if (indexBuffer == null) {
            return;
        }
        a.g(indexBuffer);
        this.h = null;
    }

    protected final void finalize() {
        try {
            dbie.a().execute(new Runnable(this) { // from class: dbhm
                private final dbho a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            });
        } catch (Exception unused) {
        } finally {
            super.finalize();
        }
    }
}
