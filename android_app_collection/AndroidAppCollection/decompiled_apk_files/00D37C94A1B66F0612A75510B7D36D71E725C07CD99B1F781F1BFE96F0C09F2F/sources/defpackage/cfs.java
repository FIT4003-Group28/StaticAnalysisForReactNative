package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cfs  reason: default package */
/* loaded from: classes2.dex */
public final class cfs extends ContextWrapper {
    static final cgh a = new cgh();
    public final clb b;
    public final cgb c;
    public final List d;
    public final Map e;
    public final cki f;
    public final cfu g;
    public final int h;
    private final cfj i;
    private ctm j;

    public cfs(Context context, clb clbVar, cgb cgbVar, cfj cfjVar, Map map, List list, cki ckiVar, cfu cfuVar) {
        super(context.getApplicationContext());
        this.b = clbVar;
        this.c = cgbVar;
        this.i = cfjVar;
        this.d = list;
        this.e = map;
        this.f = ckiVar;
        this.g = cfuVar;
        this.h = 4;
    }

    public final synchronized ctm a() {
        if (this.j == null) {
            ctm a2 = this.i.a();
            a2.L();
            this.j = a2;
        }
        return this.j;
    }
}
