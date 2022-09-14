package com.facebook.imagepipeline.h;

import com.facebook.common.d.i;
import com.facebook.imagepipeline.i.g;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
/* compiled from: SimpleProgressiveJpegConfig.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f2701a;

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes.dex */
    public interface b {
        List<Integer> a();

        int b();
    }

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes.dex */
    private static class a implements b {
        @Override // com.facebook.imagepipeline.h.f.b
        public int b() {
            return 0;
        }

        private a() {
        }

        @Override // com.facebook.imagepipeline.h.f.b
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }
    }

    public f() {
        this(new a());
    }

    public f(b bVar) {
        this.f2701a = (b) i.a(bVar);
    }

    @Override // com.facebook.imagepipeline.h.d
    public int a(int i) {
        List<Integer> a2 = this.f2701a.a();
        if (a2 == null || a2.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (a2.get(i2).intValue() > i) {
                return a2.get(i2).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.facebook.imagepipeline.h.d
    public g b(int i) {
        return com.facebook.imagepipeline.i.f.a(i, i >= this.f2701a.b(), false);
    }
}
