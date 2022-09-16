package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
/* compiled from: UseShadowNode.java */
/* loaded from: classes.dex */
class ak extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private String f4837a;

    /* renamed from: b  reason: collision with root package name */
    private String f4838b;

    /* renamed from: c  reason: collision with root package name */
    private String f4839c;

    @com.facebook.react.uimanager.a.a(a = "href")
    public void setHref(String str) {
        this.f4837a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "width")
    public void setWidth(String str) {
        this.f4838b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "height")
    public void setHeight(String str) {
        this.f4839c = str;
        markUpdated();
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        am definedTemplate = getSvgShadowNode().getDefinedTemplate(this.f4837a);
        if (definedTemplate != null) {
            boolean z = definedTemplate instanceof RenderableShadowNode;
            if (z) {
                ((RenderableShadowNode) definedTemplate).mergeProperties(this);
            }
            int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas);
            clip(canvas, paint);
            if (definedTemplate instanceof z) {
                ((z) definedTemplate).a(canvas, paint, f, (float) relativeOnWidth(this.f4838b), (float) relativeOnHeight(this.f4839c));
            } else {
                definedTemplate.draw(canvas, paint, f * this.mOpacity);
            }
            definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
            if (!z) {
                return;
            }
            ((RenderableShadowNode) definedTemplate).resetProperties();
            return;
        }
        com.facebook.common.e.a.c("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f4837a + " is not defined.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        return new Path();
    }
}
