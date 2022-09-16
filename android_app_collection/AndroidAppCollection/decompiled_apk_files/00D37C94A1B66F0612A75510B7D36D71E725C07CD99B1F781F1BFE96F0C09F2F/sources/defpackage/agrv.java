package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: agrv  reason: default package */
/* loaded from: classes.dex */
public final class agrv {
    public final String a;
    public final int b;
    public final atrf c;
    public final long d;
    public final AtomicInteger e;
    public final Set f;
    public final String g;
    public String h;
    public boolean i;
    public boolean j;
    private final String k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agrv(atri atriVar) {
        this(aakj.g(atriVar.d()), atriVar.getActionProto(), aakj.a(atriVar.getActionProto().d), TimeUnit.SECONDS.toMillis(atriVar.getEnqueueTimeSec().longValue()), atriVar.getRootActionId(), (atriVar.b.b & 16) != 0 ? atriVar.getParentActionId() : null);
        String str = null;
        this.e.set(atriVar.getRetryScheduleIndex().intValue());
        this.f.addAll(atriVar.getChildActionIds());
        this.h = (atriVar.b.b & 32) != 0 ? atriVar.getPrereqActionId() : str;
        this.j = atriVar.getHasChildActionFailed().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq a() {
        return ampq.i(this.k);
    }

    public final ampq b() {
        return ampq.i(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return !this.f.isEmpty();
    }

    public agrv(String str, atrf atrfVar, int i, long j, String str2, String str3) {
        this.i = false;
        this.j = false;
        this.a = str;
        this.c = atrfVar;
        this.b = i;
        this.e = new AtomicInteger();
        this.d = j;
        this.f = new HashSet();
        this.g = str2;
        this.k = str3;
    }
}
