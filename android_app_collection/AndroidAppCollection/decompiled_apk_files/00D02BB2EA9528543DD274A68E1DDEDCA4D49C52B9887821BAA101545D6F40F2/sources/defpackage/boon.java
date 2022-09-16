package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: boon  reason: default package */
/* loaded from: classes3.dex */
public final class boon {
    public final Context a;
    public final cqkj b;
    public final List<boou> c;
    public bnyr d;
    public boom e;

    public boon(Context context, cqkj cqkjVar, List<boou> list) {
        this.a = context;
        this.c = list == null ? dchl.a() : list;
        this.b = cqkjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(boon boonVar) {
        boonVar.d = null;
    }

    public final void a() {
        bnyr bnyrVar = this.d;
        if (bnyrVar != null && bnyrVar.isShowing()) {
            this.d.dismiss();
        }
        this.d = null;
    }

    public final void b(boou boouVar) {
        boouVar.u();
        this.c.remove(boouVar);
        boom boomVar = this.e;
        if (boomVar != null) {
            boomVar.s(boouVar);
        }
    }

    public final void c(boou boouVar, booq booqVar) {
        if (this.d != null) {
            return;
        }
        boouVar.f(new boog(this));
        boouVar.g(new booh(this, boouVar, booqVar));
        bnyr bnyrVar = new bnyr(this.a, this.b, boouVar);
        this.d = bnyrVar;
        bnyrVar.setOnCancelListener(new booi(this));
        this.d.show();
    }
}
