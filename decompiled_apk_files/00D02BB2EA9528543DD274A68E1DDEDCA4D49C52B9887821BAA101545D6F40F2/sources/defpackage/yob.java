package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yob  reason: default package */
/* loaded from: classes7.dex */
public abstract class yob implements yni {
    public boolean c;

    @Override // defpackage.yni
    public Boolean g() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.yni
    public View.OnLayoutChangeListener h() {
        return new View.OnLayoutChangeListener(this) { // from class: yoa
            private final yob a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View a;
                yob yobVar = this.a;
                View a2 = cqhu.a(view, yob.a);
                if (a2 == null || (a = cqhu.a(view, yob.b)) == null) {
                    return;
                }
                boolean z = a.getMeasuredHeight() > a2.getMeasuredHeight();
                if (yobVar.c == z) {
                    return;
                }
                yobVar.c = z;
                cqkx.p(yobVar);
            }
        };
    }
}
