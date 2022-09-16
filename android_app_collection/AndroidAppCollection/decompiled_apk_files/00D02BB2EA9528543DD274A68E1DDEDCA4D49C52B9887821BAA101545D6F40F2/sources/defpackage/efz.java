package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: efz  reason: default package */
/* loaded from: classes.dex */
public final class efz {
    public final ff a;
    public final gfq b;
    public final dxio<efh> c;
    public final dxio<cjqy> d;
    public final dxio<cjqq> e;
    public final dxio<axrx> f;
    public final dxio<cqho> g;
    public final dxio<cjmt> h;
    public final dxio<isj> i;
    public final dxio<bvsf> j;
    public final dxio<btpa> k;
    public final dxio<hut> l;
    public final dxio<huv> m;
    public final ita n;
    public final dxio<awnm> o;
    public final dxio<gdo> p;
    public final dxio<ckcw> q;
    public final dxio<bvkx> r;
    public final dxio<btbd> s;

    public efz(ff ffVar, ita itaVar, gfq gfqVar, dxio<efh> dxioVar, dxio<cjqy> dxioVar2, dxio<cjqq> dxioVar3, dxio<axrx> dxioVar4, dxio<cqho> dxioVar5, dxio<cjmt> dxioVar6, dxio<isj> dxioVar7, dxio<bvsf> dxioVar8, dxio<btpa> dxioVar9, dxio<hut> dxioVar10, dxio<huv> dxioVar11, dxio<awnm> dxioVar12, dxio<gdo> dxioVar13, dxio<ckcw> dxioVar14, dxio<bvkx> dxioVar15, dxio<btbd> dxioVar16) {
        this.a = ffVar;
        this.b = gfqVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = dxioVar5;
        this.h = dxioVar6;
        this.i = dxioVar7;
        this.j = dxioVar8;
        this.k = dxioVar9;
        this.l = dxioVar10;
        this.m = dxioVar11;
        this.n = itaVar;
        this.o = dxioVar12;
        this.p = dxioVar13;
        this.q = dxioVar14;
        this.r = dxioVar15;
        this.s = dxioVar16;
    }

    public static synchronized void a(@dzsi Intent intent) {
        synchronized (efz.class) {
            if (intent != null) {
                if (intent.getExtras() != null) {
                    try {
                        intent.getExtras().getBoolean("");
                    } catch (RuntimeException e) {
                        String valueOf = String.valueOf(intent);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Discarding Extras bundle for: ");
                        sb.append(valueOf);
                        sb.toString();
                        bvoo.k(e);
                        intent.replaceExtras(new Bundle());
                    }
                }
            }
        }
    }

    @dzsi
    public static String b(Activity activity) {
        Uri parse;
        if (activity.getIntent() != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                parse = activity.getReferrer();
            } else {
                Intent intent = activity.getIntent();
                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                if (uri != null) {
                    parse = uri;
                } else {
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    parse = stringExtra != null ? Uri.parse(stringExtra) : null;
                }
            }
            if (parse != null) {
                String uri2 = parse.toString();
                if (!dbsj.d(uri2)) {
                    return uri2;
                }
            }
        }
        return null;
    }
}
