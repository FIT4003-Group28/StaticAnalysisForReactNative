package com.google.android.apps.youtube.app.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubePlayerViewNotForReflection extends fdp implements ezg {
    private ezx a;
    private fej b;

    public YouTubePlayerViewNotForReflection(Context context) {
        this(context, null);
    }

    private final boolean f(View view) {
        return view == this.p && !this.a.g() && this.b != null;
    }

    public void extractSmartClipData(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.fek
    public final void kE(fej fejVar) {
        if (this.b == fejVar) {
            return;
        }
        this.b = fejVar;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aizi
    public final void kQ(View view, Rect rect, int i, int i2, int i3, int i4) {
        if (!f(view)) {
            super.kQ(view, rect, i, i2, i3, i4);
        } else {
            this.b.g(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aizi
    public final void kR(View view, Rect rect, int i, int i2) {
        if (!f(view)) {
            super.kR(view, rect, i, i2);
        } else {
            this.b.h(view);
        }
    }

    @Override // defpackage.aizi, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        ezxVar.getClass();
        if (ezxVar == this.a) {
            return;
        }
        this.a = ezxVar;
        afmy afmyVar = this.c;
        if (!afmyVar.G() || afmyVar.b.C().j || !ezxVar.l()) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        View view = this.p;
        if (view != null) {
            view.forceLayout();
        }
    }

    public YouTubePlayerViewNotForReflection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ezx.NONE;
        lj.V(this, 2);
    }
}
