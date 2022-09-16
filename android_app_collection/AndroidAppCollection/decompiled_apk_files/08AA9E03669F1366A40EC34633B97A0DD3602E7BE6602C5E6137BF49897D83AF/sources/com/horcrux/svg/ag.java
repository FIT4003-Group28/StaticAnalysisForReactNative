package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextPathShadowNode.java */
/* loaded from: classes.dex */
public class ag extends aj {

    /* renamed from: b  reason: collision with root package name */
    private String f4826b;
    private ah f;
    private af g;
    private String h;
    private ae i = ae.align;
    private ai j = ai.exact;

    @Override // com.horcrux.svg.aj, com.horcrux.svg.o
    protected void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.o
    public void d() {
    }

    @com.facebook.react.uimanager.a.a(a = "href")
    public void setHref(String str) {
        this.f4826b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "startOffset")
    public void setStartOffset(String str) {
        this.h = str;
        markUpdated();
    }

    @Override // com.horcrux.svg.aj
    @com.facebook.react.uimanager.a.a(a = "method")
    public void setMethod(String str) {
        this.i = ae.valueOf(str);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "spacing")
    public void setSpacing(String str) {
        this.j = ai.valueOf(str);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "side")
    public void setSide(String str) {
        this.f = ah.valueOf(str);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "midLine")
    public void setSharp(String str) {
        this.g = af.valueOf(str);
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public af g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        return this.h;
    }

    @Override // com.horcrux.svg.aj, com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        a(canvas, paint, f);
    }

    public Path i() {
        am definedTemplate = getSvgShadowNode().getDefinedTemplate(this.f4826b);
        if (definedTemplate == null || definedTemplate.getClass() != v.class) {
            return null;
        }
        return ((v) definedTemplate).a();
    }

    @Override // com.horcrux.svg.aj, com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    protected Path getPath(Canvas canvas, Paint paint) {
        return a(canvas, paint);
    }
}
