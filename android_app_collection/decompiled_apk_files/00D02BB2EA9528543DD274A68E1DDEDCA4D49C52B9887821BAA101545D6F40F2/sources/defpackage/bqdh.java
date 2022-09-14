package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bqdh  reason: default package */
/* loaded from: classes4.dex */
public final class bqdh implements cflk {
    public final dbsg<cfll> a;
    public final bqdl b;
    public final Set<Long> c = new HashSet();
    public final Set<Long> d = new HashSet();
    public boolean e = false;

    public bqdh(dbsg<cfll> dbsgVar, bqdl bqdlVar) {
        this.a = dbsgVar;
        this.b = bqdlVar;
    }

    @Override // defpackage.cflk
    public final void a(dcdc<Long> dcdcVar) {
        this.d.addAll(dcdcVar);
    }

    @Override // defpackage.cflk
    public final void y() {
        this.e = true;
    }
}
