package defpackage;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: gzr  reason: default package */
/* loaded from: classes3.dex */
final class gzr extends zmy {
    final /* synthetic */ gzt a;
    private final hay c;
    private final View d;
    private final gzf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzr(gzt gztVar, hay hayVar, View view, gzf gzfVar, zmv zmvVar) {
        super(gztVar.rb(), zmvVar);
        this.a = gztVar;
        this.c = hayVar;
        this.d = view;
        this.e = gzfVar;
    }

    @Override // defpackage.zmy, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        super.onTouch(view, motionEvent);
        zqy zqyVar = null;
        if (this.a.aO()) {
            gzt gztVar = this.a;
            if (gztVar.az) {
                Matrix transform = gztVar.ar.a.getTransform(null);
                transform.invert(transform);
                motionEvent.transform(transform);
            } else {
                return view.onTouchEvent(motionEvent);
            }
        }
        hay hayVar = this.c;
        View view2 = this.d;
        boolean z = !this.e.i();
        zqv a = hayVar.a();
        if (a != null) {
            zqyVar = a.a;
        }
        if (zqyVar != null) {
            zqyVar.a(view, motionEvent, view2, z);
            return true;
        }
        return view.onTouchEvent(motionEvent);
    }
}
