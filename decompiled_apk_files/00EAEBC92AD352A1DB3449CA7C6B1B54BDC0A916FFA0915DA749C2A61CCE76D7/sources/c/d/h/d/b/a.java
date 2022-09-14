package c.d.h.d.b;

import android.graphics.drawable.Animatable;
import c.d.h.c.c;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private long f3013b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f3014c = -1;

    /* renamed from: d  reason: collision with root package name */
    private b f3015d;

    public a(b bVar) {
        this.f3015d = bVar;
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void a(String str, Object obj, Animatable animatable) {
        this.f3014c = System.currentTimeMillis();
        b bVar = this.f3015d;
        if (bVar != null) {
            bVar.a(this.f3014c - this.f3013b);
        }
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void b(String str, Object obj) {
        this.f3013b = System.currentTimeMillis();
    }
}
