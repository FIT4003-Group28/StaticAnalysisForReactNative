package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
/* compiled from: PG */
/* renamed from: cyx  reason: default package */
/* loaded from: classes3.dex */
public final class cyx {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public cyx(ComponentHost componentHost) {
        this.d = componentHost;
    }

    public final void a() {
        int i;
        if (this.a == null) {
            return;
        }
        int i2 = this.b;
        age ageVar = this.d.a;
        int c = ageVar == null ? 0 : ageVar.c();
        while (true) {
            if (i2 >= c) {
                i = this.c;
                break;
            }
            dms dmsVar = (dms) this.d.a.g(i2);
            Object obj = dmsVar.a;
            if (obj instanceof View) {
                i = i2 + 1;
                break;
            }
            if (dmsVar.c) {
                ((Drawable) obj).draw(this.a);
            }
            i2++;
        }
        this.b = i;
    }

    public final boolean b() {
        return this.a != null && this.b < this.c;
    }
}
