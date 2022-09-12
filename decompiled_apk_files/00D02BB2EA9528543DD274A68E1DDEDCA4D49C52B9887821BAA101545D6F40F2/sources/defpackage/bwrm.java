package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bwrm  reason: default package */
/* loaded from: classes4.dex */
public abstract class bwrm implements Serializable {
    public abstract bwrl a();

    public abstract String b();

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bwrm)) {
            return false;
        }
        bwrm bwrmVar = (bwrm) obj;
        return a().equals(bwrmVar.a()) && b().equals(bwrmVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a().a(), b()});
    }

    public final String toString() {
        return a().a() + '-' + b();
    }
}
