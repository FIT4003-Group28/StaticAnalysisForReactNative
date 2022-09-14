package com.google.android.filament;

import com.google.android.filament.VertexBuffer;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RenderableManager {
    private static final String LOG_TAG = "Filament";
    private long mNativeObject;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                long j;
                try {
                    super.finalize();
                    j = this.mNativeObject;
                } catch (Throwable unused) {
                    j = this.mNativeObject;
                }
                RenderableManager.nDestroyBuilder(j);
            }
        }

        public Builder(int i) {
            long nCreateBuilder = RenderableManager.nCreateBuilder(i);
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Builder blendOrder(int i, int i2) {
            RenderableManager.nBuilderBlendOrder(this.mNativeBuilder, i, i2);
            return this;
        }

        public Builder boundingBox(Box box) {
            RenderableManager.nBuilderBoundingBox(this.mNativeBuilder, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
            return this;
        }

        public void build(Engine engine, int i) {
            if (RenderableManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i)) {
                return;
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Couldn't create Renderable component for entity ");
            sb.append(i);
            sb.append(", see log.");
            throw new IllegalStateException(sb.toString());
        }

        public Builder castShadows(boolean z) {
            RenderableManager.nBuilderCastShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder culling(boolean z) {
            RenderableManager.nBuilderCulling(this.mNativeBuilder, z);
            return this;
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject());
            return this;
        }

        public Builder layerMask(int i, int i2) {
            RenderableManager.nBuilderLayerMask(this.mNativeBuilder, i & 255, i2 & 255);
            return this;
        }

        public Builder material(int i, MaterialInstance materialInstance) {
            RenderableManager.nBuilderMaterial(this.mNativeBuilder, i, materialInstance.getNativeObject());
            return this;
        }

        public Builder morphing(boolean z) {
            RenderableManager.nBuilderMorphing(this.mNativeBuilder, z);
            return this;
        }

        public Builder priority(int i) {
            RenderableManager.nBuilderPriority(this.mNativeBuilder, i);
            return this;
        }

        public Builder receiveShadows(boolean z) {
            RenderableManager.nBuilderReceiveShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder skinning(int i) {
            RenderableManager.nBuilderSkinning(this.mNativeBuilder, i);
            return this;
        }

        public Builder skinning(int i, Buffer buffer) {
            if (RenderableManager.nBuilderSkinningBones(this.mNativeBuilder, i, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i2, int i3) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3);
            return this;
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i2, int i3, int i4, int i5) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3, i4, i5);
            return this;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum PrimitiveType {
        POINTS(0),
        LINES(1),
        TRIANGLES(4);
        
        private final int mType;

        PrimitiveType(int i) {
            this.mType = i;
        }

        public int getValue() {
            return this.mType;
        }
    }

    public RenderableManager(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBlendOrder(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCulling(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayerMask(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphing(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPriority(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReceiveShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinning(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nBuilderSkinningBones(long j, int i, Buffer buffer, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    private static native void nDestroy(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGetAxisAlignedBoundingBox(long j, int i, float[] fArr, float[] fArr2);

    private static native int nGetEnabledAttributesAt(long j, int i, int i2);

    private static native int nGetInstance(long j, int i);

    private static native long nGetMaterialAt(long j, int i, int i2);

    private static native long nGetMaterialInstanceAt(long j, int i, int i2);

    private static native int nGetPrimitiveCount(long j, int i);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsShadowCaster(long j, int i);

    private static native boolean nIsShadowReceiver(long j, int i);

    private static native void nSetAxisAlignedBoundingBox(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private static native void nSetBlendOrderAt(long j, int i, int i2, int i3);

    private static native int nSetBonesAsMatrices(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native int nSetBonesAsQuaternions(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native void nSetCastShadows(long j, int i, boolean z);

    private static native void nSetGeometryAt(long j, int i, int i2, int i3, int i4, int i5);

    private static native void nSetGeometryAt(long j, int i, int i2, int i3, long j2, long j3, int i4, int i5);

    private static native void nSetLayerMask(long j, int i, int i2, int i3);

    private static native void nSetMaterialInstanceAt(long j, int i, int i2, long j2);

    private static native void nSetMorphWeights(long j, int i, float[] fArr);

    private static native void nSetPriority(long j, int i, int i2);

    private static native void nSetReceiveShadows(long j, int i, boolean z);

    public void destroy(int i) {
        nDestroy(this.mNativeObject, i);
    }

    public Box getAxisAlignedBoundingBox(int i, Box box) {
        if (box == null) {
            box = new Box();
        }
        nGetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter(), box.getHalfExtent());
        return box;
    }

    public Set<VertexBuffer.VertexAttribute> getEnabledAttributesAt(int i, int i2) {
        int nGetEnabledAttributesAt = nGetEnabledAttributesAt(this.mNativeObject, i, i2);
        EnumSet noneOf = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
        VertexBuffer.VertexAttribute[] values = VertexBuffer.VertexAttribute.values();
        for (int i3 = 0; i3 < values.length; i3++) {
            if (((1 << i3) & nGetEnabledAttributesAt) != 0) {
                noneOf.add(values[i3]);
            }
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public int getInstance(int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public MaterialInstance getMaterialInstanceAt(int i, int i2) {
        return new MaterialInstance(nGetMaterialAt(this.mNativeObject, i, i2), nGetMaterialInstanceAt(this.mNativeObject, i, i2));
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public int getPrimitiveCount(int i) {
        return nGetPrimitiveCount(this.mNativeObject, i);
    }

    public boolean hasComponent(int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isShadowCaster(int i) {
        return nIsShadowCaster(this.mNativeObject, i);
    }

    public boolean isShadowReceiver(int i) {
        return nIsShadowReceiver(this.mNativeObject, i);
    }

    public void setAxisAlignedBoundingBox(int i, Box box) {
        nSetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
    }

    public void setBlendOrderAt(int i, int i2, int i3) {
        nSetBlendOrderAt(this.mNativeObject, i, i2, i3);
    }

    public void setBonesAsMatrices(int i, Buffer buffer, int i2, int i3) {
        if (nSetBonesAsMatrices(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setBonesAsQuaternions(int i, Buffer buffer, int i2, int i3) {
        if (nSetBonesAsQuaternions(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setCastShadows(int i, boolean z) {
        nSetCastShadows(this.mNativeObject, i, z);
    }

    public void setGeometryAt(int i, int i2, PrimitiveType primitiveType, int i3, int i4) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), i3, i4);
    }

    public void setLayerMask(int i, int i2, int i3) {
        nSetLayerMask(this.mNativeObject, i, i2, i3);
    }

    public void setMaterialInstanceAt(int i, int i2, MaterialInstance materialInstance) {
        int requiredAttributesAsInt = materialInstance.getMaterial().getRequiredAttributesAsInt();
        if ((nGetEnabledAttributesAt(this.mNativeObject, i, i2) & requiredAttributesAsInt) != requiredAttributesAsInt) {
            Platform platform = Platform.get();
            String valueOf = String.valueOf(getEnabledAttributesAt(i, i2));
            String valueOf2 = String.valueOf(materialInstance.getMaterial().getRequiredAttributes());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 134 + String.valueOf(valueOf2).length());
            sb.append("setMaterialInstanceAt() on primitive ");
            sb.append(i2);
            sb.append(" of Renderable at ");
            sb.append(i);
            sb.append(": declared attributes ");
            sb.append(valueOf);
            sb.append(" do no satisfy required attributes ");
            sb.append(valueOf2);
            platform.warn(sb.toString());
        }
        nSetMaterialInstanceAt(this.mNativeObject, i, i2, materialInstance.getNativeObject());
    }

    public void setMorphWeights(int i, float[] fArr) {
        nSetMorphWeights(this.mNativeObject, i, fArr);
    }

    public void setPriority(int i, int i2) {
        nSetPriority(this.mNativeObject, i, i2);
    }

    public void setReceiveShadows(int i, boolean z) {
        nSetReceiveShadows(this.mNativeObject, i, z);
    }

    public void setGeometryAt(int i, int i2, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), 0, indexBuffer.getIndexCount());
    }

    public void setGeometryAt(int i, int i2, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i3, int i4) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i3, i4);
    }
}
