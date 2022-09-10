package defpackage;

import com.spotify.protocol.types.Types;
/* compiled from: PG */
/* renamed from: dxgz  reason: default package */
/* loaded from: classes6.dex */
public final class dxgz implements dxgx {
    public volatile Types.RequestId a;
    public final dxgh b;
    public final dxhk c;
    public dxey d;
    private final dxgf e;

    public dxgz(dxgh dxghVar, dxhk dxhkVar) {
        dxgy dxgyVar = new dxgy(this);
        this.e = dxgyVar;
        this.b = dxghVar;
        this.c = dxhkVar;
        dxghVar.c.a.add(dxgyVar);
    }

    public static final dxhm a(dxhq dxhqVar, String str) {
        String format;
        try {
            format = dxhqVar.a.g(dxhqVar.b);
        } catch (dxho e) {
            format = String.format("Could not parse error details: %s", e.getMessage());
        }
        return new dxhm(format, str);
    }

    @Override // defpackage.dxgx
    public final <T> dxgl<T> b(String str, Object obj, Class<T> cls) {
        throw null;
    }

    @Override // defpackage.dxgx
    public final <T> dxhh<T> c(String str, Class<T> cls) {
        throw null;
    }

    @Override // defpackage.dxgx
    public final <T> void d(String str, Class<T> cls) {
        throw null;
    }
}
