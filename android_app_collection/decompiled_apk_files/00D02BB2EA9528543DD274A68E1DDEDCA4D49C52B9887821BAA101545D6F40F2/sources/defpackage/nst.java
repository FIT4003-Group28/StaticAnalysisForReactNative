package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: nst  reason: default package */
/* loaded from: classes7.dex */
public final class nst extends FrameLayout {
    @dzsi
    private nss a;
    private boolean b;
    @dzsi
    private WeakReference<View> c;

    public nst(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View a;
        WeakReference<View> weakReference = this.c;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null || !nol.a(view, i, rect)) {
            nss nssVar = this.a;
            if (nssVar != null && (a = nssVar.a(this)) != null && nol.a(a, i, rect)) {
                return true;
            }
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!this.b) {
            return;
        }
        this.c = new WeakReference<>(view2);
    }

    public void setDefaultViewProvider(@dzsi nss nssVar) {
        this.a = nssVar;
    }

    public void setRememberChildFocus(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        this.c = new WeakReference<>(z ? findFocus() : null);
    }

    public nst(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public nst(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
