package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: svt  reason: default package */
/* loaded from: classes4.dex */
final class svt implements GestureDetector.OnDoubleTapListener {
    private final svs a;

    public svt(svs svsVar) {
        this.a = svsVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        List<syl> list;
        svs svsVar = this.a;
        if (motionEvent.getActionMasked() != 1 || (list = svsVar.e) == null) {
            return false;
        }
        for (syl sylVar : list) {
            tfi tfiVar = new tfi(motionEvent.getX(), motionEvent.getY());
            tcu tcuVar = sylVar.e.b;
            awmt a = sylVar.a.a();
            syt sytVar = sylVar.e;
            sylVar.e.d(tcuVar.b(a, syt.g((View) svsVar.a.get(), tfiVar, sylVar.b, sylVar.c, sylVar.d)).Q(), sylVar.d);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        svs svsVar = this.a;
        List<tdl> list = svsVar.d;
        if (list != null) {
            for (tdl tdlVar : list) {
                tdlVar.a((View) svsVar.a.get(), new tfi(motionEvent.getX(), motionEvent.getY()));
            }
            return false;
        }
        return false;
    }
}
