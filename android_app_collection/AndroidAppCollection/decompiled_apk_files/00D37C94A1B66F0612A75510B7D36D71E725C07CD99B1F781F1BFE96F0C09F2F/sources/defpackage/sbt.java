package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: sbt  reason: default package */
/* loaded from: classes4.dex */
public abstract class sbt extends View implements scd {
    private String a;
    public boolean b;
    private final boolean c;

    public sbt(Context context) {
        super(context);
        new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = true;
        sby sbyVar = new sby();
        sbyVar.d();
        setLayoutParams(sbyVar);
    }

    public CharSequence a() {
        throw null;
    }

    public List b(int i, int i2, boolean z) {
        throw null;
    }

    public void d(sai saiVar, List list, sfa sfaVar) {
        boolean z = false;
        if (saiVar.f && saiVar.e > 0) {
            z = true;
        }
        this.b = z;
    }

    @Override // defpackage.scd
    public final String e() {
        return this.a;
    }

    @Override // defpackage.scd
    public final void f(String str) {
        this.a = str;
    }

    @Override // defpackage.scd
    public final boolean g() {
        return this.c;
    }
}
