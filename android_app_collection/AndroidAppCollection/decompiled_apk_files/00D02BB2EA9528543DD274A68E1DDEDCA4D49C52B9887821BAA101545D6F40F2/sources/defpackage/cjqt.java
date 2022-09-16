package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjqt  reason: default package */
/* loaded from: classes.dex */
final class cjqt {
    public final ddho a;

    public cjqt(ddho ddhoVar) {
        this.a = ddhoVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cjqt)) {
            return false;
        }
        if (obj != this) {
            return dbsd.a(this.a, ((cjqt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
