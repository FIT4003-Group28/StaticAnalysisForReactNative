package defpackage;

import android.content.pm.ResolveInfo;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: aruy  reason: default package */
/* loaded from: classes2.dex */
public abstract class aruy<T extends cqkp> implements arxl<T> {
    protected final ResolveInfo a;
    private final aruq b;

    public aruy(aruq aruqVar, ResolveInfo resolveInfo) {
        this.b = aruqVar;
        this.a = resolveInfo;
    }

    @Override // defpackage.arxl
    public final arxk c() {
        aruq aruqVar = this.b;
        ResolveInfo resolveInfo = this.a;
        aruq.a(aruqVar.a.a(), 1);
        aruq.a(aruqVar.b.a(), 2);
        aruv a = aruqVar.c.a();
        aruq.a(a, 3);
        aruq.a(resolveInfo, 4);
        return new arup(a, resolveInfo);
    }
}
