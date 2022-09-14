package com.google.ar.sceneform.animation;

import java.nio.FloatBuffer;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModelSkeletonRig extends dbhx {
    public long a;
    private final FloatBuffer f;

    private ModelSkeletonRig(ModelSkeletonRig modelSkeletonRig) {
        super(modelSkeletonRig);
        FloatBuffer g = g(e());
        this.f = g;
        if (dbdg.a) {
            this.a = copySkeletonRigNative(modelSkeletonRig.a, g, this.e);
        }
        j();
    }

    private native long copySkeletonRigNative(long j, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    private native long createSkeletonRigNative(FloatBuffer floatBuffer, int i, FloatBuffer floatBuffer2, int[] iArr);

    public static native void destroySkeletonRigNative(long j);

    private final void j() {
        dbeo<dbhx> dbeoVar = AnimationEngine.a().b;
        if (this.a == 0) {
            return;
        }
        AnimationEngine.a().b.a(this, new dbdn(this.a));
    }

    private native void updateBoneTransformsNative(long j);

    @Override // defpackage.dbhx
    public final void a(int i, dbdz dbdzVar) {
        if (i >= e()) {
            int e = e();
            StringBuilder sb = new StringBuilder(71);
            sb.append("boneIndex is out of range. boneIndex=");
            sb.append(i);
            sb.append(", boneCount=");
            sb.append(e);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = i * 16;
        if (this.f.position() != i2) {
            this.f.position(i2);
        }
        this.f.get(dbdzVar.b);
    }

    @Override // defpackage.dbhx
    public final boolean b(dbgt dbgtVar) {
        return AnimationEngine.a().d.containsKey(dbgtVar);
    }

    @Override // defpackage.dbhx
    public final void c() {
        long j = this.a;
        if (j != 0) {
            updateBoneTransformsNative(j);
        }
    }

    @Override // defpackage.dbhx
    public final /* bridge */ /* synthetic */ dbhx d() {
        return new ModelSkeletonRig(this);
    }

    public ModelSkeletonRig(dbji dbjiVar, dbjh dbjhVar) {
        super(dbjiVar, dbjhVar);
        this.f = g(e());
        float[] fArr = new float[16];
        for (int i = 0; i < e(); i++) {
            FloatBuffer floatBuffer = this.f;
            h(fArr, dbjiVar.a(i));
            for (int i2 = 0; i2 < 16; i2++) {
                floatBuffer.put(fArr[i2]);
            }
        }
        int f = dbjhVar.f();
        int[] iArr = new int[f];
        for (int i3 = 0; i3 < f; i3++) {
            iArr[i3] = dbjhVar.e(i3);
        }
        if (dbdg.a) {
            this.a = createSkeletonRigNative(this.f, e(), this.e, iArr);
        }
        j();
    }
}
