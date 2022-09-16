package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: aioa  reason: default package */
/* loaded from: classes.dex */
public final class aioa {
    public final aizp a;
    public final Context b;
    public final azqb c;
    public final int d;
    public final azqb e;
    public final ainv f;

    public aioa(Context context, azqb azqbVar, aizp aizpVar, int i, azqb azqbVar2) {
        this(context, azqbVar, aizpVar, i, azqbVar2, ainv.a);
    }

    public final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.b, 0, new Intent().setPackage(this.b.getPackageName()).setAction(str), zgd.M() | 134217728);
    }

    public final void b(fi fiVar, int i, int i2, PendingIntent pendingIntent, List list, boolean z) {
        fiVar.f(new fe(i, this.b.getText(i2), pendingIntent).a());
        if (z) {
            list.add(Integer.valueOf(fiVar.b.size() - 1));
        }
    }

    public aioa(Context context, azqb azqbVar, aizp aizpVar, int i, azqb azqbVar2, ainv ainvVar) {
        this.b = context;
        this.c = azqbVar;
        this.a = aizpVar;
        this.d = i;
        azqbVar2.getClass();
        this.e = azqbVar2;
        this.f = ainvVar;
    }
}
