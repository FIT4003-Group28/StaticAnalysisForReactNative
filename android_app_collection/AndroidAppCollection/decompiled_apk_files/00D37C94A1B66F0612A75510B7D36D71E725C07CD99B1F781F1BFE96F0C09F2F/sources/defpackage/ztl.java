package defpackage;

import android.content.Context;
import com.google.research.xeno.effect.Effect;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ztl  reason: default package */
/* loaded from: classes4.dex */
public final class ztl implements zsx {
    public static final amup a = amup.m("PRESETS", avxu.EFFECT_SUBPACKAGE_ID_PRESET, "EXPRESSIVE", avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE, "UNSPECIFIED", avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
    public final zsy b;
    public boolean d;
    public zrh k;
    public zrs m;
    private final znk n;
    public final Object c = new Object();
    public final ztn e = new ztn();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final Object j = new Object();
    public final zth l = new zth();

    static {
        zoa.a();
    }

    public ztl(Context context, yqw yqwVar, hkl hklVar, zte zteVar, znk znkVar) {
        this.n = znkVar;
        zsy zsyVar = new zsy(context, yqwVar, this, true, zteVar);
        this.b = zsyVar;
        zsyVar.i = hklVar.j();
    }

    public final Effect a(String str) {
        String h = akzj.h(str);
        if (this.h.containsKey(h)) {
            return (Effect) this.h.get(h);
        }
        return null;
    }

    public final void b() {
        if (this.m == null || !this.d || this.g.size() <= 0) {
            return;
        }
        zrs zrsVar = this.m;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.g;
        HashMap hashMap = this.i;
        znk znkVar = this.n;
        zsc zscVar = zrsVar.a;
        ztl ztlVar = zrsVar.b;
        synchronized (zscVar.e) {
            if (zscVar.c) {
                zep.b("EffectsSettings already set, not setting XenoEffectsLoader Settings.");
            } else {
                zscVar.c = true;
                zscVar.h.f(ztlVar.b);
                synchronized (ztlVar.j) {
                    ztlVar.k = zscVar;
                }
                zscVar.m(EnumSet.noneOf(avxv.class));
                synchronized (zscVar.j) {
                    zscVar.f = amup.j(hashMap);
                    zxq.c(zscVar.j, hashMap);
                    zscVar.j.clear();
                }
                synchronized (zscVar.l) {
                    zscVar.x = true;
                    zxq.c(zscVar.l, null);
                    zscVar.l.clear();
                }
                zscVar.l(arrayList, arrayList2, znkVar);
            }
        }
        this.m = null;
    }

    public final void c(avef avefVar) {
        new ztj(this, avefVar).execute(new Void[0]);
    }

    @Override // defpackage.zsx
    public final void d(String str, String str2) {
        ztn ztnVar = this.e;
        synchronized (ztnVar.a) {
            Iterator it = ztnVar.b.iterator();
            while (it.hasNext()) {
                ztm ztmVar = (ztm) it.next();
                if (ztmVar.b.contains(str)) {
                    ztmVar.c.put(str, str2);
                    ztmVar.b.remove(str);
                    if (ztmVar.b.isEmpty()) {
                        ztmVar.a.onCompletion(ztmVar.c, new HashMap());
                        it.remove();
                    }
                }
            }
        }
        synchronized (this.j) {
            zrh zrhVar = this.k;
            if (zrhVar != null) {
                zrhVar.a(str2);
            }
        }
    }

    public final void e() {
        zth zthVar = this.l;
        if (!zthVar.c || zthVar.a != zthVar.b) {
            return;
        }
        new ztk(this.b).execute(new Void[0]);
    }
}
