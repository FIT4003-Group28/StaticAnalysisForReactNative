package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mhm  reason: default package */
/* loaded from: classes3.dex */
public final class mhm {
    public final aagi a;
    public final ayor b;
    public final ilv c;
    public final ilu d;
    public final Context e;
    public final TextView f;
    public aypg g;

    public mhm(aagi aagiVar, ayor ayorVar, ilv ilvVar, ilu iluVar, View view) {
        this.a = aagiVar;
        this.b = ayorVar;
        this.c = ilvVar;
        this.d = iluVar;
        this.e = view.getContext();
        this.f = (TextView) view.findViewById(R.id.subtitle);
    }

    public static ayoi a(ayoi ayoiVar, String str) {
        return ayoiVar.V(new fcr(str, 9)).af(lyd.l);
    }
}
