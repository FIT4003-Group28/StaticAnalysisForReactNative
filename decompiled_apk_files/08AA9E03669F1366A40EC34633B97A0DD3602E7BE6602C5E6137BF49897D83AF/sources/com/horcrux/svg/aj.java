package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.an;
import com.horcrux.svg.am;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextShadowNode.java */
/* loaded from: classes.dex */
public class aj extends o {

    /* renamed from: b  reason: collision with root package name */
    private a f4833b;

    /* renamed from: c  reason: collision with root package name */
    String f4834c = null;

    /* renamed from: d  reason: collision with root package name */
    String f4835d = null;
    ad e = ad.spacing;
    private com.facebook.react.bridge.am f;
    private com.facebook.react.bridge.am g;
    private com.facebook.react.bridge.am h;
    private com.facebook.react.bridge.am i;
    private com.facebook.react.bridge.am j;

    @com.facebook.react.uimanager.a.a(a = "textLength")
    public void setmTextLength(String str) {
        this.f4834c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.e = ad.valueOf(str);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "alignmentBaseline")
    public void setMethod(String str) {
        this.f4833b = a.a(str);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "baselineShift")
    public void setBaselineShift(String str) {
        this.f4835d = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f4833b = a.a(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f4833b = a.baseline;
            }
            try {
                this.f4835d = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f4835d = null;
            }
        } else {
            this.f4833b = a.baseline;
            this.f4835d = null;
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "rotate")
    public void setRotate(com.facebook.react.bridge.am amVar) {
        this.h = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "deltaX")
    public void setDeltaX(com.facebook.react.bridge.am amVar) {
        this.i = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "deltaY")
    public void setDeltaY(com.facebook.react.bridge.am amVar) {
        this.j = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "positionX")
    public void setPositionX(com.facebook.react.bridge.am amVar) {
        this.f = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "positionY")
    public void setPositionY(com.facebook.react.bridge.am amVar) {
        this.g = amVar;
        markUpdated();
    }

    @Override // com.horcrux.svg.o
    @com.facebook.react.uimanager.a.a(a = "font")
    public void setFont(an anVar) {
        this.f4886a = anVar;
        markUpdated();
    }

    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        if (f > 0.01f) {
            a(canvas);
            clip(canvas, paint);
            a(canvas, paint);
            a(canvas, paint, f);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        a(canvas);
        Path a2 = a(canvas, paint);
        e();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a j() {
        a aVar;
        if (this.f4833b == null) {
            for (com.facebook.react.uimanager.w parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof aj) && (aVar = ((aj) parent).f4833b) != null) {
                    this.f4833b = aVar;
                    return aVar;
                }
            }
        }
        if (this.f4833b == null) {
            this.f4833b = a.baseline;
        }
        return this.f4833b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        String str;
        if (this.f4835d == null) {
            for (com.facebook.react.uimanager.w parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof aj) && (str = ((aj) parent).f4835d) != null) {
                    this.f4835d = str;
                    return str;
                }
            }
        }
        return this.f4835d;
    }

    void e() {
        traverseChildren(new am.a() { // from class: com.horcrux.svg.aj.1
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                ((aj) amVar).e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a(Canvas canvas, Paint paint) {
        c();
        Path path = super.getPath(canvas, paint);
        d();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.o
    public void c() {
        b().a(!(this instanceof ag) && !(this instanceof aa), this, this.f4886a, this.f, this.g, this.i, this.j, this.h);
    }
}
