package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class JavaModuleWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final q f3203a;

    /* renamed from: b  reason: collision with root package name */
    private final ModuleHolder f3204b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<? extends NativeModule> f3205c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<NativeModule.a> f3206d = new ArrayList<>();
    private final ArrayList<MethodDescriptor> e = new ArrayList<>();

    @com.facebook.k.a.a
    /* loaded from: classes.dex */
    public class MethodDescriptor {
        @com.facebook.k.a.a
        Method method;
        @com.facebook.k.a.a
        String name;
        @com.facebook.k.a.a
        String signature;
        @com.facebook.k.a.a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(q qVar, Class<? extends NativeModule> cls, ModuleHolder moduleHolder) {
        this.f3203a = qVar;
        this.f3204b = moduleHolder;
        this.f3205c = cls;
    }

    @com.facebook.k.a.a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.f3204b.getModule();
    }

    @com.facebook.k.a.a
    public String getName() {
        return this.f3204b.getName();
    }

    @com.facebook.k.a.a
    private void findMethods() {
        Method[] declaredMethods;
        com.facebook.m.a.a(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<? extends NativeModule> cls = this.f3205c;
        Class<? super Object> superclass = this.f3205c.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            al alVar = (al) method.getAnnotation(al.class);
            if (alVar != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                r rVar = new r(this, method, alVar.a());
                methodDescriptor.name = name;
                methodDescriptor.type = rVar.b();
                if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = rVar.a();
                    methodDescriptor.method = method;
                }
                this.f3206d.add(rVar);
                this.e.add(methodDescriptor);
            }
        }
        com.facebook.m.a.b(0L);
    }

    @com.facebook.k.a.a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.e.isEmpty()) {
            findMethods();
        }
        return this.e;
    }

    @com.facebook.k.a.a
    public NativeMap getConstants() {
        if (!this.f3204b.e()) {
            return null;
        }
        String name = getName();
        com.facebook.m.b.a(0L, "JavaModuleWrapper.getConstants").a("moduleName", name).a();
        ReactMarker.logMarker(ak.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        com.facebook.m.a.a(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        com.facebook.m.a.b(0L);
        com.facebook.m.a.a(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ak.CONVERT_CONSTANTS_START, name);
        try {
            return b.a(constants);
        } finally {
            ReactMarker.logMarker(ak.CONVERT_CONSTANTS_END);
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(ak.GET_CONSTANTS_END);
            com.facebook.m.b.a(0L).a();
        }
    }

    @com.facebook.k.a.a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (this.f3206d == null || i >= this.f3206d.size()) {
            return;
        }
        this.f3206d.get(i).a(this.f3203a, readableNativeArray);
    }
}
