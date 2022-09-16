package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: wmr  reason: default package */
/* loaded from: classes4.dex */
public final class wmr implements wll {
    public final wlk a;
    public final wlk b;
    public final wlk c;
    public final wlk d;
    public final wlk e;
    public final wlk f;
    public final wlk g;
    public final wlk h;
    public final wlk i;
    public final wlk j;
    public final wlk k;
    public final wlk l;
    public final wlk m;
    public final wlk n;
    public final wlk o;
    public final wlk p;
    public final wlk q;
    public final wlk r;
    public final wlk s;
    final CopyOnWriteArrayList t = new CopyOnWriteArrayList();
    public String u = null;
    public aeso v;
    private final aynx w;
    private final aynx x;
    private final airw y;

    public wmr(wmd wmdVar, wst wstVar, wrs wrsVar, wmc wmcVar, wtc wtcVar, wvg wvgVar, wmw wmwVar, wvi wviVar, wvj wvjVar, wvl wvlVar, wsj wsjVar, wsn wsnVar, wsl wslVar, wvm wvmVar, wvn wvnVar, wvt wvtVar, wtu wtuVar, wtq wtqVar, wst wstVar2, aynx aynxVar, aynx aynxVar2, airw airwVar, byte[] bArr) {
        this.a = wmdVar;
        this.b = wstVar;
        this.c = wrsVar;
        this.d = wmcVar;
        this.e = wtcVar;
        this.f = wvgVar;
        this.g = wmwVar;
        this.h = wviVar;
        this.i = wvjVar;
        this.j = wvlVar;
        this.k = wsjVar;
        this.l = wsnVar;
        this.m = wslVar;
        this.n = wvmVar;
        this.o = wvnVar;
        this.p = wvtVar;
        this.q = wtuVar;
        this.r = wtqVar;
        this.s = wstVar2;
        this.w = aynxVar;
        this.x = aynxVar2;
        this.y = airwVar;
    }

    @Override // defpackage.wll
    public final void a(wlk wlkVar) {
        this.t.add(wlkVar);
    }

    @Override // defpackage.wll
    public final void b() {
        this.y.G().d.aa(new wmq(this, 5), ab.o);
        this.y.s().b.Z(new wmq(this, 3));
        this.y.G().i.aa(new wmq(this, 6), ab.o);
        this.x.n().Z(new wmq(this, 8));
        this.x.n().O(ona.j).aa(new wmq(this, 1), ab.o);
        this.x.n().O(ona.k).Z(new wmq(this, 2));
        this.w.n().O(ona.l).Z(new wmq(this, 4));
        this.w.n().O(ona.m).u(new ayqf() { // from class: wmp
            @Override // defpackage.ayqf
            public final boolean a(Object obj) {
                wmr wmrVar = wmr.this;
                ahgc ahgcVar = (ahgc) obj;
                aeso aesoVar = wmrVar.v;
                aeso a = ahgcVar.a();
                if (a == null || a.b == -1 || a.a() == -1) {
                    return false;
                }
                if (aesoVar != null && a.c(aesoVar)) {
                    if (!a.b(aesoVar)) {
                        return false;
                    }
                    if ((a.b != 0 || Math.abs(a.a() - aesoVar.a()) <= 50) && Math.abs(a.d - aesoVar.d) <= 50) {
                        return false;
                    }
                }
                wmrVar.v = ahgcVar.a();
                return true;
            }
        }).Z(new wmq(this));
        this.w.n().Z(new wmq(this, 7));
    }

    @Override // defpackage.wll
    public final void c(wlk wlkVar) {
        this.t.remove(wlkVar);
    }

    @Override // defpackage.wll
    public final boolean d(String str) {
        return TextUtils.equals(str, this.u);
    }
}
