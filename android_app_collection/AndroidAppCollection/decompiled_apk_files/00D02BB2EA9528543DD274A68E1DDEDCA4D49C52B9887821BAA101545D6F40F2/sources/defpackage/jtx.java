package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: jtx  reason: default package */
/* loaded from: classes7.dex */
final class jtx implements Choreographer.FrameCallback {
    final /* synthetic */ jtz a;

    public jtx(jtz jtzVar) {
        this.a = jtzVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        jtz jtzVar = this.a;
        if (!jtzVar.u) {
            jtzVar.u = true;
            ((ckhe) jtzVar.c.a(ckee.j)).c();
        }
        jtz jtzVar2 = this.a;
        if (!jtzVar2.v) {
            if (jtzVar2.f.getChildCount() > 0) {
                jtz jtzVar3 = this.a;
                jtzVar3.v = true;
                ((ckhe) jtzVar3.c.a(ckee.m)).c();
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
