package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Engine {
    private final LightManager mLightManager;
    private long mNativeObject;
    private final RenderableManager mRenderableManager;
    private final TransformManager mTransformManager;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Backend {
        DEFAULT,
        OPENGL,
        VULKAN,
        METAL,
        NOOP
    }

    private Engine(long j) {
        this.mNativeObject = j;
        this.mTransformManager = new TransformManager(nGetTransformManager(j));
        this.mLightManager = new LightManager(nGetLightManager(j));
        this.mRenderableManager = new RenderableManager(nGetRenderableManager(j));
    }

    private void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public static Engine create() {
        long nCreateEngine = nCreateEngine(0L, 0L);
        if (nCreateEngine == 0) {
            throw new IllegalStateException("Couldn't create Engine");
        }
        return new Engine(nCreateEngine);
    }

    private static native long nCreateCamera(long j);

    private static native long nCreateCameraWithEntity(long j, int i);

    private static native long nCreateEngine(long j, long j2);

    private static native long nCreateFence(long j);

    private static native long nCreateRenderer(long j);

    private static native long nCreateScene(long j);

    private static native long nCreateSwapChain(long j, Object obj, long j2);

    private static native long nCreateSwapChainFromRawPointer(long j, long j2, long j3);

    private static native long nCreateSwapChainHeadless(long j, int i, int i2, long j2);

    private static native long nCreateView(long j);

    private static native void nDestroyCamera(long j, long j2);

    private static native void nDestroyEngine(long j);

    private static native void nDestroyEntity(long j, int i);

    private static native void nDestroyFence(long j, long j2);

    private static native void nDestroyIndexBuffer(long j, long j2);

    private static native void nDestroyIndirectLight(long j, long j2);

    private static native void nDestroyMaterial(long j, long j2);

    private static native void nDestroyMaterialInstance(long j, long j2);

    private static native void nDestroyRenderTarget(long j, long j2);

    private static native void nDestroyRenderer(long j, long j2);

    private static native void nDestroyScene(long j, long j2);

    private static native void nDestroySkybox(long j, long j2);

    private static native void nDestroyStream(long j, long j2);

    private static native void nDestroySwapChain(long j, long j2);

    private static native void nDestroyTexture(long j, long j2);

    private static native void nDestroyVertexBuffer(long j, long j2);

    private static native void nDestroyView(long j, long j2);

    private static native void nFlushAndWait(long j);

    private static native long nGetBackend(long j);

    private static native long nGetLightManager(long j);

    private static native long nGetRenderableManager(long j);

    private static native long nGetTransformManager(long j);

    public Camera createCamera() {
        long nCreateCamera = nCreateCamera(getNativeObject());
        if (nCreateCamera == 0) {
            throw new IllegalStateException("Couldn't create Camera");
        }
        return new Camera(nCreateCamera);
    }

    public Fence createFence() {
        long nCreateFence = nCreateFence(getNativeObject());
        if (nCreateFence == 0) {
            throw new IllegalStateException("Couldn't create Fence");
        }
        return new Fence(nCreateFence);
    }

    public Renderer createRenderer() {
        long nCreateRenderer = nCreateRenderer(getNativeObject());
        if (nCreateRenderer == 0) {
            throw new IllegalStateException("Couldn't create Renderer");
        }
        return new Renderer(this, nCreateRenderer);
    }

    public Scene createScene() {
        long nCreateScene = nCreateScene(getNativeObject());
        if (nCreateScene == 0) {
            throw new IllegalStateException("Couldn't create Scene");
        }
        return new Scene(nCreateScene);
    }

    public SwapChain createSwapChainFromNativeSurface(NativeSurface nativeSurface, long j) {
        long nCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(getNativeObject(), nativeSurface.getNativeObject(), j);
        if (nCreateSwapChainFromRawPointer == 0) {
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        return new SwapChain(nCreateSwapChainFromRawPointer, nativeSurface);
    }

    public View createView() {
        long nCreateView = nCreateView(getNativeObject());
        if (nCreateView == 0) {
            throw new IllegalStateException("Couldn't create View");
        }
        return new View(nCreateView);
    }

    public void destroy() {
        nDestroyEngine(getNativeObject());
        clearNativeObject();
    }

    public void destroyCamera(Camera camera) {
        nDestroyCamera(getNativeObject(), camera.getNativeObject());
        camera.clearNativeObject();
    }

    public void destroyEntity(int i) {
        nDestroyEntity(getNativeObject(), i);
    }

    public void destroyFence(Fence fence) {
        nDestroyFence(getNativeObject(), fence.getNativeObject());
        fence.clearNativeObject();
    }

    public void destroyIndexBuffer(IndexBuffer indexBuffer) {
        nDestroyIndexBuffer(getNativeObject(), indexBuffer.getNativeObject());
        indexBuffer.clearNativeObject();
    }

    public void destroyIndirectLight(IndirectLight indirectLight) {
        nDestroyIndirectLight(getNativeObject(), indirectLight.getNativeObject());
        indirectLight.clearNativeObject();
    }

    public void destroyMaterial(Material material) {
        nDestroyMaterial(getNativeObject(), material.getNativeObject());
        material.clearNativeObject();
    }

    public void destroyMaterialInstance(MaterialInstance materialInstance) {
        nDestroyMaterialInstance(getNativeObject(), materialInstance.getNativeObject());
        materialInstance.clearNativeObject();
    }

    public void destroyRenderTarget(RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.getNativeObject());
        renderTarget.clearNativeObject();
    }

    public void destroyRenderer(Renderer renderer) {
        nDestroyRenderer(getNativeObject(), renderer.getNativeObject());
        renderer.clearNativeObject();
    }

    public void destroyScene(Scene scene) {
        nDestroyScene(getNativeObject(), scene.getNativeObject());
        scene.clearNativeObject();
    }

    public void destroySkybox(Skybox skybox) {
        nDestroySkybox(getNativeObject(), skybox.getNativeObject());
        skybox.clearNativeObject();
    }

    public void destroyStream(Stream stream) {
        nDestroyStream(getNativeObject(), stream.getNativeObject());
        stream.clearNativeObject();
    }

    public void destroySwapChain(SwapChain swapChain) {
        nDestroySwapChain(getNativeObject(), swapChain.getNativeObject());
        swapChain.clearNativeObject();
    }

    public void destroyTexture(Texture texture) {
        nDestroyTexture(getNativeObject(), texture.getNativeObject());
        texture.clearNativeObject();
    }

    public void destroyVertexBuffer(VertexBuffer vertexBuffer) {
        nDestroyVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject());
        vertexBuffer.clearNativeObject();
    }

    public void destroyView(View view) {
        nDestroyView(getNativeObject(), view.getNativeObject());
        view.clearNativeObject();
    }

    public void flushAndWait() {
        nFlushAndWait(getNativeObject());
    }

    public Backend getBackend() {
        return Backend.values()[(int) nGetBackend(getNativeObject())];
    }

    public LightManager getLightManager() {
        return this.mLightManager;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    public RenderableManager getRenderableManager() {
        return this.mRenderableManager;
    }

    public TransformManager getTransformManager() {
        return this.mTransformManager;
    }

    public boolean isValid() {
        return this.mNativeObject != 0;
    }

    public SwapChain createSwapChain(int i, int i2, long j) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        long nCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i, i2, j);
        if (nCreateSwapChainHeadless == 0) {
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        return new SwapChain(nCreateSwapChainHeadless, null);
    }

    public static Engine create(Backend backend) {
        long nCreateEngine = nCreateEngine(backend.ordinal(), 0L);
        if (nCreateEngine == 0) {
            throw new IllegalStateException("Couldn't create Engine");
        }
        return new Engine(nCreateEngine);
    }

    public Camera createCamera(int i) {
        long nCreateCameraWithEntity = nCreateCameraWithEntity(getNativeObject(), i);
        if (nCreateCameraWithEntity == 0) {
            throw new IllegalStateException("Couldn't create Camera");
        }
        return new Camera(nCreateCameraWithEntity);
    }

    public SwapChain createSwapChain(Object obj) {
        return createSwapChain(obj, 0L);
    }

    public SwapChain createSwapChain(Object obj, long j) {
        if (Platform.get().validateSurface(obj)) {
            long nCreateSwapChain = nCreateSwapChain(getNativeObject(), obj, j);
            if (nCreateSwapChain == 0) {
                throw new IllegalStateException("Couldn't create SwapChain");
            }
            return new SwapChain(nCreateSwapChain, obj);
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Invalid surface ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Engine create(Object obj) {
        if (Platform.get().validateSharedContext(obj)) {
            long nCreateEngine = nCreateEngine(0L, Platform.get().getSharedContextNativeHandle(obj));
            if (nCreateEngine == 0) {
                throw new IllegalStateException("Couldn't create Engine");
            }
            return new Engine(nCreateEngine);
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Invalid shared context ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
