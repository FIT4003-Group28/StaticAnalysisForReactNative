package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qex  reason: default package */
/* loaded from: classes4.dex */
public final class qex implements qgh {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;

    public qex(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
    }

    @Override // defpackage.qgh
    @Deprecated
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qgh
    public final int b() {
        return this.f;
    }

    @Override // defpackage.qgh
    public final Location c() {
        return this.e;
    }

    @Override // defpackage.qgh
    @Deprecated
    public final Date d() {
        return this.a;
    }

    @Override // defpackage.qgh
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.qgh
    @Deprecated
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.qgh
    public final boolean g() {
        return this.d;
    }
}
