package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class e extends com.facebook.react.views.view.f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    private a f10096b;

    /* renamed from: c  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f10097c;

    /* renamed from: d  reason: collision with root package name */
    private c f10098d;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar);
    }

    public e(Context context) {
        super(context);
    }

    private void a() {
        com.th3rdwave.safeareacontext.a b2 = f.b(this);
        c a2 = f.a((ViewGroup) getRootView(), this);
        if (b2 == null || a2 == null) {
            return;
        }
        com.th3rdwave.safeareacontext.a aVar = this.f10097c;
        if (aVar != null && this.f10098d != null && aVar.a(b2) && this.f10098d.a(a2)) {
            return;
        }
        a aVar2 = this.f10096b;
        c.d.k.a.a.a(aVar2);
        aVar2.a(this, b2, a2);
        this.f10097c = b2;
        this.f10098d = a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        return true;
    }

    public void setOnInsetsChangeListener(a aVar) {
        this.f10096b = aVar;
    }
}
