package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qcj  reason: default package */
/* loaded from: classes4.dex */
public final class qcj {
    public final Date a;
    public final List b;
    public final int c;
    public final Set d;
    public final Location e;
    public final Bundle f;
    public final Map g;
    public final int h;
    public final Set i;
    public final Bundle j;
    public final Set k;
    public final boolean l;

    public qcj(qci qciVar) {
        this.a = qciVar.g;
        this.b = qciVar.h;
        this.c = qciVar.i;
        this.d = Collections.unmodifiableSet(qciVar.a);
        this.e = qciVar.j;
        this.f = qciVar.b;
        this.g = Collections.unmodifiableMap(qciVar.c);
        this.h = qciVar.k;
        this.i = Collections.unmodifiableSet(qciVar.d);
        this.j = qciVar.e;
        this.k = Collections.unmodifiableSet(qciVar.f);
        this.l = qciVar.l;
    }
}
