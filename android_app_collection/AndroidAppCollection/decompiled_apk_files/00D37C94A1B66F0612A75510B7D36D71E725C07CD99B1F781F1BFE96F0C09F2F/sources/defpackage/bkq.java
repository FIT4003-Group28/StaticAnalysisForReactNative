package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkq  reason: default package */
/* loaded from: classes2.dex */
public final class bkq {
    public final Class a;
    public final String b;
    public final Context c;
    public ArrayList d;
    public Executor e;
    public Executor f;
    public blq g;
    public boolean h;
    public boolean j;
    private Set l;
    public boolean i = true;
    public final bkr k = new bkr();

    public bkq(Context context, Class cls, String str) {
        this.c = context;
        this.a = cls;
        this.b = str;
    }

    public final void a(bla... blaVarArr) {
        if (this.l == null) {
            this.l = new HashSet();
        }
        for (int i = 0; i <= 0; i++) {
            bla blaVar = blaVarArr[i];
            this.l.add(Integer.valueOf(blaVar.a));
            this.l.add(Integer.valueOf(blaVar.b));
        }
        this.k.a(blaVarArr);
    }
}
