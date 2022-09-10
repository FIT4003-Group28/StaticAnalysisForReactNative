package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bdfb  reason: default package */
/* loaded from: classes3.dex */
public class bdfb implements bdax {
    public final bcrt a;
    public final bbuu b;
    public final dwfl c;
    public final int d;
    public final Resources e;
    private final boolean f;

    public bdfb(Resources resources, bbuu bbuuVar, boolean z, bcrt bcrtVar, dwfl dwflVar, int i) {
        this.e = resources;
        this.b = bbuuVar;
        this.a = bcrtVar;
        this.f = z;
        this.c = dwflVar;
        this.d = i;
    }

    @Override // defpackage.bdax
    @dzsi
    public jbj a() {
        if (!this.f) {
            return null;
        }
        return new bdfa(this);
    }
}
