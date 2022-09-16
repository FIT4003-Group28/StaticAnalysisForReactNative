package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: sae  reason: default package */
/* loaded from: classes4.dex */
public final class sae extends shp {
    final /* synthetic */ sai a;
    private final sgg b = new sgg();

    public sae(sai saiVar) {
        this.a = saiVar;
    }

    @Override // defpackage.shp
    public final boolean a(MotionEvent motionEvent) {
        sai saiVar = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = this.a.y;
        sgg sggVar = this.b;
        int paddingLeft = ((int) x) - saiVar.getPaddingLeft();
        int paddingTop = ((int) y) - saiVar.getPaddingTop();
        ArrayList d = sbv.d();
        int childCount = saiVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else if (saiVar.getChildAt(childCount) instanceof scd) {
                d.addAll(((scd) saiVar.getChildAt(childCount)).b(paddingLeft, paddingTop, z));
            }
        }
        sggVar.a = !d.isEmpty();
        sggVar.b = saiVar.x.g(d);
        if (this.b.b) {
            sai saiVar2 = this.a;
            saiVar2.f = false;
            List g = sbv.g(saiVar2.u, new sbi(1));
            sgo.b(saiVar2);
            saiVar2.g(g);
        }
        return this.b.a;
    }
}
