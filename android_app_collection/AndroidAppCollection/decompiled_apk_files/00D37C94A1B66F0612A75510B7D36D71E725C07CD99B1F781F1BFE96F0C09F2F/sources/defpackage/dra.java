package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dra  reason: default package */
/* loaded from: classes3.dex */
public final class dra implements dqz {
    public final String a;
    public final ArrayList b;

    public dra(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.dqz
    public final dqz d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dra)) {
            return false;
        }
        dra draVar = (dra) obj;
        String str = this.a;
        if (str == null ? draVar.a != null : !str.equals(draVar.a)) {
            return false;
        }
        return this.b.equals(draVar.b);
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.dqz
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return null;
    }
}
