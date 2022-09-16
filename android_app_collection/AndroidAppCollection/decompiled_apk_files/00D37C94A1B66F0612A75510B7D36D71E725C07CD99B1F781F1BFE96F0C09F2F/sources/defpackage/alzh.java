package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alzh  reason: default package */
/* loaded from: classes.dex */
public final class alzh implements alzj {
    boolean b;
    protected final Map a = new HashMap();
    boolean c = true;

    @Override // defpackage.alzj
    public final alzi a() {
        if (this.a.isEmpty()) {
            return this.b ? alzi.b : alzi.a;
        }
        return new alzi(new HashMap(this.a), this.b);
    }

    public final alzl b() {
        return a().g();
    }

    public final void c(alzl alzlVar) {
        boolean z = alzlVar.d;
        if (this.c) {
            this.b = z;
            for (Integer num : alzlVar.c) {
                this.a.put(Integer.valueOf(num.intValue()), alzi.b);
            }
            for (alzk alzkVar : alzlVar.b) {
                Map map = this.a;
                Integer valueOf = Integer.valueOf(alzkVar.b);
                alzl alzlVar2 = alzkVar.c;
                if (alzlVar2 == null) {
                    alzlVar2 = alzl.a;
                }
                map.put(valueOf, alzi.d(alzlVar2));
            }
            return;
        }
        throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
    }

    public final void d(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            e(iArr[i], alzi.b);
        }
    }

    public final void e(int i, alzi alziVar) {
        if (this.b) {
            alziVar = alziVar.f();
        }
        if (!alzi.a.equals(alziVar)) {
            this.a.put(Integer.valueOf(i), alziVar);
        } else {
            this.a.remove(Integer.valueOf(i));
        }
        this.c = false;
    }
}
