package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.List;
/* compiled from: PG */
/* renamed from: htj  reason: default package */
/* loaded from: classes3.dex */
public final class htj {
    public final Handler a;
    public final hvy b;
    public final hsq c;
    public final hrd d;
    public final hub e;
    public final hut f;
    public final hrw g;
    public final hvd h;
    public boolean i;
    public dp j;

    public htj(Handler handler, hvy hvyVar, hsq hsqVar, hrd hrdVar, hub hubVar, hut hutVar, hrw hrwVar, hvd hvdVar) {
        this.a = handler;
        this.b = hvyVar;
        this.c = hsqVar;
        this.d = hrdVar;
        this.e = hubVar;
        this.f = hutVar;
        this.g = hrwVar;
        this.h = hvdVar;
    }

    public static Object a(List list, Object obj) {
        return list.get((list.indexOf(obj) + 1) % list.size());
    }

    public final void b(String str) {
        new hti(new File(new File(this.j.mJ().getFilesDir(), zny.a), str), str).execute(new Void[0]);
    }
}
