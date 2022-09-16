package defpackage;

import java.lang.reflect.AccessibleObject;
/* compiled from: PG */
/* renamed from: dgxb  reason: default package */
/* loaded from: classes6.dex */
public abstract class dgxb {
    public static final dgxb a;

    static {
        a = dgum.a < 9 ? new dgxa() : new dgxc();
    }

    public abstract void a(AccessibleObject accessibleObject);
}
