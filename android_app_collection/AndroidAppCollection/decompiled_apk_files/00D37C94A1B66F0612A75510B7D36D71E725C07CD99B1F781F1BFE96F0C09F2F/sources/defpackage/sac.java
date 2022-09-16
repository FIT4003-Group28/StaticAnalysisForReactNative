package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.chromium.net.PrivateKeyType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sac  reason: default package */
/* loaded from: classes4.dex */
public final class sac implements View.OnTouchListener {
    final /* synthetic */ sai a;

    public sac(sai saiVar) {
        this.a = saiVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sai saiVar = this.a;
        saiVar.k.onTouchEvent(motionEvent);
        boolean z = saiVar.l.onTouchEvent(motionEvent) || saiVar.k.isInProgress();
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (z || action != 1) {
            return z;
        }
        sca scaVar = saiVar.m;
        for (shp shpVar : scaVar.b) {
            sai saiVar2 = scaVar.a;
        }
        return false;
    }
}
