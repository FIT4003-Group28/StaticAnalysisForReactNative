package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: tkc  reason: default package */
/* loaded from: classes4.dex */
public final class tkc extends tjy {
    public final tkb h;
    public final String i;
    public final tjv j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final View.OnAttachStateChangeListener n;
    private boolean o;

    public tkc(View view, tkb tkbVar, String str, tjv tjvVar) {
        super(new tki());
        this.h = tkbVar;
        this.i = str;
        this.j = tjvVar;
        this.n = new tka(this);
        d(view);
    }

    @Override // defpackage.tjy
    public final void d(View view) {
        super.d(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // defpackage.tjy
    public final boolean h() {
        return this.a || this.k || this.l;
    }

    public final tjt i(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c());
        linkedHashMap.put(tju.ID, str);
        linkedHashMap.put(tju.DONE_REASON, str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", tly.a(tju.ID));
        linkedHashMap2.put("r", tly.a(tju.DONE_REASON));
        linkedHashMap2.put("c", tly.d(tju.COVERAGE, tjr.b));
        linkedHashMap2.put("nc", tly.d(tju.MIN_COVERAGE, tjr.b));
        linkedHashMap2.put("mc", tly.d(tju.MAX_COVERAGE, tjr.b));
        linkedHashMap2.put("tos", tly.e(tju.TOS));
        linkedHashMap2.put("mtos", tly.e(tju.MAX_CONSECUTIVE_TOS));
        linkedHashMap2.put("p", tly.e(tju.POSITION));
        linkedHashMap2.put("cp", tly.e(tju.CONTAINER_POSITION));
        linkedHashMap2.put("bs", tly.e(tju.VIEWPORT_SIZE));
        linkedHashMap2.put("ps", tly.e(tju.APP_SIZE));
        linkedHashMap2.put("scs", tly.e(tju.SCREEN_SIZE));
        linkedHashMap2.put("lte", tly.b("1"));
        linkedHashMap2.put("avms", tly.b("nl"));
        linkedHashMap2.put("sv", tly.b("83"));
        linkedHashMap2.put("cb", tly.b("a"));
        String b = tjw.b(linkedHashMap, Collections.unmodifiableMap(linkedHashMap2), null, null);
        tjs a = tjt.a();
        a.a = b;
        return a.a();
    }

    public final void j() {
        if (!this.m || this.o) {
            return;
        }
        this.h.b(i("lidartos", "u"), a());
        this.o = true;
        if (a() == null) {
            return;
        }
        a().removeOnAttachStateChangeListener(this.n);
    }
}
