package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjy  reason: default package */
/* loaded from: classes.dex */
public final class afjy extends afhx {
    public static final dcqe a = dcqe.c("afjy");
    public static final dbsl<afga> d = afjt.a;
    public final Activity b;
    public final afgy c;
    private final String e;
    private final bvrb i;

    public afjy(Intent intent, @dzsi String str, gga ggaVar, bvrb bvrbVar, afgy afgyVar) {
        super(intent, str, afid.SHORT_URL);
        this.e = afhg.a(intent);
        this.b = ggaVar;
        this.i = bvrbVar;
        this.c = afgyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        d(this.e);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return null;
    }

    public final void d(String str) {
        this.i.b(new afjv(this, str), bvrj.BACKGROUND_THREADPOOL);
    }
}
