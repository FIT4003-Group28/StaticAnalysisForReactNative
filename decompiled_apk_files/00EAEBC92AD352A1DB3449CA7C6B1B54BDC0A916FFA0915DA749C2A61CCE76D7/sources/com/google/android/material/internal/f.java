package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private float f8143c;

    /* renamed from: f  reason: collision with root package name */
    private c.e.a.c.x.d f8146f;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f8141a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.c.x.f f8142b = new a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8144d = true;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f8145e = new WeakReference<>(null);

    /* loaded from: classes.dex */
    class a extends c.e.a.c.x.f {
        a() {
        }

        @Override // c.e.a.c.x.f
        public void a(int i) {
            f.this.f8144d = true;
            b bVar = (b) f.this.f8145e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c.e.a.c.x.f
        public void a(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            f.this.f8144d = true;
            b bVar = (b) f.this.f8145e.get();
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        a(bVar);
    }

    private float a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f8141a.measureText(charSequence, 0, charSequence.length());
    }

    public float a(String str) {
        if (!this.f8144d) {
            return this.f8143c;
        }
        this.f8143c = a((CharSequence) str);
        this.f8144d = false;
        return this.f8143c;
    }

    public c.e.a.c.x.d a() {
        return this.f8146f;
    }

    public void a(Context context) {
        this.f8146f.b(context, this.f8141a, this.f8142b);
    }

    public void a(c.e.a.c.x.d dVar, Context context) {
        if (this.f8146f != dVar) {
            this.f8146f = dVar;
            if (dVar != null) {
                dVar.c(context, this.f8141a, this.f8142b);
                b bVar = this.f8145e.get();
                if (bVar != null) {
                    this.f8141a.drawableState = bVar.getState();
                }
                dVar.b(context, this.f8141a, this.f8142b);
                this.f8144d = true;
            }
            b bVar2 = this.f8145e.get();
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            bVar2.onStateChange(bVar2.getState());
        }
    }

    public void a(b bVar) {
        this.f8145e = new WeakReference<>(bVar);
    }

    public void a(boolean z) {
        this.f8144d = z;
    }

    public TextPaint b() {
        return this.f8141a;
    }
}
