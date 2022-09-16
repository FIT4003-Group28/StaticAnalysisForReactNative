package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: loh  reason: default package */
/* loaded from: classes3.dex */
public class loh extends ajxq {
    @Deprecated
    public int a;
    public arew b;
    private final Context c;

    public loh(Context context) {
        super(b(context));
        this.a = 0;
        this.c = context;
    }

    public static int b(Context context) {
        return context.getResources().getInteger(R.integer.grid_shelf_num_columns);
    }

    @Override // defpackage.ajxq, defpackage.ajxu
    public final int a() {
        if (this.b == null) {
            int i = this.a;
            return i > 0 ? i : this.d;
        }
        int i2 = this.c.getResources().getConfiguration().orientation;
        boolean y = zew.y(this.c);
        if (i2 != 2) {
            arew arewVar = this.b;
            return y ? arewVar.c : arewVar.b;
        }
        arew arewVar2 = this.b;
        return y ? arewVar2.e : arewVar2.d;
    }

    @Override // defpackage.ajxq
    public final void c(int i) {
        if (this.b != null || this.a > 0) {
            i = a();
        }
        super.c(i);
    }

    public void d() {
        c(b(this.c));
    }
}
