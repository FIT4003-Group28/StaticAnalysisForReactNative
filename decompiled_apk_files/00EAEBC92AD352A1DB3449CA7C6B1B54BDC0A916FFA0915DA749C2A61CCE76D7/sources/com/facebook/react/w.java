package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Iterable<ModuleHolder> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f6413b;

        /* renamed from: com.facebook.react.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0136a implements Iterator<ModuleHolder> {

            /* renamed from: b  reason: collision with root package name */
            int f6414b = 0;

            C0136a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6414b < a.this.f6413b.size();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            /* renamed from: next */
            public ModuleHolder mo247next() {
                List list = a.this.f6413b;
                int i = this.f6414b;
                this.f6414b = i + 1;
                return new ModuleHolder((NativeModule) list.get(i));
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        a(List list) {
            this.f6413b = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0136a();
        }
    }

    public static Iterable<ModuleHolder> a(v vVar, ReactApplicationContext reactApplicationContext, r rVar) {
        c.d.d.e.a.a("ReactNative", vVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(vVar instanceof t ? ((t) vVar).a(reactApplicationContext, rVar) : vVar.createNativeModules(reactApplicationContext));
    }
}
