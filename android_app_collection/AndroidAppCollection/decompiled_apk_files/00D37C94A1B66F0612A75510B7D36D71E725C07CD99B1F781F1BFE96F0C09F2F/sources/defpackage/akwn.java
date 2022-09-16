package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.SecureRandom;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akwn */
/* loaded from: classes.dex */
public final class akwn implements akwp {
    private final yve a;
    private final axnm b;
    private final Map c = new ConcurrentHashMap();

    public akwn(yve yveVar, axnm axnmVar) {
        this.a = yveVar;
        this.b = axnmVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        zep.d("Error while writing settings", th);
    }

    @Override // defpackage.akwp
    public final boolean b(float f, final akvj akvjVar) {
        Boolean bool = (Boolean) this.c.get(akvjVar.h);
        if (bool != null) {
            return bool.booleanValue();
        }
        float floatValue = ((Float) akvjVar.i.a((awvl) this.a.c())).floatValue();
        if (floatValue < 0.0f) {
            floatValue = ((SecureRandom) this.b.get()).nextFloat();
        }
        float f2 = floatValue + f;
        boolean z = f2 >= 1.0f;
        final float f3 = f2 - ((int) f2);
        ylx.m(this.a.b(new ampg() { // from class: akwm
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return (awvl) ((aopa) akvj.this.j.a(((awvl) obj).mo52toBuilder(), Float.valueOf(f3))).mo39build();
            }
        }), aiuv.h);
        this.c.put(akvjVar.h, Boolean.valueOf(z));
        return z;
    }
}
