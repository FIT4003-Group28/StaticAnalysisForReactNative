package defpackage;

import android.view.DragEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajpe  reason: default package */
/* loaded from: classes.dex */
final class ajpe implements View.OnDragListener {
    final /* synthetic */ ajpf a;

    public ajpe(ajpf ajpfVar) {
        this.a = ajpfVar;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 3) {
            dragEvent.getY();
            return true;
        } else if (action != 4) {
            return true;
        } else {
            int y = (int) dragEvent.getY();
            ajpf ajpfVar = this.a;
            int i = ajpfVar.e ? y - 30 : y - 60;
            if (i < 36) {
                i = 36;
            }
            ajpfVar.b.setPadding(0, i, 0, 0);
            return true;
        }
    }
}
