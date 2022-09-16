package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: djb  reason: default package */
/* loaded from: classes3.dex */
public final class djb {
    public dll a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public final void a(View view) {
        if (!this.c || this.d) {
            return;
        }
        if (!this.e) {
            this.d = true;
            dll dllVar = this.a;
            if (dllVar != null) {
                dllVar.a(view, 1);
            }
            this.c = false;
        }
        this.e = false;
    }

    public final void b(View view) {
        if (!this.b && !this.d) {
            this.b = true;
            dll dllVar = this.a;
            if (dllVar != null) {
                dllVar.a(view, 0);
            }
        }
        this.e = true;
    }

    public final void c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (!this.d) {
                this.c = false;
                this.e = true;
                return;
            }
            this.b = false;
            this.c = false;
            this.d = false;
        } else if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || this.c || !this.b || this.d) {
        } else {
            this.d = true;
            dll dllVar = this.a;
            if (dllVar == null) {
                return;
            }
            dllVar.a(view, 1);
        }
    }

    public final void d() {
        this.c = true;
    }
}
