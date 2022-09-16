package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaah  reason: default package */
/* loaded from: classes.dex */
public final class aaah extends xo {
    private final Context d;
    private final boolean e;
    private List f = null;
    private aaan g;
    private aaar h;

    public aaah(Context context, boolean z) {
        this.d = context;
        this.e = z;
    }

    @Override // defpackage.xo
    public final int b() {
        List list = this.f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return ((zza) this.f.get(i)).b.ordinal();
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        return this.g.a(this.d, viewGroup, zyz.values()[i], this.e);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        return i;
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        this.g.b(this.d, (zza) this.f.get(i), yoVar, this.h);
    }

    public final void w(List list, aaan aaanVar, aaar aaarVar) {
        this.g = aaanVar;
        aaarVar.getClass();
        this.h = aaarVar;
        if (this.f != list) {
            list.getClass();
            this.f = list;
            mr();
        }
    }
}
