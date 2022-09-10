package defpackage;

import android.content.Intent;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: azui  reason: default package */
/* loaded from: classes.dex */
public final class azui extends afhx {
    public static final Pattern a = Pattern.compile("/maps/placelists/all/?$");
    public static final dbsl<afga> b = azuh.a;
    private final axwy c;

    public azui(axwy axwyVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.YOUR_SAVED_PLACES);
        this.c = axwyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.c.n();
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_YOUR_SAVED_PLACES;
    }
}
