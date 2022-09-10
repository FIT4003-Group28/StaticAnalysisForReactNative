package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@Deprecated
/* renamed from: jlm  reason: default package */
/* loaded from: classes7.dex */
public final class jlm {
    final jmi a;

    public jlm(View view, jll jllVar, View view2, jlk jlkVar, int i, jlj jljVar) {
        dbsk.s(view2);
        final jmi jmiVar = new jmi(view2.getContext());
        jmiVar.setWillNotDraw(false);
        jmiVar.setLayerType(1, jmiVar.a);
        jmiVar.setOnClickListener(new View.OnClickListener(jmiVar) { // from class: jmf
            private final jmi a;

            {
                this.a = jmiVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.a.a();
            }
        });
        this.a = jmiVar;
        jmiVar.e = view;
        jmiVar.b = new PopupWindow(jmiVar);
        jmiVar.b.setInputMethodMode(1);
        jmiVar.addView(view);
        jmiVar.setAnchor(view2, jllVar, jlkVar, i, jljVar);
    }

    public final void a() {
        this.a.a();
    }
}
