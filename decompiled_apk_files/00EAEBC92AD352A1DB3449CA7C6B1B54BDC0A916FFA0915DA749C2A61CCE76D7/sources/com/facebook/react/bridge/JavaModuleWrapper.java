package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
@a
/* loaded from: classes.dex */
public class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @a
    /* loaded from: classes.dex */
    public class MethodDescriptor {
        @a
        Method method;
        @a
        String name;
        @a
        String signature;
        @a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @a
    private void findMethods() {
        Method[] declaredMethods;
        com.facebook.systrace.a.a(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                methodDescriptor.type = javaMethodWrapper.getType();
                if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        com.facebook.systrace.a.a(0L);
    }

    @a
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        b.AbstractC0140b a2 = b.a(0L, "JavaModuleWrapper.getConstants");
        a2.a("moduleName", name);
        a2.a();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        com.facebook.systrace.a.a(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        com.facebook.systrace.a.a(0L);
        com.facebook.systrace.a.a(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            b.a(0L).a();
        }
    }

    @a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
    }
}
