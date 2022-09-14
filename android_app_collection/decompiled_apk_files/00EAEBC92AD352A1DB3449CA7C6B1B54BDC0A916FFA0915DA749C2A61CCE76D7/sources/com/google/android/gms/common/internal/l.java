package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f7040a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private com.google.android.gms.common.f f7041b;

    public l(com.google.android.gms.common.f fVar) {
        s.a(fVar);
        this.f7041b = fVar;
    }

    public int a(Context context, a.f fVar) {
        s.a(context);
        s.a(fVar);
        if (!fVar.c()) {
            return 0;
        }
        int d2 = fVar.d();
        int i = this.f7040a.get(d2, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f7040a.size()) {
                int keyAt = this.f7040a.keyAt(i2);
                if (keyAt > d2 && this.f7040a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.f7041b.a(context, d2);
        }
        this.f7040a.put(d2, i);
        return i;
    }

    public void a() {
        this.f7040a.clear();
    }
}
