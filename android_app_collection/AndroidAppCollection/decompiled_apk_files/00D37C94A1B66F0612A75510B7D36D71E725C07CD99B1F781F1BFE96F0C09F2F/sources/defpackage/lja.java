package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: lja  reason: default package */
/* loaded from: classes3.dex */
public final class lja implements zbu {
    final /* synthetic */ yve a;
    final /* synthetic */ azqb b;
    final /* synthetic */ SharedPreferences c;

    public lja(yve yveVar, azqb azqbVar, SharedPreferences sharedPreferences) {
        this.a = yveVar;
        this.b = azqbVar;
        this.c = sharedPreferences;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        boolean equals = ((agvq) this.b.get()).u().equals(attl.LD);
        return anii.h(this.a.b(new ehf(equals, 12)), new ehf(equals, 13), anjk.a);
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        Boolean bool = (Boolean) obj;
        ankt b = this.a.b(new liw(bool, 2));
        if (bool.booleanValue()) {
            ((agvq) this.b.get()).E(attl.LD);
            return b;
        }
        final yve yveVar = this.a;
        final SharedPreferences sharedPreferences = this.c;
        return anii.i(b, new anir() { // from class: liz
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                Void r4 = (Void) obj2;
                return anii.h(yve.this.a(), new tvh(sharedPreferences, 1), anjk.a);
            }
        }, anjk.a);
    }
}
