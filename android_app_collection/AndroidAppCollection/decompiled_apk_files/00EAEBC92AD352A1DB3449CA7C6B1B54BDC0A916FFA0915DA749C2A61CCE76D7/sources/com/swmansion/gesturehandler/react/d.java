package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class d implements c.f.a.c {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<int[]> f9920a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<int[]> f9921b = new SparseArray<>();

    private int[] a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public void a() {
        this.f9920a.clear();
        this.f9921b.clear();
    }

    public void a(int i) {
        this.f9920a.remove(i);
        this.f9921b.remove(i);
    }

    public void a(c.f.a.b bVar, ReadableMap readableMap) {
        bVar.a(this);
        if (readableMap.hasKey("waitFor")) {
            this.f9920a.put(bVar.l(), a(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f9921b.put(bVar.l(), a(readableMap, "simultaneousHandlers"));
        }
    }

    @Override // c.f.a.c
    public boolean a(c.f.a.b bVar, c.f.a.b bVar2) {
        int[] iArr = this.f9921b.get(bVar.l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.l()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c.f.a.c
    public boolean b(c.f.a.b bVar, c.f.a.b bVar2) {
        int[] iArr = this.f9920a.get(bVar.l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.l()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c.f.a.c
    public boolean c(c.f.a.b bVar, c.f.a.b bVar2) {
        return false;
    }

    @Override // c.f.a.c
    public boolean d(c.f.a.b bVar, c.f.a.b bVar2) {
        return false;
    }
}
