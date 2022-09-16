package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dqq  reason: default package */
/* loaded from: classes3.dex */
public final class dqq implements dqz {
    public final dqz a;
    public final String b;

    public dqq() {
        dqz dqzVar = f;
        throw null;
    }

    public dqq(String str) {
        this.a = f;
        this.b = str;
    }

    public dqq(String str, dqz dqzVar) {
        this.a = dqzVar;
        this.b = str;
    }

    @Override // defpackage.dqz
    public final dqz d() {
        return new dqq(this.b, this.a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dqq)) {
            return false;
        }
        dqq dqqVar = (dqq) obj;
        return this.b.equals(dqqVar.b) && this.a.equals(dqqVar.a);
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.dqz
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return null;
    }
}
