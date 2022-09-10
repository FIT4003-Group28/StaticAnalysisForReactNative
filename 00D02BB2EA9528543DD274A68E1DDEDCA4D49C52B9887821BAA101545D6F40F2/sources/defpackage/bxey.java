package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bxey  reason: default package */
/* loaded from: classes4.dex */
public final class bxey extends afhx {
    public static final dbsl<afga> b = bxex.a;
    public final dxio<ascb> a;
    private final bvrb c;

    public bxey(Intent intent, @dzsi String str, bvrb bvrbVar, dxio<ascb> dxioVar) {
        super(intent, str, afid.SHOW_SEARCH_ALONG_ROUTE);
        this.c = bvrbVar;
        this.a = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.c.b(new Runnable(this) { // from class: bxew
            private final bxey a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().s();
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_SHOW_SEARCH_ALONG_ROUTE_PAGE;
    }
}
