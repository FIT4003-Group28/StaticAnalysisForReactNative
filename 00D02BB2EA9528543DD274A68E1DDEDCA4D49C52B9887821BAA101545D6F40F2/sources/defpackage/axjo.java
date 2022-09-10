package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: axjo  reason: default package */
/* loaded from: classes3.dex */
public final class axjo extends afhx {
    public static final dbsl<afga> a = axjn.a;
    private final ceet b;
    @dzsi
    private final dpyv c;

    public axjo(Intent intent, @dzsi String str, ceet ceetVar, auhi auhiVar) {
        super(intent, str, afid.PEOPLE_FOLLOWER_LIST);
        this.b = ceetVar;
        Integer l = auhiVar.l(intent);
        this.c = l == null ? null : dpyv.b(l.intValue());
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("obfuscatedGaiaId");
        dbsk.s(stringExtra);
        this.b.m(stringExtra, axok.FOLLOWERS, this.c);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_UNKNOWN;
    }
}
