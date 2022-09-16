package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amvf  reason: default package */
/* loaded from: classes.dex */
final class amvf implements Serializable {
    final amvg a;

    public amvf(amvg amvgVar) {
        this.a = amvgVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
