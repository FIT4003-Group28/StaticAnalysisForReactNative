package defpackage;

import android.graphics.Rect;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ntn  reason: default package */
/* loaded from: classes3.dex */
public final class ntn implements nsk {
    public final Map a;
    public int b;
    public Rect c;
    private final aynx d;
    private final aynx e;

    public ntn(nqr nqrVar, Map map) {
        this.a = map;
        this.d = nqrVar.a.O(new ntm(this, 1)).h(nps.m);
        this.e = nqrVar.a.O(new ntm(this)).h(nps.m);
    }

    @Override // defpackage.nsk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.nsk
    public final Rect b() {
        return this.c;
    }

    @Override // defpackage.nsk
    public final aynx c() {
        return this.e;
    }

    @Override // defpackage.nsk
    public final aynx d() {
        return this.d;
    }

    @Override // defpackage.nsk
    public final void e() {
        for (nsk nskVar : ((amup) this.a).values()) {
            nskVar.e();
        }
        this.d.Z(new ntl(this));
        this.e.Z(new ntl(this, 1));
    }
}
