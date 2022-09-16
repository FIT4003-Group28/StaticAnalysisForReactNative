package defpackage;

import android.content.Context;
import j$.util.concurrent.ThreadLocalRandom;
/* compiled from: PG */
/* renamed from: akvf  reason: default package */
/* loaded from: classes.dex */
public final class akvf {
    public final akve a;
    private final Context c;
    private final avfe d;
    private final avev e;
    private int f = -1;
    public float b = -1.0f;

    public akvf(Context context, aacz aaczVar, akve akveVar) {
        this.c = context;
        this.a = akveVar;
        apyy b = aaczVar.b();
        b = b == null ? apyy.a : b;
        atfw atfwVar = b.k;
        avff avffVar = (atfwVar == null ? atfw.a : atfwVar).x;
        avfe avfeVar = (avffVar == null ? avff.a : avffVar).k;
        this.d = avfeVar == null ? avfe.a : avfeVar;
        atfw atfwVar2 = b.k;
        avff avffVar2 = (atfwVar2 == null ? atfw.a : atfwVar2).x;
        avev avevVar = (avffVar2 == null ? avff.a : avffVar2).m;
        this.e = avevVar == null ? avev.a : avevVar;
    }

    public final float a() {
        return this.e.c;
    }

    public final int b() {
        int i = this.f;
        if (i < 0) {
            i = ThreadLocalRandom.current().nextInt(this.e.b);
            this.f = i;
        }
        return i * 1000;
    }

    public final int c() {
        return this.d.f;
    }

    public final int d() {
        return (int) this.d.d;
    }

    public final akvh e() {
        Context context = this.c;
        avfe avfeVar = this.d;
        int i = 0;
        if ((avfeVar.b & 8) != 0 && !avfeVar.e) {
            i = 1;
        }
        return new akvh(i, new akvi(context), akvg.a);
    }

    public final int f() {
        if (!this.d.c || d() <= 0) {
            return 1;
        }
        avev avevVar = this.e;
        return (avevVar.c <= 0.0f || avevVar.b <= 0) ? 2 : 3;
    }
}
