package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpod  reason: default package */
/* loaded from: classes5.dex */
public final class cpod extends cppy {
    final /* synthetic */ cpoj a;
    private final cpur b = new cpur();

    public cpod(cpoj cpojVar) {
        this.a = cpojVar;
    }

    @Override // defpackage.cppy
    public final boolean a(MotionEvent motionEvent) {
        List h;
        cpoj cpojVar = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = this.a.w;
        cpur cpurVar = this.b;
        int paddingLeft = ((int) x) - cpojVar.getPaddingLeft();
        int paddingTop = ((int) y) - cpojVar.getPaddingTop();
        ArrayList a = cpwi.a();
        int childCount = cpojVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else if ((cpojVar.getChildAt(childCount) instanceof cpqf) && (h = ((cpqf) cpojVar.getChildAt(childCount)).h(paddingLeft, paddingTop, z)) != null) {
                a.addAll(h);
            }
        }
        cpurVar.a = !a.isEmpty();
        cpurVar.b = cpojVar.v.a(cpojVar, a);
        if (this.b.b) {
            cpoj cpojVar2 = this.a;
            cpojVar2.m(cpojVar2.x);
        }
        return this.b.a;
    }
}
