package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cnhs  reason: default package */
/* loaded from: classes5.dex */
final class cnhs implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ cnht a;
    private final boolean b;
    private final View c;
    private final cmzy d;

    public cnhs(cnht cnhtVar, boolean z, View view, cmzy cmzyVar) {
        this.a = cnhtVar;
        this.b = z;
        this.c = view;
        this.d = cmzyVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View findViewById;
        ahp<RecyclerView, acl> cmzvVar;
        View findViewById2;
        int i = cnjc.a;
        cnht cnhtVar = this.a;
        cnhtVar.l.k(this.b, cnhtVar.z);
        cmzy cmzyVar = this.d;
        if (cmzyVar != null) {
            View view = this.c;
            int i2 = cmzyVar.a;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null) {
                if ((findViewById instanceof RecyclerView) && (cmzyVar.b >= 0 || cmzyVar.c != -1)) {
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    if (cmzyVar.c != -1) {
                        cmzvVar = new cmzu(cmzyVar);
                    } else {
                        cmzvVar = new cmzv(cmzyVar);
                    }
                    acl b = cmzyVar.b(recyclerView, cmzvVar);
                    if (b == null) {
                        findViewById = null;
                    } else {
                        findViewById = b.a;
                        int i3 = cmzyVar.d;
                        if (i3 != -1 && (findViewById2 = findViewById.findViewById(i3)) != null) {
                            findViewById = findViewById2;
                        }
                    }
                }
                if (findViewById != null && !findViewById.requestFocus()) {
                    findViewById.getViewTreeObserver().addOnTouchModeChangeListener(new cmzx(findViewById));
                }
            }
        }
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
