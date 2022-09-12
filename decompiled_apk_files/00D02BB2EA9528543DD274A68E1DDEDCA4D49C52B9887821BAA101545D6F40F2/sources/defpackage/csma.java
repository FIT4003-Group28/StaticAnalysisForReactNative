package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: csma  reason: default package */
/* loaded from: classes5.dex */
final class csma extends ams {
    private final csme f;
    private final View g;
    private final Rect h;
    private final String i;

    public csma(csme csmeVar, View view) {
        super(csmeVar);
        this.h = new Rect();
        this.f = csmeVar;
        this.g = view;
        this.i = csmeVar.getResources().getString(R.string.libraries_material_featurehighlight_dismiss);
    }

    private static final CharSequence B(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getAccessibilityClassName();
        }
        return view.getClass().getName();
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        csme csmeVar = this.f;
        int i = csme.z;
        if (!csmeVar.h.b() || !this.f.c.contains((int) f, (int) f2)) {
            if (this.f.h.e() && this.f.d.contains((int) f, (int) f2)) {
                return 2;
            }
            if (this.f.h.h() && this.f.e.contains((int) f, (int) f2)) {
                return 3;
            }
            if (this.f.b.contains((int) f, (int) f2)) {
                return 4;
            }
            return (!this.f.f(f, f2) || !this.f.f.c(f, f2)) ? 5 : -1;
        }
        return 1;
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        csme csmeVar = this.f;
        int i = csme.z;
        if (csmeVar.h.b()) {
            list.add(1);
        }
        if (this.f.h.e()) {
            list.add(2);
        }
        if (this.f.h.h()) {
            list.add(3);
        }
        list.add(4);
        list.add(5);
    }

    @Override // defpackage.ams
    protected final void w(int i, AccessibilityEvent accessibilityEvent) {
        if (i == 1) {
            csme csmeVar = this.f;
            int i2 = csme.z;
            accessibilityEvent.setContentDescription(csmeVar.h.c());
        } else if (i == 2) {
            csme csmeVar2 = this.f;
            int i3 = csme.z;
            accessibilityEvent.setContentDescription(csmeVar2.h.f());
        } else if (i == 3) {
            csme csmeVar3 = this.f;
            int i4 = csme.z;
            accessibilityEvent.setContentDescription(csmeVar3.h.i());
        } else if (i == 4) {
            accessibilityEvent.setContentDescription(this.g.getContentDescription());
            accessibilityEvent.setClassName(B(this.g));
        } else if (i != 5) {
        } else {
            accessibilityEvent.setContentDescription(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        if (i2 == 16) {
            if (i == 4) {
                csme csmeVar = this.f;
                int i3 = csme.z;
                csmeVar.g();
                return true;
            } else if (i != 5 && i != 3) {
                return false;
            } else {
                csme csmeVar2 = this.f;
                int i4 = csme.z;
                csmeVar2.h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        if (i == 1) {
            Rect rect = this.h;
            csme csmeVar = this.f;
            int i2 = csme.z;
            rect.set(csmeVar.c);
            pcVar.D(this.f.h.c());
            pcVar.B("android.widget.TextView");
        } else if (i == 2) {
            Rect rect2 = this.h;
            csme csmeVar2 = this.f;
            int i3 = csme.z;
            rect2.set(csmeVar2.d);
            pcVar.D(this.f.h.f());
            pcVar.B("android.widget.TextView");
        } else if (i != 3) {
            CharSequence charSequence = "";
            if (i == 4) {
                Rect rect3 = this.h;
                csme csmeVar3 = this.f;
                int i4 = csme.z;
                rect3.set(csmeVar3.b);
                View view = this.g;
                if (view instanceof TextView) {
                    pcVar.D(((TextView) view).getText());
                } else {
                    CharSequence contentDescription = view.getContentDescription();
                    if (contentDescription != null) {
                        charSequence = contentDescription;
                    }
                    pcVar.G(charSequence);
                }
                pcVar.B(B(this.g));
                pcVar.t(this.g.isClickable());
                pcVar.f(16);
            } else if (i == 5) {
                this.h.set(0, 0, this.f.getWidth(), this.f.getHeight());
                pcVar.G(this.i);
                pcVar.f(16);
            } else {
                this.h.setEmpty();
                pcVar.G(charSequence);
            }
        } else {
            Rect rect4 = this.h;
            csme csmeVar4 = this.f;
            int i5 = csme.z;
            rect4.set(csmeVar4.e);
            pcVar.D(this.f.h.i());
            pcVar.f(16);
        }
        pcVar.k(this.h);
    }
}
