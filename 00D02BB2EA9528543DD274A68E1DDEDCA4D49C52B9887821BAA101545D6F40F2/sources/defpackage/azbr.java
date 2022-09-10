package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azbr  reason: default package */
/* loaded from: classes3.dex */
final class azbr implements degu<baad> {
    final /* synthetic */ azbs a;

    public azbr(azbs azbsVar) {
        this.a = azbsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.h(false);
        azbs azbsVar = this.a;
        final ayay ayayVar = azbsVar.c;
        final String e = dbsj.e(azbsVar.h);
        ayayVar.f.a(new Runnable(ayayVar, e) { // from class: ayas
            private final ayay a;
            private final String b;

            {
                this.a = ayayVar;
                this.b = e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ayay ayayVar2 = this.a;
                ayayVar2.h(ayayVar2.a.getString(R.string.ERROR_CREATING_NEW_LIST, new Object[]{this.b}));
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        cjta b;
        ddho ddhoVar;
        cjtd a;
        baad baadVar2 = baadVar;
        this.a.h(false);
        ayzh ayzhVar = this.a.j.a;
        if (ayzhVar.J() != null) {
            ayzhVar.Nw(baadVar2);
        }
        azbs azbsVar = this.a;
        cjqy cjqyVar = azbsVar.g;
        baac t = baadVar2.t();
        String str = null;
        cjtd bY = !azbsVar.f.isEmpty() ? azbsVar.f.get(0).bY() : null;
        if (bY != null) {
            str = bY.d;
        }
        baac baacVar = baac.PRIVATE;
        int ordinal = t.ordinal();
        if (ordinal == 0) {
            b = cjtd.b();
            ddhoVar = dtyb.z;
        } else if (ordinal == 1) {
            b = cjtd.b();
            ddhoVar = dtyb.B;
        } else if (ordinal != 2) {
            a = cjtd.b;
            cjqyVar.i(a);
        } else {
            b = cjtd.b();
            ddhoVar = dtyb.A;
        }
        b.d = ddhoVar;
        b.g(str);
        a = b.a();
        cjqyVar.i(a);
    }
}
