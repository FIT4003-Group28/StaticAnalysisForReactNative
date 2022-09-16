package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: zbn  reason: default package */
/* loaded from: classes4.dex */
final class zbn implements Runnable {
    final /* synthetic */ zbp a;

    public zbn(zbp zbpVar) {
        this.a = zbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        zbp zbpVar = this.a;
        zbs zbsVar = zbpVar.d;
        if (zbsVar != null && (motionEvent = zbpVar.a) != null) {
            zbsVar.b(motionEvent);
        }
        this.a.c();
    }
}
