package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.w;
/* compiled from: PathShadowNode.java */
/* loaded from: classes.dex */
class v extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private Path f4917a;

    @com.facebook.react.uimanager.a.a(a = com.baidu.platform.comapi.d.f1997a)
    public void setD(String str) {
        this.f4917a = new w.a(str, this.mScale).a();
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f4917a;
    }

    public Path a() {
        return this.f4917a;
    }
}
