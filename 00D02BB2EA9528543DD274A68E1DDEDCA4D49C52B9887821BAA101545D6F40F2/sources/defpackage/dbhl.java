package defpackage;

import com.google.android.filament.EntityManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: PG */
/* renamed from: dbhl  reason: default package */
/* loaded from: classes5.dex */
public final class dbhl {
    public final dbdx a;
    public final dbhe b;
    public int c;
    public int d = 0;
    public dbhk e;
    public dbdz f;
    private dbhq g;
    private int h;
    private dbdz i;

    public dbhl(dbdx dbdxVar, dbhe dbheVar) {
        this.c = 0;
        this.h = 0;
        dbjb.d(dbdxVar, "Parameter \"transformProvider\" was null.");
        this.a = dbdxVar;
        this.b = dbheVar;
        dbet a = EngineInstance.a();
        int create = EntityManager.get().create();
        a.k().create(create);
        this.c = create;
        dbdz e = e();
        if (e != null) {
            dbet a2 = EngineInstance.a();
            int i = this.c;
            int create2 = EntityManager.get().create();
            TransformManager k = a2.k();
            k.create(create2, k.getInstance(i), e.b);
            this.h = create2;
        }
        dbhs.b().i.a(this, new dbhj(this.c, this.h));
    }

    public final int a() {
        int i = this.h;
        return i == 0 ? this.c : i;
    }

    public final dbhx b() {
        dbhe dbheVar = this.b;
        if (dbheVar instanceof dbgt) {
            return ((dbgt) dbheVar).b;
        }
        return null;
    }

    public final void c(dbhq dbhqVar) {
        dbhqVar.f(this);
        this.g = dbhqVar;
        this.b.m(dbhqVar);
    }

    public final void d() {
        dbhq dbhqVar = this.g;
        if (dbhqVar != null) {
            dbhqVar.g(this);
            this.b.n();
        }
    }

    public final dbdz e() {
        dbdz dbdzVar = this.i;
        if (dbdzVar != null) {
            return dbdzVar;
        }
        dbho dbhoVar = (dbho) this.b.c;
        float f = dbhoVar.a;
        dbeb dbebVar = new dbeb(dbhoVar.b);
        if (f == 1.0f && dbeb.k(dbebVar, dbeb.l())) {
            return null;
        }
        dbdz dbdzVar2 = new dbdz();
        this.i = dbdzVar2;
        dbdzVar2.a(dbdz.a);
        float[] fArr = dbdzVar2.b;
        fArr[0] = f;
        fArr[5] = f;
        fArr[10] = f;
        this.i.g(dbebVar);
        return this.i;
    }

    public final void f(boolean z) {
        int i;
        dbgt e;
        dbhl dbhlVar;
        dbdz A;
        dbda dbdaVar;
        dbhk dbhkVar;
        dbhe dbheVar = this.b;
        if (!(dbheVar instanceof dbgt)) {
            return;
        }
        dbgt dbgtVar = (dbgt) dbheVar;
        dbhx b = b();
        if (b == null) {
            return;
        }
        if (!z && !b.b(dbgtVar) && ((dbhkVar = this.e) == null || !((dbcz) dbhkVar).c.d)) {
            return;
        }
        int f = b.f();
        RenderableManager m = EngineInstance.a().m();
        int renderableManager = m.getInstance(a());
        FloatBuffer floatBuffer = b.e;
        dbhk dbhkVar2 = this.e;
        if (dbhkVar2 != null) {
            dbcz dbczVar = (dbcz) dbhkVar2;
            dbhx z2 = dbczVar.c.z();
            if (z2 != null && (e = dbczVar.c.e()) != null) {
                FloatBuffer floatBuffer2 = null;
                for (int i2 = 0; i2 < z2.f(); i2++) {
                    if (i2 < z2.f()) {
                        int e2 = z2.d.e(i2);
                        dbcy dbcyVar = dbczVar.c.a.get(e.a(e2));
                        if (dbcyVar != null && dbcyVar.a.n && dbcyVar.b) {
                            if (floatBuffer2 == null) {
                                FloatBuffer floatBuffer3 = dbczVar.a;
                                if (floatBuffer3 == null || floatBuffer3.limit() != floatBuffer.limit()) {
                                    dbczVar.a = ByteBuffer.allocateDirect(floatBuffer.limit() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                }
                                floatBuffer2 = dbczVar.a;
                                dbjb.c(floatBuffer2);
                                floatBuffer2.put(floatBuffer);
                                floatBuffer.rewind();
                            }
                            dbcm dbcmVar = dbcyVar.a;
                            dbhx z3 = dbczVar.c.z();
                            if (z3 != null && (dbhlVar = dbczVar.c.p) != null) {
                                dbdz dbdzVar = dbczVar.b;
                                if (e2 < z3.e()) {
                                    dbhx.h(dbdzVar.b, z3.c.a(e2));
                                    dbcm dbcmVar2 = dbcmVar.f;
                                    if (dbcmVar2 == null || dbcmVar2 == (dbdaVar = dbczVar.c)) {
                                        A = dbcmVar.A();
                                    } else {
                                        dbdz.h(dbdaVar.B(), dbcmVar.E(), dbczVar.c.b);
                                        A = dbczVar.c.b;
                                    }
                                    dbdz dbdzVar2 = dbhlVar.f;
                                    if (dbdzVar2 == null) {
                                        dbdz e3 = dbhlVar.e();
                                        if (e3 == null) {
                                            dbdzVar2 = null;
                                        } else {
                                            dbdz dbdzVar3 = new dbdz();
                                            dbhlVar.f = dbdzVar3;
                                            dbdz.j(e3, dbdzVar3);
                                            dbdzVar2 = dbhlVar.f;
                                        }
                                    }
                                    if (dbdzVar2 != null) {
                                        dbdz.h(dbdzVar2, A, dbczVar.c.b);
                                        A = dbczVar.c.b;
                                    }
                                    dbdz.h(A, dbczVar.b, dbczVar.c.b);
                                    int i3 = i2 * 16;
                                    if (floatBuffer2.position() != i3) {
                                        floatBuffer2.position(i3);
                                    }
                                    floatBuffer2.put(dbczVar.c.b.b);
                                } else {
                                    int e4 = z3.e();
                                    StringBuilder sb = new StringBuilder(71);
                                    sb.append("boneIndex is out of range. boneIndex=");
                                    sb.append(e2);
                                    sb.append(", boneCount=");
                                    sb.append(e4);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    } else {
                        int f2 = z2.f();
                        StringBuilder sb2 = new StringBuilder(71);
                        sb2.append("index is out of range. index=");
                        sb2.append(i2);
                        sb2.append(", materialBoneCount=");
                        sb2.append(f2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                i = 0;
                dbczVar.c.d = false;
                if (floatBuffer2 != null) {
                    floatBuffer2.rewind();
                    floatBuffer = floatBuffer2;
                } else {
                    dbczVar.a = null;
                }
                m.setBonesAsMatrices(renderableManager, floatBuffer, f, i);
            }
        }
        i = 0;
        m.setBonesAsMatrices(renderableManager, floatBuffer, f, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i, int i2) {
        RenderableManager m = EngineInstance.a().m();
        m.setBlendOrderAt(m.getInstance(a()), i, i2);
    }
}
