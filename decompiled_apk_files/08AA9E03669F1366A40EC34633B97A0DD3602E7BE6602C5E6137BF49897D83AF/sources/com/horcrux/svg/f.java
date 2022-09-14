package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.horcrux.svg.am;
/* compiled from: DefsShadowNode.java */
/* loaded from: classes.dex */
class f extends e {
    @Override // com.horcrux.svg.e, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        traverseChildren(new am.a() { // from class: com.horcrux.svg.f.1
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                amVar.markUpdateSeen();
                amVar.traverseChildren(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.am
    public void saveDefinition() {
        traverseChildren(new am.a() { // from class: com.horcrux.svg.f.2
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                amVar.saveDefinition();
            }
        });
    }
}
