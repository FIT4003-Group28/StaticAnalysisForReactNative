package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: hoy  reason: default package */
/* loaded from: classes3.dex */
public final class hoy implements hop, hpy {
    public final Context a;
    public final hox b;
    public Bitmap c;
    public hov d;
    public hoo e;
    public View f;
    public TextView g;
    public RecyclerView h;
    public boolean i;
    public float j;

    public hoy(Context context, hox hoxVar) {
        this.a = context;
        this.b = hoxVar;
    }

    @Override // defpackage.hpy
    public final float a() {
        if (this.i) {
            return this.j;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.i) {
            return 0.0f;
        }
        return this.j;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.f;
    }

    @Override // defpackage.hop
    public final void d() {
        hqb.d(this);
        this.i = !this.i;
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }
}
